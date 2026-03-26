package com.filippodeluca.jsfacade.awssdk
package client
package s3

import cats.effect._
import cats.effect.std.Env
import cats.syntax.all.*

import scalajs.js.JSConverters._
import models._
import commands._

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

    def deletePage(continuationToken: Option[String]): IO[Unit] = {
      client
        .sendIO(
          ListObjectsV2Command(
            ListObjectsV2CommandInput(
              Bucket = bucketName,
              ContinuationToken = continuationToken.orUndefined
            )
          )
        )
        .flatMap { result =>
          val deleteObjects = result.Contents.toOption
            .map(_.toList)
            .getOrElse(List.empty)
            .traverse_ { obj =>
              obj.Key.toOption.traverse_ { key =>
                client
                  .sendIO(
                    DeleteObjectCommand(
                      DeleteObjectCommandInput(
                        Bucket = bucketName,
                        Key = key
                      )
                    )
                  )
                  .void
              }
            }

          val nextPage = result.IsTruncated.toOption
            .filter(identity)
            .as(result.NextContinuationToken.toOption)
            .flatten

          deleteObjects >> nextPage.traverse_(token => deletePage(Some(token)))
        }
    }

    deletePage(None)
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
