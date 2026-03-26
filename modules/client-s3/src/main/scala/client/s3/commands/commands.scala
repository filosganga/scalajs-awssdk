package com.filippodeluca.jsfacade.awssdk
package client
package s3
package commands

import com.filippodeluca.jsfacade.awssdk.client.s3.models._
import scalajs.js
import scalajs.js.annotation.JSImport

@js.native
@JSImport("@aws-sdk/client-s3", "GetObjectCommand")
class GetObjectCommand(override val input: GetObjectCommandInput)
    extends Command[GetObjectCommandInput, GetObjectCommandOutput]

object GetObjectCommand {
  def apply(input: GetObjectCommandInput): GetObjectCommand =
    new GetObjectCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutObjectCommand")
class PutObjectCommand(override val input: PutObjectCommandInput)
    extends Command[PutObjectCommandInput, PutObjectCommandOutput]

object PutObjectCommand {
  def apply(input: PutObjectCommandInput): PutObjectCommand =
    new PutObjectCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "CreateBucketCommand")
class CreateBucketCommand(override val input: CreateBucketCommandInput)
    extends Command[CreateBucketCommandInput, CreateBucketCommandOutput]

object CreateBucketCommand {
  def apply(input: CreateBucketCommandInput): CreateBucketCommand =
    new CreateBucketCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketCommand")
class DeleteBucketCommand(override val input: DeleteBucketCommandInput)
    extends Command[DeleteBucketCommandInput, DeleteBucketCommandOutput]

object DeleteBucketCommand {
  def apply(input: DeleteBucketCommandInput): DeleteBucketCommand =
    new DeleteBucketCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteObjectCommand")
class DeleteObjectCommand(override val input: DeleteObjectCommandInput)
    extends Command[DeleteObjectCommandInput, DeleteObjectCommandOutput]

object DeleteObjectCommand {
  def apply(input: DeleteObjectCommandInput): DeleteObjectCommand =
    new DeleteObjectCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "ListObjectsV2Command")
class ListObjectsV2Command(override val input: ListObjectsV2CommandInput)
    extends Command[ListObjectsV2CommandInput, ListObjectsV2CommandOutput]

object ListObjectsV2Command {
  def apply(input: ListObjectsV2CommandInput): ListObjectsV2Command =
    new ListObjectsV2Command(
      input
    )
}
