package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models._
import commands._

class BucketPolicyTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("PutBucketPolicy and GetBucketPolicy should roundtrip") {
    case (client, bucketName) =>
      val policy =
        s"""{"Version":"2012-10-17","Statement":[{"Effect":"Allow","Principal":"*","Action":"s3:GetObject","Resource":"arn:aws:s3:::${bucketName}/*"}]}"""

      for {
        _ <- client.sendIO(
          PutBucketPolicyCommand(
            PutBucketPolicyCommandInput(
              Bucket = bucketName,
              Policy = policy
            )
          )
        )
        result <- client.sendIO(
          GetBucketPolicyCommand(
            GetBucketPolicyCommandInput(Bucket = bucketName)
          )
        )
      } yield {
        assert(result.Policy.isDefined)
        assert(result.Policy.get.contains("s3:GetObject"))
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("DeleteBucketPolicy should remove policy") {
    case (client, bucketName) =>
      val policy =
        s"""{"Version":"2012-10-17","Statement":[{"Effect":"Allow","Principal":"*","Action":"s3:GetObject","Resource":"arn:aws:s3:::${bucketName}/*"}]}"""

      for {
        _ <- client.sendIO(
          PutBucketPolicyCommand(
            PutBucketPolicyCommandInput(
              Bucket = bucketName,
              Policy = policy
            )
          )
        )
        _ <- client.sendIO(
          DeleteBucketPolicyCommand(
            DeleteBucketPolicyCommandInput(Bucket = bucketName)
          )
        )
        result <- client
          .sendIO(
            GetBucketPolicyCommand(
              GetBucketPolicyCommandInput(Bucket = bucketName)
            )
          )
          .attempt
      } yield {
        assert(result.isLeft)
      }
  }

}
