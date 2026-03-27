package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models.*
import commands.*

class ListBucketsTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("ListBuckets should return the created bucket") {
    case (client, bucketName) =>
      for {
        result <- client.sendIO(
          ListBucketsCommand(
            ListBucketsCommandInput()
          )
        )
      } yield {
        assert(result.Buckets.isDefined)
        assert(result.Buckets.get.exists(_.Name.toOption.contains(bucketName)))
      }
  }

}
