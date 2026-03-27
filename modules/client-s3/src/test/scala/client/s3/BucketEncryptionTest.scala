package com.filippodeluca.jsfacade.awssdk
package client
package s3

import scalajs.js
import models.*
import commands.*

class BucketEncryptionTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutBucketEncryption and GetBucketEncryption should roundtrip") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutBucketEncryptionCommand(
            PutBucketEncryptionCommandInput(
              Bucket = bucketName,
              ServerSideEncryptionConfiguration =
                ServerSideEncryptionConfiguration(
                  Rules = js.Array(
                    ServerSideEncryptionRule(
                      ApplyServerSideEncryptionByDefault =
                        ServerSideEncryptionByDefault(
                          SSEAlgorithm = ServerSideEncryption.AES256
                        )
                    )
                  )
                )
            )
          )
        )
        result <- client.sendIO(
          GetBucketEncryptionCommand(
            GetBucketEncryptionCommandInput(Bucket = bucketName)
          )
        )
      } yield {
        assert(
          result.ServerSideEncryptionConfiguration.isDefined
        )
      }
  }

}
