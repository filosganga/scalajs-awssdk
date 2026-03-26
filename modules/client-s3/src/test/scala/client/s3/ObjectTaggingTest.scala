package com.filippodeluca.jsfacade.awssdk
package client
package s3

import scalajs.js
import models._
import commands._

class ObjectTaggingTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutObjectTagging and GetObjectTagging should roundtrip") {
    case (client, bucketName) =>
      val key = "tagged.txt"

      for {
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(Bucket = bucketName, Key = key, Body = "data")
          )
        )
        _ <- client.sendIO(
          PutObjectTaggingCommand(
            PutObjectTaggingCommandInput(
              Bucket = bucketName,
              Key = key,
              Tagging = Tagging(
                TagSet = js.Array(
                  Tag(Key = "env", Value = "test"),
                  Tag(Key = "team", Value = "platform")
                )
              )
            )
          )
        )
        result <- client.sendIO(
          GetObjectTaggingCommand(
            GetObjectTaggingCommandInput(Bucket = bucketName, Key = key)
          )
        )
      } yield {
        assert(result.TagSet.isDefined)
        assertEquals(result.TagSet.get.length, 2)
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("DeleteObjectTagging should remove tags") {
    case (client, bucketName) =>
      val key = "to-untag.txt"

      for {
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = key,
              Body = "data",
              Tagging = "env=test"
            )
          )
        )
        _ <- client.sendIO(
          DeleteObjectTaggingCommand(
            DeleteObjectTaggingCommandInput(Bucket = bucketName, Key = key)
          )
        )
        result <- client.sendIO(
          GetObjectTaggingCommand(
            GetObjectTaggingCommandInput(Bucket = bucketName, Key = key)
          )
        )
      } yield {
        assert(
          result.TagSet.toOption.forall(_.length == 0)
        )
      }
  }

}
