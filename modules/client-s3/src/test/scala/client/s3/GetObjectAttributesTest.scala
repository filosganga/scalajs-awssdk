package com.filippodeluca.jsfacade.awssdk
package client
package s3

import scalajs.js
import models.*
import commands.*

class GetObjectAttributesTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("GetObjectAttributes should return requested attributes") {
    case (client, bucketName) =>
      val key = "attrs-test.txt"

      for {
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = key,
              Body = "test content"
            )
          )
        )
        result <- client.sendIO(
          GetObjectAttributesCommand(
            GetObjectAttributesCommandInput(
              Bucket = bucketName,
              Key = key,
              ObjectAttributes = js.Array(
                ObjectAttributes.ETAG,
                ObjectAttributes.OBJECT_SIZE
              )
            )
          )
        )
      } yield {
        assert(result.ETag.isDefined || result.ObjectSize.isDefined)
      }
  }

}
