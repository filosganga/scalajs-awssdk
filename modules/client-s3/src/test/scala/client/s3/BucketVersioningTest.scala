package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models.*
import commands.*

class BucketVersioningTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutBucketVersioning and GetBucketVersioning should roundtrip") {
    case (client, bucketName) =>
      for {
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
        result <- client.sendIO(
          GetBucketVersioningCommand(
            GetBucketVersioningCommandInput(Bucket = bucketName)
          )
        )
      } yield {
        assertEquals(
          result.Status.toOption,
          Some(BucketVersioningStatus.Enabled)
        )
      }
  }

}
