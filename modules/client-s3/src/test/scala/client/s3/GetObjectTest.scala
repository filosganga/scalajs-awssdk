package com.filippodeluca.jsfacade.awssdk
package client
package s3

import cats.effect._

import scalajs.js
import models._
import commands._

import fs2.{Stream => Fs2Stream}
import fs2.io

class GetObjectTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("GetObject should retrieve a previously put object") {
    case (client, bucketName) =>
      val key = "test-key.txt"
      val content = "Hello, S3!"

      val putObject = client.sendIO(
        PutObjectCommand(
          PutObjectCommandInput(
            Bucket = bucketName,
            Key = key,
            Body = content,
            ContentType = "text/plain"
          )
        )
      )

      val getObject = client.sendIO(
        GetObjectCommand(
          GetObjectCommandInput(
            Bucket = bucketName,
            Key = key
          )
        )
      )

      for {
        putResult <- putObject
        getResult <- getObject
        body <- io
          .suspendReadableAndRead[IO, io.Readable]()(
            getResult.Body.get.asInstanceOf[io.Readable]
          )
          .use { case (_, stream) =>
            stream.through(fs2.text.utf8.decode).compile.string
          }
      } yield {
        assert(putResult.ETag.isDefined)
        assertEquals(body, content)
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutObject with fs2 stream body and GetObject back") {
    case (client, bucketName) =>
      val key = "test-fs2-stream.txt"
      val content = "Hello from fs2 stream!"

      val putWithStream = for {
        readable <- io.toReadableResource[IO](
          Fs2Stream.emits(content.getBytes("UTF-8")).covary[IO]
        )
        _ <- Resource.eval(
          client.sendIO(
            PutObjectCommand(
              PutObjectCommandInput(
                Bucket = bucketName,
                Key = key,
                Body = readable,
                ContentType = "text/plain"
              )
            )
          )
        )
      } yield ()

      for {
        _ <- putWithStream.use_
        getResult <- client.sendIO(
          GetObjectCommand(
            GetObjectCommandInput(
              Bucket = bucketName,
              Key = key
            )
          )
        )
        body <- io
          .suspendReadableAndRead[IO, io.Readable]()(
            getResult.Body.get.asInstanceOf[io.Readable]
          )
          .use { case (_, stream) =>
            stream.through(fs2.text.utf8.decode).compile.string
          }
      } yield {
        assertEquals(body, content)
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("GetObject should return metadata") { case (client, bucketName) =>
    val key = "test-metadata.txt"
    val content = "metadata test"

    for {
      _ <- client.sendIO(
        PutObjectCommand(
          PutObjectCommandInput(
            Bucket = bucketName,
            Key = key,
            Body = content,
            ContentType = "text/plain",
            Metadata = js.Dictionary("custom-key" -> "custom-value")
          )
        )
      )
      getResult <- client.sendIO(
        GetObjectCommand(
          GetObjectCommandInput(
            Bucket = bucketName,
            Key = key
          )
        )
      )
    } yield {
      assertEquals(getResult.ContentType.toOption, Some("text/plain"))
      assertEquals(
        getResult.Metadata.get("custom-key"),
        "custom-value"
      )
    }
  }

}
