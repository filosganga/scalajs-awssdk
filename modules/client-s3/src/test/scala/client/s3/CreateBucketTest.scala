package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models.*
import commands.*

class CreateBucketTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    clientR
  }.test("CreateBucket should create a bucket") { client =>
    val bucketName = s"test-create-${new java.util.Random().nextInt.abs}"

    for {
      result <- client.sendIO(
        CreateBucketCommand(
          CreateBucketCommandInput(Bucket = bucketName)
        )
      )
      _ <- client
        .sendIO(
          DeleteBucketCommand(
            DeleteBucketCommandInput(Bucket = bucketName)
          )
        )
    } yield {
      assert(result.Location.isDefined)
    }
  }

  ResourceFunFixture {
    clientR
  }.test("CreateBucket should support ObjectOwnership") { client =>
    val bucketName =
      s"test-create-ownership-${new java.util.Random().nextInt.abs}"

    for {
      result <- client.sendIO(
        CreateBucketCommand(
          CreateBucketCommandInput(
            Bucket = bucketName,
            ObjectOwnership = ObjectOwnership.BucketOwnerEnforced
          )
        )
      )
      _ <- client
        .sendIO(
          DeleteBucketCommand(
            DeleteBucketCommandInput(Bucket = bucketName)
          )
        )
    } yield {
      assert(result.Location.isDefined)
    }
  }

}
