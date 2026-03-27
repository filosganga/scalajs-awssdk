package com.filippodeluca.jsfacade.awssdk
package client
package s3

import cats.effect.IO

import models.*
import commands.*

class CopyObjectTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("CopyObject should copy an object within the same bucket") {
    case (client, bucketName) =>
      for {
        _ <- client.sendIO(
          PutObjectCommand(
            PutObjectCommandInput(
              Bucket = bucketName,
              Key = "source.txt",
              Body = "copy me"
            )
          )
        )
        result <- client.sendIO(
          CopyObjectCommand(
            CopyObjectCommandInput(
              Bucket = bucketName,
              Key = "dest.txt",
              CopySource = s"${bucketName}/source.txt"
            )
          )
        )
        get <- client.sendIO(
          GetObjectCommand(
            GetObjectCommandInput(Bucket = bucketName, Key = "dest.txt")
          )
        )
        body <- IO.fromPromise(IO(get.Body.get.transformToString()))
      } yield {
        assert(result.CopyObjectResult.isDefined)
        assertEquals(body, "copy me")
      }
  }

}
