package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models._
import commands._

class BucketWebsiteTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutBucketWebsite and GetBucketWebsite should roundtrip") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutBucketWebsiteCommand(
            PutBucketWebsiteCommandInput(
              Bucket = bucketName,
              WebsiteConfiguration = WebsiteConfiguration(
                IndexDocument = IndexDocument(Suffix = "index.html"),
                ErrorDocument = ErrorDocument(Key = "error.html")
              )
            )
          )
        )
        result <- client.sendIO(
          GetBucketWebsiteCommand(
            GetBucketWebsiteCommandInput(Bucket = bucketName)
          )
        )
      } yield {
        assert(result.IndexDocument.isDefined)
        assertEquals(result.IndexDocument.get.Suffix.toOption, Some("index.html"))
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("DeleteBucketWebsite should remove website config") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutBucketWebsiteCommand(
            PutBucketWebsiteCommandInput(
              Bucket = bucketName,
              WebsiteConfiguration = WebsiteConfiguration(
                IndexDocument = IndexDocument(Suffix = "index.html")
              )
            )
          )
        )
        _ <- client.sendIO(
          DeleteBucketWebsiteCommand(
            DeleteBucketWebsiteCommandInput(Bucket = bucketName)
          )
        )
        result <- client
          .sendIO(
            GetBucketWebsiteCommand(
              GetBucketWebsiteCommandInput(Bucket = bucketName)
            )
          )
          .attempt
      } yield {
        assert(result.isLeft)
      }
  }

}
