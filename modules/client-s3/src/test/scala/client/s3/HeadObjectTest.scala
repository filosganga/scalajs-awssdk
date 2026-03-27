package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models.*
import commands.*

class HeadObjectTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("HeadObject should return object metadata without body") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = "head-test.txt",
              Body = "hello world",
              ContentType = "text/plain"
            )
          )
        )
        result <- client.sendIO(
          HeadObjectCommand(
            HeadObjectCommandInput(
              Bucket = bucketName,
              Key = "head-test.txt"
            )
          )
        )
      } yield {
        assertEquals(result.ContentType.toOption, Some("text/plain"))
        assert(result.ContentLength.isDefined)
        assert(result.ETag.isDefined)
      }
  }

}
