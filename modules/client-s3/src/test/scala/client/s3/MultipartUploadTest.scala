package com.filippodeluca.jsfacade.awssdk
package client
package s3

import cats.effect._

import scalajs.js
import scalajs.js.JSConverters._
import models._
import commands._

class MultipartUploadTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("CreateMultipartUpload and AbortMultipartUpload") {
    case (client, bucketName) =>
      val key = "multipart-abort.txt"

      for {
        create <- client.sendIO(
          CreateMultipartUploadCommand(
            CreateMultipartUploadCommandInput(
              Bucket = bucketName,
              Key = key,
              ContentType = "text/plain"
            )
          )
        )
        _ = assert(create.UploadId.isDefined)
        abort <- client.sendIO(
          AbortMultipartUploadCommand(
            AbortMultipartUploadCommandInput(
              Bucket = bucketName,
              Key = key,
              UploadId = create.UploadId.get
            )
          )
        )
      } yield {
        assert(abort.$metadata.httpStatusCode.contains(204))
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("ListMultipartUploads should list in-progress uploads") {
    case (client, bucketName) =>
      val key = "multipart-list.txt"

      for {
        create <- client.sendIO(
          CreateMultipartUploadCommand(
            CreateMultipartUploadCommandInput(
              Bucket = bucketName,
              Key = key
            )
          )
        )
        list <- client.sendIO(
          ListMultipartUploadsCommand(
            ListMultipartUploadsCommandInput(Bucket = bucketName)
          )
        )
        _ <- client.sendIO(
          AbortMultipartUploadCommand(
            AbortMultipartUploadCommandInput(
              Bucket = bucketName,
              Key = key,
              UploadId = create.UploadId.get
            )
          )
        )
      } yield {
        assert(list.Uploads.isDefined)
        assert(list.Uploads.get.exists(_.Key.toOption.contains(key)))
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("Full multipart upload: create, upload parts, complete") {
    case (client, bucketName) =>
      val key = "multipart-complete.txt"
      // Minimum part size is 5MB for all parts except the last
      val partSize = 5 * 1024 * 1024
      val part1Data = new js.typedarray.Uint8Array(partSize)
      val part2Data = new js.typedarray.Uint8Array(100)

      for {
        create <- client.sendIO(
          CreateMultipartUploadCommand(
            CreateMultipartUploadCommandInput(
              Bucket = bucketName,
              Key = key
            )
          )
        )
        uploadId = create.UploadId.get
        upload1 <- client.sendIO(
          UploadPartCommand(
            UploadPartCommandInput(
              Bucket = bucketName,
              Key = key,
              UploadId = uploadId,
              PartNumber = 1,
              Body = part1Data
            )
          )
        )
        upload2 <- client.sendIO(
          UploadPartCommand(
            UploadPartCommandInput(
              Bucket = bucketName,
              Key = key,
              UploadId = uploadId,
              PartNumber = 2,
              Body = part2Data
            )
          )
        )
        complete <- client.sendIO(
          CompleteMultipartUploadCommand(
            CompleteMultipartUploadCommandInput(
              Bucket = bucketName,
              Key = key,
              UploadId = uploadId,
              MultipartUpload = CompletedMultipartUpload(
                Parts = js.Array(
                  CompletedPart(ETag = upload1.ETag.get, PartNumber = 1),
                  CompletedPart(ETag = upload2.ETag.get, PartNumber = 2)
                )
              )
            )
          )
        )
        head <- client.sendIO(
          HeadObjectCommand(
            HeadObjectCommandInput(Bucket = bucketName, Key = key)
          )
        )
      } yield {
        assert(complete.ETag.isDefined)
        assertEquals(
          head.ContentLength.toOption.map(_.toLong),
          Some((partSize + 100).toLong)
        )
      }
  }

}
