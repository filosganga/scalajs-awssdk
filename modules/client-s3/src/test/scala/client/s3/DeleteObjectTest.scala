package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models._
import commands._

class DeleteObjectTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("DeleteObject should delete an existing object") {
    case (client, bucketName) =>
      val key = "to-delete.txt"

      for {
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(Bucket = bucketName, Key = key, Body = "bye")
          )
        )
        _ <- client.sendIO(
          DeleteObjectCommand(
            DeleteObjectCommandInput(Bucket = bucketName, Key = key)
          )
        )
        list <- client.sendIO(
          ListObjectsV2Command(
            ListObjectsV2CommandInput(Bucket = bucketName)
          )
        )
      } yield {
        assertEquals(list.KeyCount.toOption, Some(0))
      }
  }

}
