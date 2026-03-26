package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models._
import commands._

class ListObjectVersionsTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("ListObjectVersions should return versions") {
    case (client, bucketName) =>
      for {
        // Enable versioning
        _ <- client.sendIO(
          PutBucketVersioningCommand(
            PutBucketVersioningCommandInput(
              Bucket = bucketName,
              VersioningConfiguration = VersioningConfiguration(
                Status = BucketVersioningStatus.Enabled
              )
            )
          )
        )
        // Put two versions of the same key
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = "versioned.txt",
              Body = "v1"
            )
          )
        )
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = "versioned.txt",
              Body = "v2"
            )
          )
        )
        result <- client.sendIO(
          ListObjectVersionsCommand(
            ListObjectVersionsCommandInput(Bucket = bucketName)
          )
        )
      } yield {
        assert(result.Versions.isDefined)
        assert(result.Versions.get.length >= 2)
      }
  }

}
