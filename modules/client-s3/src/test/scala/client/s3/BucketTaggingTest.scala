package com.filippodeluca.jsfacade.awssdk
package client
package s3

import scalajs.js
import models.*
import commands.*

class BucketTaggingTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutBucketTagging and GetBucketTagging should roundtrip") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutBucketTaggingCommand(
            PutBucketTaggingCommandInput(
              Bucket = bucketName,
              Tagging = Tagging(
                TagSet = js.Array(
                  Tag(Key = "env", Value = "test"),
                  Tag(Key = "project", Value = "scalajs-awssdk")
                )
              )
            )
          )
        )
        result <- client.sendIO(
          GetBucketTaggingCommand(
            GetBucketTaggingCommandInput(Bucket = bucketName)
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
  }.test("DeleteBucketTagging should remove tags") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutBucketTaggingCommand(
            PutBucketTaggingCommandInput(
              Bucket = bucketName,
              Tagging = Tagging(
                TagSet = js.Array(Tag(Key = "k", Value = "v"))
              )
            )
          )
        )
        _ <- client.sendIO(
          DeleteBucketTaggingCommand(
            DeleteBucketTaggingCommandInput(Bucket = bucketName)
          )
        )
        result <- client
          .sendIO(
            GetBucketTaggingCommand(
              GetBucketTaggingCommandInput(Bucket = bucketName)
            )
          )
          .attempt
      } yield {
        // Either empty tag set or error (NoSuchTagSet)
        assert(
          result.isLeft ||
            result.toOption.exists(_.TagSet.toOption.forall(_.length == 0))
        )
      }
  }

}
