package com.filippodeluca.jsfacade.awssdk
package client
package s3

import scalajs.js
import models.*
import commands.*

class DeleteObjectsTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("DeleteObjects should delete multiple objects") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = "a.txt",
              Body = "a"
            )
          )
        )
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = "b.txt",
              Body = "b"
            )
          )
        )
        result <- client.sendIO(
          DeleteObjectsCommand(
            DeleteObjectsCommandInput(
              Bucket = bucketName,
              Delete = Delete(
                Objects = js.Array(
                  ObjectIdentifier(Key = "a.txt"),
                  ObjectIdentifier(Key = "b.txt")
                )
              )
            )
          )
        )
        list <- client.sendIO(
          ListObjectsV2Command(
            ListObjectsV2CommandInput(Bucket = bucketName)
          )
        )
      } yield {
        assert(result.Deleted.isDefined)
        assertEquals(result.Deleted.get.length, 2)
        assertEquals(list.KeyCount.toOption, Some(0))
      }
  }

}
