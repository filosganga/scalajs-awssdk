package com.filippodeluca.jsfacade.awssdk
package client
package s3

import cats.effect._

import models._
import commands._

class DeleteBucketTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    clientR
  }.test("DeleteBucket should delete an existing bucket") { client =>
    val bucketName = s"test-delete-${new java.util.Random().nextInt.abs}"

    for {
      _ <- client.sendIO(
        CreateBucketCommand(
          CreateBucketCommandInput(Bucket = bucketName)
        )
      )
      result <- client.sendIO(
        DeleteBucketCommand(
          DeleteBucketCommandInput(Bucket = bucketName)
        )
      )
    } yield {
      assert(result.$metadata.httpStatusCode.contains(204))
    }
  }

  ResourceFunFixture {
    clientR
  }.test("DeleteBucket should fail for non-existing bucket") { client =>
    val bucketName =
      s"test-delete-nonexistent-${new java.util.Random().nextInt.abs}"

    client
      .sendIO(
        DeleteBucketCommand(
          DeleteBucketCommandInput(Bucket = bucketName)
        )
      )
      .attempt
      .map { result =>
        assert(result.isLeft)
      }
  }

}
