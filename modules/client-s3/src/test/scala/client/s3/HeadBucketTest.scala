package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models._
import commands._

class HeadBucketTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("HeadBucket should succeed for existing bucket") {
    case (client, bucketName) =>
      client
        .sendIO(
          HeadBucketCommand(
            HeadBucketCommandInput(Bucket = bucketName)
          )
        )
        .map { result =>
          assert(result.$metadata.httpStatusCode.contains(200))
        }
  }

  ResourceFunFixture {
    clientR
  }.test("HeadBucket should fail for non-existing bucket") { client =>
    client
      .sendIO(
        HeadBucketCommand(
          HeadBucketCommandInput(
            Bucket = s"non-existing-${new java.util.Random().nextInt.abs}"
          )
        )
      )
      .attempt
      .map(result => assert(result.isLeft))
  }

}
