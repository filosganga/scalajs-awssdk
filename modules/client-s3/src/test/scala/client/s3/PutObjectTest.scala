package com.filippodeluca.jsfacade.awssdk
package client
package s3

import cats.effect.*
import fs2.{Stream as Fs2Stream, io}

import scalajs.js
import models.*
import commands.*

class PutObjectTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutObject should put a string body") { case (client, bucketName) =>
    val key = "test-put-string.txt"
    val content = "Hello, S3!"

    for {
      result <- client.sendIO(
        PutObjectCommand(
          PutObjectCommandInput(
            Bucket = bucketName,
            Key = key,
            Body = content,
            ContentType = "text/plain"
          )
        )
      )
    } yield {
      assert(result.ETag.isDefined)
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutObject should put an fs2 stream body") {
    case (client, bucketName) =>
      val key = "test-put-stream.txt"
      val content = "Hello from fs2 stream!"

      val putWithStream = for {
        readable <- io.toReadableResource[IO](
          Fs2Stream.emits(content.getBytes("UTF-8")).covary[IO]
        )
        result <- Resource.eval(
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
      } yield result

      putWithStream.use { result =>
        IO(assert(result.ETag.isDefined))
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutObject should support custom metadata") {
    case (client, bucketName) =>
      val key = "test-put-metadata.txt"
      val content = "metadata content"

      for {
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = key,
              Body = content,
              ContentType = "application/json",
              Metadata = js.Dictionary(
                "author" -> "test-user",
                "version" -> "1"
              )
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
        assertEquals(
          getResult.ContentType.toOption,
          Some("application/json")
        )
        assertEquals(getResult.Metadata.get("author"), "test-user")
        assertEquals(getResult.Metadata.get("version"), "1")
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutObject should overwrite existing object") {
    case (client, bucketName) =>
      val key = "test-put-overwrite.txt"

      for {
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = key,
              Body = "first version"
            )
          )
        )
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = key,
              Body = "second version"
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
        body <- io
          .suspendReadableAndRead[IO, io.Readable]()(
            getResult.Body.get.asInstanceOf[io.Readable]
          )
          .use { case (_, stream) =>
            stream.through(fs2.text.utf8.decode).compile.string
          }
      } yield {
        assertEquals(body, "second version")
      }
  }

}
