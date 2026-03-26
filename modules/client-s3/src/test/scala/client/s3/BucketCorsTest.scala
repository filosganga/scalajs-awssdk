package com.filippodeluca.jsfacade.awssdk
package client
package s3

import scalajs.js
import models._
import commands._

class BucketCorsTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutBucketCors and GetBucketCors should roundtrip") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutBucketCorsCommand(
            PutBucketCorsCommandInput(
              Bucket = bucketName,
              CORSConfiguration = CORSConfiguration(
                CORSRules = js.Array(
                  CORSRule(
                    AllowedMethods = js.Array("GET", "PUT"),
                    AllowedOrigins = js.Array("https://example.com"),
                    AllowedHeaders = js.Array("*"),
                    MaxAgeSeconds = 3600
                  )
                )
              )
            )
          )
        )
        result <- client.sendIO(
          GetBucketCorsCommand(
            GetBucketCorsCommandInput(Bucket = bucketName)
          )
        )
      } yield {
        assert(result.CORSRules.isDefined)
        assertEquals(result.CORSRules.get.length, 1)
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("DeleteBucketCors should remove CORS config") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutBucketCorsCommand(
            PutBucketCorsCommandInput(
              Bucket = bucketName,
              CORSConfiguration = CORSConfiguration(
                CORSRules = js.Array(
                  CORSRule(
                    AllowedMethods = js.Array("GET"),
                    AllowedOrigins = js.Array("*")
                  )
                )
              )
            )
          )
        )
        _ <- client.sendIO(
          DeleteBucketCorsCommand(
            DeleteBucketCorsCommandInput(Bucket = bucketName)
          )
        )
        result <- client
          .sendIO(
            GetBucketCorsCommand(
              GetBucketCorsCommandInput(Bucket = bucketName)
            )
          )
          .attempt
      } yield {
        assert(result.isLeft)
      }
  }

}
