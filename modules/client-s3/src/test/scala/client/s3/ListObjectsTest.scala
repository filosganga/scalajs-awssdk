package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models._
import commands._

class ListObjectsTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("ListObjects should list objects in a bucket") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(Bucket = bucketName, Key = "file1.txt", Body = "a")
          )
        )
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(Bucket = bucketName, Key = "file2.txt", Body = "b")
          )
        )
        result <- client.sendIO(
          ListObjectsCommand(
            ListObjectsCommandInput(Bucket = bucketName)
          )
        )
      } yield {
        assert(result.Contents.isDefined)
        assertEquals(result.Contents.get.length, 2)
      }
  }

}
