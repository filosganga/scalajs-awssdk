package com.filippodeluca.jsfacade.awssdk
package client
package s3

import cats.effect.*
import cats.effect.std.Env
import cats.syntax.all.*

import scalajs.js.JSConverters.*
import models.*
import commands.*

trait S3Fixtures {
  self: munit.FunSuite =>

  implicit class RichS3Client(client: S3Client) {
    def sendIO[Input, Output](cmd: Command[Input, Output]) = IO
      .fromPromise {
        IO {
          client.send(cmd)
        }
      }
      .onError { e =>
        cats.effect.std
          .Console[IO]
          .errorln(s"Error sending S3 request: ${e.getMessage}")
      }

  }

  def clientR =
    Resource.eval(Env[IO].get("S3_ENDPOINT")).flatMap { endpoint =>
      Resource.make {
        IO {
          val config =
            S3ClientConfig(
              region = "eu-west-1",
              endpoint = endpoint.orUndefined,
              forcePathStyle = true
            )
          new S3Client(config)
        }
      }(c => IO(c.destroy()))
    }

  def emptyBucket(client: S3Client, bucketName: String): IO[Unit] = {

    // Delete all object versions and delete markers (needed for versioned buckets)
    def deleteVersionsPage(keyMarker: Option[String]): IO[Unit] = {
      client
        .sendIO(
          ListObjectVersionsCommand(
            ListObjectVersionsCommandInput(
              Bucket = bucketName,
              KeyMarker = keyMarker.orUndefined
            )
          )
        )
        .flatMap { result =>
          val versions = result.Versions.toOption
            .map(_.toList)
            .getOrElse(List.empty)
          val deleteMarkers = result.DeleteMarkers.toOption
            .map(_.toList)
            .getOrElse(List.empty)

          val deleteAll = versions.traverse_ { v =>
            (v.Key.toOption, v.VersionId.toOption).tupled.traverse_ {
              case (key, versionId) =>
                client
                  .sendIO(
                    DeleteObjectCommand(
                      DeleteObjectCommandInput(
                        Bucket = bucketName,
                        Key = key,
                        VersionId = versionId
                      )
                    )
                  )
                  .void
            }
          } >> deleteMarkers.traverse_ { dm =>
            (dm.Key.toOption, dm.VersionId.toOption).tupled.traverse_ {
              case (key, versionId) =>
                client
                  .sendIO(
                    DeleteObjectCommand(
                      DeleteObjectCommandInput(
                        Bucket = bucketName,
                        Key = key,
                        VersionId = versionId
                      )
                    )
                  )
                  .void
            }
          }

          val nextPage = result.IsTruncated.toOption
            .filter(identity)
            .as(result.NextKeyMarker.toOption)
            .flatten

          deleteAll >> nextPage.traverse_(marker =>
            deleteVersionsPage(Some(marker))
          )
        }
    }

    deleteVersionsPage(None)
  }

  def bucketR(client: S3Client) = Resource
    .eval(IO { new java.util.Random().nextInt.abs })
    .map(id => s"test-${id.toString}")
    .flatMap { bucketName =>
      Resource
        .make {
          client
            .sendIO(
              CreateBucketCommand(
                CreateBucketCommandInput(Bucket = bucketName)
              )
            )
            .as(bucketName)
        } { bucketName =>
          emptyBucket(client, bucketName) >>
            client
              .sendIO(
                DeleteBucketCommand(
                  DeleteBucketCommandInput(Bucket = bucketName)
                )
              )
              .void
        }
    }

}
