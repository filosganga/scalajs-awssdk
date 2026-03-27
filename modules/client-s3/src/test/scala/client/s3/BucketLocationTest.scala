package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models.*
import commands.*

class BucketLocationTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("GetBucketLocation should return location") {
    case (client, bucketName) =>
      for {
        result <- client.sendIO(
          GetBucketLocationCommand(
            GetBucketLocationCommandInput(Bucket = bucketName)
          )
        )
      } yield {
        assert(result.$metadata.httpStatusCode.contains(200))
      }
  }

}
