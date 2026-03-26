package com.filippodeluca.jsfacade.awssdk
package client
package s3
package models

import com.filippodeluca.jsfacade.awssdk.types.*
import scalajs.js

@js.native
trait SdkStream extends js.Object {
  def transformToByteArray(): js.Promise[js.typedarray.Uint8Array] = js.native
  def transformToString(
      encoding: js.UndefOr[String] = js.undefined
  ): js.Promise[String] = js.native
}

@js.native
trait S3Object extends js.Object {
  val Key: js.UndefOr[String] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val ETag: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[js.Array[ChecksumAlgorithm]] = js.native
  val Size: js.UndefOr[Double] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val Owner: js.UndefOr[Owner] = js.native
}

@js.native
trait S3Error extends js.Object {
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val Code: js.UndefOr[String] = js.native
  val Message: js.UndefOr[String] = js.native
}

@js.native
trait MetricsFilter extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
  val Tag: js.UndefOr[Tag] = js.native
  val And: js.UndefOr[MetricsAndOperator] = js.native
  val AccessPointArn: js.UndefOr[String] = js.native
}

@js.native
trait MetricsAndOperator extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
  val Tags: js.UndefOr[js.Array[Tag]] = js.native
  val AccessPointArn: js.UndefOr[String] = js.native
}

@js.native
trait AnalyticsFilter extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
  val Tag: js.UndefOr[Tag] = js.native
  val And: js.UndefOr[AnalyticsAndOperator] = js.native
}

@js.native
trait AnalyticsAndOperator extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
  val Tags: js.UndefOr[js.Array[Tag]] = js.native
}

@js.native
trait NotificationConfiguration extends js.Object {
  val TopicConfigurations: js.UndefOr[js.Array[TopicConfiguration]] = js.native
  val QueueConfigurations: js.UndefOr[js.Array[QueueConfiguration]] = js.native
  val LambdaFunctionConfigurations
      : js.UndefOr[js.Array[LambdaFunctionConfiguration]] = js.native
  val EventBridgeConfiguration: js.UndefOr[EventBridgeConfiguration] = js.native
}

@js.native
trait SelectObjectContentEventStream extends js.Object

@js.native
trait ObjectEncryption extends js.Object

@js.native
trait AbortMultipartUploadCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val UploadId: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val IfMatchInitiatedTime: js.UndefOr[js.Date] = js.native
}

object AbortMultipartUploadCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      UploadId: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      IfMatchInitiatedTime: js.UndefOr[js.Date] = js.undefined
  ): AbortMultipartUploadCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        UploadId = UploadId.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        IfMatchInitiatedTime = IfMatchInitiatedTime.asInstanceOf[js.Any]
      )
      .asInstanceOf[AbortMultipartUploadCommandInput]
  }
}

@js.native
trait AbortMultipartUploadCommandOutput extends MetadataBearer {
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait CompleteMultipartUploadCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.native
  val UploadId: js.UndefOr[String] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
  val MpuObjectSize: js.UndefOr[Double] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val IfMatch: js.UndefOr[String] = js.native
  val IfNoneMatch: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
}

object CompleteMultipartUploadCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.undefined,
      UploadId: js.UndefOr[String] = js.undefined,
      ChecksumCRC32: js.UndefOr[String] = js.undefined,
      ChecksumCRC32C: js.UndefOr[String] = js.undefined,
      ChecksumCRC64NVME: js.UndefOr[String] = js.undefined,
      ChecksumSHA1: js.UndefOr[String] = js.undefined,
      ChecksumSHA256: js.UndefOr[String] = js.undefined,
      ChecksumType: js.UndefOr[ChecksumType] = js.undefined,
      MpuObjectSize: js.UndefOr[Double] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      IfMatch: js.UndefOr[String] = js.undefined,
      IfNoneMatch: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined
  ): CompleteMultipartUploadCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        MultipartUpload = MultipartUpload.asInstanceOf[js.Any],
        UploadId = UploadId.asInstanceOf[js.Any],
        ChecksumCRC32 = ChecksumCRC32.asInstanceOf[js.Any],
        ChecksumCRC32C = ChecksumCRC32C.asInstanceOf[js.Any],
        ChecksumCRC64NVME = ChecksumCRC64NVME.asInstanceOf[js.Any],
        ChecksumSHA1 = ChecksumSHA1.asInstanceOf[js.Any],
        ChecksumSHA256 = ChecksumSHA256.asInstanceOf[js.Any],
        ChecksumType = ChecksumType.asInstanceOf[js.Any],
        MpuObjectSize = MpuObjectSize.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        IfMatch = IfMatch.asInstanceOf[js.Any],
        IfNoneMatch = IfNoneMatch.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any]
      )
      .asInstanceOf[CompleteMultipartUploadCommandInput]
  }
}

@js.native
trait CompleteMultipartUploadCommandOutput extends MetadataBearer {
  val Location: js.UndefOr[String] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val Expiration: js.UndefOr[String] = js.native
  val ETag: js.UndefOr[String] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait CopyObjectCommandInput extends js.Object {
  val ACL: js.UndefOr[ObjectCannedACL] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val CacheControl: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ContentDisposition: js.UndefOr[String] = js.native
  val ContentEncoding: js.UndefOr[String] = js.native
  val ContentLanguage: js.UndefOr[String] = js.native
  val ContentType: js.UndefOr[String] = js.native
  val CopySource: js.UndefOr[String] = js.native
  val CopySourceIfMatch: js.UndefOr[String] = js.native
  val CopySourceIfModifiedSince: js.UndefOr[js.Date] = js.native
  val CopySourceIfNoneMatch: js.UndefOr[String] = js.native
  val CopySourceIfUnmodifiedSince: js.UndefOr[js.Date] = js.native
  val Expires: js.UndefOr[js.Date] = js.native
  val GrantFullControl: js.UndefOr[String] = js.native
  val GrantRead: js.UndefOr[String] = js.native
  val GrantReadACP: js.UndefOr[String] = js.native
  val GrantWriteACP: js.UndefOr[String] = js.native
  val IfMatch: js.UndefOr[String] = js.native
  val IfNoneMatch: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val Metadata: js.UndefOr[js.Dictionary[String]] = js.native
  val MetadataDirective: js.UndefOr[MetadataDirective] = js.native
  val TaggingDirective: js.UndefOr[TaggingDirective] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val WebsiteRedirectLocation: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val SSEKMSEncryptionContext: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val CopySourceSSECustomerAlgorithm: js.UndefOr[String] = js.native
  val CopySourceSSECustomerKey: js.UndefOr[String] = js.native
  val CopySourceSSECustomerKeyMD5: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val Tagging: js.UndefOr[String] = js.native
  val ObjectLockMode: js.UndefOr[ObjectLockMode] = js.native
  val ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.native
  val ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
    js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val ExpectedSourceBucketOwner: js.UndefOr[String] = js.native
}

object CopyObjectCommandInput {
  def apply(
      ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      Bucket: js.UndefOr[String] = js.undefined,
      CacheControl: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ContentDisposition: js.UndefOr[String] = js.undefined,
      ContentEncoding: js.UndefOr[String] = js.undefined,
      ContentLanguage: js.UndefOr[String] = js.undefined,
      ContentType: js.UndefOr[String] = js.undefined,
      CopySource: js.UndefOr[String] = js.undefined,
      CopySourceIfMatch: js.UndefOr[String] = js.undefined,
      CopySourceIfModifiedSince: js.UndefOr[js.Date] = js.undefined,
      CopySourceIfNoneMatch: js.UndefOr[String] = js.undefined,
      CopySourceIfUnmodifiedSince: js.UndefOr[js.Date] = js.undefined,
      Expires: js.UndefOr[js.Date] = js.undefined,
      GrantFullControl: js.UndefOr[String] = js.undefined,
      GrantRead: js.UndefOr[String] = js.undefined,
      GrantReadACP: js.UndefOr[String] = js.undefined,
      GrantWriteACP: js.UndefOr[String] = js.undefined,
      IfMatch: js.UndefOr[String] = js.undefined,
      IfNoneMatch: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      Metadata: js.UndefOr[js.Dictionary[String]] = js.undefined,
      MetadataDirective: js.UndefOr[MetadataDirective] = js.undefined,
      TaggingDirective: js.UndefOr[TaggingDirective] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      WebsiteRedirectLocation: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      SSEKMSKeyId: js.UndefOr[String] = js.undefined,
      SSEKMSEncryptionContext: js.UndefOr[String] = js.undefined,
      BucketKeyEnabled: js.UndefOr[Boolean] = js.undefined,
      CopySourceSSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      CopySourceSSECustomerKey: js.UndefOr[String] = js.undefined,
      CopySourceSSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      Tagging: js.UndefOr[String] = js.undefined,
      ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined,
      ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.undefined,
      ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
        js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      ExpectedSourceBucketOwner: js.UndefOr[String] = js.undefined
  ): CopyObjectCommandInput = {
    js.Dynamic
      .literal(
        ACL = ACL.asInstanceOf[js.Any],
        Bucket = Bucket.asInstanceOf[js.Any],
        CacheControl = CacheControl.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ContentDisposition = ContentDisposition.asInstanceOf[js.Any],
        ContentEncoding = ContentEncoding.asInstanceOf[js.Any],
        ContentLanguage = ContentLanguage.asInstanceOf[js.Any],
        ContentType = ContentType.asInstanceOf[js.Any],
        CopySource = CopySource.asInstanceOf[js.Any],
        CopySourceIfMatch = CopySourceIfMatch.asInstanceOf[js.Any],
        CopySourceIfModifiedSince =
          CopySourceIfModifiedSince.asInstanceOf[js.Any],
        CopySourceIfNoneMatch = CopySourceIfNoneMatch.asInstanceOf[js.Any],
        CopySourceIfUnmodifiedSince =
          CopySourceIfUnmodifiedSince.asInstanceOf[js.Any],
        Expires = Expires.asInstanceOf[js.Any],
        GrantFullControl = GrantFullControl.asInstanceOf[js.Any],
        GrantRead = GrantRead.asInstanceOf[js.Any],
        GrantReadACP = GrantReadACP.asInstanceOf[js.Any],
        GrantWriteACP = GrantWriteACP.asInstanceOf[js.Any],
        IfMatch = IfMatch.asInstanceOf[js.Any],
        IfNoneMatch = IfNoneMatch.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        Metadata = Metadata.asInstanceOf[js.Any],
        MetadataDirective = MetadataDirective.asInstanceOf[js.Any],
        TaggingDirective = TaggingDirective.asInstanceOf[js.Any],
        ServerSideEncryption = ServerSideEncryption.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any],
        WebsiteRedirectLocation = WebsiteRedirectLocation.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        SSEKMSKeyId = SSEKMSKeyId.asInstanceOf[js.Any],
        SSEKMSEncryptionContext = SSEKMSEncryptionContext.asInstanceOf[js.Any],
        BucketKeyEnabled = BucketKeyEnabled.asInstanceOf[js.Any],
        CopySourceSSECustomerAlgorithm =
          CopySourceSSECustomerAlgorithm.asInstanceOf[js.Any],
        CopySourceSSECustomerKey =
          CopySourceSSECustomerKey.asInstanceOf[js.Any],
        CopySourceSSECustomerKeyMD5 =
          CopySourceSSECustomerKeyMD5.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        Tagging = Tagging.asInstanceOf[js.Any],
        ObjectLockMode = ObjectLockMode.asInstanceOf[js.Any],
        ObjectLockRetainUntilDate =
          ObjectLockRetainUntilDate.asInstanceOf[js.Any],
        ObjectLockLegalHoldStatus =
          ObjectLockLegalHoldStatus.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        ExpectedSourceBucketOwner =
          ExpectedSourceBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[CopyObjectCommandInput]
  }
}

@js.native
trait CopyObjectCommandOutput extends MetadataBearer {
  val CopyObjectResult: js.UndefOr[CopyObjectResult] = js.native
  val Expiration: js.UndefOr[String] = js.native
  val CopySourceVersionId: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val SSEKMSEncryptionContext: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait CreateBucketCommandInput extends js.Object {
  val ACL: js.UndefOr[BucketCannedACL] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val CreateBucketConfiguration: js.UndefOr[CreateBucketConfiguration] =
    js.native
  val GrantFullControl: js.UndefOr[String] = js.native
  val GrantRead: js.UndefOr[String] = js.native
  val GrantReadACP: js.UndefOr[String] = js.native
  val GrantWrite: js.UndefOr[String] = js.native
  val GrantWriteACP: js.UndefOr[String] = js.native
  val ObjectLockEnabledForBucket: js.UndefOr[Boolean] = js.native
  val ObjectOwnership: js.UndefOr[ObjectOwnership] = js.native
  val BucketNamespace: js.UndefOr[BucketNamespace] = js.native
}

object CreateBucketCommandInput {
  def apply(
      ACL: js.UndefOr[BucketCannedACL] = js.undefined,
      Bucket: js.UndefOr[String] = js.undefined,
      CreateBucketConfiguration: js.UndefOr[CreateBucketConfiguration] =
        js.undefined,
      GrantFullControl: js.UndefOr[String] = js.undefined,
      GrantRead: js.UndefOr[String] = js.undefined,
      GrantReadACP: js.UndefOr[String] = js.undefined,
      GrantWrite: js.UndefOr[String] = js.undefined,
      GrantWriteACP: js.UndefOr[String] = js.undefined,
      ObjectLockEnabledForBucket: js.UndefOr[Boolean] = js.undefined,
      ObjectOwnership: js.UndefOr[ObjectOwnership] = js.undefined,
      BucketNamespace: js.UndefOr[BucketNamespace] = js.undefined
  ): CreateBucketCommandInput = {
    js.Dynamic
      .literal(
        ACL = ACL.asInstanceOf[js.Any],
        Bucket = Bucket.asInstanceOf[js.Any],
        CreateBucketConfiguration =
          CreateBucketConfiguration.asInstanceOf[js.Any],
        GrantFullControl = GrantFullControl.asInstanceOf[js.Any],
        GrantRead = GrantRead.asInstanceOf[js.Any],
        GrantReadACP = GrantReadACP.asInstanceOf[js.Any],
        GrantWrite = GrantWrite.asInstanceOf[js.Any],
        GrantWriteACP = GrantWriteACP.asInstanceOf[js.Any],
        ObjectLockEnabledForBucket =
          ObjectLockEnabledForBucket.asInstanceOf[js.Any],
        ObjectOwnership = ObjectOwnership.asInstanceOf[js.Any],
        BucketNamespace = BucketNamespace.asInstanceOf[js.Any]
      )
      .asInstanceOf[CreateBucketCommandInput]
  }
}

@js.native
trait CreateBucketCommandOutput extends MetadataBearer {
  val Location: js.UndefOr[String] = js.native
  val BucketArn: js.UndefOr[String] = js.native
}

@js.native
trait CreateBucketMetadataConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val MetadataConfiguration: js.UndefOr[MetadataConfiguration] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object CreateBucketMetadataConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      MetadataConfiguration: js.UndefOr[MetadataConfiguration] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): CreateBucketMetadataConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        MetadataConfiguration = MetadataConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[CreateBucketMetadataConfigurationCommandInput]
  }
}

@js.native
trait CreateBucketMetadataConfigurationCommandOutput extends MetadataBearer

@js.native
trait CreateBucketMetadataTableConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val MetadataTableConfiguration: js.UndefOr[MetadataTableConfiguration] =
    js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object CreateBucketMetadataTableConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      MetadataTableConfiguration: js.UndefOr[MetadataTableConfiguration] =
        js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): CreateBucketMetadataTableConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        MetadataTableConfiguration =
          MetadataTableConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[CreateBucketMetadataTableConfigurationCommandInput]
  }
}

@js.native
trait CreateBucketMetadataTableConfigurationCommandOutput extends MetadataBearer

@js.native
trait CreateMultipartUploadCommandInput extends js.Object {
  val ACL: js.UndefOr[ObjectCannedACL] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val CacheControl: js.UndefOr[String] = js.native
  val ContentDisposition: js.UndefOr[String] = js.native
  val ContentEncoding: js.UndefOr[String] = js.native
  val ContentLanguage: js.UndefOr[String] = js.native
  val ContentType: js.UndefOr[String] = js.native
  val Expires: js.UndefOr[js.Date] = js.native
  val GrantFullControl: js.UndefOr[String] = js.native
  val GrantRead: js.UndefOr[String] = js.native
  val GrantReadACP: js.UndefOr[String] = js.native
  val GrantWriteACP: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val Metadata: js.UndefOr[js.Dictionary[String]] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val WebsiteRedirectLocation: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val SSEKMSEncryptionContext: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val Tagging: js.UndefOr[String] = js.native
  val ObjectLockMode: js.UndefOr[ObjectLockMode] = js.native
  val ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.native
  val ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
    js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
}

object CreateMultipartUploadCommandInput {
  def apply(
      ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      Bucket: js.UndefOr[String] = js.undefined,
      CacheControl: js.UndefOr[String] = js.undefined,
      ContentDisposition: js.UndefOr[String] = js.undefined,
      ContentEncoding: js.UndefOr[String] = js.undefined,
      ContentLanguage: js.UndefOr[String] = js.undefined,
      ContentType: js.UndefOr[String] = js.undefined,
      Expires: js.UndefOr[js.Date] = js.undefined,
      GrantFullControl: js.UndefOr[String] = js.undefined,
      GrantRead: js.UndefOr[String] = js.undefined,
      GrantReadACP: js.UndefOr[String] = js.undefined,
      GrantWriteACP: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      Metadata: js.UndefOr[js.Dictionary[String]] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      WebsiteRedirectLocation: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      SSEKMSKeyId: js.UndefOr[String] = js.undefined,
      SSEKMSEncryptionContext: js.UndefOr[String] = js.undefined,
      BucketKeyEnabled: js.UndefOr[Boolean] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      Tagging: js.UndefOr[String] = js.undefined,
      ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined,
      ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.undefined,
      ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
        js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ChecksumType: js.UndefOr[ChecksumType] = js.undefined
  ): CreateMultipartUploadCommandInput = {
    js.Dynamic
      .literal(
        ACL = ACL.asInstanceOf[js.Any],
        Bucket = Bucket.asInstanceOf[js.Any],
        CacheControl = CacheControl.asInstanceOf[js.Any],
        ContentDisposition = ContentDisposition.asInstanceOf[js.Any],
        ContentEncoding = ContentEncoding.asInstanceOf[js.Any],
        ContentLanguage = ContentLanguage.asInstanceOf[js.Any],
        ContentType = ContentType.asInstanceOf[js.Any],
        Expires = Expires.asInstanceOf[js.Any],
        GrantFullControl = GrantFullControl.asInstanceOf[js.Any],
        GrantRead = GrantRead.asInstanceOf[js.Any],
        GrantReadACP = GrantReadACP.asInstanceOf[js.Any],
        GrantWriteACP = GrantWriteACP.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        Metadata = Metadata.asInstanceOf[js.Any],
        ServerSideEncryption = ServerSideEncryption.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any],
        WebsiteRedirectLocation = WebsiteRedirectLocation.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        SSEKMSKeyId = SSEKMSKeyId.asInstanceOf[js.Any],
        SSEKMSEncryptionContext = SSEKMSEncryptionContext.asInstanceOf[js.Any],
        BucketKeyEnabled = BucketKeyEnabled.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        Tagging = Tagging.asInstanceOf[js.Any],
        ObjectLockMode = ObjectLockMode.asInstanceOf[js.Any],
        ObjectLockRetainUntilDate =
          ObjectLockRetainUntilDate.asInstanceOf[js.Any],
        ObjectLockLegalHoldStatus =
          ObjectLockLegalHoldStatus.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ChecksumType = ChecksumType.asInstanceOf[js.Any]
      )
      .asInstanceOf[CreateMultipartUploadCommandInput]
  }
}

@js.native
trait CreateMultipartUploadCommandOutput extends MetadataBearer {
  val AbortDate: js.UndefOr[js.Date] = js.native
  val AbortRuleId: js.UndefOr[String] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val UploadId: js.UndefOr[String] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val SSEKMSEncryptionContext: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
}

@js.native
trait CreateSessionCommandInput extends js.Object {
  val SessionMode: js.UndefOr[SessionMode] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val SSEKMSEncryptionContext: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
}

object CreateSessionCommandInput {
  def apply(
      SessionMode: js.UndefOr[SessionMode] = js.undefined,
      Bucket: js.UndefOr[String] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      SSEKMSKeyId: js.UndefOr[String] = js.undefined,
      SSEKMSEncryptionContext: js.UndefOr[String] = js.undefined,
      BucketKeyEnabled: js.UndefOr[Boolean] = js.undefined
  ): CreateSessionCommandInput = {
    js.Dynamic
      .literal(
        SessionMode = SessionMode.asInstanceOf[js.Any],
        Bucket = Bucket.asInstanceOf[js.Any],
        ServerSideEncryption = ServerSideEncryption.asInstanceOf[js.Any],
        SSEKMSKeyId = SSEKMSKeyId.asInstanceOf[js.Any],
        SSEKMSEncryptionContext = SSEKMSEncryptionContext.asInstanceOf[js.Any],
        BucketKeyEnabled = BucketKeyEnabled.asInstanceOf[js.Any]
      )
      .asInstanceOf[CreateSessionCommandInput]
  }
}

@js.native
trait CreateSessionCommandOutput extends MetadataBearer {
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val SSEKMSEncryptionContext: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val Credentials: js.UndefOr[SessionCredentials] = js.native
}

@js.native
trait DeleteBucketAnalyticsConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketAnalyticsConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketAnalyticsConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketAnalyticsConfigurationCommandInput]
  }
}

@js.native
trait DeleteBucketAnalyticsConfigurationCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketCommandInput]
  }
}

@js.native
trait DeleteBucketCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketCorsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketCorsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketCorsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketCorsCommandInput]
  }
}

@js.native
trait DeleteBucketCorsCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketEncryptionCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketEncryptionCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketEncryptionCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketEncryptionCommandInput]
  }
}

@js.native
trait DeleteBucketEncryptionCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketIntelligentTieringConfigurationCommandInput
    extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketIntelligentTieringConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketIntelligentTieringConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketIntelligentTieringConfigurationCommandInput]
  }
}

@js.native
trait DeleteBucketIntelligentTieringConfigurationCommandOutput
    extends MetadataBearer

@js.native
trait DeleteBucketInventoryConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketInventoryConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketInventoryConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketInventoryConfigurationCommandInput]
  }
}

@js.native
trait DeleteBucketInventoryConfigurationCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketLifecycleCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketLifecycleCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketLifecycleCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketLifecycleCommandInput]
  }
}

@js.native
trait DeleteBucketLifecycleCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketMetadataConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketMetadataConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketMetadataConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketMetadataConfigurationCommandInput]
  }
}

@js.native
trait DeleteBucketMetadataConfigurationCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketMetadataTableConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketMetadataTableConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketMetadataTableConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketMetadataTableConfigurationCommandInput]
  }
}

@js.native
trait DeleteBucketMetadataTableConfigurationCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketMetricsConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketMetricsConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketMetricsConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketMetricsConfigurationCommandInput]
  }
}

@js.native
trait DeleteBucketMetricsConfigurationCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketOwnershipControlsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketOwnershipControlsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketOwnershipControlsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketOwnershipControlsCommandInput]
  }
}

@js.native
trait DeleteBucketOwnershipControlsCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketPolicyCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketPolicyCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketPolicyCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketPolicyCommandInput]
  }
}

@js.native
trait DeleteBucketPolicyCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketReplicationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketReplicationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketReplicationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketReplicationCommandInput]
  }
}

@js.native
trait DeleteBucketReplicationCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketTaggingCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketTaggingCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketTaggingCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketTaggingCommandInput]
  }
}

@js.native
trait DeleteBucketTaggingCommandOutput extends MetadataBearer

@js.native
trait DeleteBucketWebsiteCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketWebsiteCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketWebsiteCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketWebsiteCommandInput]
  }
}

@js.native
trait DeleteBucketWebsiteCommandOutput extends MetadataBearer

@js.native
trait DeleteObjectCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val MFA: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val BypassGovernanceRetention: js.UndefOr[Boolean] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val IfMatch: js.UndefOr[String] = js.native
  val IfMatchLastModifiedTime: js.UndefOr[js.Date] = js.native
  val IfMatchSize: js.UndefOr[Double] = js.native
}

object DeleteObjectCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      MFA: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      BypassGovernanceRetention: js.UndefOr[Boolean] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      IfMatch: js.UndefOr[String] = js.undefined,
      IfMatchLastModifiedTime: js.UndefOr[js.Date] = js.undefined,
      IfMatchSize: js.UndefOr[Double] = js.undefined
  ): DeleteObjectCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        MFA = MFA.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        BypassGovernanceRetention =
          BypassGovernanceRetention.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        IfMatch = IfMatch.asInstanceOf[js.Any],
        IfMatchLastModifiedTime = IfMatchLastModifiedTime.asInstanceOf[js.Any],
        IfMatchSize = IfMatchSize.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteObjectCommandInput]
  }
}

@js.native
trait DeleteObjectCommandOutput extends MetadataBearer {
  val DeleteMarker: js.UndefOr[Boolean] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait DeleteObjectTaggingCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteObjectTaggingCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteObjectTaggingCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteObjectTaggingCommandInput]
  }
}

@js.native
trait DeleteObjectTaggingCommandOutput extends MetadataBearer {
  val VersionId: js.UndefOr[String] = js.native
}

@js.native
trait DeleteObjectsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Delete: js.UndefOr[Delete] = js.native
  val MFA: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val BypassGovernanceRetention: js.UndefOr[Boolean] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
}

object DeleteObjectsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Delete: js.UndefOr[Delete] = js.undefined,
      MFA: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      BypassGovernanceRetention: js.UndefOr[Boolean] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined
  ): DeleteObjectsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Delete = Delete.asInstanceOf[js.Any],
        MFA = MFA.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        BypassGovernanceRetention =
          BypassGovernanceRetention.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteObjectsCommandInput]
  }
}

@js.native
trait DeleteObjectsCommandOutput extends MetadataBearer {
  val Deleted: js.UndefOr[js.Array[DeletedObject]] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
  val Errors: js.UndefOr[js.Array[S3Error]] = js.native
}

@js.native
trait DeletePublicAccessBlockCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeletePublicAccessBlockCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeletePublicAccessBlockCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeletePublicAccessBlockCommandInput]
  }
}

@js.native
trait DeletePublicAccessBlockCommandOutput extends MetadataBearer

@js.native
trait GetBucketAbacCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketAbacCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketAbacCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketAbacCommandInput]
  }
}

@js.native
trait GetBucketAbacCommandOutput extends MetadataBearer {
  val AbacStatus: js.UndefOr[AbacStatus] = js.native
}

@js.native
trait GetBucketAccelerateConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
}

object GetBucketAccelerateConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  ): GetBucketAccelerateConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketAccelerateConfigurationCommandInput]
  }
}

@js.native
trait GetBucketAccelerateConfigurationCommandOutput extends MetadataBearer {
  val Status: js.UndefOr[BucketAccelerateStatus] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait GetBucketAclCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketAclCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketAclCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketAclCommandInput]
  }
}

@js.native
trait GetBucketAclCommandOutput extends MetadataBearer {
  val Owner: js.UndefOr[Owner] = js.native
  val Grants: js.UndefOr[js.Array[Grant]] = js.native
}

@js.native
trait GetBucketAnalyticsConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketAnalyticsConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketAnalyticsConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketAnalyticsConfigurationCommandInput]
  }
}

@js.native
trait GetBucketAnalyticsConfigurationCommandOutput extends MetadataBearer {
  val AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration] = js.native
}

@js.native
trait GetBucketCorsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketCorsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketCorsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketCorsCommandInput]
  }
}

@js.native
trait GetBucketCorsCommandOutput extends MetadataBearer {
  val CORSRules: js.UndefOr[js.Array[CORSRule]] = js.native
}

@js.native
trait GetBucketEncryptionCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketEncryptionCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketEncryptionCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketEncryptionCommandInput]
  }
}

@js.native
trait GetBucketEncryptionCommandOutput extends MetadataBearer {
  val ServerSideEncryptionConfiguration
      : js.UndefOr[ServerSideEncryptionConfiguration] = js.native
}

@js.native
trait GetBucketIntelligentTieringConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketIntelligentTieringConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketIntelligentTieringConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketIntelligentTieringConfigurationCommandInput]
  }
}

@js.native
trait GetBucketIntelligentTieringConfigurationCommandOutput
    extends MetadataBearer {
  val IntelligentTieringConfiguration
      : js.UndefOr[IntelligentTieringConfiguration] = js.native
}

@js.native
trait GetBucketInventoryConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketInventoryConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketInventoryConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketInventoryConfigurationCommandInput]
  }
}

@js.native
trait GetBucketInventoryConfigurationCommandOutput extends MetadataBearer {
  val InventoryConfiguration: js.UndefOr[InventoryConfiguration] = js.native
}

@js.native
trait GetBucketLifecycleConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketLifecycleConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketLifecycleConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketLifecycleConfigurationCommandInput]
  }
}

@js.native
trait GetBucketLifecycleConfigurationCommandOutput extends MetadataBearer {
  val Rules: js.UndefOr[js.Array[LifecycleRule]] = js.native
  val TransitionDefaultMinimumObjectSize
      : js.UndefOr[TransitionDefaultMinimumObjectSize] = js.native
}

@js.native
trait GetBucketLocationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketLocationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketLocationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketLocationCommandInput]
  }
}

@js.native
trait GetBucketLocationCommandOutput extends MetadataBearer {
  val LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.native
}

@js.native
trait GetBucketLoggingCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketLoggingCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketLoggingCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketLoggingCommandInput]
  }
}

@js.native
trait GetBucketLoggingCommandOutput extends MetadataBearer {
  val LoggingEnabled: js.UndefOr[LoggingEnabled] = js.native
}

@js.native
trait GetBucketMetadataConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketMetadataConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketMetadataConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketMetadataConfigurationCommandInput]
  }
}

@js.native
trait GetBucketMetadataConfigurationCommandOutput extends MetadataBearer {
  val GetBucketMetadataConfigurationResult
      : js.UndefOr[GetBucketMetadataConfigurationResult] = js.native
}

@js.native
trait GetBucketMetadataTableConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketMetadataTableConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketMetadataTableConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketMetadataTableConfigurationCommandInput]
  }
}

@js.native
trait GetBucketMetadataTableConfigurationCommandOutput extends MetadataBearer {
  val GetBucketMetadataTableConfigurationResult
      : js.UndefOr[GetBucketMetadataTableConfigurationResult] = js.native
}

@js.native
trait GetBucketMetricsConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketMetricsConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketMetricsConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketMetricsConfigurationCommandInput]
  }
}

@js.native
trait GetBucketMetricsConfigurationCommandOutput extends MetadataBearer {
  val MetricsConfiguration: js.UndefOr[MetricsConfiguration] = js.native
}

@js.native
trait GetBucketNotificationConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketNotificationConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketNotificationConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketNotificationConfigurationCommandInput]
  }
}

@js.native
trait GetBucketNotificationConfigurationCommandOutput extends MetadataBearer {
  val TopicConfigurations: js.UndefOr[js.Array[TopicConfiguration]] = js.native
  val QueueConfigurations: js.UndefOr[js.Array[QueueConfiguration]] = js.native
  val LambdaFunctionConfigurations
      : js.UndefOr[js.Array[LambdaFunctionConfiguration]] = js.native
  val EventBridgeConfiguration: js.UndefOr[EventBridgeConfiguration] = js.native
}

@js.native
trait GetBucketOwnershipControlsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketOwnershipControlsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketOwnershipControlsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketOwnershipControlsCommandInput]
  }
}

@js.native
trait GetBucketOwnershipControlsCommandOutput extends MetadataBearer {
  val OwnershipControls: js.UndefOr[OwnershipControls] = js.native
}

@js.native
trait GetBucketPolicyCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketPolicyCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketPolicyCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketPolicyCommandInput]
  }
}

@js.native
trait GetBucketPolicyCommandOutput extends MetadataBearer {
  val Policy: js.UndefOr[String] = js.native
}

@js.native
trait GetBucketPolicyStatusCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketPolicyStatusCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketPolicyStatusCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketPolicyStatusCommandInput]
  }
}

@js.native
trait GetBucketPolicyStatusCommandOutput extends MetadataBearer {
  val PolicyStatus: js.UndefOr[PolicyStatus] = js.native
}

@js.native
trait GetBucketReplicationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketReplicationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketReplicationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketReplicationCommandInput]
  }
}

@js.native
trait GetBucketReplicationCommandOutput extends MetadataBearer {
  val ReplicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.native
}

@js.native
trait GetBucketRequestPaymentCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketRequestPaymentCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketRequestPaymentCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketRequestPaymentCommandInput]
  }
}

@js.native
trait GetBucketRequestPaymentCommandOutput extends MetadataBearer {
  val Payer: js.UndefOr[Payer] = js.native
}

@js.native
trait GetBucketTaggingCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketTaggingCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketTaggingCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketTaggingCommandInput]
  }
}

@js.native
trait GetBucketTaggingCommandOutput extends MetadataBearer {
  val TagSet: js.UndefOr[js.Array[Tag]] = js.native
}

@js.native
trait GetBucketVersioningCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketVersioningCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketVersioningCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketVersioningCommandInput]
  }
}

@js.native
trait GetBucketVersioningCommandOutput extends MetadataBearer {
  val Status: js.UndefOr[BucketVersioningStatus] = js.native
  val MFADelete: js.UndefOr[MFADeleteStatus] = js.native
}

@js.native
trait GetBucketWebsiteCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetBucketWebsiteCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetBucketWebsiteCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketWebsiteCommandInput]
  }
}

@js.native
trait GetBucketWebsiteCommandOutput extends MetadataBearer {
  val RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.native
  val IndexDocument: js.UndefOr[IndexDocument] = js.native
  val ErrorDocument: js.UndefOr[ErrorDocument] = js.native
  val RoutingRules: js.UndefOr[js.Array[RoutingRule]] = js.native
}

@js.native
trait GetObjectAclCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetObjectAclCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetObjectAclCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetObjectAclCommandInput]
  }
}

@js.native
trait GetObjectAclCommandOutput extends MetadataBearer {
  val Owner: js.UndefOr[Owner] = js.native
  val Grants: js.UndefOr[js.Array[Grant]] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait GetObjectAttributesCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val MaxParts: js.UndefOr[Int] = js.native
  val PartNumberMarker: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val ObjectAttributes: js.UndefOr[js.Array[ObjectAttributes]] = js.native
}

object GetObjectAttributesCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      MaxParts: js.UndefOr[Int] = js.undefined,
      PartNumberMarker: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      ObjectAttributes: js.UndefOr[js.Array[ObjectAttributes]] = js.undefined
  ): GetObjectAttributesCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        MaxParts = MaxParts.asInstanceOf[js.Any],
        PartNumberMarker = PartNumberMarker.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        ObjectAttributes = ObjectAttributes.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetObjectAttributesCommandInput]
  }
}

@js.native
trait GetObjectAttributesCommandOutput extends MetadataBearer {
  val DeleteMarker: js.UndefOr[Boolean] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
  val ETag: js.UndefOr[String] = js.native
  val Checksum: js.UndefOr[Checksum] = js.native
  val ObjectParts: js.UndefOr[GetObjectAttributesParts] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val ObjectSize: js.UndefOr[Double] = js.native
}

@js.native
trait GetObjectCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val IfMatch: js.UndefOr[String] = js.native
  val IfModifiedSince: js.UndefOr[js.Date] = js.native
  val IfNoneMatch: js.UndefOr[String] = js.native
  val IfUnmodifiedSince: js.UndefOr[js.Date] = js.native
  val Key: js.UndefOr[String] = js.native
  val Range: js.UndefOr[String] = js.native
  val ResponseCacheControl: js.UndefOr[String] = js.native
  val ResponseContentDisposition: js.UndefOr[String] = js.native
  val ResponseContentEncoding: js.UndefOr[String] = js.native
  val ResponseContentLanguage: js.UndefOr[String] = js.native
  val ResponseContentType: js.UndefOr[String] = js.native
  val ResponseExpires: js.UndefOr[js.Date] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val PartNumber: js.UndefOr[Int] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val ChecksumMode: js.UndefOr[ChecksumMode] = js.native
}

object GetObjectCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      IfMatch: js.UndefOr[String] = js.undefined,
      IfModifiedSince: js.UndefOr[js.Date] = js.undefined,
      IfNoneMatch: js.UndefOr[String] = js.undefined,
      IfUnmodifiedSince: js.UndefOr[js.Date] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      Range: js.UndefOr[String] = js.undefined,
      ResponseCacheControl: js.UndefOr[String] = js.undefined,
      ResponseContentDisposition: js.UndefOr[String] = js.undefined,
      ResponseContentEncoding: js.UndefOr[String] = js.undefined,
      ResponseContentLanguage: js.UndefOr[String] = js.undefined,
      ResponseContentType: js.UndefOr[String] = js.undefined,
      ResponseExpires: js.UndefOr[js.Date] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      PartNumber: js.UndefOr[Int] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      ChecksumMode: js.UndefOr[ChecksumMode] = js.undefined
  ): GetObjectCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        IfMatch = IfMatch.asInstanceOf[js.Any],
        IfModifiedSince = IfModifiedSince.asInstanceOf[js.Any],
        IfNoneMatch = IfNoneMatch.asInstanceOf[js.Any],
        IfUnmodifiedSince = IfUnmodifiedSince.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        Range = Range.asInstanceOf[js.Any],
        ResponseCacheControl = ResponseCacheControl.asInstanceOf[js.Any],
        ResponseContentDisposition =
          ResponseContentDisposition.asInstanceOf[js.Any],
        ResponseContentEncoding = ResponseContentEncoding.asInstanceOf[js.Any],
        ResponseContentLanguage = ResponseContentLanguage.asInstanceOf[js.Any],
        ResponseContentType = ResponseContentType.asInstanceOf[js.Any],
        ResponseExpires = ResponseExpires.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        PartNumber = PartNumber.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        ChecksumMode = ChecksumMode.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetObjectCommandInput]
  }
}

// TODO: Body — streaming/binary type 'StreamingBlobPayloadOutputTypes' — consider using SdkStream, io.Readable, or a more specific type
@js.native
trait GetObjectCommandOutput extends MetadataBearer {
  val DeleteMarker: js.UndefOr[Boolean] = js.native
  val AcceptRanges: js.UndefOr[String] = js.native
  val Expiration: js.UndefOr[String] = js.native
  val Restore: js.UndefOr[String] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val ContentLength: js.UndefOr[Double] = js.native
  val ETag: js.UndefOr[String] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
  val MissingMeta: js.UndefOr[Int] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val CacheControl: js.UndefOr[String] = js.native
  val ContentDisposition: js.UndefOr[String] = js.native
  val ContentEncoding: js.UndefOr[String] = js.native
  val ContentLanguage: js.UndefOr[String] = js.native
  val ContentRange: js.UndefOr[String] = js.native
  val ContentType: js.UndefOr[String] = js.native
  val Expires: js.UndefOr[js.Date] = js.native
  val ExpiresString: js.UndefOr[String] = js.native
  val WebsiteRedirectLocation: js.UndefOr[String] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val Metadata: js.UndefOr[js.Dictionary[String]] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
  val ReplicationStatus: js.UndefOr[ReplicationStatus] = js.native
  val PartsCount: js.UndefOr[Int] = js.native
  val TagCount: js.UndefOr[Int] = js.native
  val ObjectLockMode: js.UndefOr[ObjectLockMode] = js.native
  val ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.native
  val ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
    js.native
  val Body: js.UndefOr[SdkStream] = js.native
}

@js.native
trait GetObjectLegalHoldCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetObjectLegalHoldCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetObjectLegalHoldCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetObjectLegalHoldCommandInput]
  }
}

@js.native
trait GetObjectLegalHoldCommandOutput extends MetadataBearer {
  val LegalHold: js.UndefOr[ObjectLockLegalHold] = js.native
}

@js.native
trait GetObjectLockConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetObjectLockConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetObjectLockConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetObjectLockConfigurationCommandInput]
  }
}

@js.native
trait GetObjectLockConfigurationCommandOutput extends MetadataBearer {
  val ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration] = js.native
}

@js.native
trait GetObjectRetentionCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetObjectRetentionCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetObjectRetentionCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetObjectRetentionCommandInput]
  }
}

@js.native
trait GetObjectRetentionCommandOutput extends MetadataBearer {
  val Retention: js.UndefOr[ObjectLockRetention] = js.native
}

@js.native
trait GetObjectTaggingCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
}

object GetObjectTaggingCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  ): GetObjectTaggingCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetObjectTaggingCommandInput]
  }
}

@js.native
trait GetObjectTaggingCommandOutput extends MetadataBearer {
  val VersionId: js.UndefOr[String] = js.native
  val TagSet: js.UndefOr[js.Array[Tag]] = js.native
}

@js.native
trait GetObjectTorrentCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetObjectTorrentCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetObjectTorrentCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetObjectTorrentCommandInput]
  }
}

// TODO: Body — streaming/binary type 'StreamingBlobPayloadOutputTypes' — consider using SdkStream, io.Readable, or a more specific type
@js.native
trait GetObjectTorrentCommandOutput extends MetadataBearer {
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
  val Body: js.UndefOr[js.Any] = js.native
}

@js.native
trait GetPublicAccessBlockCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object GetPublicAccessBlockCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): GetPublicAccessBlockCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetPublicAccessBlockCommandInput]
  }
}

@js.native
trait GetPublicAccessBlockCommandOutput extends MetadataBearer {
  val PublicAccessBlockConfiguration
      : js.UndefOr[PublicAccessBlockConfiguration] = js.native
}

@js.native
trait HeadBucketCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object HeadBucketCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): HeadBucketCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[HeadBucketCommandInput]
  }
}

@js.native
trait HeadBucketCommandOutput extends MetadataBearer {
  val BucketArn: js.UndefOr[String] = js.native
  val BucketLocationType: js.UndefOr[LocationType] = js.native
  val BucketLocationName: js.UndefOr[String] = js.native
  val BucketRegion: js.UndefOr[String] = js.native
  val AccessPointAlias: js.UndefOr[Boolean] = js.native
}

@js.native
trait HeadObjectCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val IfMatch: js.UndefOr[String] = js.native
  val IfModifiedSince: js.UndefOr[js.Date] = js.native
  val IfNoneMatch: js.UndefOr[String] = js.native
  val IfUnmodifiedSince: js.UndefOr[js.Date] = js.native
  val Key: js.UndefOr[String] = js.native
  val Range: js.UndefOr[String] = js.native
  val ResponseCacheControl: js.UndefOr[String] = js.native
  val ResponseContentDisposition: js.UndefOr[String] = js.native
  val ResponseContentEncoding: js.UndefOr[String] = js.native
  val ResponseContentLanguage: js.UndefOr[String] = js.native
  val ResponseContentType: js.UndefOr[String] = js.native
  val ResponseExpires: js.UndefOr[js.Date] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val PartNumber: js.UndefOr[Int] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val ChecksumMode: js.UndefOr[ChecksumMode] = js.native
}

object HeadObjectCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      IfMatch: js.UndefOr[String] = js.undefined,
      IfModifiedSince: js.UndefOr[js.Date] = js.undefined,
      IfNoneMatch: js.UndefOr[String] = js.undefined,
      IfUnmodifiedSince: js.UndefOr[js.Date] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      Range: js.UndefOr[String] = js.undefined,
      ResponseCacheControl: js.UndefOr[String] = js.undefined,
      ResponseContentDisposition: js.UndefOr[String] = js.undefined,
      ResponseContentEncoding: js.UndefOr[String] = js.undefined,
      ResponseContentLanguage: js.UndefOr[String] = js.undefined,
      ResponseContentType: js.UndefOr[String] = js.undefined,
      ResponseExpires: js.UndefOr[js.Date] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      PartNumber: js.UndefOr[Int] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      ChecksumMode: js.UndefOr[ChecksumMode] = js.undefined
  ): HeadObjectCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        IfMatch = IfMatch.asInstanceOf[js.Any],
        IfModifiedSince = IfModifiedSince.asInstanceOf[js.Any],
        IfNoneMatch = IfNoneMatch.asInstanceOf[js.Any],
        IfUnmodifiedSince = IfUnmodifiedSince.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        Range = Range.asInstanceOf[js.Any],
        ResponseCacheControl = ResponseCacheControl.asInstanceOf[js.Any],
        ResponseContentDisposition =
          ResponseContentDisposition.asInstanceOf[js.Any],
        ResponseContentEncoding = ResponseContentEncoding.asInstanceOf[js.Any],
        ResponseContentLanguage = ResponseContentLanguage.asInstanceOf[js.Any],
        ResponseContentType = ResponseContentType.asInstanceOf[js.Any],
        ResponseExpires = ResponseExpires.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        PartNumber = PartNumber.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        ChecksumMode = ChecksumMode.asInstanceOf[js.Any]
      )
      .asInstanceOf[HeadObjectCommandInput]
  }
}

@js.native
trait HeadObjectCommandOutput extends MetadataBearer {
  val DeleteMarker: js.UndefOr[Boolean] = js.native
  val AcceptRanges: js.UndefOr[String] = js.native
  val Expiration: js.UndefOr[String] = js.native
  val Restore: js.UndefOr[String] = js.native
  val ArchiveStatus: js.UndefOr[ArchiveStatus] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val ContentLength: js.UndefOr[Double] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
  val ETag: js.UndefOr[String] = js.native
  val MissingMeta: js.UndefOr[Int] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val CacheControl: js.UndefOr[String] = js.native
  val ContentDisposition: js.UndefOr[String] = js.native
  val ContentEncoding: js.UndefOr[String] = js.native
  val ContentLanguage: js.UndefOr[String] = js.native
  val ContentType: js.UndefOr[String] = js.native
  val ContentRange: js.UndefOr[String] = js.native
  val Expires: js.UndefOr[js.Date] = js.native
  val ExpiresString: js.UndefOr[String] = js.native
  val WebsiteRedirectLocation: js.UndefOr[String] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val Metadata: js.UndefOr[js.Dictionary[String]] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
  val ReplicationStatus: js.UndefOr[ReplicationStatus] = js.native
  val PartsCount: js.UndefOr[Int] = js.native
  val TagCount: js.UndefOr[Int] = js.native
  val ObjectLockMode: js.UndefOr[ObjectLockMode] = js.native
  val ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.native
  val ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
    js.native
}

@js.native
trait ListBucketAnalyticsConfigurationsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object ListBucketAnalyticsConfigurationsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContinuationToken: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): ListBucketAnalyticsConfigurationsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContinuationToken = ContinuationToken.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListBucketAnalyticsConfigurationsCommandInput]
  }
}

@js.native
trait ListBucketAnalyticsConfigurationsCommandOutput extends MetadataBearer {
  val IsTruncated: js.UndefOr[Boolean] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val NextContinuationToken: js.UndefOr[String] = js.native
  val AnalyticsConfigurationList: js.UndefOr[js.Array[AnalyticsConfiguration]] =
    js.native
}

@js.native
trait ListBucketIntelligentTieringConfigurationsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object ListBucketIntelligentTieringConfigurationsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContinuationToken: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): ListBucketIntelligentTieringConfigurationsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContinuationToken = ContinuationToken.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListBucketIntelligentTieringConfigurationsCommandInput]
  }
}

@js.native
trait ListBucketIntelligentTieringConfigurationsCommandOutput
    extends MetadataBearer {
  val IsTruncated: js.UndefOr[Boolean] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val NextContinuationToken: js.UndefOr[String] = js.native
  val IntelligentTieringConfigurationList
      : js.UndefOr[js.Array[IntelligentTieringConfiguration]] = js.native
}

@js.native
trait ListBucketInventoryConfigurationsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object ListBucketInventoryConfigurationsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContinuationToken: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): ListBucketInventoryConfigurationsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContinuationToken = ContinuationToken.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListBucketInventoryConfigurationsCommandInput]
  }
}

@js.native
trait ListBucketInventoryConfigurationsCommandOutput extends MetadataBearer {
  val ContinuationToken: js.UndefOr[String] = js.native
  val InventoryConfigurationList: js.UndefOr[js.Array[InventoryConfiguration]] =
    js.native
  val IsTruncated: js.UndefOr[Boolean] = js.native
  val NextContinuationToken: js.UndefOr[String] = js.native
}

@js.native
trait ListBucketMetricsConfigurationsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object ListBucketMetricsConfigurationsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContinuationToken: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): ListBucketMetricsConfigurationsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContinuationToken = ContinuationToken.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListBucketMetricsConfigurationsCommandInput]
  }
}

@js.native
trait ListBucketMetricsConfigurationsCommandOutput extends MetadataBearer {
  val IsTruncated: js.UndefOr[Boolean] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val NextContinuationToken: js.UndefOr[String] = js.native
  val MetricsConfigurationList: js.UndefOr[js.Array[MetricsConfiguration]] =
    js.native
}

@js.native
trait ListBucketsCommandInput extends js.Object {
  val MaxBuckets: js.UndefOr[Int] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val BucketRegion: js.UndefOr[String] = js.native
}

object ListBucketsCommandInput {
  def apply(
      MaxBuckets: js.UndefOr[Int] = js.undefined,
      ContinuationToken: js.UndefOr[String] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      BucketRegion: js.UndefOr[String] = js.undefined
  ): ListBucketsCommandInput = {
    js.Dynamic
      .literal(
        MaxBuckets = MaxBuckets.asInstanceOf[js.Any],
        ContinuationToken = ContinuationToken.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any],
        BucketRegion = BucketRegion.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListBucketsCommandInput]
  }
}

@js.native
trait ListBucketsCommandOutput extends MetadataBearer {
  val Buckets: js.UndefOr[js.Array[Bucket]] = js.native
  val Owner: js.UndefOr[Owner] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val Prefix: js.UndefOr[String] = js.native
}

@js.native
trait ListDirectoryBucketsCommandInput extends js.Object {
  val ContinuationToken: js.UndefOr[String] = js.native
  val MaxDirectoryBuckets: js.UndefOr[Double] = js.native
}

object ListDirectoryBucketsCommandInput {
  def apply(
      ContinuationToken: js.UndefOr[String] = js.undefined,
      MaxDirectoryBuckets: js.UndefOr[Double] = js.undefined
  ): ListDirectoryBucketsCommandInput = {
    js.Dynamic
      .literal(
        ContinuationToken = ContinuationToken.asInstanceOf[js.Any],
        MaxDirectoryBuckets = MaxDirectoryBuckets.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListDirectoryBucketsCommandInput]
  }
}

@js.native
trait ListDirectoryBucketsCommandOutput extends MetadataBearer {
  val Buckets: js.UndefOr[js.Array[Bucket]] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
}

@js.native
trait ListMultipartUploadsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Delimiter: js.UndefOr[String] = js.native
  val EncodingType: js.UndefOr[EncodingType] = js.native
  val KeyMarker: js.UndefOr[String] = js.native
  val MaxUploads: js.UndefOr[Int] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val UploadIdMarker: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
}

object ListMultipartUploadsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Delimiter: js.UndefOr[String] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      KeyMarker: js.UndefOr[String] = js.undefined,
      MaxUploads: js.UndefOr[Int] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      UploadIdMarker: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  ): ListMultipartUploadsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Delimiter = Delimiter.asInstanceOf[js.Any],
        EncodingType = EncodingType.asInstanceOf[js.Any],
        KeyMarker = KeyMarker.asInstanceOf[js.Any],
        MaxUploads = MaxUploads.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any],
        UploadIdMarker = UploadIdMarker.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListMultipartUploadsCommandInput]
  }
}

@js.native
trait ListMultipartUploadsCommandOutput extends MetadataBearer {
  val Bucket: js.UndefOr[String] = js.native
  val KeyMarker: js.UndefOr[String] = js.native
  val UploadIdMarker: js.UndefOr[String] = js.native
  val NextKeyMarker: js.UndefOr[String] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val Delimiter: js.UndefOr[String] = js.native
  val NextUploadIdMarker: js.UndefOr[String] = js.native
  val MaxUploads: js.UndefOr[Int] = js.native
  val IsTruncated: js.UndefOr[Boolean] = js.native
  val Uploads: js.UndefOr[js.Array[MultipartUpload]] = js.native
  val CommonPrefixes: js.UndefOr[js.Array[CommonPrefix]] = js.native
  val EncodingType: js.UndefOr[EncodingType] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait ListObjectVersionsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Delimiter: js.UndefOr[String] = js.native
  val EncodingType: js.UndefOr[EncodingType] = js.native
  val KeyMarker: js.UndefOr[String] = js.native
  val MaxKeys: js.UndefOr[Int] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val VersionIdMarker: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val OptionalObjectAttributes: js.UndefOr[js.Array[OptionalObjectAttributes]] =
    js.native
}

object ListObjectVersionsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Delimiter: js.UndefOr[String] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      KeyMarker: js.UndefOr[String] = js.undefined,
      MaxKeys: js.UndefOr[Int] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      VersionIdMarker: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      OptionalObjectAttributes: js.UndefOr[js.Array[OptionalObjectAttributes]] =
        js.undefined
  ): ListObjectVersionsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Delimiter = Delimiter.asInstanceOf[js.Any],
        EncodingType = EncodingType.asInstanceOf[js.Any],
        KeyMarker = KeyMarker.asInstanceOf[js.Any],
        MaxKeys = MaxKeys.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any],
        VersionIdMarker = VersionIdMarker.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        OptionalObjectAttributes = OptionalObjectAttributes.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListObjectVersionsCommandInput]
  }
}

@js.native
trait ListObjectVersionsCommandOutput extends MetadataBearer {
  val IsTruncated: js.UndefOr[Boolean] = js.native
  val KeyMarker: js.UndefOr[String] = js.native
  val VersionIdMarker: js.UndefOr[String] = js.native
  val NextKeyMarker: js.UndefOr[String] = js.native
  val NextVersionIdMarker: js.UndefOr[String] = js.native
  val Versions: js.UndefOr[js.Array[ObjectVersion]] = js.native
  val DeleteMarkers: js.UndefOr[js.Array[DeleteMarkerEntry]] = js.native
  val Name: js.UndefOr[String] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val Delimiter: js.UndefOr[String] = js.native
  val MaxKeys: js.UndefOr[Int] = js.native
  val CommonPrefixes: js.UndefOr[js.Array[CommonPrefix]] = js.native
  val EncodingType: js.UndefOr[EncodingType] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait ListObjectsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Delimiter: js.UndefOr[String] = js.native
  val EncodingType: js.UndefOr[EncodingType] = js.native
  val Marker: js.UndefOr[String] = js.native
  val MaxKeys: js.UndefOr[Int] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val OptionalObjectAttributes: js.UndefOr[js.Array[OptionalObjectAttributes]] =
    js.native
}

object ListObjectsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Delimiter: js.UndefOr[String] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxKeys: js.UndefOr[Int] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      OptionalObjectAttributes: js.UndefOr[js.Array[OptionalObjectAttributes]] =
        js.undefined
  ): ListObjectsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Delimiter = Delimiter.asInstanceOf[js.Any],
        EncodingType = EncodingType.asInstanceOf[js.Any],
        Marker = Marker.asInstanceOf[js.Any],
        MaxKeys = MaxKeys.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        OptionalObjectAttributes = OptionalObjectAttributes.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListObjectsCommandInput]
  }
}

@js.native
trait ListObjectsCommandOutput extends MetadataBearer {
  val IsTruncated: js.UndefOr[Boolean] = js.native
  val Marker: js.UndefOr[String] = js.native
  val NextMarker: js.UndefOr[String] = js.native
  val Contents: js.UndefOr[js.Array[S3Object]] = js.native
  val Name: js.UndefOr[String] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val Delimiter: js.UndefOr[String] = js.native
  val MaxKeys: js.UndefOr[Int] = js.native
  val CommonPrefixes: js.UndefOr[js.Array[CommonPrefix]] = js.native
  val EncodingType: js.UndefOr[EncodingType] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait ListObjectsV2CommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Delimiter: js.UndefOr[String] = js.native
  val EncodingType: js.UndefOr[EncodingType] = js.native
  val MaxKeys: js.UndefOr[Int] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val FetchOwner: js.UndefOr[Boolean] = js.native
  val StartAfter: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val OptionalObjectAttributes: js.UndefOr[js.Array[OptionalObjectAttributes]] =
    js.native
}

object ListObjectsV2CommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Delimiter: js.UndefOr[String] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      MaxKeys: js.UndefOr[Int] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      ContinuationToken: js.UndefOr[String] = js.undefined,
      FetchOwner: js.UndefOr[Boolean] = js.undefined,
      StartAfter: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      OptionalObjectAttributes: js.UndefOr[js.Array[OptionalObjectAttributes]] =
        js.undefined
  ): ListObjectsV2CommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Delimiter = Delimiter.asInstanceOf[js.Any],
        EncodingType = EncodingType.asInstanceOf[js.Any],
        MaxKeys = MaxKeys.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any],
        ContinuationToken = ContinuationToken.asInstanceOf[js.Any],
        FetchOwner = FetchOwner.asInstanceOf[js.Any],
        StartAfter = StartAfter.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        OptionalObjectAttributes = OptionalObjectAttributes.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListObjectsV2CommandInput]
  }
}

@js.native
trait ListObjectsV2CommandOutput extends MetadataBearer {
  val IsTruncated: js.UndefOr[Boolean] = js.native
  val Contents: js.UndefOr[js.Array[S3Object]] = js.native
  val Name: js.UndefOr[String] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val Delimiter: js.UndefOr[String] = js.native
  val MaxKeys: js.UndefOr[Int] = js.native
  val CommonPrefixes: js.UndefOr[js.Array[CommonPrefix]] = js.native
  val EncodingType: js.UndefOr[EncodingType] = js.native
  val KeyCount: js.UndefOr[Int] = js.native
  val ContinuationToken: js.UndefOr[String] = js.native
  val NextContinuationToken: js.UndefOr[String] = js.native
  val StartAfter: js.UndefOr[String] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait ListPartsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val MaxParts: js.UndefOr[Int] = js.native
  val PartNumberMarker: js.UndefOr[String] = js.native
  val UploadId: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
}

object ListPartsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      MaxParts: js.UndefOr[Int] = js.undefined,
      PartNumberMarker: js.UndefOr[String] = js.undefined,
      UploadId: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined
  ): ListPartsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        MaxParts = MaxParts.asInstanceOf[js.Any],
        PartNumberMarker = PartNumberMarker.asInstanceOf[js.Any],
        UploadId = UploadId.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListPartsCommandInput]
  }
}

@js.native
trait ListPartsCommandOutput extends MetadataBearer {
  val AbortDate: js.UndefOr[js.Date] = js.native
  val AbortRuleId: js.UndefOr[String] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val UploadId: js.UndefOr[String] = js.native
  val PartNumberMarker: js.UndefOr[String] = js.native
  val NextPartNumberMarker: js.UndefOr[String] = js.native
  val MaxParts: js.UndefOr[Int] = js.native
  val IsTruncated: js.UndefOr[Boolean] = js.native
  val Parts: js.UndefOr[js.Array[Part]] = js.native
  val Initiator: js.UndefOr[Initiator] = js.native
  val Owner: js.UndefOr[Owner] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
}

@js.native
trait PutBucketAbacCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val AbacStatus: js.UndefOr[AbacStatus] = js.native
}

object PutBucketAbacCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      AbacStatus: js.UndefOr[AbacStatus] = js.undefined
  ): PutBucketAbacCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        AbacStatus = AbacStatus.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketAbacCommandInput]
  }
}

@js.native
trait PutBucketAbacCommandOutput extends MetadataBearer

@js.native
trait PutBucketAccelerateConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val AccelerateConfiguration: js.UndefOr[AccelerateConfiguration] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
}

object PutBucketAccelerateConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      AccelerateConfiguration: js.UndefOr[AccelerateConfiguration] =
        js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined
  ): PutBucketAccelerateConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketAccelerateConfigurationCommandInput]
  }
}

@js.native
trait PutBucketAccelerateConfigurationCommandOutput extends MetadataBearer

@js.native
trait PutBucketAclCommandInput extends js.Object {
  val ACL: js.UndefOr[BucketCannedACL] = js.native
  val AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val GrantFullControl: js.UndefOr[String] = js.native
  val GrantRead: js.UndefOr[String] = js.native
  val GrantReadACP: js.UndefOr[String] = js.native
  val GrantWrite: js.UndefOr[String] = js.native
  val GrantWriteACP: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketAclCommandInput {
  def apply(
      ACL: js.UndefOr[BucketCannedACL] = js.undefined,
      AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.undefined,
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      GrantFullControl: js.UndefOr[String] = js.undefined,
      GrantRead: js.UndefOr[String] = js.undefined,
      GrantReadACP: js.UndefOr[String] = js.undefined,
      GrantWrite: js.UndefOr[String] = js.undefined,
      GrantWriteACP: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketAclCommandInput = {
    js.Dynamic
      .literal(
        ACL = ACL.asInstanceOf[js.Any],
        AccessControlPolicy = AccessControlPolicy.asInstanceOf[js.Any],
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        GrantFullControl = GrantFullControl.asInstanceOf[js.Any],
        GrantRead = GrantRead.asInstanceOf[js.Any],
        GrantReadACP = GrantReadACP.asInstanceOf[js.Any],
        GrantWrite = GrantWrite.asInstanceOf[js.Any],
        GrantWriteACP = GrantWriteACP.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketAclCommandInput]
  }
}

@js.native
trait PutBucketAclCommandOutput extends MetadataBearer

@js.native
trait PutBucketAnalyticsConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketAnalyticsConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketAnalyticsConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketAnalyticsConfigurationCommandInput]
  }
}

@js.native
trait PutBucketAnalyticsConfigurationCommandOutput extends MetadataBearer

@js.native
trait PutBucketCorsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val CORSConfiguration: js.UndefOr[CORSConfiguration] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketCorsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      CORSConfiguration: js.UndefOr[CORSConfiguration] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketCorsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        CORSConfiguration = CORSConfiguration.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketCorsCommandInput]
  }
}

@js.native
trait PutBucketCorsCommandOutput extends MetadataBearer

@js.native
trait PutBucketEncryptionCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ServerSideEncryptionConfiguration
      : js.UndefOr[ServerSideEncryptionConfiguration] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketEncryptionCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ServerSideEncryptionConfiguration: js.UndefOr[
        ServerSideEncryptionConfiguration
      ] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketEncryptionCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ServerSideEncryptionConfiguration =
          ServerSideEncryptionConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketEncryptionCommandInput]
  }
}

@js.native
trait PutBucketEncryptionCommandOutput extends MetadataBearer

@js.native
trait PutBucketIntelligentTieringConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val IntelligentTieringConfiguration
      : js.UndefOr[IntelligentTieringConfiguration] = js.native
}

object PutBucketIntelligentTieringConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      IntelligentTieringConfiguration: js.UndefOr[
        IntelligentTieringConfiguration
      ] = js.undefined
  ): PutBucketIntelligentTieringConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        IntelligentTieringConfiguration =
          IntelligentTieringConfiguration.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketIntelligentTieringConfigurationCommandInput]
  }
}

@js.native
trait PutBucketIntelligentTieringConfigurationCommandOutput
    extends MetadataBearer

@js.native
trait PutBucketInventoryConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val InventoryConfiguration: js.UndefOr[InventoryConfiguration] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketInventoryConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      InventoryConfiguration: js.UndefOr[InventoryConfiguration] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketInventoryConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        InventoryConfiguration = InventoryConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketInventoryConfigurationCommandInput]
  }
}

@js.native
trait PutBucketInventoryConfigurationCommandOutput extends MetadataBearer

@js.native
trait PutBucketLifecycleConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration] =
    js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val TransitionDefaultMinimumObjectSize
      : js.UndefOr[TransitionDefaultMinimumObjectSize] = js.native
}

object PutBucketLifecycleConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration] =
        js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      TransitionDefaultMinimumObjectSize: js.UndefOr[
        TransitionDefaultMinimumObjectSize
      ] = js.undefined
  ): PutBucketLifecycleConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        LifecycleConfiguration = LifecycleConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        TransitionDefaultMinimumObjectSize =
          TransitionDefaultMinimumObjectSize.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketLifecycleConfigurationCommandInput]
  }
}

@js.native
trait PutBucketLifecycleConfigurationCommandOutput extends MetadataBearer {
  val TransitionDefaultMinimumObjectSize
      : js.UndefOr[TransitionDefaultMinimumObjectSize] = js.native
}

@js.native
trait PutBucketLoggingCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val BucketLoggingStatus: js.UndefOr[BucketLoggingStatus] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketLoggingCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      BucketLoggingStatus: js.UndefOr[BucketLoggingStatus] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketLoggingCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketLoggingCommandInput]
  }
}

@js.native
trait PutBucketLoggingCommandOutput extends MetadataBearer

@js.native
trait PutBucketMetricsConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Id: js.UndefOr[String] = js.native
  val MetricsConfiguration: js.UndefOr[MetricsConfiguration] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketMetricsConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      MetricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketMetricsConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketMetricsConfigurationCommandInput]
  }
}

@js.native
trait PutBucketMetricsConfigurationCommandOutput extends MetadataBearer

@js.native
trait PutBucketNotificationConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val NotificationConfiguration: js.UndefOr[NotificationConfiguration] =
    js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val SkipDestinationValidation: js.UndefOr[Boolean] = js.native
}

object PutBucketNotificationConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      NotificationConfiguration: js.UndefOr[NotificationConfiguration] =
        js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      SkipDestinationValidation: js.UndefOr[Boolean] = js.undefined
  ): PutBucketNotificationConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        NotificationConfiguration =
          NotificationConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        SkipDestinationValidation =
          SkipDestinationValidation.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketNotificationConfigurationCommandInput]
  }
}

@js.native
trait PutBucketNotificationConfigurationCommandOutput extends MetadataBearer

@js.native
trait PutBucketOwnershipControlsCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val OwnershipControls: js.UndefOr[OwnershipControls] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
}

object PutBucketOwnershipControlsCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      OwnershipControls: js.UndefOr[OwnershipControls] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined
  ): PutBucketOwnershipControlsCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        OwnershipControls = OwnershipControls.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketOwnershipControlsCommandInput]
  }
}

@js.native
trait PutBucketOwnershipControlsCommandOutput extends MetadataBearer

@js.native
trait PutBucketPolicyCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ConfirmRemoveSelfBucketAccess: js.UndefOr[Boolean] = js.native
  val Policy: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketPolicyCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ConfirmRemoveSelfBucketAccess: js.UndefOr[Boolean] = js.undefined,
      Policy: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketPolicyCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ConfirmRemoveSelfBucketAccess =
          ConfirmRemoveSelfBucketAccess.asInstanceOf[js.Any],
        Policy = Policy.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketPolicyCommandInput]
  }
}

@js.native
trait PutBucketPolicyCommandOutput extends MetadataBearer

@js.native
trait PutBucketReplicationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ReplicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.native
  val Token: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketReplicationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ReplicationConfiguration: js.UndefOr[ReplicationConfiguration] =
        js.undefined,
      Token: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketReplicationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ReplicationConfiguration =
          ReplicationConfiguration.asInstanceOf[js.Any],
        Token = Token.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketReplicationCommandInput]
  }
}

@js.native
trait PutBucketReplicationCommandOutput extends MetadataBearer

@js.native
trait PutBucketRequestPaymentCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val RequestPaymentConfiguration: js.UndefOr[RequestPaymentConfiguration] =
    js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketRequestPaymentCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      RequestPaymentConfiguration: js.UndefOr[RequestPaymentConfiguration] =
        js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketRequestPaymentCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        RequestPaymentConfiguration =
          RequestPaymentConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketRequestPaymentCommandInput]
  }
}

@js.native
trait PutBucketRequestPaymentCommandOutput extends MetadataBearer

@js.native
trait PutBucketTaggingCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val Tagging: js.UndefOr[Tagging] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketTaggingCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      Tagging: js.UndefOr[Tagging] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketTaggingCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        Tagging = Tagging.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketTaggingCommandInput]
  }
}

@js.native
trait PutBucketTaggingCommandOutput extends MetadataBearer

@js.native
trait PutBucketVersioningCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val MFA: js.UndefOr[String] = js.native
  val VersioningConfiguration: js.UndefOr[VersioningConfiguration] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketVersioningCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      MFA: js.UndefOr[String] = js.undefined,
      VersioningConfiguration: js.UndefOr[VersioningConfiguration] =
        js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketVersioningCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        MFA = MFA.asInstanceOf[js.Any],
        VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketVersioningCommandInput]
  }
}

@js.native
trait PutBucketVersioningCommandOutput extends MetadataBearer

@js.native
trait PutBucketWebsiteCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val WebsiteConfiguration: js.UndefOr[WebsiteConfiguration] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutBucketWebsiteCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      WebsiteConfiguration: js.UndefOr[WebsiteConfiguration] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutBucketWebsiteCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutBucketWebsiteCommandInput]
  }
}

@js.native
trait PutBucketWebsiteCommandOutput extends MetadataBearer

@js.native
trait PutObjectAclCommandInput extends js.Object {
  val ACL: js.UndefOr[ObjectCannedACL] = js.native
  val AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val GrantFullControl: js.UndefOr[String] = js.native
  val GrantRead: js.UndefOr[String] = js.native
  val GrantReadACP: js.UndefOr[String] = js.native
  val GrantWrite: js.UndefOr[String] = js.native
  val GrantWriteACP: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutObjectAclCommandInput {
  def apply(
      ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.undefined,
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      GrantFullControl: js.UndefOr[String] = js.undefined,
      GrantRead: js.UndefOr[String] = js.undefined,
      GrantReadACP: js.UndefOr[String] = js.undefined,
      GrantWrite: js.UndefOr[String] = js.undefined,
      GrantWriteACP: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutObjectAclCommandInput = {
    js.Dynamic
      .literal(
        ACL = ACL.asInstanceOf[js.Any],
        AccessControlPolicy = AccessControlPolicy.asInstanceOf[js.Any],
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        GrantFullControl = GrantFullControl.asInstanceOf[js.Any],
        GrantRead = GrantRead.asInstanceOf[js.Any],
        GrantReadACP = GrantReadACP.asInstanceOf[js.Any],
        GrantWrite = GrantWrite.asInstanceOf[js.Any],
        GrantWriteACP = GrantWriteACP.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutObjectAclCommandInput]
  }
}

@js.native
trait PutObjectAclCommandOutput extends MetadataBearer {
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

// TODO: Body — streaming/binary type 'StreamingBlobPayloadInputTypes' — consider using SdkStream, io.Readable, or a more specific type
@js.native
trait PutObjectCommandInput extends js.Object {
  val ACL: js.UndefOr[ObjectCannedACL] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val CacheControl: js.UndefOr[String] = js.native
  val ContentDisposition: js.UndefOr[String] = js.native
  val ContentEncoding: js.UndefOr[String] = js.native
  val ContentLanguage: js.UndefOr[String] = js.native
  val ContentLength: js.UndefOr[Double] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ContentType: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val Expires: js.UndefOr[js.Date] = js.native
  val IfMatch: js.UndefOr[String] = js.native
  val IfNoneMatch: js.UndefOr[String] = js.native
  val GrantFullControl: js.UndefOr[String] = js.native
  val GrantRead: js.UndefOr[String] = js.native
  val GrantReadACP: js.UndefOr[String] = js.native
  val GrantWriteACP: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val WriteOffsetBytes: js.UndefOr[Double] = js.native
  val Metadata: js.UndefOr[js.Dictionary[String]] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val WebsiteRedirectLocation: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val SSEKMSEncryptionContext: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val Tagging: js.UndefOr[String] = js.native
  val ObjectLockMode: js.UndefOr[ObjectLockMode] = js.native
  val ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.native
  val ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
    js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val Body: js.UndefOr[js.Any] = js.native
}

object PutObjectCommandInput {
  def apply(
      ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      Bucket: js.UndefOr[String] = js.undefined,
      CacheControl: js.UndefOr[String] = js.undefined,
      ContentDisposition: js.UndefOr[String] = js.undefined,
      ContentEncoding: js.UndefOr[String] = js.undefined,
      ContentLanguage: js.UndefOr[String] = js.undefined,
      ContentLength: js.UndefOr[Double] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ContentType: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ChecksumCRC32: js.UndefOr[String] = js.undefined,
      ChecksumCRC32C: js.UndefOr[String] = js.undefined,
      ChecksumCRC64NVME: js.UndefOr[String] = js.undefined,
      ChecksumSHA1: js.UndefOr[String] = js.undefined,
      ChecksumSHA256: js.UndefOr[String] = js.undefined,
      Expires: js.UndefOr[js.Date] = js.undefined,
      IfMatch: js.UndefOr[String] = js.undefined,
      IfNoneMatch: js.UndefOr[String] = js.undefined,
      GrantFullControl: js.UndefOr[String] = js.undefined,
      GrantRead: js.UndefOr[String] = js.undefined,
      GrantReadACP: js.UndefOr[String] = js.undefined,
      GrantWriteACP: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      WriteOffsetBytes: js.UndefOr[Double] = js.undefined,
      Metadata: js.UndefOr[js.Dictionary[String]] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      WebsiteRedirectLocation: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      SSEKMSKeyId: js.UndefOr[String] = js.undefined,
      SSEKMSEncryptionContext: js.UndefOr[String] = js.undefined,
      BucketKeyEnabled: js.UndefOr[Boolean] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      Tagging: js.UndefOr[String] = js.undefined,
      ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined,
      ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.undefined,
      ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
        js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      Body: js.UndefOr[js.Any] = js.undefined
  ): PutObjectCommandInput = {
    js.Dynamic
      .literal(
        ACL = ACL.asInstanceOf[js.Any],
        Bucket = Bucket.asInstanceOf[js.Any],
        CacheControl = CacheControl.asInstanceOf[js.Any],
        ContentDisposition = ContentDisposition.asInstanceOf[js.Any],
        ContentEncoding = ContentEncoding.asInstanceOf[js.Any],
        ContentLanguage = ContentLanguage.asInstanceOf[js.Any],
        ContentLength = ContentLength.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ContentType = ContentType.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ChecksumCRC32 = ChecksumCRC32.asInstanceOf[js.Any],
        ChecksumCRC32C = ChecksumCRC32C.asInstanceOf[js.Any],
        ChecksumCRC64NVME = ChecksumCRC64NVME.asInstanceOf[js.Any],
        ChecksumSHA1 = ChecksumSHA1.asInstanceOf[js.Any],
        ChecksumSHA256 = ChecksumSHA256.asInstanceOf[js.Any],
        Expires = Expires.asInstanceOf[js.Any],
        IfMatch = IfMatch.asInstanceOf[js.Any],
        IfNoneMatch = IfNoneMatch.asInstanceOf[js.Any],
        GrantFullControl = GrantFullControl.asInstanceOf[js.Any],
        GrantRead = GrantRead.asInstanceOf[js.Any],
        GrantReadACP = GrantReadACP.asInstanceOf[js.Any],
        GrantWriteACP = GrantWriteACP.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        WriteOffsetBytes = WriteOffsetBytes.asInstanceOf[js.Any],
        Metadata = Metadata.asInstanceOf[js.Any],
        ServerSideEncryption = ServerSideEncryption.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any],
        WebsiteRedirectLocation = WebsiteRedirectLocation.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        SSEKMSKeyId = SSEKMSKeyId.asInstanceOf[js.Any],
        SSEKMSEncryptionContext = SSEKMSEncryptionContext.asInstanceOf[js.Any],
        BucketKeyEnabled = BucketKeyEnabled.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        Tagging = Tagging.asInstanceOf[js.Any],
        ObjectLockMode = ObjectLockMode.asInstanceOf[js.Any],
        ObjectLockRetainUntilDate =
          ObjectLockRetainUntilDate.asInstanceOf[js.Any],
        ObjectLockLegalHoldStatus =
          ObjectLockLegalHoldStatus.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        Body = Body.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutObjectCommandInput]
  }
}

@js.native
trait PutObjectCommandOutput extends MetadataBearer {
  val Expiration: js.UndefOr[String] = js.native
  val ETag: js.UndefOr[String] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val SSEKMSEncryptionContext: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val Size: js.UndefOr[Double] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait PutObjectLegalHoldCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val LegalHold: js.UndefOr[ObjectLockLegalHold] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutObjectLegalHoldCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      LegalHold: js.UndefOr[ObjectLockLegalHold] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutObjectLegalHoldCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        LegalHold = LegalHold.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutObjectLegalHoldCommandInput]
  }
}

@js.native
trait PutObjectLegalHoldCommandOutput extends MetadataBearer {
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait PutObjectLockConfigurationCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val Token: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutObjectLockConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration] =
        js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      Token: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutObjectLockConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ObjectLockConfiguration = ObjectLockConfiguration.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        Token = Token.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutObjectLockConfigurationCommandInput]
  }
}

@js.native
trait PutObjectLockConfigurationCommandOutput extends MetadataBearer {
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait PutObjectRetentionCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val Retention: js.UndefOr[ObjectLockRetention] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val BypassGovernanceRetention: js.UndefOr[Boolean] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutObjectRetentionCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      Retention: js.UndefOr[ObjectLockRetention] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      BypassGovernanceRetention: js.UndefOr[Boolean] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutObjectRetentionCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        Retention = Retention.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        BypassGovernanceRetention =
          BypassGovernanceRetention.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutObjectRetentionCommandInput]
  }
}

@js.native
trait PutObjectRetentionCommandOutput extends MetadataBearer {
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait PutObjectTaggingCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val Tagging: js.UndefOr[Tagging] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
}

object PutObjectTaggingCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      Tagging: js.UndefOr[Tagging] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  ): PutObjectTaggingCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        Tagging = Tagging.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutObjectTaggingCommandInput]
  }
}

@js.native
trait PutObjectTaggingCommandOutput extends MetadataBearer {
  val VersionId: js.UndefOr[String] = js.native
}

@js.native
trait PutPublicAccessBlockCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val PublicAccessBlockConfiguration
      : js.UndefOr[PublicAccessBlockConfiguration] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object PutPublicAccessBlockCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      PublicAccessBlockConfiguration: js.UndefOr[
        PublicAccessBlockConfiguration
      ] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutPublicAccessBlockCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        PublicAccessBlockConfiguration =
          PublicAccessBlockConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutPublicAccessBlockCommandInput]
  }
}

@js.native
trait PutPublicAccessBlockCommandOutput extends MetadataBearer

@js.native
trait RenameObjectCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val RenameSource: js.UndefOr[String] = js.native
  val DestinationIfMatch: js.UndefOr[String] = js.native
  val DestinationIfNoneMatch: js.UndefOr[String] = js.native
  val DestinationIfModifiedSince: js.UndefOr[js.Date] = js.native
  val DestinationIfUnmodifiedSince: js.UndefOr[js.Date] = js.native
  val SourceIfMatch: js.UndefOr[String] = js.native
  val SourceIfNoneMatch: js.UndefOr[String] = js.native
  val SourceIfModifiedSince: js.UndefOr[js.Date] = js.native
  val SourceIfUnmodifiedSince: js.UndefOr[js.Date] = js.native
  val ClientToken: js.UndefOr[String] = js.native
}

object RenameObjectCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      RenameSource: js.UndefOr[String] = js.undefined,
      DestinationIfMatch: js.UndefOr[String] = js.undefined,
      DestinationIfNoneMatch: js.UndefOr[String] = js.undefined,
      DestinationIfModifiedSince: js.UndefOr[js.Date] = js.undefined,
      DestinationIfUnmodifiedSince: js.UndefOr[js.Date] = js.undefined,
      SourceIfMatch: js.UndefOr[String] = js.undefined,
      SourceIfNoneMatch: js.UndefOr[String] = js.undefined,
      SourceIfModifiedSince: js.UndefOr[js.Date] = js.undefined,
      SourceIfUnmodifiedSince: js.UndefOr[js.Date] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined
  ): RenameObjectCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        RenameSource = RenameSource.asInstanceOf[js.Any],
        DestinationIfMatch = DestinationIfMatch.asInstanceOf[js.Any],
        DestinationIfNoneMatch = DestinationIfNoneMatch.asInstanceOf[js.Any],
        DestinationIfModifiedSince =
          DestinationIfModifiedSince.asInstanceOf[js.Any],
        DestinationIfUnmodifiedSince =
          DestinationIfUnmodifiedSince.asInstanceOf[js.Any],
        SourceIfMatch = SourceIfMatch.asInstanceOf[js.Any],
        SourceIfNoneMatch = SourceIfNoneMatch.asInstanceOf[js.Any],
        SourceIfModifiedSince = SourceIfModifiedSince.asInstanceOf[js.Any],
        SourceIfUnmodifiedSince = SourceIfUnmodifiedSince.asInstanceOf[js.Any],
        ClientToken = ClientToken.asInstanceOf[js.Any]
      )
      .asInstanceOf[RenameObjectCommandInput]
  }
}

@js.native
trait RenameObjectCommandOutput extends MetadataBearer {}

@js.native
trait RestoreObjectCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val RestoreRequest: js.UndefOr[RestoreRequest] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object RestoreObjectCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      RestoreRequest: js.UndefOr[RestoreRequest] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): RestoreObjectCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        RestoreRequest = RestoreRequest.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[RestoreObjectCommandInput]
  }
}

@js.native
trait RestoreObjectCommandOutput extends MetadataBearer {
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
  val RestoreOutputPath: js.UndefOr[String] = js.native
}

@js.native
trait SelectObjectContentCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val Expression: js.UndefOr[String] = js.native
  val ExpressionType: js.UndefOr[ExpressionType] = js.native
  val RequestProgress: js.UndefOr[RequestProgress] = js.native
  val InputSerialization: js.UndefOr[InputSerialization] = js.native
  val OutputSerialization: js.UndefOr[OutputSerialization] = js.native
  val ScanRange: js.UndefOr[ScanRange] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object SelectObjectContentCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      Expression: js.UndefOr[String] = js.undefined,
      ExpressionType: js.UndefOr[ExpressionType] = js.undefined,
      RequestProgress: js.UndefOr[RequestProgress] = js.undefined,
      InputSerialization: js.UndefOr[InputSerialization] = js.undefined,
      OutputSerialization: js.UndefOr[OutputSerialization] = js.undefined,
      ScanRange: js.UndefOr[ScanRange] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): SelectObjectContentCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        Expression = Expression.asInstanceOf[js.Any],
        ExpressionType = ExpressionType.asInstanceOf[js.Any],
        RequestProgress = RequestProgress.asInstanceOf[js.Any],
        InputSerialization = InputSerialization.asInstanceOf[js.Any],
        OutputSerialization = OutputSerialization.asInstanceOf[js.Any],
        ScanRange = ScanRange.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[SelectObjectContentCommandInput]
  }
}

@js.native
trait SelectObjectContentCommandOutput extends MetadataBearer {
  val Payload: js.UndefOr[AsyncIterable[SelectObjectContentEventStream]] =
    js.native
}

@js.native
trait UpdateBucketMetadataInventoryTableConfigurationCommandInput
    extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val InventoryTableConfiguration
      : js.UndefOr[InventoryTableConfigurationUpdates] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object UpdateBucketMetadataInventoryTableConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      InventoryTableConfiguration: js.UndefOr[
        InventoryTableConfigurationUpdates
      ] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): UpdateBucketMetadataInventoryTableConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        InventoryTableConfiguration =
          InventoryTableConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[UpdateBucketMetadataInventoryTableConfigurationCommandInput]
  }
}

@js.native
trait UpdateBucketMetadataInventoryTableConfigurationCommandOutput
    extends MetadataBearer

@js.native
trait UpdateBucketMetadataJournalTableConfigurationCommandInput
    extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val JournalTableConfiguration: js.UndefOr[JournalTableConfigurationUpdates] =
    js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object UpdateBucketMetadataJournalTableConfigurationCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      JournalTableConfiguration: js.UndefOr[JournalTableConfigurationUpdates] =
        js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): UpdateBucketMetadataJournalTableConfigurationCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        JournalTableConfiguration =
          JournalTableConfiguration.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[UpdateBucketMetadataJournalTableConfigurationCommandInput]
  }
}

@js.native
trait UpdateBucketMetadataJournalTableConfigurationCommandOutput
    extends MetadataBearer

@js.native
trait UpdateObjectEncryptionCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val ObjectEncryption: js.UndefOr[ObjectEncryption] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
}

object UpdateObjectEncryptionCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      ObjectEncryption: js.UndefOr[ObjectEncryption] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined
  ): UpdateObjectEncryptionCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        ObjectEncryption = ObjectEncryption.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any]
      )
      .asInstanceOf[UpdateObjectEncryptionCommandInput]
  }
}

@js.native
trait UpdateObjectEncryptionCommandOutput extends MetadataBearer {
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

// TODO: Body — streaming/binary type 'StreamingBlobPayloadInputTypes' — consider using SdkStream, io.Readable, or a more specific type
@js.native
trait UploadPartCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val ContentLength: js.UndefOr[Double] = js.native
  val ContentMD5: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val PartNumber: js.UndefOr[Int] = js.native
  val UploadId: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val Body: js.UndefOr[js.Any] = js.native
}

object UploadPartCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      ContentLength: js.UndefOr[Double] = js.undefined,
      ContentMD5: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ChecksumCRC32: js.UndefOr[String] = js.undefined,
      ChecksumCRC32C: js.UndefOr[String] = js.undefined,
      ChecksumCRC64NVME: js.UndefOr[String] = js.undefined,
      ChecksumSHA1: js.UndefOr[String] = js.undefined,
      ChecksumSHA256: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      PartNumber: js.UndefOr[Int] = js.undefined,
      UploadId: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      Body: js.UndefOr[js.Any] = js.undefined
  ): UploadPartCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        ContentLength = ContentLength.asInstanceOf[js.Any],
        ContentMD5 = ContentMD5.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ChecksumCRC32 = ChecksumCRC32.asInstanceOf[js.Any],
        ChecksumCRC32C = ChecksumCRC32C.asInstanceOf[js.Any],
        ChecksumCRC64NVME = ChecksumCRC64NVME.asInstanceOf[js.Any],
        ChecksumSHA1 = ChecksumSHA1.asInstanceOf[js.Any],
        ChecksumSHA256 = ChecksumSHA256.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        PartNumber = PartNumber.asInstanceOf[js.Any],
        UploadId = UploadId.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        Body = Body.asInstanceOf[js.Any]
      )
      .asInstanceOf[UploadPartCommandInput]
  }
}

@js.native
trait UploadPartCommandOutput extends MetadataBearer {
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val ETag: js.UndefOr[String] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

@js.native
trait UploadPartCopyCommandInput extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val CopySource: js.UndefOr[String] = js.native
  val CopySourceIfMatch: js.UndefOr[String] = js.native
  val CopySourceIfModifiedSince: js.UndefOr[js.Date] = js.native
  val CopySourceIfNoneMatch: js.UndefOr[String] = js.native
  val CopySourceIfUnmodifiedSince: js.UndefOr[js.Date] = js.native
  val CopySourceRange: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val PartNumber: js.UndefOr[Int] = js.native
  val UploadId: js.UndefOr[String] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKey: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val CopySourceSSECustomerAlgorithm: js.UndefOr[String] = js.native
  val CopySourceSSECustomerKey: js.UndefOr[String] = js.native
  val CopySourceSSECustomerKeyMD5: js.UndefOr[String] = js.native
  val RequestPayer: js.UndefOr[RequestPayer] = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
  val ExpectedSourceBucketOwner: js.UndefOr[String] = js.native
}

object UploadPartCopyCommandInput {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      CopySource: js.UndefOr[String] = js.undefined,
      CopySourceIfMatch: js.UndefOr[String] = js.undefined,
      CopySourceIfModifiedSince: js.UndefOr[js.Date] = js.undefined,
      CopySourceIfNoneMatch: js.UndefOr[String] = js.undefined,
      CopySourceIfUnmodifiedSince: js.UndefOr[js.Date] = js.undefined,
      CopySourceRange: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      PartNumber: js.UndefOr[Int] = js.undefined,
      UploadId: js.UndefOr[String] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSECustomerKey: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      CopySourceSSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      CopySourceSSECustomerKey: js.UndefOr[String] = js.undefined,
      CopySourceSSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      ExpectedSourceBucketOwner: js.UndefOr[String] = js.undefined
  ): UploadPartCopyCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        CopySource = CopySource.asInstanceOf[js.Any],
        CopySourceIfMatch = CopySourceIfMatch.asInstanceOf[js.Any],
        CopySourceIfModifiedSince =
          CopySourceIfModifiedSince.asInstanceOf[js.Any],
        CopySourceIfNoneMatch = CopySourceIfNoneMatch.asInstanceOf[js.Any],
        CopySourceIfUnmodifiedSince =
          CopySourceIfUnmodifiedSince.asInstanceOf[js.Any],
        CopySourceRange = CopySourceRange.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        PartNumber = PartNumber.asInstanceOf[js.Any],
        UploadId = UploadId.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        CopySourceSSECustomerAlgorithm =
          CopySourceSSECustomerAlgorithm.asInstanceOf[js.Any],
        CopySourceSSECustomerKey =
          CopySourceSSECustomerKey.asInstanceOf[js.Any],
        CopySourceSSECustomerKeyMD5 =
          CopySourceSSECustomerKeyMD5.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        ExpectedSourceBucketOwner =
          ExpectedSourceBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[UploadPartCopyCommandInput]
  }
}

@js.native
trait UploadPartCopyCommandOutput extends MetadataBearer {
  val CopySourceVersionId: js.UndefOr[String] = js.native
  val CopyPartResult: js.UndefOr[CopyPartResult] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
}

// TODO: Body — streaming/binary type 'StreamingBlobPayloadInputTypes' — consider using SdkStream, io.Readable, or a more specific type
@js.native
trait WriteGetObjectResponseCommandInput extends js.Object {
  val RequestRoute: js.UndefOr[String] = js.native
  val RequestToken: js.UndefOr[String] = js.native
  val StatusCode: js.UndefOr[Double] = js.native
  val ErrorCode: js.UndefOr[String] = js.native
  val ErrorMessage: js.UndefOr[String] = js.native
  val AcceptRanges: js.UndefOr[String] = js.native
  val CacheControl: js.UndefOr[String] = js.native
  val ContentDisposition: js.UndefOr[String] = js.native
  val ContentEncoding: js.UndefOr[String] = js.native
  val ContentLanguage: js.UndefOr[String] = js.native
  val ContentLength: js.UndefOr[Double] = js.native
  val ContentRange: js.UndefOr[String] = js.native
  val ContentType: js.UndefOr[String] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val DeleteMarker: js.UndefOr[Boolean] = js.native
  val ETag: js.UndefOr[String] = js.native
  val Expires: js.UndefOr[js.Date] = js.native
  val Expiration: js.UndefOr[String] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val MissingMeta: js.UndefOr[Int] = js.native
  val Metadata: js.UndefOr[js.Dictionary[String]] = js.native
  val ObjectLockMode: js.UndefOr[ObjectLockMode] = js.native
  val ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
    js.native
  val ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.native
  val PartsCount: js.UndefOr[Int] = js.native
  val ReplicationStatus: js.UndefOr[ReplicationStatus] = js.native
  val RequestCharged: js.UndefOr[RequestCharged] = js.native
  val Restore: js.UndefOr[String] = js.native
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val SSECustomerAlgorithm: js.UndefOr[String] = js.native
  val SSEKMSKeyId: js.UndefOr[String] = js.native
  val SSECustomerKeyMD5: js.UndefOr[String] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val TagCount: js.UndefOr[Int] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val Body: js.UndefOr[js.Any] = js.native
}

object WriteGetObjectResponseCommandInput {
  def apply(
      RequestRoute: js.UndefOr[String] = js.undefined,
      RequestToken: js.UndefOr[String] = js.undefined,
      StatusCode: js.UndefOr[Double] = js.undefined,
      ErrorCode: js.UndefOr[String] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined,
      AcceptRanges: js.UndefOr[String] = js.undefined,
      CacheControl: js.UndefOr[String] = js.undefined,
      ContentDisposition: js.UndefOr[String] = js.undefined,
      ContentEncoding: js.UndefOr[String] = js.undefined,
      ContentLanguage: js.UndefOr[String] = js.undefined,
      ContentLength: js.UndefOr[Double] = js.undefined,
      ContentRange: js.UndefOr[String] = js.undefined,
      ContentType: js.UndefOr[String] = js.undefined,
      ChecksumCRC32: js.UndefOr[String] = js.undefined,
      ChecksumCRC32C: js.UndefOr[String] = js.undefined,
      ChecksumCRC64NVME: js.UndefOr[String] = js.undefined,
      ChecksumSHA1: js.UndefOr[String] = js.undefined,
      ChecksumSHA256: js.UndefOr[String] = js.undefined,
      DeleteMarker: js.UndefOr[Boolean] = js.undefined,
      ETag: js.UndefOr[String] = js.undefined,
      Expires: js.UndefOr[js.Date] = js.undefined,
      Expiration: js.UndefOr[String] = js.undefined,
      LastModified: js.UndefOr[js.Date] = js.undefined,
      MissingMeta: js.UndefOr[Int] = js.undefined,
      Metadata: js.UndefOr[js.Dictionary[String]] = js.undefined,
      ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined,
      ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
        js.undefined,
      ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.undefined,
      PartsCount: js.UndefOr[Int] = js.undefined,
      ReplicationStatus: js.UndefOr[ReplicationStatus] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      Restore: js.UndefOr[String] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[String] = js.undefined,
      SSEKMSKeyId: js.UndefOr[String] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[String] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      TagCount: js.UndefOr[Int] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      BucketKeyEnabled: js.UndefOr[Boolean] = js.undefined,
      Body: js.UndefOr[js.Any] = js.undefined
  ): WriteGetObjectResponseCommandInput = {
    js.Dynamic
      .literal(
        RequestRoute = RequestRoute.asInstanceOf[js.Any],
        RequestToken = RequestToken.asInstanceOf[js.Any],
        StatusCode = StatusCode.asInstanceOf[js.Any],
        ErrorCode = ErrorCode.asInstanceOf[js.Any],
        ErrorMessage = ErrorMessage.asInstanceOf[js.Any],
        AcceptRanges = AcceptRanges.asInstanceOf[js.Any],
        CacheControl = CacheControl.asInstanceOf[js.Any],
        ContentDisposition = ContentDisposition.asInstanceOf[js.Any],
        ContentEncoding = ContentEncoding.asInstanceOf[js.Any],
        ContentLanguage = ContentLanguage.asInstanceOf[js.Any],
        ContentLength = ContentLength.asInstanceOf[js.Any],
        ContentRange = ContentRange.asInstanceOf[js.Any],
        ContentType = ContentType.asInstanceOf[js.Any],
        ChecksumCRC32 = ChecksumCRC32.asInstanceOf[js.Any],
        ChecksumCRC32C = ChecksumCRC32C.asInstanceOf[js.Any],
        ChecksumCRC64NVME = ChecksumCRC64NVME.asInstanceOf[js.Any],
        ChecksumSHA1 = ChecksumSHA1.asInstanceOf[js.Any],
        ChecksumSHA256 = ChecksumSHA256.asInstanceOf[js.Any],
        DeleteMarker = DeleteMarker.asInstanceOf[js.Any],
        ETag = ETag.asInstanceOf[js.Any],
        Expires = Expires.asInstanceOf[js.Any],
        Expiration = Expiration.asInstanceOf[js.Any],
        LastModified = LastModified.asInstanceOf[js.Any],
        MissingMeta = MissingMeta.asInstanceOf[js.Any],
        Metadata = Metadata.asInstanceOf[js.Any],
        ObjectLockMode = ObjectLockMode.asInstanceOf[js.Any],
        ObjectLockLegalHoldStatus =
          ObjectLockLegalHoldStatus.asInstanceOf[js.Any],
        ObjectLockRetainUntilDate =
          ObjectLockRetainUntilDate.asInstanceOf[js.Any],
        PartsCount = PartsCount.asInstanceOf[js.Any],
        ReplicationStatus = ReplicationStatus.asInstanceOf[js.Any],
        RequestCharged = RequestCharged.asInstanceOf[js.Any],
        Restore = Restore.asInstanceOf[js.Any],
        ServerSideEncryption = ServerSideEncryption.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSEKMSKeyId = SSEKMSKeyId.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any],
        TagCount = TagCount.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        BucketKeyEnabled = BucketKeyEnabled.asInstanceOf[js.Any],
        Body = Body.asInstanceOf[js.Any]
      )
      .asInstanceOf[WriteGetObjectResponseCommandInput]
  }
}

@js.native
trait WriteGetObjectResponseCommandOutput extends MetadataBearer

@js.native
trait CompletedMultipartUpload extends js.Object {
  val Parts: js.UndefOr[js.Array[CompletedPart]] = js.native
}

object CompletedMultipartUpload {
  def apply(
      Parts: js.UndefOr[js.Array[CompletedPart]] = js.undefined
  ): CompletedMultipartUpload = {
    js.Dynamic
      .literal(
        Parts = Parts.asInstanceOf[js.Any]
      )
      .asInstanceOf[CompletedMultipartUpload]
  }
}

@js.native
trait CompletedPart extends js.Object {
  val ETag: js.UndefOr[String] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val PartNumber: js.UndefOr[Int] = js.native
}

object CompletedPart {
  def apply(
      ETag: js.UndefOr[String] = js.undefined,
      ChecksumCRC32: js.UndefOr[String] = js.undefined,
      ChecksumCRC32C: js.UndefOr[String] = js.undefined,
      ChecksumCRC64NVME: js.UndefOr[String] = js.undefined,
      ChecksumSHA1: js.UndefOr[String] = js.undefined,
      ChecksumSHA256: js.UndefOr[String] = js.undefined,
      PartNumber: js.UndefOr[Int] = js.undefined
  ): CompletedPart = {
    js.Dynamic
      .literal(
        ETag = ETag.asInstanceOf[js.Any],
        ChecksumCRC32 = ChecksumCRC32.asInstanceOf[js.Any],
        ChecksumCRC32C = ChecksumCRC32C.asInstanceOf[js.Any],
        ChecksumCRC64NVME = ChecksumCRC64NVME.asInstanceOf[js.Any],
        ChecksumSHA1 = ChecksumSHA1.asInstanceOf[js.Any],
        ChecksumSHA256 = ChecksumSHA256.asInstanceOf[js.Any],
        PartNumber = PartNumber.asInstanceOf[js.Any]
      )
      .asInstanceOf[CompletedPart]
  }
}

@js.native
trait CopyObjectResult extends js.Object {
  val ETag: js.UndefOr[String] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
}

object CopyObjectResult {
  def apply(
      ETag: js.UndefOr[String] = js.undefined,
      LastModified: js.UndefOr[js.Date] = js.undefined,
      ChecksumType: js.UndefOr[ChecksumType] = js.undefined,
      ChecksumCRC32: js.UndefOr[String] = js.undefined,
      ChecksumCRC32C: js.UndefOr[String] = js.undefined,
      ChecksumCRC64NVME: js.UndefOr[String] = js.undefined,
      ChecksumSHA1: js.UndefOr[String] = js.undefined,
      ChecksumSHA256: js.UndefOr[String] = js.undefined
  ): CopyObjectResult = {
    js.Dynamic
      .literal(
        ETag = ETag.asInstanceOf[js.Any],
        LastModified = LastModified.asInstanceOf[js.Any],
        ChecksumType = ChecksumType.asInstanceOf[js.Any],
        ChecksumCRC32 = ChecksumCRC32.asInstanceOf[js.Any],
        ChecksumCRC32C = ChecksumCRC32C.asInstanceOf[js.Any],
        ChecksumCRC64NVME = ChecksumCRC64NVME.asInstanceOf[js.Any],
        ChecksumSHA1 = ChecksumSHA1.asInstanceOf[js.Any],
        ChecksumSHA256 = ChecksumSHA256.asInstanceOf[js.Any]
      )
      .asInstanceOf[CopyObjectResult]
  }
}

@js.native
trait CreateBucketConfiguration extends js.Object {
  val LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.native
  val Location: js.UndefOr[LocationInfo] = js.native
  val Bucket: js.UndefOr[BucketInfo] = js.native
  val Tags: js.UndefOr[js.Array[Tag]] = js.native
}

object CreateBucketConfiguration {
  def apply(
      LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined,
      Location: js.UndefOr[LocationInfo] = js.undefined,
      Bucket: js.UndefOr[BucketInfo] = js.undefined,
      Tags: js.UndefOr[js.Array[Tag]] = js.undefined
  ): CreateBucketConfiguration = {
    js.Dynamic
      .literal(
        LocationConstraint = LocationConstraint.asInstanceOf[js.Any],
        Location = Location.asInstanceOf[js.Any],
        Bucket = Bucket.asInstanceOf[js.Any],
        Tags = Tags.asInstanceOf[js.Any]
      )
      .asInstanceOf[CreateBucketConfiguration]
  }
}

@js.native
trait LocationInfo extends js.Object {
  val Type: js.UndefOr[LocationType] = js.native
  val Name: js.UndefOr[String] = js.native
}

object LocationInfo {
  def apply(
      Type: js.UndefOr[LocationType] = js.undefined,
      Name: js.UndefOr[String] = js.undefined
  ): LocationInfo = {
    js.Dynamic
      .literal(
        Type = Type.asInstanceOf[js.Any],
        Name = Name.asInstanceOf[js.Any]
      )
      .asInstanceOf[LocationInfo]
  }
}

@js.native
trait BucketInfo extends js.Object {
  val DataRedundancy: js.UndefOr[DataRedundancy] = js.native
  val Type: js.UndefOr[BucketType] = js.native
}

object BucketInfo {
  def apply(
      DataRedundancy: js.UndefOr[DataRedundancy] = js.undefined,
      Type: js.UndefOr[BucketType] = js.undefined
  ): BucketInfo = {
    js.Dynamic
      .literal(
        DataRedundancy = DataRedundancy.asInstanceOf[js.Any],
        Type = Type.asInstanceOf[js.Any]
      )
      .asInstanceOf[BucketInfo]
  }
}

@js.native
trait Tag extends js.Object {
  val Key: js.UndefOr[String] = js.native
  val Value: js.UndefOr[String] = js.native
}

object Tag {
  def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
  ): Tag = {
    js.Dynamic
      .literal(
        Key = Key.asInstanceOf[js.Any],
        Value = Value.asInstanceOf[js.Any]
      )
      .asInstanceOf[Tag]
  }
}

@js.native
trait MetadataConfiguration extends js.Object {
  val JournalTableConfiguration: js.UndefOr[JournalTableConfiguration] =
    js.native
  val InventoryTableConfiguration: js.UndefOr[InventoryTableConfiguration] =
    js.native
}

object MetadataConfiguration {
  def apply(
      JournalTableConfiguration: js.UndefOr[JournalTableConfiguration] =
        js.undefined,
      InventoryTableConfiguration: js.UndefOr[InventoryTableConfiguration] =
        js.undefined
  ): MetadataConfiguration = {
    js.Dynamic
      .literal(
        JournalTableConfiguration =
          JournalTableConfiguration.asInstanceOf[js.Any],
        InventoryTableConfiguration =
          InventoryTableConfiguration.asInstanceOf[js.Any]
      )
      .asInstanceOf[MetadataConfiguration]
  }
}

@js.native
trait JournalTableConfiguration extends js.Object {
  val RecordExpiration: js.UndefOr[RecordExpiration] = js.native
  val EncryptionConfiguration
      : js.UndefOr[MetadataTableEncryptionConfiguration] = js.native
}

object JournalTableConfiguration {
  def apply(
      RecordExpiration: js.UndefOr[RecordExpiration] = js.undefined,
      EncryptionConfiguration: js.UndefOr[
        MetadataTableEncryptionConfiguration
      ] = js.undefined
  ): JournalTableConfiguration = {
    js.Dynamic
      .literal(
        RecordExpiration = RecordExpiration.asInstanceOf[js.Any],
        EncryptionConfiguration = EncryptionConfiguration.asInstanceOf[js.Any]
      )
      .asInstanceOf[JournalTableConfiguration]
  }
}

@js.native
trait RecordExpiration extends js.Object {
  val Expiration: js.UndefOr[ExpirationState] = js.native
  val Days: js.UndefOr[Int] = js.native
}

object RecordExpiration {
  def apply(
      Expiration: js.UndefOr[ExpirationState] = js.undefined,
      Days: js.UndefOr[Int] = js.undefined
  ): RecordExpiration = {
    js.Dynamic
      .literal(
        Expiration = Expiration.asInstanceOf[js.Any],
        Days = Days.asInstanceOf[js.Any]
      )
      .asInstanceOf[RecordExpiration]
  }
}

@js.native
trait MetadataTableEncryptionConfiguration extends js.Object {
  val SseAlgorithm: js.UndefOr[TableSseAlgorithm] = js.native
  val KmsKeyArn: js.UndefOr[String] = js.native
}

object MetadataTableEncryptionConfiguration {
  def apply(
      SseAlgorithm: js.UndefOr[TableSseAlgorithm] = js.undefined,
      KmsKeyArn: js.UndefOr[String] = js.undefined
  ): MetadataTableEncryptionConfiguration = {
    js.Dynamic
      .literal(
        SseAlgorithm = SseAlgorithm.asInstanceOf[js.Any],
        KmsKeyArn = KmsKeyArn.asInstanceOf[js.Any]
      )
      .asInstanceOf[MetadataTableEncryptionConfiguration]
  }
}

@js.native
trait InventoryTableConfiguration extends js.Object {
  val ConfigurationState: js.UndefOr[InventoryConfigurationState] = js.native
  val EncryptionConfiguration
      : js.UndefOr[MetadataTableEncryptionConfiguration] = js.native
}

object InventoryTableConfiguration {
  def apply(
      ConfigurationState: js.UndefOr[InventoryConfigurationState] =
        js.undefined,
      EncryptionConfiguration: js.UndefOr[
        MetadataTableEncryptionConfiguration
      ] = js.undefined
  ): InventoryTableConfiguration = {
    js.Dynamic
      .literal(
        ConfigurationState = ConfigurationState.asInstanceOf[js.Any],
        EncryptionConfiguration = EncryptionConfiguration.asInstanceOf[js.Any]
      )
      .asInstanceOf[InventoryTableConfiguration]
  }
}

@js.native
trait MetadataTableConfiguration extends js.Object {
  val S3TablesDestination: js.UndefOr[S3TablesDestination] = js.native
}

object MetadataTableConfiguration {
  def apply(
      S3TablesDestination: js.UndefOr[S3TablesDestination] = js.undefined
  ): MetadataTableConfiguration = {
    js.Dynamic
      .literal(
        S3TablesDestination = S3TablesDestination.asInstanceOf[js.Any]
      )
      .asInstanceOf[MetadataTableConfiguration]
  }
}

@js.native
trait S3TablesDestination extends js.Object {
  val TableBucketArn: js.UndefOr[String] = js.native
  val TableName: js.UndefOr[String] = js.native
}

object S3TablesDestination {
  def apply(
      TableBucketArn: js.UndefOr[String] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined
  ): S3TablesDestination = {
    js.Dynamic
      .literal(
        TableBucketArn = TableBucketArn.asInstanceOf[js.Any],
        TableName = TableName.asInstanceOf[js.Any]
      )
      .asInstanceOf[S3TablesDestination]
  }
}

@js.native
trait SessionCredentials extends js.Object {
  val AccessKeyId: js.UndefOr[String] = js.native
  val SecretAccessKey: js.UndefOr[String] = js.native
  val SessionToken: js.UndefOr[String] = js.native
  val Expiration: js.UndefOr[js.Date] = js.native
}

object SessionCredentials {
  def apply(
      AccessKeyId: js.UndefOr[String] = js.undefined,
      SecretAccessKey: js.UndefOr[String] = js.undefined,
      SessionToken: js.UndefOr[String] = js.undefined,
      Expiration: js.UndefOr[js.Date] = js.undefined
  ): SessionCredentials = {
    js.Dynamic
      .literal(
        AccessKeyId = AccessKeyId.asInstanceOf[js.Any],
        SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any],
        SessionToken = SessionToken.asInstanceOf[js.Any],
        Expiration = Expiration.asInstanceOf[js.Any]
      )
      .asInstanceOf[SessionCredentials]
  }
}

@js.native
trait Delete extends js.Object {
  val Objects: js.UndefOr[js.Array[ObjectIdentifier]] = js.native
  val Quiet: js.UndefOr[Boolean] = js.native
}

object Delete {
  def apply(
      Objects: js.UndefOr[js.Array[ObjectIdentifier]] = js.undefined,
      Quiet: js.UndefOr[Boolean] = js.undefined
  ): Delete = {
    js.Dynamic
      .literal(
        Objects = Objects.asInstanceOf[js.Any],
        Quiet = Quiet.asInstanceOf[js.Any]
      )
      .asInstanceOf[Delete]
  }
}

@js.native
trait ObjectIdentifier extends js.Object {
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val ETag: js.UndefOr[String] = js.native
  val LastModifiedTime: js.UndefOr[js.Date] = js.native
  val Size: js.UndefOr[Double] = js.native
}

object ObjectIdentifier {
  def apply(
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      ETag: js.UndefOr[String] = js.undefined,
      LastModifiedTime: js.UndefOr[js.Date] = js.undefined,
      Size: js.UndefOr[Double] = js.undefined
  ): ObjectIdentifier = {
    js.Dynamic
      .literal(
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        ETag = ETag.asInstanceOf[js.Any],
        LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any],
        Size = Size.asInstanceOf[js.Any]
      )
      .asInstanceOf[ObjectIdentifier]
  }
}

@js.native
trait DeletedObject extends js.Object {
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val DeleteMarker: js.UndefOr[Boolean] = js.native
  val DeleteMarkerVersionId: js.UndefOr[String] = js.native
}

object DeletedObject {
  def apply(
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      DeleteMarker: js.UndefOr[Boolean] = js.undefined,
      DeleteMarkerVersionId: js.UndefOr[String] = js.undefined
  ): DeletedObject = {
    js.Dynamic
      .literal(
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        DeleteMarker = DeleteMarker.asInstanceOf[js.Any],
        DeleteMarkerVersionId = DeleteMarkerVersionId.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeletedObject]
  }
}

@js.native
trait AbacStatus extends js.Object {
  val Status: js.UndefOr[BucketAbacStatus] = js.native
}

object AbacStatus {
  def apply(
      Status: js.UndefOr[BucketAbacStatus] = js.undefined
  ): AbacStatus = {
    js.Dynamic
      .literal(
        Status = Status.asInstanceOf[js.Any]
      )
      .asInstanceOf[AbacStatus]
  }
}

@js.native
trait Owner extends js.Object {
  val DisplayName: js.UndefOr[String] = js.native
  val ID: js.UndefOr[String] = js.native
}

object Owner {
  def apply(
      DisplayName: js.UndefOr[String] = js.undefined,
      ID: js.UndefOr[String] = js.undefined
  ): Owner = {
    js.Dynamic
      .literal(
        DisplayName = DisplayName.asInstanceOf[js.Any],
        ID = ID.asInstanceOf[js.Any]
      )
      .asInstanceOf[Owner]
  }
}

@js.native
trait Grant extends js.Object {
  val Grantee: js.UndefOr[Grantee] = js.native
  val Permission: js.UndefOr[Permission] = js.native
}

object Grant {
  def apply(
      Grantee: js.UndefOr[Grantee] = js.undefined,
      Permission: js.UndefOr[Permission] = js.undefined
  ): Grant = {
    js.Dynamic
      .literal(
        Grantee = Grantee.asInstanceOf[js.Any],
        Permission = Permission.asInstanceOf[js.Any]
      )
      .asInstanceOf[Grant]
  }
}

@js.native
trait Grantee extends js.Object {
  val DisplayName: js.UndefOr[String] = js.native
  val EmailAddress: js.UndefOr[String] = js.native
  val ID: js.UndefOr[String] = js.native
  val URI: js.UndefOr[String] = js.native
  val Type: js.UndefOr[Type] = js.native
}

object Grantee {
  def apply(
      DisplayName: js.UndefOr[String] = js.undefined,
      EmailAddress: js.UndefOr[String] = js.undefined,
      ID: js.UndefOr[String] = js.undefined,
      URI: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[Type] = js.undefined
  ): Grantee = {
    js.Dynamic
      .literal(
        DisplayName = DisplayName.asInstanceOf[js.Any],
        EmailAddress = EmailAddress.asInstanceOf[js.Any],
        ID = ID.asInstanceOf[js.Any],
        URI = URI.asInstanceOf[js.Any],
        Type = Type.asInstanceOf[js.Any]
      )
      .asInstanceOf[Grantee]
  }
}

@js.native
trait AnalyticsConfiguration extends js.Object {
  val Id: js.UndefOr[String] = js.native
  val Filter: js.UndefOr[AnalyticsFilter] = js.native
  val StorageClassAnalysis: js.UndefOr[StorageClassAnalysis] = js.native
}

object AnalyticsConfiguration {
  def apply(
      Id: js.UndefOr[String] = js.undefined,
      Filter: js.UndefOr[AnalyticsFilter] = js.undefined,
      StorageClassAnalysis: js.UndefOr[StorageClassAnalysis] = js.undefined
  ): AnalyticsConfiguration = {
    js.Dynamic
      .literal(
        Id = Id.asInstanceOf[js.Any],
        Filter = Filter.asInstanceOf[js.Any],
        StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any]
      )
      .asInstanceOf[AnalyticsConfiguration]
  }
}

@js.native
trait StorageClassAnalysis extends js.Object {
  val DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.native
}

object StorageClassAnalysis {
  def apply(
      DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.undefined
  ): StorageClassAnalysis = {
    js.Dynamic
      .literal(
        DataExport = DataExport.asInstanceOf[js.Any]
      )
      .asInstanceOf[StorageClassAnalysis]
  }
}

@js.native
trait StorageClassAnalysisDataExport extends js.Object {
  val OutputSchemaVersion: js.UndefOr[StorageClassAnalysisSchemaVersion] =
    js.native
  val Destination: js.UndefOr[AnalyticsExportDestination] = js.native
}

object StorageClassAnalysisDataExport {
  def apply(
      OutputSchemaVersion: js.UndefOr[StorageClassAnalysisSchemaVersion] =
        js.undefined,
      Destination: js.UndefOr[AnalyticsExportDestination] = js.undefined
  ): StorageClassAnalysisDataExport = {
    js.Dynamic
      .literal(
        OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any],
        Destination = Destination.asInstanceOf[js.Any]
      )
      .asInstanceOf[StorageClassAnalysisDataExport]
  }
}

@js.native
trait AnalyticsExportDestination extends js.Object {
  val S3BucketDestination: js.UndefOr[AnalyticsS3BucketDestination] = js.native
}

object AnalyticsExportDestination {
  def apply(
      S3BucketDestination: js.UndefOr[AnalyticsS3BucketDestination] =
        js.undefined
  ): AnalyticsExportDestination = {
    js.Dynamic
      .literal(
        S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any]
      )
      .asInstanceOf[AnalyticsExportDestination]
  }
}

@js.native
trait AnalyticsS3BucketDestination extends js.Object {
  val Format: js.UndefOr[AnalyticsS3ExportFileFormat] = js.native
  val BucketAccountId: js.UndefOr[String] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val Prefix: js.UndefOr[String] = js.native
}

object AnalyticsS3BucketDestination {
  def apply(
      Format: js.UndefOr[AnalyticsS3ExportFileFormat] = js.undefined,
      BucketAccountId: js.UndefOr[String] = js.undefined,
      Bucket: js.UndefOr[String] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined
  ): AnalyticsS3BucketDestination = {
    js.Dynamic
      .literal(
        Format = Format.asInstanceOf[js.Any],
        BucketAccountId = BucketAccountId.asInstanceOf[js.Any],
        Bucket = Bucket.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any]
      )
      .asInstanceOf[AnalyticsS3BucketDestination]
  }
}

@js.native
trait CORSRule extends js.Object {
  val ID: js.UndefOr[String] = js.native
  val AllowedHeaders: js.UndefOr[js.Array[String]] = js.native
  val AllowedMethods: js.UndefOr[js.Array[String]] = js.native
  val AllowedOrigins: js.UndefOr[js.Array[String]] = js.native
  val ExposeHeaders: js.UndefOr[js.Array[String]] = js.native
  val MaxAgeSeconds: js.UndefOr[Int] = js.native
}

object CORSRule {
  def apply(
      ID: js.UndefOr[String] = js.undefined,
      AllowedHeaders: js.UndefOr[js.Array[String]] = js.undefined,
      AllowedMethods: js.UndefOr[js.Array[String]] = js.undefined,
      AllowedOrigins: js.UndefOr[js.Array[String]] = js.undefined,
      ExposeHeaders: js.UndefOr[js.Array[String]] = js.undefined,
      MaxAgeSeconds: js.UndefOr[Int] = js.undefined
  ): CORSRule = {
    js.Dynamic
      .literal(
        ID = ID.asInstanceOf[js.Any],
        AllowedHeaders = AllowedHeaders.asInstanceOf[js.Any],
        AllowedMethods = AllowedMethods.asInstanceOf[js.Any],
        AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any],
        ExposeHeaders = ExposeHeaders.asInstanceOf[js.Any],
        MaxAgeSeconds = MaxAgeSeconds.asInstanceOf[js.Any]
      )
      .asInstanceOf[CORSRule]
  }
}

@js.native
trait ServerSideEncryptionConfiguration extends js.Object {
  val Rules: js.UndefOr[js.Array[ServerSideEncryptionRule]] = js.native
}

object ServerSideEncryptionConfiguration {
  def apply(
      Rules: js.UndefOr[js.Array[ServerSideEncryptionRule]] = js.undefined
  ): ServerSideEncryptionConfiguration = {
    js.Dynamic
      .literal(
        Rules = Rules.asInstanceOf[js.Any]
      )
      .asInstanceOf[ServerSideEncryptionConfiguration]
  }
}

@js.native
trait ServerSideEncryptionRule extends js.Object {
  val ApplyServerSideEncryptionByDefault
      : js.UndefOr[ServerSideEncryptionByDefault] = js.native
  val BucketKeyEnabled: js.UndefOr[Boolean] = js.native
  val BlockedEncryptionTypes: js.UndefOr[BlockedEncryptionTypes] = js.native
}

object ServerSideEncryptionRule {
  def apply(
      ApplyServerSideEncryptionByDefault: js.UndefOr[
        ServerSideEncryptionByDefault
      ] = js.undefined,
      BucketKeyEnabled: js.UndefOr[Boolean] = js.undefined,
      BlockedEncryptionTypes: js.UndefOr[BlockedEncryptionTypes] = js.undefined
  ): ServerSideEncryptionRule = {
    js.Dynamic
      .literal(
        ApplyServerSideEncryptionByDefault =
          ApplyServerSideEncryptionByDefault.asInstanceOf[js.Any],
        BucketKeyEnabled = BucketKeyEnabled.asInstanceOf[js.Any],
        BlockedEncryptionTypes = BlockedEncryptionTypes.asInstanceOf[js.Any]
      )
      .asInstanceOf[ServerSideEncryptionRule]
  }
}

@js.native
trait ServerSideEncryptionByDefault extends js.Object {
  val SSEAlgorithm: js.UndefOr[ServerSideEncryption] = js.native
  val KMSMasterKeyID: js.UndefOr[String] = js.native
}

object ServerSideEncryptionByDefault {
  def apply(
      SSEAlgorithm: js.UndefOr[ServerSideEncryption] = js.undefined,
      KMSMasterKeyID: js.UndefOr[String] = js.undefined
  ): ServerSideEncryptionByDefault = {
    js.Dynamic
      .literal(
        SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any],
        KMSMasterKeyID = KMSMasterKeyID.asInstanceOf[js.Any]
      )
      .asInstanceOf[ServerSideEncryptionByDefault]
  }
}

@js.native
trait BlockedEncryptionTypes extends js.Object {
  val EncryptionType: js.UndefOr[js.Array[EncryptionType]] = js.native
}

object BlockedEncryptionTypes {
  def apply(
      EncryptionType: js.UndefOr[js.Array[EncryptionType]] = js.undefined
  ): BlockedEncryptionTypes = {
    js.Dynamic
      .literal(
        EncryptionType = EncryptionType.asInstanceOf[js.Any]
      )
      .asInstanceOf[BlockedEncryptionTypes]
  }
}

@js.native
trait IntelligentTieringConfiguration extends js.Object {
  val Id: js.UndefOr[String] = js.native
  val Filter: js.UndefOr[IntelligentTieringFilter] = js.native
  val Status: js.UndefOr[IntelligentTieringStatus] = js.native
  val Tierings: js.UndefOr[js.Array[Tiering]] = js.native
}

object IntelligentTieringConfiguration {
  def apply(
      Id: js.UndefOr[String] = js.undefined,
      Filter: js.UndefOr[IntelligentTieringFilter] = js.undefined,
      Status: js.UndefOr[IntelligentTieringStatus] = js.undefined,
      Tierings: js.UndefOr[js.Array[Tiering]] = js.undefined
  ): IntelligentTieringConfiguration = {
    js.Dynamic
      .literal(
        Id = Id.asInstanceOf[js.Any],
        Filter = Filter.asInstanceOf[js.Any],
        Status = Status.asInstanceOf[js.Any],
        Tierings = Tierings.asInstanceOf[js.Any]
      )
      .asInstanceOf[IntelligentTieringConfiguration]
  }
}

@js.native
trait IntelligentTieringFilter extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
  val Tag: js.UndefOr[Tag] = js.native
  val And: js.UndefOr[IntelligentTieringAndOperator] = js.native
}

object IntelligentTieringFilter {
  def apply(
      Prefix: js.UndefOr[String] = js.undefined,
      Tag: js.UndefOr[Tag] = js.undefined,
      And: js.UndefOr[IntelligentTieringAndOperator] = js.undefined
  ): IntelligentTieringFilter = {
    js.Dynamic
      .literal(
        Prefix = Prefix.asInstanceOf[js.Any],
        Tag = Tag.asInstanceOf[js.Any],
        And = And.asInstanceOf[js.Any]
      )
      .asInstanceOf[IntelligentTieringFilter]
  }
}

@js.native
trait IntelligentTieringAndOperator extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
  val Tags: js.UndefOr[js.Array[Tag]] = js.native
}

object IntelligentTieringAndOperator {
  def apply(
      Prefix: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[js.Array[Tag]] = js.undefined
  ): IntelligentTieringAndOperator = {
    js.Dynamic
      .literal(
        Prefix = Prefix.asInstanceOf[js.Any],
        Tags = Tags.asInstanceOf[js.Any]
      )
      .asInstanceOf[IntelligentTieringAndOperator]
  }
}

@js.native
trait Tiering extends js.Object {
  val Days: js.UndefOr[Int] = js.native
  val AccessTier: js.UndefOr[IntelligentTieringAccessTier] = js.native
}

object Tiering {
  def apply(
      Days: js.UndefOr[Int] = js.undefined,
      AccessTier: js.UndefOr[IntelligentTieringAccessTier] = js.undefined
  ): Tiering = {
    js.Dynamic
      .literal(
        Days = Days.asInstanceOf[js.Any],
        AccessTier = AccessTier.asInstanceOf[js.Any]
      )
      .asInstanceOf[Tiering]
  }
}

@js.native
trait InventoryConfiguration extends js.Object {
  val Destination: js.UndefOr[InventoryDestination] = js.native
  val IsEnabled: js.UndefOr[Boolean] = js.native
  val Filter: js.UndefOr[InventoryFilter] = js.native
  val Id: js.UndefOr[String] = js.native
  val IncludedObjectVersions: js.UndefOr[InventoryIncludedObjectVersions] =
    js.native
  val OptionalFields: js.UndefOr[js.Array[InventoryOptionalField]] = js.native
  val Schedule: js.UndefOr[InventorySchedule] = js.native
}

object InventoryConfiguration {
  def apply(
      Destination: js.UndefOr[InventoryDestination] = js.undefined,
      IsEnabled: js.UndefOr[Boolean] = js.undefined,
      Filter: js.UndefOr[InventoryFilter] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      IncludedObjectVersions: js.UndefOr[InventoryIncludedObjectVersions] =
        js.undefined,
      OptionalFields: js.UndefOr[js.Array[InventoryOptionalField]] =
        js.undefined,
      Schedule: js.UndefOr[InventorySchedule] = js.undefined
  ): InventoryConfiguration = {
    js.Dynamic
      .literal(
        Destination = Destination.asInstanceOf[js.Any],
        IsEnabled = IsEnabled.asInstanceOf[js.Any],
        Filter = Filter.asInstanceOf[js.Any],
        Id = Id.asInstanceOf[js.Any],
        IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any],
        OptionalFields = OptionalFields.asInstanceOf[js.Any],
        Schedule = Schedule.asInstanceOf[js.Any]
      )
      .asInstanceOf[InventoryConfiguration]
  }
}

@js.native
trait InventoryDestination extends js.Object {
  val S3BucketDestination: js.UndefOr[InventoryS3BucketDestination] = js.native
}

object InventoryDestination {
  def apply(
      S3BucketDestination: js.UndefOr[InventoryS3BucketDestination] =
        js.undefined
  ): InventoryDestination = {
    js.Dynamic
      .literal(
        S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any]
      )
      .asInstanceOf[InventoryDestination]
  }
}

@js.native
trait InventoryS3BucketDestination extends js.Object {
  val AccountId: js.UndefOr[String] = js.native
  val Bucket: js.UndefOr[String] = js.native
  val Format: js.UndefOr[InventoryFormat] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val Encryption: js.UndefOr[InventoryEncryption] = js.native
}

object InventoryS3BucketDestination {
  def apply(
      AccountId: js.UndefOr[String] = js.undefined,
      Bucket: js.UndefOr[String] = js.undefined,
      Format: js.UndefOr[InventoryFormat] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      Encryption: js.UndefOr[InventoryEncryption] = js.undefined
  ): InventoryS3BucketDestination = {
    js.Dynamic
      .literal(
        AccountId = AccountId.asInstanceOf[js.Any],
        Bucket = Bucket.asInstanceOf[js.Any],
        Format = Format.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any],
        Encryption = Encryption.asInstanceOf[js.Any]
      )
      .asInstanceOf[InventoryS3BucketDestination]
  }
}

@js.native
trait InventoryEncryption extends js.Object {
  val SSES3: js.UndefOr[SSES3] = js.native
  val SSEKMS: js.UndefOr[SSEKMS] = js.native
}

object InventoryEncryption {
  def apply(
      SSES3: js.UndefOr[SSES3] = js.undefined,
      SSEKMS: js.UndefOr[SSEKMS] = js.undefined
  ): InventoryEncryption = {
    js.Dynamic
      .literal(
        SSES3 = SSES3.asInstanceOf[js.Any],
        SSEKMS = SSEKMS.asInstanceOf[js.Any]
      )
      .asInstanceOf[InventoryEncryption]
  }
}

@js.native
trait SSES3 extends js.Object {}

@js.native
trait SSEKMS extends js.Object {
  val KeyId: js.UndefOr[String] = js.native
}

object SSEKMS {
  def apply(
      KeyId: js.UndefOr[String] = js.undefined
  ): SSEKMS = {
    js.Dynamic
      .literal(
        KeyId = KeyId.asInstanceOf[js.Any]
      )
      .asInstanceOf[SSEKMS]
  }
}

@js.native
trait InventoryFilter extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
}

object InventoryFilter {
  def apply(
      Prefix: js.UndefOr[String] = js.undefined
  ): InventoryFilter = {
    js.Dynamic
      .literal(
        Prefix = Prefix.asInstanceOf[js.Any]
      )
      .asInstanceOf[InventoryFilter]
  }
}

@js.native
trait InventorySchedule extends js.Object {
  val Frequency: js.UndefOr[InventoryFrequency] = js.native
}

object InventorySchedule {
  def apply(
      Frequency: js.UndefOr[InventoryFrequency] = js.undefined
  ): InventorySchedule = {
    js.Dynamic
      .literal(
        Frequency = Frequency.asInstanceOf[js.Any]
      )
      .asInstanceOf[InventorySchedule]
  }
}

@js.native
trait LifecycleRule extends js.Object {
  val Expiration: js.UndefOr[LifecycleExpiration] = js.native
  val ID: js.UndefOr[String] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val Filter: js.UndefOr[LifecycleRuleFilter] = js.native
  val Status: js.UndefOr[ExpirationStatus] = js.native
  val Transitions: js.UndefOr[js.Array[Transition]] = js.native
  val NoncurrentVersionTransitions
      : js.UndefOr[js.Array[NoncurrentVersionTransition]] = js.native
  val NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] =
    js.native
  val AbortIncompleteMultipartUpload
      : js.UndefOr[AbortIncompleteMultipartUpload] = js.native
}

object LifecycleRule {
  def apply(
      Expiration: js.UndefOr[LifecycleExpiration] = js.undefined,
      ID: js.UndefOr[String] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      Filter: js.UndefOr[LifecycleRuleFilter] = js.undefined,
      Status: js.UndefOr[ExpirationStatus] = js.undefined,
      Transitions: js.UndefOr[js.Array[Transition]] = js.undefined,
      NoncurrentVersionTransitions: js.UndefOr[
        js.Array[NoncurrentVersionTransition]
      ] = js.undefined,
      NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] =
        js.undefined,
      AbortIncompleteMultipartUpload: js.UndefOr[
        AbortIncompleteMultipartUpload
      ] = js.undefined
  ): LifecycleRule = {
    js.Dynamic
      .literal(
        Expiration = Expiration.asInstanceOf[js.Any],
        ID = ID.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any],
        Filter = Filter.asInstanceOf[js.Any],
        Status = Status.asInstanceOf[js.Any],
        Transitions = Transitions.asInstanceOf[js.Any],
        NoncurrentVersionTransitions =
          NoncurrentVersionTransitions.asInstanceOf[js.Any],
        NoncurrentVersionExpiration =
          NoncurrentVersionExpiration.asInstanceOf[js.Any],
        AbortIncompleteMultipartUpload =
          AbortIncompleteMultipartUpload.asInstanceOf[js.Any]
      )
      .asInstanceOf[LifecycleRule]
  }
}

@js.native
trait LifecycleExpiration extends js.Object {
  val Date: js.UndefOr[js.Date] = js.native
  val Days: js.UndefOr[Int] = js.native
  val ExpiredObjectDeleteMarker: js.UndefOr[Boolean] = js.native
}

object LifecycleExpiration {
  def apply(
      Date: js.UndefOr[js.Date] = js.undefined,
      Days: js.UndefOr[Int] = js.undefined,
      ExpiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
  ): LifecycleExpiration = {
    js.Dynamic
      .literal(
        Date = Date.asInstanceOf[js.Any],
        Days = Days.asInstanceOf[js.Any],
        ExpiredObjectDeleteMarker =
          ExpiredObjectDeleteMarker.asInstanceOf[js.Any]
      )
      .asInstanceOf[LifecycleExpiration]
  }
}

@js.native
trait LifecycleRuleFilter extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
  val Tag: js.UndefOr[Tag] = js.native
  val ObjectSizeGreaterThan: js.UndefOr[Double] = js.native
  val ObjectSizeLessThan: js.UndefOr[Double] = js.native
  val And: js.UndefOr[LifecycleRuleAndOperator] = js.native
}

object LifecycleRuleFilter {
  def apply(
      Prefix: js.UndefOr[String] = js.undefined,
      Tag: js.UndefOr[Tag] = js.undefined,
      ObjectSizeGreaterThan: js.UndefOr[Double] = js.undefined,
      ObjectSizeLessThan: js.UndefOr[Double] = js.undefined,
      And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined
  ): LifecycleRuleFilter = {
    js.Dynamic
      .literal(
        Prefix = Prefix.asInstanceOf[js.Any],
        Tag = Tag.asInstanceOf[js.Any],
        ObjectSizeGreaterThan = ObjectSizeGreaterThan.asInstanceOf[js.Any],
        ObjectSizeLessThan = ObjectSizeLessThan.asInstanceOf[js.Any],
        And = And.asInstanceOf[js.Any]
      )
      .asInstanceOf[LifecycleRuleFilter]
  }
}

@js.native
trait LifecycleRuleAndOperator extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
  val Tags: js.UndefOr[js.Array[Tag]] = js.native
  val ObjectSizeGreaterThan: js.UndefOr[Double] = js.native
  val ObjectSizeLessThan: js.UndefOr[Double] = js.native
}

object LifecycleRuleAndOperator {
  def apply(
      Prefix: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[js.Array[Tag]] = js.undefined,
      ObjectSizeGreaterThan: js.UndefOr[Double] = js.undefined,
      ObjectSizeLessThan: js.UndefOr[Double] = js.undefined
  ): LifecycleRuleAndOperator = {
    js.Dynamic
      .literal(
        Prefix = Prefix.asInstanceOf[js.Any],
        Tags = Tags.asInstanceOf[js.Any],
        ObjectSizeGreaterThan = ObjectSizeGreaterThan.asInstanceOf[js.Any],
        ObjectSizeLessThan = ObjectSizeLessThan.asInstanceOf[js.Any]
      )
      .asInstanceOf[LifecycleRuleAndOperator]
  }
}

@js.native
trait Transition extends js.Object {
  val Date: js.UndefOr[js.Date] = js.native
  val Days: js.UndefOr[Int] = js.native
  val StorageClass: js.UndefOr[TransitionStorageClass] = js.native
}

object Transition {
  def apply(
      Date: js.UndefOr[js.Date] = js.undefined,
      Days: js.UndefOr[Int] = js.undefined,
      StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
  ): Transition = {
    js.Dynamic
      .literal(
        Date = Date.asInstanceOf[js.Any],
        Days = Days.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any]
      )
      .asInstanceOf[Transition]
  }
}

@js.native
trait NoncurrentVersionTransition extends js.Object {
  val NoncurrentDays: js.UndefOr[Int] = js.native
  val StorageClass: js.UndefOr[TransitionStorageClass] = js.native
  val NewerNoncurrentVersions: js.UndefOr[Int] = js.native
}

object NoncurrentVersionTransition {
  def apply(
      NoncurrentDays: js.UndefOr[Int] = js.undefined,
      StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined,
      NewerNoncurrentVersions: js.UndefOr[Int] = js.undefined
  ): NoncurrentVersionTransition = {
    js.Dynamic
      .literal(
        NoncurrentDays = NoncurrentDays.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any],
        NewerNoncurrentVersions = NewerNoncurrentVersions.asInstanceOf[js.Any]
      )
      .asInstanceOf[NoncurrentVersionTransition]
  }
}

@js.native
trait NoncurrentVersionExpiration extends js.Object {
  val NoncurrentDays: js.UndefOr[Int] = js.native
  val NewerNoncurrentVersions: js.UndefOr[Int] = js.native
}

object NoncurrentVersionExpiration {
  def apply(
      NoncurrentDays: js.UndefOr[Int] = js.undefined,
      NewerNoncurrentVersions: js.UndefOr[Int] = js.undefined
  ): NoncurrentVersionExpiration = {
    js.Dynamic
      .literal(
        NoncurrentDays = NoncurrentDays.asInstanceOf[js.Any],
        NewerNoncurrentVersions = NewerNoncurrentVersions.asInstanceOf[js.Any]
      )
      .asInstanceOf[NoncurrentVersionExpiration]
  }
}

@js.native
trait AbortIncompleteMultipartUpload extends js.Object {
  val DaysAfterInitiation: js.UndefOr[Int] = js.native
}

object AbortIncompleteMultipartUpload {
  def apply(
      DaysAfterInitiation: js.UndefOr[Int] = js.undefined
  ): AbortIncompleteMultipartUpload = {
    js.Dynamic
      .literal(
        DaysAfterInitiation = DaysAfterInitiation.asInstanceOf[js.Any]
      )
      .asInstanceOf[AbortIncompleteMultipartUpload]
  }
}

@js.native
trait LoggingEnabled extends js.Object {
  val TargetBucket: js.UndefOr[String] = js.native
  val TargetGrants: js.UndefOr[js.Array[TargetGrant]] = js.native
  val TargetPrefix: js.UndefOr[String] = js.native
  val TargetObjectKeyFormat: js.UndefOr[TargetObjectKeyFormat] = js.native
}

object LoggingEnabled {
  def apply(
      TargetBucket: js.UndefOr[String] = js.undefined,
      TargetGrants: js.UndefOr[js.Array[TargetGrant]] = js.undefined,
      TargetPrefix: js.UndefOr[String] = js.undefined,
      TargetObjectKeyFormat: js.UndefOr[TargetObjectKeyFormat] = js.undefined
  ): LoggingEnabled = {
    js.Dynamic
      .literal(
        TargetBucket = TargetBucket.asInstanceOf[js.Any],
        TargetGrants = TargetGrants.asInstanceOf[js.Any],
        TargetPrefix = TargetPrefix.asInstanceOf[js.Any],
        TargetObjectKeyFormat = TargetObjectKeyFormat.asInstanceOf[js.Any]
      )
      .asInstanceOf[LoggingEnabled]
  }
}

@js.native
trait TargetGrant extends js.Object {
  val Grantee: js.UndefOr[Grantee] = js.native
  val Permission: js.UndefOr[BucketLogsPermission] = js.native
}

object TargetGrant {
  def apply(
      Grantee: js.UndefOr[Grantee] = js.undefined,
      Permission: js.UndefOr[BucketLogsPermission] = js.undefined
  ): TargetGrant = {
    js.Dynamic
      .literal(
        Grantee = Grantee.asInstanceOf[js.Any],
        Permission = Permission.asInstanceOf[js.Any]
      )
      .asInstanceOf[TargetGrant]
  }
}

@js.native
trait TargetObjectKeyFormat extends js.Object {
  val SimplePrefix: js.UndefOr[SimplePrefix] = js.native
  val PartitionedPrefix: js.UndefOr[PartitionedPrefix] = js.native
}

object TargetObjectKeyFormat {
  def apply(
      SimplePrefix: js.UndefOr[SimplePrefix] = js.undefined,
      PartitionedPrefix: js.UndefOr[PartitionedPrefix] = js.undefined
  ): TargetObjectKeyFormat = {
    js.Dynamic
      .literal(
        SimplePrefix = SimplePrefix.asInstanceOf[js.Any],
        PartitionedPrefix = PartitionedPrefix.asInstanceOf[js.Any]
      )
      .asInstanceOf[TargetObjectKeyFormat]
  }
}

@js.native
trait SimplePrefix extends js.Object {}

@js.native
trait PartitionedPrefix extends js.Object {
  val PartitionDateSource: js.UndefOr[PartitionDateSource] = js.native
}

object PartitionedPrefix {
  def apply(
      PartitionDateSource: js.UndefOr[PartitionDateSource] = js.undefined
  ): PartitionedPrefix = {
    js.Dynamic
      .literal(
        PartitionDateSource = PartitionDateSource.asInstanceOf[js.Any]
      )
      .asInstanceOf[PartitionedPrefix]
  }
}

@js.native
trait GetBucketMetadataConfigurationResult extends js.Object {
  val MetadataConfigurationResult: js.UndefOr[MetadataConfigurationResult] =
    js.native
}

object GetBucketMetadataConfigurationResult {
  def apply(
      MetadataConfigurationResult: js.UndefOr[MetadataConfigurationResult] =
        js.undefined
  ): GetBucketMetadataConfigurationResult = {
    js.Dynamic
      .literal(
        MetadataConfigurationResult =
          MetadataConfigurationResult.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketMetadataConfigurationResult]
  }
}

@js.native
trait MetadataConfigurationResult extends js.Object {
  val DestinationResult: js.UndefOr[DestinationResult] = js.native
  val JournalTableConfigurationResult
      : js.UndefOr[JournalTableConfigurationResult] = js.native
  val InventoryTableConfigurationResult
      : js.UndefOr[InventoryTableConfigurationResult] = js.native
}

object MetadataConfigurationResult {
  def apply(
      DestinationResult: js.UndefOr[DestinationResult] = js.undefined,
      JournalTableConfigurationResult: js.UndefOr[
        JournalTableConfigurationResult
      ] = js.undefined,
      InventoryTableConfigurationResult: js.UndefOr[
        InventoryTableConfigurationResult
      ] = js.undefined
  ): MetadataConfigurationResult = {
    js.Dynamic
      .literal(
        DestinationResult = DestinationResult.asInstanceOf[js.Any],
        JournalTableConfigurationResult =
          JournalTableConfigurationResult.asInstanceOf[js.Any],
        InventoryTableConfigurationResult =
          InventoryTableConfigurationResult.asInstanceOf[js.Any]
      )
      .asInstanceOf[MetadataConfigurationResult]
  }
}

@js.native
trait DestinationResult extends js.Object {
  val TableBucketType: js.UndefOr[S3TablesBucketType] = js.native
  val TableBucketArn: js.UndefOr[String] = js.native
  val TableNamespace: js.UndefOr[String] = js.native
}

object DestinationResult {
  def apply(
      TableBucketType: js.UndefOr[S3TablesBucketType] = js.undefined,
      TableBucketArn: js.UndefOr[String] = js.undefined,
      TableNamespace: js.UndefOr[String] = js.undefined
  ): DestinationResult = {
    js.Dynamic
      .literal(
        TableBucketType = TableBucketType.asInstanceOf[js.Any],
        TableBucketArn = TableBucketArn.asInstanceOf[js.Any],
        TableNamespace = TableNamespace.asInstanceOf[js.Any]
      )
      .asInstanceOf[DestinationResult]
  }
}

@js.native
trait JournalTableConfigurationResult extends js.Object {
  val TableStatus: js.UndefOr[String] = js.native
  val Error: js.UndefOr[ErrorDetails] = js.native
  val TableName: js.UndefOr[String] = js.native
  val TableArn: js.UndefOr[String] = js.native
  val RecordExpiration: js.UndefOr[RecordExpiration] = js.native
}

object JournalTableConfigurationResult {
  def apply(
      TableStatus: js.UndefOr[String] = js.undefined,
      Error: js.UndefOr[ErrorDetails] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined,
      TableArn: js.UndefOr[String] = js.undefined,
      RecordExpiration: js.UndefOr[RecordExpiration] = js.undefined
  ): JournalTableConfigurationResult = {
    js.Dynamic
      .literal(
        TableStatus = TableStatus.asInstanceOf[js.Any],
        Error = Error.asInstanceOf[js.Any],
        TableName = TableName.asInstanceOf[js.Any],
        TableArn = TableArn.asInstanceOf[js.Any],
        RecordExpiration = RecordExpiration.asInstanceOf[js.Any]
      )
      .asInstanceOf[JournalTableConfigurationResult]
  }
}

@js.native
trait ErrorDetails extends js.Object {
  val ErrorCode: js.UndefOr[String] = js.native
  val ErrorMessage: js.UndefOr[String] = js.native
}

object ErrorDetails {
  def apply(
      ErrorCode: js.UndefOr[String] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined
  ): ErrorDetails = {
    js.Dynamic
      .literal(
        ErrorCode = ErrorCode.asInstanceOf[js.Any],
        ErrorMessage = ErrorMessage.asInstanceOf[js.Any]
      )
      .asInstanceOf[ErrorDetails]
  }
}

@js.native
trait InventoryTableConfigurationResult extends js.Object {
  val ConfigurationState: js.UndefOr[InventoryConfigurationState] = js.native
  val TableStatus: js.UndefOr[String] = js.native
  val Error: js.UndefOr[ErrorDetails] = js.native
  val TableName: js.UndefOr[String] = js.native
  val TableArn: js.UndefOr[String] = js.native
}

object InventoryTableConfigurationResult {
  def apply(
      ConfigurationState: js.UndefOr[InventoryConfigurationState] =
        js.undefined,
      TableStatus: js.UndefOr[String] = js.undefined,
      Error: js.UndefOr[ErrorDetails] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined,
      TableArn: js.UndefOr[String] = js.undefined
  ): InventoryTableConfigurationResult = {
    js.Dynamic
      .literal(
        ConfigurationState = ConfigurationState.asInstanceOf[js.Any],
        TableStatus = TableStatus.asInstanceOf[js.Any],
        Error = Error.asInstanceOf[js.Any],
        TableName = TableName.asInstanceOf[js.Any],
        TableArn = TableArn.asInstanceOf[js.Any]
      )
      .asInstanceOf[InventoryTableConfigurationResult]
  }
}

@js.native
trait GetBucketMetadataTableConfigurationResult extends js.Object {
  val MetadataTableConfigurationResult
      : js.UndefOr[MetadataTableConfigurationResult] = js.native
  val Status: js.UndefOr[String] = js.native
  val Error: js.UndefOr[ErrorDetails] = js.native
}

object GetBucketMetadataTableConfigurationResult {
  def apply(
      MetadataTableConfigurationResult: js.UndefOr[
        MetadataTableConfigurationResult
      ] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      Error: js.UndefOr[ErrorDetails] = js.undefined
  ): GetBucketMetadataTableConfigurationResult = {
    js.Dynamic
      .literal(
        MetadataTableConfigurationResult =
          MetadataTableConfigurationResult.asInstanceOf[js.Any],
        Status = Status.asInstanceOf[js.Any],
        Error = Error.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetBucketMetadataTableConfigurationResult]
  }
}

@js.native
trait MetadataTableConfigurationResult extends js.Object {
  val S3TablesDestinationResult: js.UndefOr[S3TablesDestinationResult] =
    js.native
}

object MetadataTableConfigurationResult {
  def apply(
      S3TablesDestinationResult: js.UndefOr[S3TablesDestinationResult] =
        js.undefined
  ): MetadataTableConfigurationResult = {
    js.Dynamic
      .literal(
        S3TablesDestinationResult =
          S3TablesDestinationResult.asInstanceOf[js.Any]
      )
      .asInstanceOf[MetadataTableConfigurationResult]
  }
}

@js.native
trait S3TablesDestinationResult extends js.Object {
  val TableBucketArn: js.UndefOr[String] = js.native
  val TableName: js.UndefOr[String] = js.native
  val TableArn: js.UndefOr[String] = js.native
  val TableNamespace: js.UndefOr[String] = js.native
}

object S3TablesDestinationResult {
  def apply(
      TableBucketArn: js.UndefOr[String] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined,
      TableArn: js.UndefOr[String] = js.undefined,
      TableNamespace: js.UndefOr[String] = js.undefined
  ): S3TablesDestinationResult = {
    js.Dynamic
      .literal(
        TableBucketArn = TableBucketArn.asInstanceOf[js.Any],
        TableName = TableName.asInstanceOf[js.Any],
        TableArn = TableArn.asInstanceOf[js.Any],
        TableNamespace = TableNamespace.asInstanceOf[js.Any]
      )
      .asInstanceOf[S3TablesDestinationResult]
  }
}

@js.native
trait MetricsConfiguration extends js.Object {
  val Id: js.UndefOr[String] = js.native
  val Filter: js.UndefOr[MetricsFilter] = js.native
}

object MetricsConfiguration {
  def apply(
      Id: js.UndefOr[String] = js.undefined,
      Filter: js.UndefOr[MetricsFilter] = js.undefined
  ): MetricsConfiguration = {
    js.Dynamic
      .literal(
        Id = Id.asInstanceOf[js.Any],
        Filter = Filter.asInstanceOf[js.Any]
      )
      .asInstanceOf[MetricsConfiguration]
  }
}

@js.native
trait TopicConfiguration extends js.Object {
  val Id: js.UndefOr[String] = js.native
  val TopicArn: js.UndefOr[String] = js.native
  val Events: js.UndefOr[js.Array[Event]] = js.native
  val Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
}

object TopicConfiguration {
  def apply(
      Id: js.UndefOr[String] = js.undefined,
      TopicArn: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[js.Array[Event]] = js.undefined,
      Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
  ): TopicConfiguration = {
    js.Dynamic
      .literal(
        Id = Id.asInstanceOf[js.Any],
        TopicArn = TopicArn.asInstanceOf[js.Any],
        Events = Events.asInstanceOf[js.Any],
        Filter = Filter.asInstanceOf[js.Any]
      )
      .asInstanceOf[TopicConfiguration]
  }
}

@js.native
trait NotificationConfigurationFilter extends js.Object {
  val Key: js.UndefOr[S3KeyFilter] = js.native
}

object NotificationConfigurationFilter {
  def apply(
      Key: js.UndefOr[S3KeyFilter] = js.undefined
  ): NotificationConfigurationFilter = {
    js.Dynamic
      .literal(
        Key = Key.asInstanceOf[js.Any]
      )
      .asInstanceOf[NotificationConfigurationFilter]
  }
}

@js.native
trait S3KeyFilter extends js.Object {
  val FilterRules: js.UndefOr[js.Array[FilterRule]] = js.native
}

object S3KeyFilter {
  def apply(
      FilterRules: js.UndefOr[js.Array[FilterRule]] = js.undefined
  ): S3KeyFilter = {
    js.Dynamic
      .literal(
        FilterRules = FilterRules.asInstanceOf[js.Any]
      )
      .asInstanceOf[S3KeyFilter]
  }
}

@js.native
trait FilterRule extends js.Object {
  val Name: js.UndefOr[FilterRuleName] = js.native
  val Value: js.UndefOr[String] = js.native
}

object FilterRule {
  def apply(
      Name: js.UndefOr[FilterRuleName] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
  ): FilterRule = {
    js.Dynamic
      .literal(
        Name = Name.asInstanceOf[js.Any],
        Value = Value.asInstanceOf[js.Any]
      )
      .asInstanceOf[FilterRule]
  }
}

@js.native
trait QueueConfiguration extends js.Object {
  val Id: js.UndefOr[String] = js.native
  val QueueArn: js.UndefOr[String] = js.native
  val Events: js.UndefOr[js.Array[Event]] = js.native
  val Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
}

object QueueConfiguration {
  def apply(
      Id: js.UndefOr[String] = js.undefined,
      QueueArn: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[js.Array[Event]] = js.undefined,
      Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
  ): QueueConfiguration = {
    js.Dynamic
      .literal(
        Id = Id.asInstanceOf[js.Any],
        QueueArn = QueueArn.asInstanceOf[js.Any],
        Events = Events.asInstanceOf[js.Any],
        Filter = Filter.asInstanceOf[js.Any]
      )
      .asInstanceOf[QueueConfiguration]
  }
}

@js.native
trait LambdaFunctionConfiguration extends js.Object {
  val Id: js.UndefOr[String] = js.native
  val LambdaFunctionArn: js.UndefOr[String] = js.native
  val Events: js.UndefOr[js.Array[Event]] = js.native
  val Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
}

object LambdaFunctionConfiguration {
  def apply(
      Id: js.UndefOr[String] = js.undefined,
      LambdaFunctionArn: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[js.Array[Event]] = js.undefined,
      Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
  ): LambdaFunctionConfiguration = {
    js.Dynamic
      .literal(
        Id = Id.asInstanceOf[js.Any],
        LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any],
        Events = Events.asInstanceOf[js.Any],
        Filter = Filter.asInstanceOf[js.Any]
      )
      .asInstanceOf[LambdaFunctionConfiguration]
  }
}

@js.native
trait EventBridgeConfiguration extends js.Object {}

@js.native
trait OwnershipControls extends js.Object {
  val Rules: js.UndefOr[js.Array[OwnershipControlsRule]] = js.native
}

object OwnershipControls {
  def apply(
      Rules: js.UndefOr[js.Array[OwnershipControlsRule]] = js.undefined
  ): OwnershipControls = {
    js.Dynamic
      .literal(
        Rules = Rules.asInstanceOf[js.Any]
      )
      .asInstanceOf[OwnershipControls]
  }
}

@js.native
trait OwnershipControlsRule extends js.Object {
  val ObjectOwnership: js.UndefOr[ObjectOwnership] = js.native
}

object OwnershipControlsRule {
  def apply(
      ObjectOwnership: js.UndefOr[ObjectOwnership] = js.undefined
  ): OwnershipControlsRule = {
    js.Dynamic
      .literal(
        ObjectOwnership = ObjectOwnership.asInstanceOf[js.Any]
      )
      .asInstanceOf[OwnershipControlsRule]
  }
}

@js.native
trait PolicyStatus extends js.Object {
  val IsPublic: js.UndefOr[Boolean] = js.native
}

object PolicyStatus {
  def apply(
      IsPublic: js.UndefOr[Boolean] = js.undefined
  ): PolicyStatus = {
    js.Dynamic
      .literal(
        IsPublic = IsPublic.asInstanceOf[js.Any]
      )
      .asInstanceOf[PolicyStatus]
  }
}

@js.native
trait ReplicationConfiguration extends js.Object {
  val Role: js.UndefOr[String] = js.native
  val Rules: js.UndefOr[js.Array[ReplicationRule]] = js.native
}

object ReplicationConfiguration {
  def apply(
      Role: js.UndefOr[String] = js.undefined,
      Rules: js.UndefOr[js.Array[ReplicationRule]] = js.undefined
  ): ReplicationConfiguration = {
    js.Dynamic
      .literal(
        Role = Role.asInstanceOf[js.Any],
        Rules = Rules.asInstanceOf[js.Any]
      )
      .asInstanceOf[ReplicationConfiguration]
  }
}

@js.native
trait ReplicationRule extends js.Object {
  val ID: js.UndefOr[String] = js.native
  val Priority: js.UndefOr[Int] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val Filter: js.UndefOr[ReplicationRuleFilter] = js.native
  val Status: js.UndefOr[ReplicationRuleStatus] = js.native
  val SourceSelectionCriteria: js.UndefOr[SourceSelectionCriteria] = js.native
  val ExistingObjectReplication: js.UndefOr[ExistingObjectReplication] =
    js.native
  val Destination: js.UndefOr[Destination] = js.native
  val DeleteMarkerReplication: js.UndefOr[DeleteMarkerReplication] = js.native
}

object ReplicationRule {
  def apply(
      ID: js.UndefOr[String] = js.undefined,
      Priority: js.UndefOr[Int] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      Filter: js.UndefOr[ReplicationRuleFilter] = js.undefined,
      Status: js.UndefOr[ReplicationRuleStatus] = js.undefined,
      SourceSelectionCriteria: js.UndefOr[SourceSelectionCriteria] =
        js.undefined,
      ExistingObjectReplication: js.UndefOr[ExistingObjectReplication] =
        js.undefined,
      Destination: js.UndefOr[Destination] = js.undefined,
      DeleteMarkerReplication: js.UndefOr[DeleteMarkerReplication] =
        js.undefined
  ): ReplicationRule = {
    js.Dynamic
      .literal(
        ID = ID.asInstanceOf[js.Any],
        Priority = Priority.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any],
        Filter = Filter.asInstanceOf[js.Any],
        Status = Status.asInstanceOf[js.Any],
        SourceSelectionCriteria = SourceSelectionCriteria.asInstanceOf[js.Any],
        ExistingObjectReplication =
          ExistingObjectReplication.asInstanceOf[js.Any],
        Destination = Destination.asInstanceOf[js.Any],
        DeleteMarkerReplication = DeleteMarkerReplication.asInstanceOf[js.Any]
      )
      .asInstanceOf[ReplicationRule]
  }
}

@js.native
trait ReplicationRuleFilter extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
  val Tag: js.UndefOr[Tag] = js.native
  val And: js.UndefOr[ReplicationRuleAndOperator] = js.native
}

object ReplicationRuleFilter {
  def apply(
      Prefix: js.UndefOr[String] = js.undefined,
      Tag: js.UndefOr[Tag] = js.undefined,
      And: js.UndefOr[ReplicationRuleAndOperator] = js.undefined
  ): ReplicationRuleFilter = {
    js.Dynamic
      .literal(
        Prefix = Prefix.asInstanceOf[js.Any],
        Tag = Tag.asInstanceOf[js.Any],
        And = And.asInstanceOf[js.Any]
      )
      .asInstanceOf[ReplicationRuleFilter]
  }
}

@js.native
trait ReplicationRuleAndOperator extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
  val Tags: js.UndefOr[js.Array[Tag]] = js.native
}

object ReplicationRuleAndOperator {
  def apply(
      Prefix: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[js.Array[Tag]] = js.undefined
  ): ReplicationRuleAndOperator = {
    js.Dynamic
      .literal(
        Prefix = Prefix.asInstanceOf[js.Any],
        Tags = Tags.asInstanceOf[js.Any]
      )
      .asInstanceOf[ReplicationRuleAndOperator]
  }
}

@js.native
trait SourceSelectionCriteria extends js.Object {
  val SseKmsEncryptedObjects: js.UndefOr[SseKmsEncryptedObjects] = js.native
  val ReplicaModifications: js.UndefOr[ReplicaModifications] = js.native
}

object SourceSelectionCriteria {
  def apply(
      SseKmsEncryptedObjects: js.UndefOr[SseKmsEncryptedObjects] = js.undefined,
      ReplicaModifications: js.UndefOr[ReplicaModifications] = js.undefined
  ): SourceSelectionCriteria = {
    js.Dynamic
      .literal(
        SseKmsEncryptedObjects = SseKmsEncryptedObjects.asInstanceOf[js.Any],
        ReplicaModifications = ReplicaModifications.asInstanceOf[js.Any]
      )
      .asInstanceOf[SourceSelectionCriteria]
  }
}

@js.native
trait SseKmsEncryptedObjects extends js.Object {
  val Status: js.UndefOr[SseKmsEncryptedObjectsStatus] = js.native
}

object SseKmsEncryptedObjects {
  def apply(
      Status: js.UndefOr[SseKmsEncryptedObjectsStatus] = js.undefined
  ): SseKmsEncryptedObjects = {
    js.Dynamic
      .literal(
        Status = Status.asInstanceOf[js.Any]
      )
      .asInstanceOf[SseKmsEncryptedObjects]
  }
}

@js.native
trait ReplicaModifications extends js.Object {
  val Status: js.UndefOr[ReplicaModificationsStatus] = js.native
}

object ReplicaModifications {
  def apply(
      Status: js.UndefOr[ReplicaModificationsStatus] = js.undefined
  ): ReplicaModifications = {
    js.Dynamic
      .literal(
        Status = Status.asInstanceOf[js.Any]
      )
      .asInstanceOf[ReplicaModifications]
  }
}

@js.native
trait ExistingObjectReplication extends js.Object {
  val Status: js.UndefOr[ExistingObjectReplicationStatus] = js.native
}

object ExistingObjectReplication {
  def apply(
      Status: js.UndefOr[ExistingObjectReplicationStatus] = js.undefined
  ): ExistingObjectReplication = {
    js.Dynamic
      .literal(
        Status = Status.asInstanceOf[js.Any]
      )
      .asInstanceOf[ExistingObjectReplication]
  }
}

@js.native
trait Destination extends js.Object {
  val Bucket: js.UndefOr[String] = js.native
  val Account: js.UndefOr[String] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val AccessControlTranslation: js.UndefOr[AccessControlTranslation] = js.native
  val EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  val ReplicationTime: js.UndefOr[ReplicationTime] = js.native
  val Metrics: js.UndefOr[Metrics] = js.native
}

object Destination {
  def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Account: js.UndefOr[String] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      AccessControlTranslation: js.UndefOr[AccessControlTranslation] =
        js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] =
        js.undefined,
      ReplicationTime: js.UndefOr[ReplicationTime] = js.undefined,
      Metrics: js.UndefOr[Metrics] = js.undefined
  ): Destination = {
    js.Dynamic
      .literal(
        Bucket = Bucket.asInstanceOf[js.Any],
        Account = Account.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any],
        AccessControlTranslation =
          AccessControlTranslation.asInstanceOf[js.Any],
        EncryptionConfiguration = EncryptionConfiguration.asInstanceOf[js.Any],
        ReplicationTime = ReplicationTime.asInstanceOf[js.Any],
        Metrics = Metrics.asInstanceOf[js.Any]
      )
      .asInstanceOf[Destination]
  }
}

@js.native
trait AccessControlTranslation extends js.Object {
  val Owner: js.UndefOr[OwnerOverride] = js.native
}

object AccessControlTranslation {
  def apply(
      Owner: js.UndefOr[OwnerOverride] = js.undefined
  ): AccessControlTranslation = {
    js.Dynamic
      .literal(
        Owner = Owner.asInstanceOf[js.Any]
      )
      .asInstanceOf[AccessControlTranslation]
  }
}

@js.native
trait EncryptionConfiguration extends js.Object {
  val ReplicaKmsKeyID: js.UndefOr[String] = js.native
}

object EncryptionConfiguration {
  def apply(
      ReplicaKmsKeyID: js.UndefOr[String] = js.undefined
  ): EncryptionConfiguration = {
    js.Dynamic
      .literal(
        ReplicaKmsKeyID = ReplicaKmsKeyID.asInstanceOf[js.Any]
      )
      .asInstanceOf[EncryptionConfiguration]
  }
}

@js.native
trait ReplicationTime extends js.Object {
  val Status: js.UndefOr[ReplicationTimeStatus] = js.native
  val Time: js.UndefOr[ReplicationTimeValue] = js.native
}

object ReplicationTime {
  def apply(
      Status: js.UndefOr[ReplicationTimeStatus] = js.undefined,
      Time: js.UndefOr[ReplicationTimeValue] = js.undefined
  ): ReplicationTime = {
    js.Dynamic
      .literal(
        Status = Status.asInstanceOf[js.Any],
        Time = Time.asInstanceOf[js.Any]
      )
      .asInstanceOf[ReplicationTime]
  }
}

@js.native
trait ReplicationTimeValue extends js.Object {
  val Minutes: js.UndefOr[Int] = js.native
}

object ReplicationTimeValue {
  def apply(
      Minutes: js.UndefOr[Int] = js.undefined
  ): ReplicationTimeValue = {
    js.Dynamic
      .literal(
        Minutes = Minutes.asInstanceOf[js.Any]
      )
      .asInstanceOf[ReplicationTimeValue]
  }
}

@js.native
trait Metrics extends js.Object {
  val Status: js.UndefOr[MetricsStatus] = js.native
  val EventThreshold: js.UndefOr[ReplicationTimeValue] = js.native
}

object Metrics {
  def apply(
      Status: js.UndefOr[MetricsStatus] = js.undefined,
      EventThreshold: js.UndefOr[ReplicationTimeValue] = js.undefined
  ): Metrics = {
    js.Dynamic
      .literal(
        Status = Status.asInstanceOf[js.Any],
        EventThreshold = EventThreshold.asInstanceOf[js.Any]
      )
      .asInstanceOf[Metrics]
  }
}

@js.native
trait DeleteMarkerReplication extends js.Object {
  val Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.native
}

object DeleteMarkerReplication {
  def apply(
      Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.undefined
  ): DeleteMarkerReplication = {
    js.Dynamic
      .literal(
        Status = Status.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteMarkerReplication]
  }
}

@js.native
trait RedirectAllRequestsTo extends js.Object {
  val HostName: js.UndefOr[String] = js.native
  val Protocol: js.UndefOr[Protocol] = js.native
}

object RedirectAllRequestsTo {
  def apply(
      HostName: js.UndefOr[String] = js.undefined,
      Protocol: js.UndefOr[Protocol] = js.undefined
  ): RedirectAllRequestsTo = {
    js.Dynamic
      .literal(
        HostName = HostName.asInstanceOf[js.Any],
        Protocol = Protocol.asInstanceOf[js.Any]
      )
      .asInstanceOf[RedirectAllRequestsTo]
  }
}

@js.native
trait IndexDocument extends js.Object {
  val Suffix: js.UndefOr[String] = js.native
}

object IndexDocument {
  def apply(
      Suffix: js.UndefOr[String] = js.undefined
  ): IndexDocument = {
    js.Dynamic
      .literal(
        Suffix = Suffix.asInstanceOf[js.Any]
      )
      .asInstanceOf[IndexDocument]
  }
}

@js.native
trait ErrorDocument extends js.Object {
  val Key: js.UndefOr[String] = js.native
}

object ErrorDocument {
  def apply(
      Key: js.UndefOr[String] = js.undefined
  ): ErrorDocument = {
    js.Dynamic
      .literal(
        Key = Key.asInstanceOf[js.Any]
      )
      .asInstanceOf[ErrorDocument]
  }
}

@js.native
trait RoutingRule extends js.Object {
  val Condition: js.UndefOr[Condition] = js.native
  val Redirect: js.UndefOr[Redirect] = js.native
}

object RoutingRule {
  def apply(
      Condition: js.UndefOr[Condition] = js.undefined,
      Redirect: js.UndefOr[Redirect] = js.undefined
  ): RoutingRule = {
    js.Dynamic
      .literal(
        Condition = Condition.asInstanceOf[js.Any],
        Redirect = Redirect.asInstanceOf[js.Any]
      )
      .asInstanceOf[RoutingRule]
  }
}

@js.native
trait Condition extends js.Object {
  val HttpErrorCodeReturnedEquals: js.UndefOr[String] = js.native
  val KeyPrefixEquals: js.UndefOr[String] = js.native
}

object Condition {
  def apply(
      HttpErrorCodeReturnedEquals: js.UndefOr[String] = js.undefined,
      KeyPrefixEquals: js.UndefOr[String] = js.undefined
  ): Condition = {
    js.Dynamic
      .literal(
        HttpErrorCodeReturnedEquals =
          HttpErrorCodeReturnedEquals.asInstanceOf[js.Any],
        KeyPrefixEquals = KeyPrefixEquals.asInstanceOf[js.Any]
      )
      .asInstanceOf[Condition]
  }
}

@js.native
trait Redirect extends js.Object {
  val HostName: js.UndefOr[String] = js.native
  val HttpRedirectCode: js.UndefOr[String] = js.native
  val Protocol: js.UndefOr[Protocol] = js.native
  val ReplaceKeyPrefixWith: js.UndefOr[String] = js.native
  val ReplaceKeyWith: js.UndefOr[String] = js.native
}

object Redirect {
  def apply(
      HostName: js.UndefOr[String] = js.undefined,
      HttpRedirectCode: js.UndefOr[String] = js.undefined,
      Protocol: js.UndefOr[Protocol] = js.undefined,
      ReplaceKeyPrefixWith: js.UndefOr[String] = js.undefined,
      ReplaceKeyWith: js.UndefOr[String] = js.undefined
  ): Redirect = {
    js.Dynamic
      .literal(
        HostName = HostName.asInstanceOf[js.Any],
        HttpRedirectCode = HttpRedirectCode.asInstanceOf[js.Any],
        Protocol = Protocol.asInstanceOf[js.Any],
        ReplaceKeyPrefixWith = ReplaceKeyPrefixWith.asInstanceOf[js.Any],
        ReplaceKeyWith = ReplaceKeyWith.asInstanceOf[js.Any]
      )
      .asInstanceOf[Redirect]
  }
}

@js.native
trait Checksum extends js.Object {
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
}

object Checksum {
  def apply(
      ChecksumCRC32: js.UndefOr[String] = js.undefined,
      ChecksumCRC32C: js.UndefOr[String] = js.undefined,
      ChecksumCRC64NVME: js.UndefOr[String] = js.undefined,
      ChecksumSHA1: js.UndefOr[String] = js.undefined,
      ChecksumSHA256: js.UndefOr[String] = js.undefined,
      ChecksumType: js.UndefOr[ChecksumType] = js.undefined
  ): Checksum = {
    js.Dynamic
      .literal(
        ChecksumCRC32 = ChecksumCRC32.asInstanceOf[js.Any],
        ChecksumCRC32C = ChecksumCRC32C.asInstanceOf[js.Any],
        ChecksumCRC64NVME = ChecksumCRC64NVME.asInstanceOf[js.Any],
        ChecksumSHA1 = ChecksumSHA1.asInstanceOf[js.Any],
        ChecksumSHA256 = ChecksumSHA256.asInstanceOf[js.Any],
        ChecksumType = ChecksumType.asInstanceOf[js.Any]
      )
      .asInstanceOf[Checksum]
  }
}

@js.native
trait GetObjectAttributesParts extends js.Object {
  val TotalPartsCount: js.UndefOr[Int] = js.native
  val PartNumberMarker: js.UndefOr[String] = js.native
  val NextPartNumberMarker: js.UndefOr[String] = js.native
  val MaxParts: js.UndefOr[Int] = js.native
  val IsTruncated: js.UndefOr[Boolean] = js.native
  val Parts: js.UndefOr[js.Array[ObjectPart]] = js.native
}

object GetObjectAttributesParts {
  def apply(
      TotalPartsCount: js.UndefOr[Int] = js.undefined,
      PartNumberMarker: js.UndefOr[String] = js.undefined,
      NextPartNumberMarker: js.UndefOr[String] = js.undefined,
      MaxParts: js.UndefOr[Int] = js.undefined,
      IsTruncated: js.UndefOr[Boolean] = js.undefined,
      Parts: js.UndefOr[js.Array[ObjectPart]] = js.undefined
  ): GetObjectAttributesParts = {
    js.Dynamic
      .literal(
        TotalPartsCount = TotalPartsCount.asInstanceOf[js.Any],
        PartNumberMarker = PartNumberMarker.asInstanceOf[js.Any],
        NextPartNumberMarker = NextPartNumberMarker.asInstanceOf[js.Any],
        MaxParts = MaxParts.asInstanceOf[js.Any],
        IsTruncated = IsTruncated.asInstanceOf[js.Any],
        Parts = Parts.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetObjectAttributesParts]
  }
}

@js.native
trait ObjectPart extends js.Object {
  val PartNumber: js.UndefOr[Int] = js.native
  val Size: js.UndefOr[Double] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
}

object ObjectPart {
  def apply(
      PartNumber: js.UndefOr[Int] = js.undefined,
      Size: js.UndefOr[Double] = js.undefined,
      ChecksumCRC32: js.UndefOr[String] = js.undefined,
      ChecksumCRC32C: js.UndefOr[String] = js.undefined,
      ChecksumCRC64NVME: js.UndefOr[String] = js.undefined,
      ChecksumSHA1: js.UndefOr[String] = js.undefined,
      ChecksumSHA256: js.UndefOr[String] = js.undefined
  ): ObjectPart = {
    js.Dynamic
      .literal(
        PartNumber = PartNumber.asInstanceOf[js.Any],
        Size = Size.asInstanceOf[js.Any],
        ChecksumCRC32 = ChecksumCRC32.asInstanceOf[js.Any],
        ChecksumCRC32C = ChecksumCRC32C.asInstanceOf[js.Any],
        ChecksumCRC64NVME = ChecksumCRC64NVME.asInstanceOf[js.Any],
        ChecksumSHA1 = ChecksumSHA1.asInstanceOf[js.Any],
        ChecksumSHA256 = ChecksumSHA256.asInstanceOf[js.Any]
      )
      .asInstanceOf[ObjectPart]
  }
}

@js.native
trait ObjectLockLegalHold extends js.Object {
  val Status: js.UndefOr[ObjectLockLegalHoldStatus] = js.native
}

object ObjectLockLegalHold {
  def apply(
      Status: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
  ): ObjectLockLegalHold = {
    js.Dynamic
      .literal(
        Status = Status.asInstanceOf[js.Any]
      )
      .asInstanceOf[ObjectLockLegalHold]
  }
}

@js.native
trait ObjectLockConfiguration extends js.Object {
  val ObjectLockEnabled: js.UndefOr[ObjectLockEnabled] = js.native
  val Rule: js.UndefOr[ObjectLockRule] = js.native
}

object ObjectLockConfiguration {
  def apply(
      ObjectLockEnabled: js.UndefOr[ObjectLockEnabled] = js.undefined,
      Rule: js.UndefOr[ObjectLockRule] = js.undefined
  ): ObjectLockConfiguration = {
    js.Dynamic
      .literal(
        ObjectLockEnabled = ObjectLockEnabled.asInstanceOf[js.Any],
        Rule = Rule.asInstanceOf[js.Any]
      )
      .asInstanceOf[ObjectLockConfiguration]
  }
}

@js.native
trait ObjectLockRule extends js.Object {
  val DefaultRetention: js.UndefOr[DefaultRetention] = js.native
}

object ObjectLockRule {
  def apply(
      DefaultRetention: js.UndefOr[DefaultRetention] = js.undefined
  ): ObjectLockRule = {
    js.Dynamic
      .literal(
        DefaultRetention = DefaultRetention.asInstanceOf[js.Any]
      )
      .asInstanceOf[ObjectLockRule]
  }
}

@js.native
trait DefaultRetention extends js.Object {
  val Mode: js.UndefOr[ObjectLockRetentionMode] = js.native
  val Days: js.UndefOr[Int] = js.native
  val Years: js.UndefOr[Int] = js.native
}

object DefaultRetention {
  def apply(
      Mode: js.UndefOr[ObjectLockRetentionMode] = js.undefined,
      Days: js.UndefOr[Int] = js.undefined,
      Years: js.UndefOr[Int] = js.undefined
  ): DefaultRetention = {
    js.Dynamic
      .literal(
        Mode = Mode.asInstanceOf[js.Any],
        Days = Days.asInstanceOf[js.Any],
        Years = Years.asInstanceOf[js.Any]
      )
      .asInstanceOf[DefaultRetention]
  }
}

@js.native
trait ObjectLockRetention extends js.Object {
  val Mode: js.UndefOr[ObjectLockRetentionMode] = js.native
  val RetainUntilDate: js.UndefOr[js.Date] = js.native
}

object ObjectLockRetention {
  def apply(
      Mode: js.UndefOr[ObjectLockRetentionMode] = js.undefined,
      RetainUntilDate: js.UndefOr[js.Date] = js.undefined
  ): ObjectLockRetention = {
    js.Dynamic
      .literal(
        Mode = Mode.asInstanceOf[js.Any],
        RetainUntilDate = RetainUntilDate.asInstanceOf[js.Any]
      )
      .asInstanceOf[ObjectLockRetention]
  }
}

@js.native
trait PublicAccessBlockConfiguration extends js.Object {
  val BlockPublicAcls: js.UndefOr[Boolean] = js.native
  val IgnorePublicAcls: js.UndefOr[Boolean] = js.native
  val BlockPublicPolicy: js.UndefOr[Boolean] = js.native
  val RestrictPublicBuckets: js.UndefOr[Boolean] = js.native
}

object PublicAccessBlockConfiguration {
  def apply(
      BlockPublicAcls: js.UndefOr[Boolean] = js.undefined,
      IgnorePublicAcls: js.UndefOr[Boolean] = js.undefined,
      BlockPublicPolicy: js.UndefOr[Boolean] = js.undefined,
      RestrictPublicBuckets: js.UndefOr[Boolean] = js.undefined
  ): PublicAccessBlockConfiguration = {
    js.Dynamic
      .literal(
        BlockPublicAcls = BlockPublicAcls.asInstanceOf[js.Any],
        IgnorePublicAcls = IgnorePublicAcls.asInstanceOf[js.Any],
        BlockPublicPolicy = BlockPublicPolicy.asInstanceOf[js.Any],
        RestrictPublicBuckets = RestrictPublicBuckets.asInstanceOf[js.Any]
      )
      .asInstanceOf[PublicAccessBlockConfiguration]
  }
}

@js.native
trait Bucket extends js.Object {
  val Name: js.UndefOr[String] = js.native
  val CreationDate: js.UndefOr[js.Date] = js.native
  val BucketRegion: js.UndefOr[String] = js.native
  val BucketArn: js.UndefOr[String] = js.native
}

object Bucket {
  def apply(
      Name: js.UndefOr[String] = js.undefined,
      CreationDate: js.UndefOr[js.Date] = js.undefined,
      BucketRegion: js.UndefOr[String] = js.undefined,
      BucketArn: js.UndefOr[String] = js.undefined
  ): Bucket = {
    js.Dynamic
      .literal(
        Name = Name.asInstanceOf[js.Any],
        CreationDate = CreationDate.asInstanceOf[js.Any],
        BucketRegion = BucketRegion.asInstanceOf[js.Any],
        BucketArn = BucketArn.asInstanceOf[js.Any]
      )
      .asInstanceOf[Bucket]
  }
}

@js.native
trait MultipartUpload extends js.Object {
  val UploadId: js.UndefOr[String] = js.native
  val Key: js.UndefOr[String] = js.native
  val Initiated: js.UndefOr[js.Date] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
  val Owner: js.UndefOr[Owner] = js.native
  val Initiator: js.UndefOr[Initiator] = js.native
  val ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
}

object MultipartUpload {
  def apply(
      UploadId: js.UndefOr[String] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      Initiated: js.UndefOr[js.Date] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      Initiator: js.UndefOr[Initiator] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
      ChecksumType: js.UndefOr[ChecksumType] = js.undefined
  ): MultipartUpload = {
    js.Dynamic
      .literal(
        UploadId = UploadId.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        Initiated = Initiated.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any],
        Owner = Owner.asInstanceOf[js.Any],
        Initiator = Initiator.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ChecksumType = ChecksumType.asInstanceOf[js.Any]
      )
      .asInstanceOf[MultipartUpload]
  }
}

@js.native
trait Initiator extends js.Object {
  val ID: js.UndefOr[String] = js.native
  val DisplayName: js.UndefOr[String] = js.native
}

object Initiator {
  def apply(
      ID: js.UndefOr[String] = js.undefined,
      DisplayName: js.UndefOr[String] = js.undefined
  ): Initiator = {
    js.Dynamic
      .literal(
        ID = ID.asInstanceOf[js.Any],
        DisplayName = DisplayName.asInstanceOf[js.Any]
      )
      .asInstanceOf[Initiator]
  }
}

@js.native
trait CommonPrefix extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
}

object CommonPrefix {
  def apply(
      Prefix: js.UndefOr[String] = js.undefined
  ): CommonPrefix = {
    js.Dynamic
      .literal(
        Prefix = Prefix.asInstanceOf[js.Any]
      )
      .asInstanceOf[CommonPrefix]
  }
}

@js.native
trait ObjectVersion extends js.Object {
  val ETag: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[js.Array[ChecksumAlgorithm]] = js.native
  val ChecksumType: js.UndefOr[ChecksumType] = js.native
  val Size: js.UndefOr[Double] = js.native
  val StorageClass: js.UndefOr[ObjectVersionStorageClass] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val IsLatest: js.UndefOr[Boolean] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val Owner: js.UndefOr[Owner] = js.native
  val RestoreStatus: js.UndefOr[RestoreStatus] = js.native
}

object ObjectVersion {
  def apply(
      ETag: js.UndefOr[String] = js.undefined,
      ChecksumAlgorithm: js.UndefOr[js.Array[ChecksumAlgorithm]] = js.undefined,
      ChecksumType: js.UndefOr[ChecksumType] = js.undefined,
      Size: js.UndefOr[Double] = js.undefined,
      StorageClass: js.UndefOr[ObjectVersionStorageClass] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      IsLatest: js.UndefOr[Boolean] = js.undefined,
      LastModified: js.UndefOr[js.Date] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      RestoreStatus: js.UndefOr[RestoreStatus] = js.undefined
  ): ObjectVersion = {
    js.Dynamic
      .literal(
        ETag = ETag.asInstanceOf[js.Any],
        ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any],
        ChecksumType = ChecksumType.asInstanceOf[js.Any],
        Size = Size.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        IsLatest = IsLatest.asInstanceOf[js.Any],
        LastModified = LastModified.asInstanceOf[js.Any],
        Owner = Owner.asInstanceOf[js.Any],
        RestoreStatus = RestoreStatus.asInstanceOf[js.Any]
      )
      .asInstanceOf[ObjectVersion]
  }
}

@js.native
trait RestoreStatus extends js.Object {
  val IsRestoreInProgress: js.UndefOr[Boolean] = js.native
  val RestoreExpiryDate: js.UndefOr[js.Date] = js.native
}

object RestoreStatus {
  def apply(
      IsRestoreInProgress: js.UndefOr[Boolean] = js.undefined,
      RestoreExpiryDate: js.UndefOr[js.Date] = js.undefined
  ): RestoreStatus = {
    js.Dynamic
      .literal(
        IsRestoreInProgress = IsRestoreInProgress.asInstanceOf[js.Any],
        RestoreExpiryDate = RestoreExpiryDate.asInstanceOf[js.Any]
      )
      .asInstanceOf[RestoreStatus]
  }
}

@js.native
trait DeleteMarkerEntry extends js.Object {
  val Owner: js.UndefOr[Owner] = js.native
  val Key: js.UndefOr[String] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val IsLatest: js.UndefOr[Boolean] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
}

object DeleteMarkerEntry {
  def apply(
      Owner: js.UndefOr[Owner] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      VersionId: js.UndefOr[String] = js.undefined,
      IsLatest: js.UndefOr[Boolean] = js.undefined,
      LastModified: js.UndefOr[js.Date] = js.undefined
  ): DeleteMarkerEntry = {
    js.Dynamic
      .literal(
        Owner = Owner.asInstanceOf[js.Any],
        Key = Key.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        IsLatest = IsLatest.asInstanceOf[js.Any],
        LastModified = LastModified.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteMarkerEntry]
  }
}

@js.native
trait Part extends js.Object {
  val PartNumber: js.UndefOr[Int] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val ETag: js.UndefOr[String] = js.native
  val Size: js.UndefOr[Double] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
}

object Part {
  def apply(
      PartNumber: js.UndefOr[Int] = js.undefined,
      LastModified: js.UndefOr[js.Date] = js.undefined,
      ETag: js.UndefOr[String] = js.undefined,
      Size: js.UndefOr[Double] = js.undefined,
      ChecksumCRC32: js.UndefOr[String] = js.undefined,
      ChecksumCRC32C: js.UndefOr[String] = js.undefined,
      ChecksumCRC64NVME: js.UndefOr[String] = js.undefined,
      ChecksumSHA1: js.UndefOr[String] = js.undefined,
      ChecksumSHA256: js.UndefOr[String] = js.undefined
  ): Part = {
    js.Dynamic
      .literal(
        PartNumber = PartNumber.asInstanceOf[js.Any],
        LastModified = LastModified.asInstanceOf[js.Any],
        ETag = ETag.asInstanceOf[js.Any],
        Size = Size.asInstanceOf[js.Any],
        ChecksumCRC32 = ChecksumCRC32.asInstanceOf[js.Any],
        ChecksumCRC32C = ChecksumCRC32C.asInstanceOf[js.Any],
        ChecksumCRC64NVME = ChecksumCRC64NVME.asInstanceOf[js.Any],
        ChecksumSHA1 = ChecksumSHA1.asInstanceOf[js.Any],
        ChecksumSHA256 = ChecksumSHA256.asInstanceOf[js.Any]
      )
      .asInstanceOf[Part]
  }
}

@js.native
trait AccelerateConfiguration extends js.Object {
  val Status: js.UndefOr[BucketAccelerateStatus] = js.native
}

object AccelerateConfiguration {
  def apply(
      Status: js.UndefOr[BucketAccelerateStatus] = js.undefined
  ): AccelerateConfiguration = {
    js.Dynamic
      .literal(
        Status = Status.asInstanceOf[js.Any]
      )
      .asInstanceOf[AccelerateConfiguration]
  }
}

@js.native
trait AccessControlPolicy extends js.Object {
  val Grants: js.UndefOr[js.Array[Grant]] = js.native
  val Owner: js.UndefOr[Owner] = js.native
}

object AccessControlPolicy {
  def apply(
      Grants: js.UndefOr[js.Array[Grant]] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined
  ): AccessControlPolicy = {
    js.Dynamic
      .literal(
        Grants = Grants.asInstanceOf[js.Any],
        Owner = Owner.asInstanceOf[js.Any]
      )
      .asInstanceOf[AccessControlPolicy]
  }
}

@js.native
trait CORSConfiguration extends js.Object {
  val CORSRules: js.UndefOr[js.Array[CORSRule]] = js.native
}

object CORSConfiguration {
  def apply(
      CORSRules: js.UndefOr[js.Array[CORSRule]] = js.undefined
  ): CORSConfiguration = {
    js.Dynamic
      .literal(
        CORSRules = CORSRules.asInstanceOf[js.Any]
      )
      .asInstanceOf[CORSConfiguration]
  }
}

@js.native
trait BucketLifecycleConfiguration extends js.Object {
  val Rules: js.UndefOr[js.Array[LifecycleRule]] = js.native
}

object BucketLifecycleConfiguration {
  def apply(
      Rules: js.UndefOr[js.Array[LifecycleRule]] = js.undefined
  ): BucketLifecycleConfiguration = {
    js.Dynamic
      .literal(
        Rules = Rules.asInstanceOf[js.Any]
      )
      .asInstanceOf[BucketLifecycleConfiguration]
  }
}

@js.native
trait BucketLoggingStatus extends js.Object {
  val LoggingEnabled: js.UndefOr[LoggingEnabled] = js.native
}

object BucketLoggingStatus {
  def apply(
      LoggingEnabled: js.UndefOr[LoggingEnabled] = js.undefined
  ): BucketLoggingStatus = {
    js.Dynamic
      .literal(
        LoggingEnabled = LoggingEnabled.asInstanceOf[js.Any]
      )
      .asInstanceOf[BucketLoggingStatus]
  }
}

@js.native
trait RequestPaymentConfiguration extends js.Object {
  val Payer: js.UndefOr[Payer] = js.native
}

object RequestPaymentConfiguration {
  def apply(
      Payer: js.UndefOr[Payer] = js.undefined
  ): RequestPaymentConfiguration = {
    js.Dynamic
      .literal(
        Payer = Payer.asInstanceOf[js.Any]
      )
      .asInstanceOf[RequestPaymentConfiguration]
  }
}

@js.native
trait Tagging extends js.Object {
  val TagSet: js.UndefOr[js.Array[Tag]] = js.native
}

object Tagging {
  def apply(
      TagSet: js.UndefOr[js.Array[Tag]] = js.undefined
  ): Tagging = {
    js.Dynamic
      .literal(
        TagSet = TagSet.asInstanceOf[js.Any]
      )
      .asInstanceOf[Tagging]
  }
}

@js.native
trait VersioningConfiguration extends js.Object {
  val MFADelete: js.UndefOr[MFADelete] = js.native
  val Status: js.UndefOr[BucketVersioningStatus] = js.native
}

object VersioningConfiguration {
  def apply(
      MFADelete: js.UndefOr[MFADelete] = js.undefined,
      Status: js.UndefOr[BucketVersioningStatus] = js.undefined
  ): VersioningConfiguration = {
    js.Dynamic
      .literal(
        MFADelete = MFADelete.asInstanceOf[js.Any],
        Status = Status.asInstanceOf[js.Any]
      )
      .asInstanceOf[VersioningConfiguration]
  }
}

@js.native
trait WebsiteConfiguration extends js.Object {
  val ErrorDocument: js.UndefOr[ErrorDocument] = js.native
  val IndexDocument: js.UndefOr[IndexDocument] = js.native
  val RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.native
  val RoutingRules: js.UndefOr[js.Array[RoutingRule]] = js.native
}

object WebsiteConfiguration {
  def apply(
      ErrorDocument: js.UndefOr[ErrorDocument] = js.undefined,
      IndexDocument: js.UndefOr[IndexDocument] = js.undefined,
      RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.undefined,
      RoutingRules: js.UndefOr[js.Array[RoutingRule]] = js.undefined
  ): WebsiteConfiguration = {
    js.Dynamic
      .literal(
        ErrorDocument = ErrorDocument.asInstanceOf[js.Any],
        IndexDocument = IndexDocument.asInstanceOf[js.Any],
        RedirectAllRequestsTo = RedirectAllRequestsTo.asInstanceOf[js.Any],
        RoutingRules = RoutingRules.asInstanceOf[js.Any]
      )
      .asInstanceOf[WebsiteConfiguration]
  }
}

@js.native
trait RestoreRequest extends js.Object {
  val Days: js.UndefOr[Int] = js.native
  val GlacierJobParameters: js.UndefOr[GlacierJobParameters] = js.native
  val Type: js.UndefOr[RestoreRequestType] = js.native
  val Tier: js.UndefOr[Tier] = js.native
  val Description: js.UndefOr[String] = js.native
  val SelectParameters: js.UndefOr[SelectParameters] = js.native
  val OutputLocation: js.UndefOr[OutputLocation] = js.native
}

object RestoreRequest {
  def apply(
      Days: js.UndefOr[Int] = js.undefined,
      GlacierJobParameters: js.UndefOr[GlacierJobParameters] = js.undefined,
      Type: js.UndefOr[RestoreRequestType] = js.undefined,
      Tier: js.UndefOr[Tier] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      SelectParameters: js.UndefOr[SelectParameters] = js.undefined,
      OutputLocation: js.UndefOr[OutputLocation] = js.undefined
  ): RestoreRequest = {
    js.Dynamic
      .literal(
        Days = Days.asInstanceOf[js.Any],
        GlacierJobParameters = GlacierJobParameters.asInstanceOf[js.Any],
        Type = Type.asInstanceOf[js.Any],
        Tier = Tier.asInstanceOf[js.Any],
        Description = Description.asInstanceOf[js.Any],
        SelectParameters = SelectParameters.asInstanceOf[js.Any],
        OutputLocation = OutputLocation.asInstanceOf[js.Any]
      )
      .asInstanceOf[RestoreRequest]
  }
}

@js.native
trait GlacierJobParameters extends js.Object {
  val Tier: js.UndefOr[Tier] = js.native
}

object GlacierJobParameters {
  def apply(
      Tier: js.UndefOr[Tier] = js.undefined
  ): GlacierJobParameters = {
    js.Dynamic
      .literal(
        Tier = Tier.asInstanceOf[js.Any]
      )
      .asInstanceOf[GlacierJobParameters]
  }
}

@js.native
trait SelectParameters extends js.Object {
  val InputSerialization: js.UndefOr[InputSerialization] = js.native
  val ExpressionType: js.UndefOr[ExpressionType] = js.native
  val Expression: js.UndefOr[String] = js.native
  val OutputSerialization: js.UndefOr[OutputSerialization] = js.native
}

object SelectParameters {
  def apply(
      InputSerialization: js.UndefOr[InputSerialization] = js.undefined,
      ExpressionType: js.UndefOr[ExpressionType] = js.undefined,
      Expression: js.UndefOr[String] = js.undefined,
      OutputSerialization: js.UndefOr[OutputSerialization] = js.undefined
  ): SelectParameters = {
    js.Dynamic
      .literal(
        InputSerialization = InputSerialization.asInstanceOf[js.Any],
        ExpressionType = ExpressionType.asInstanceOf[js.Any],
        Expression = Expression.asInstanceOf[js.Any],
        OutputSerialization = OutputSerialization.asInstanceOf[js.Any]
      )
      .asInstanceOf[SelectParameters]
  }
}

@js.native
trait InputSerialization extends js.Object {
  val CSV: js.UndefOr[CSVInput] = js.native
  val CompressionType: js.UndefOr[CompressionType] = js.native
  val JSON: js.UndefOr[JSONInput] = js.native
  val Parquet: js.UndefOr[ParquetInput] = js.native
}

object InputSerialization {
  def apply(
      CSV: js.UndefOr[CSVInput] = js.undefined,
      CompressionType: js.UndefOr[CompressionType] = js.undefined,
      JSON: js.UndefOr[JSONInput] = js.undefined,
      Parquet: js.UndefOr[ParquetInput] = js.undefined
  ): InputSerialization = {
    js.Dynamic
      .literal(
        CSV = CSV.asInstanceOf[js.Any],
        CompressionType = CompressionType.asInstanceOf[js.Any],
        JSON = JSON.asInstanceOf[js.Any],
        Parquet = Parquet.asInstanceOf[js.Any]
      )
      .asInstanceOf[InputSerialization]
  }
}

@js.native
trait CSVInput extends js.Object {
  val FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.native
  val Comments: js.UndefOr[String] = js.native
  val QuoteEscapeCharacter: js.UndefOr[String] = js.native
  val RecordDelimiter: js.UndefOr[String] = js.native
  val FieldDelimiter: js.UndefOr[String] = js.native
  val QuoteCharacter: js.UndefOr[String] = js.native
  val AllowQuotedRecordDelimiter: js.UndefOr[Boolean] = js.native
}

object CSVInput {
  def apply(
      FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.undefined,
      Comments: js.UndefOr[String] = js.undefined,
      QuoteEscapeCharacter: js.UndefOr[String] = js.undefined,
      RecordDelimiter: js.UndefOr[String] = js.undefined,
      FieldDelimiter: js.UndefOr[String] = js.undefined,
      QuoteCharacter: js.UndefOr[String] = js.undefined,
      AllowQuotedRecordDelimiter: js.UndefOr[Boolean] = js.undefined
  ): CSVInput = {
    js.Dynamic
      .literal(
        FileHeaderInfo = FileHeaderInfo.asInstanceOf[js.Any],
        Comments = Comments.asInstanceOf[js.Any],
        QuoteEscapeCharacter = QuoteEscapeCharacter.asInstanceOf[js.Any],
        RecordDelimiter = RecordDelimiter.asInstanceOf[js.Any],
        FieldDelimiter = FieldDelimiter.asInstanceOf[js.Any],
        QuoteCharacter = QuoteCharacter.asInstanceOf[js.Any],
        AllowQuotedRecordDelimiter =
          AllowQuotedRecordDelimiter.asInstanceOf[js.Any]
      )
      .asInstanceOf[CSVInput]
  }
}

@js.native
trait JSONInput extends js.Object {
  val Type: js.UndefOr[JSONType] = js.native
}

object JSONInput {
  def apply(
      Type: js.UndefOr[JSONType] = js.undefined
  ): JSONInput = {
    js.Dynamic
      .literal(
        Type = Type.asInstanceOf[js.Any]
      )
      .asInstanceOf[JSONInput]
  }
}

@js.native
trait ParquetInput extends js.Object {}

@js.native
trait OutputSerialization extends js.Object {
  val CSV: js.UndefOr[CSVOutput] = js.native
  val JSON: js.UndefOr[JSONOutput] = js.native
}

object OutputSerialization {
  def apply(
      CSV: js.UndefOr[CSVOutput] = js.undefined,
      JSON: js.UndefOr[JSONOutput] = js.undefined
  ): OutputSerialization = {
    js.Dynamic
      .literal(
        CSV = CSV.asInstanceOf[js.Any],
        JSON = JSON.asInstanceOf[js.Any]
      )
      .asInstanceOf[OutputSerialization]
  }
}

@js.native
trait CSVOutput extends js.Object {
  val QuoteFields: js.UndefOr[QuoteFields] = js.native
  val QuoteEscapeCharacter: js.UndefOr[String] = js.native
  val RecordDelimiter: js.UndefOr[String] = js.native
  val FieldDelimiter: js.UndefOr[String] = js.native
  val QuoteCharacter: js.UndefOr[String] = js.native
}

object CSVOutput {
  def apply(
      QuoteFields: js.UndefOr[QuoteFields] = js.undefined,
      QuoteEscapeCharacter: js.UndefOr[String] = js.undefined,
      RecordDelimiter: js.UndefOr[String] = js.undefined,
      FieldDelimiter: js.UndefOr[String] = js.undefined,
      QuoteCharacter: js.UndefOr[String] = js.undefined
  ): CSVOutput = {
    js.Dynamic
      .literal(
        QuoteFields = QuoteFields.asInstanceOf[js.Any],
        QuoteEscapeCharacter = QuoteEscapeCharacter.asInstanceOf[js.Any],
        RecordDelimiter = RecordDelimiter.asInstanceOf[js.Any],
        FieldDelimiter = FieldDelimiter.asInstanceOf[js.Any],
        QuoteCharacter = QuoteCharacter.asInstanceOf[js.Any]
      )
      .asInstanceOf[CSVOutput]
  }
}

@js.native
trait JSONOutput extends js.Object {
  val RecordDelimiter: js.UndefOr[String] = js.native
}

object JSONOutput {
  def apply(
      RecordDelimiter: js.UndefOr[String] = js.undefined
  ): JSONOutput = {
    js.Dynamic
      .literal(
        RecordDelimiter = RecordDelimiter.asInstanceOf[js.Any]
      )
      .asInstanceOf[JSONOutput]
  }
}

@js.native
trait OutputLocation extends js.Object {
  val S3: js.UndefOr[S3Location] = js.native
}

object OutputLocation {
  def apply(
      S3: js.UndefOr[S3Location] = js.undefined
  ): OutputLocation = {
    js.Dynamic
      .literal(
        S3 = S3.asInstanceOf[js.Any]
      )
      .asInstanceOf[OutputLocation]
  }
}

@js.native
trait S3Location extends js.Object {
  val BucketName: js.UndefOr[String] = js.native
  val Prefix: js.UndefOr[String] = js.native
  val Encryption: js.UndefOr[Encryption] = js.native
  val CannedACL: js.UndefOr[ObjectCannedACL] = js.native
  val AccessControlList: js.UndefOr[js.Array[Grant]] = js.native
  val Tagging: js.UndefOr[Tagging] = js.native
  val UserMetadata: js.UndefOr[js.Array[MetadataEntry]] = js.native
  val StorageClass: js.UndefOr[StorageClass] = js.native
}

object S3Location {
  def apply(
      BucketName: js.UndefOr[String] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined,
      CannedACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      AccessControlList: js.UndefOr[js.Array[Grant]] = js.undefined,
      Tagging: js.UndefOr[Tagging] = js.undefined,
      UserMetadata: js.UndefOr[js.Array[MetadataEntry]] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined
  ): S3Location = {
    js.Dynamic
      .literal(
        BucketName = BucketName.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any],
        Encryption = Encryption.asInstanceOf[js.Any],
        CannedACL = CannedACL.asInstanceOf[js.Any],
        AccessControlList = AccessControlList.asInstanceOf[js.Any],
        Tagging = Tagging.asInstanceOf[js.Any],
        UserMetadata = UserMetadata.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any]
      )
      .asInstanceOf[S3Location]
  }
}

@js.native
trait Encryption extends js.Object {
  val EncryptionType: js.UndefOr[ServerSideEncryption] = js.native
  val KMSKeyId: js.UndefOr[String] = js.native
  val KMSContext: js.UndefOr[String] = js.native
}

object Encryption {
  def apply(
      EncryptionType: js.UndefOr[ServerSideEncryption] = js.undefined,
      KMSKeyId: js.UndefOr[String] = js.undefined,
      KMSContext: js.UndefOr[String] = js.undefined
  ): Encryption = {
    js.Dynamic
      .literal(
        EncryptionType = EncryptionType.asInstanceOf[js.Any],
        KMSKeyId = KMSKeyId.asInstanceOf[js.Any],
        KMSContext = KMSContext.asInstanceOf[js.Any]
      )
      .asInstanceOf[Encryption]
  }
}

@js.native
trait MetadataEntry extends js.Object {
  val Name: js.UndefOr[String] = js.native
  val Value: js.UndefOr[String] = js.native
}

object MetadataEntry {
  def apply(
      Name: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
  ): MetadataEntry = {
    js.Dynamic
      .literal(
        Name = Name.asInstanceOf[js.Any],
        Value = Value.asInstanceOf[js.Any]
      )
      .asInstanceOf[MetadataEntry]
  }
}

@js.native
trait RequestProgress extends js.Object {
  val Enabled: js.UndefOr[Boolean] = js.native
}

object RequestProgress {
  def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined
  ): RequestProgress = {
    js.Dynamic
      .literal(
        Enabled = Enabled.asInstanceOf[js.Any]
      )
      .asInstanceOf[RequestProgress]
  }
}

@js.native
trait ScanRange extends js.Object {
  val Start: js.UndefOr[Int] = js.native
  val End: js.UndefOr[Int] = js.native
}

object ScanRange {
  def apply(
      Start: js.UndefOr[Int] = js.undefined,
      End: js.UndefOr[Int] = js.undefined
  ): ScanRange = {
    js.Dynamic
      .literal(
        Start = Start.asInstanceOf[js.Any],
        End = End.asInstanceOf[js.Any]
      )
      .asInstanceOf[ScanRange]
  }
}

@js.native
trait InventoryTableConfigurationUpdates extends js.Object {
  val ConfigurationState: js.UndefOr[InventoryConfigurationState] = js.native
  val EncryptionConfiguration
      : js.UndefOr[MetadataTableEncryptionConfiguration] = js.native
}

object InventoryTableConfigurationUpdates {
  def apply(
      ConfigurationState: js.UndefOr[InventoryConfigurationState] =
        js.undefined,
      EncryptionConfiguration: js.UndefOr[
        MetadataTableEncryptionConfiguration
      ] = js.undefined
  ): InventoryTableConfigurationUpdates = {
    js.Dynamic
      .literal(
        ConfigurationState = ConfigurationState.asInstanceOf[js.Any],
        EncryptionConfiguration = EncryptionConfiguration.asInstanceOf[js.Any]
      )
      .asInstanceOf[InventoryTableConfigurationUpdates]
  }
}

@js.native
trait JournalTableConfigurationUpdates extends js.Object {
  val RecordExpiration: js.UndefOr[RecordExpiration] = js.native
}

object JournalTableConfigurationUpdates {
  def apply(
      RecordExpiration: js.UndefOr[RecordExpiration] = js.undefined
  ): JournalTableConfigurationUpdates = {
    js.Dynamic
      .literal(
        RecordExpiration = RecordExpiration.asInstanceOf[js.Any]
      )
      .asInstanceOf[JournalTableConfigurationUpdates]
  }
}

@js.native
trait CopyPartResult extends js.Object {
  val ETag: js.UndefOr[String] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumCRC64NVME: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
}

object CopyPartResult {
  def apply(
      ETag: js.UndefOr[String] = js.undefined,
      LastModified: js.UndefOr[js.Date] = js.undefined,
      ChecksumCRC32: js.UndefOr[String] = js.undefined,
      ChecksumCRC32C: js.UndefOr[String] = js.undefined,
      ChecksumCRC64NVME: js.UndefOr[String] = js.undefined,
      ChecksumSHA1: js.UndefOr[String] = js.undefined,
      ChecksumSHA256: js.UndefOr[String] = js.undefined
  ): CopyPartResult = {
    js.Dynamic
      .literal(
        ETag = ETag.asInstanceOf[js.Any],
        LastModified = LastModified.asInstanceOf[js.Any],
        ChecksumCRC32 = ChecksumCRC32.asInstanceOf[js.Any],
        ChecksumCRC32C = ChecksumCRC32C.asInstanceOf[js.Any],
        ChecksumCRC64NVME = ChecksumCRC64NVME.asInstanceOf[js.Any],
        ChecksumSHA1 = ChecksumSHA1.asInstanceOf[js.Any],
        ChecksumSHA256 = ChecksumSHA256.asInstanceOf[js.Any]
      )
      .asInstanceOf[CopyPartResult]
  }
}

// Enum types

sealed trait BucketAbacStatus extends js.Any
object BucketAbacStatus {
  val Disabled = "Disabled".asInstanceOf[BucketAbacStatus]
  val Enabled = "Enabled".asInstanceOf[BucketAbacStatus]
}

sealed trait RequestCharged extends js.Any
object RequestCharged {
  val Requester = "requester".asInstanceOf[RequestCharged]
}

sealed trait RequestPayer extends js.Any
object RequestPayer {
  val Requester = "requester".asInstanceOf[RequestPayer]
}

sealed trait BucketAccelerateStatus extends js.Any
object BucketAccelerateStatus {
  val Enabled = "Enabled".asInstanceOf[BucketAccelerateStatus]
  val Suspended = "Suspended".asInstanceOf[BucketAccelerateStatus]
}

sealed trait Type extends js.Any
object Type {
  val AmazonCustomerByEmail = "AmazonCustomerByEmail".asInstanceOf[Type]
  val CanonicalUser = "CanonicalUser".asInstanceOf[Type]
  val Group = "Group".asInstanceOf[Type]
}

sealed trait Permission extends js.Any
object Permission {
  val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[Permission]
  val READ = "READ".asInstanceOf[Permission]
  val READ_ACP = "READ_ACP".asInstanceOf[Permission]
  val WRITE = "WRITE".asInstanceOf[Permission]
  val WRITE_ACP = "WRITE_ACP".asInstanceOf[Permission]
}

sealed trait OwnerOverride extends js.Any
object OwnerOverride {
  val Destination = "Destination".asInstanceOf[OwnerOverride]
}

sealed trait ChecksumType extends js.Any
object ChecksumType {
  val COMPOSITE = "COMPOSITE".asInstanceOf[ChecksumType]
  val FULL_OBJECT = "FULL_OBJECT".asInstanceOf[ChecksumType]
}

sealed trait ServerSideEncryption extends js.Any
object ServerSideEncryption {
  val AES256 = "AES256".asInstanceOf[ServerSideEncryption]
  val Aws_fsx = "aws:fsx".asInstanceOf[ServerSideEncryption]
  val Aws_kms = "aws:kms".asInstanceOf[ServerSideEncryption]
  val Aws_kms_dsse = "aws:kms:dsse".asInstanceOf[ServerSideEncryption]
}

sealed trait ObjectCannedACL extends js.Any
object ObjectCannedACL {
  val Authenticated_read = "authenticated-read".asInstanceOf[ObjectCannedACL]
  val Aws_exec_read = "aws-exec-read".asInstanceOf[ObjectCannedACL]
  val Bucket_owner_full_control =
    "bucket-owner-full-control".asInstanceOf[ObjectCannedACL]
  val Bucket_owner_read = "bucket-owner-read".asInstanceOf[ObjectCannedACL]
  val Private = "private".asInstanceOf[ObjectCannedACL]
  val Public_read = "public-read".asInstanceOf[ObjectCannedACL]
  val Public_read_write = "public-read-write".asInstanceOf[ObjectCannedACL]
}

sealed trait ChecksumAlgorithm extends js.Any
object ChecksumAlgorithm {
  val CRC32 = "CRC32".asInstanceOf[ChecksumAlgorithm]
  val CRC32C = "CRC32C".asInstanceOf[ChecksumAlgorithm]
  val CRC64NVME = "CRC64NVME".asInstanceOf[ChecksumAlgorithm]
  val SHA1 = "SHA1".asInstanceOf[ChecksumAlgorithm]
  val SHA256 = "SHA256".asInstanceOf[ChecksumAlgorithm]
}

sealed trait MetadataDirective extends js.Any
object MetadataDirective {
  val COPY = "COPY".asInstanceOf[MetadataDirective]
  val REPLACE = "REPLACE".asInstanceOf[MetadataDirective]
}

sealed trait ObjectLockLegalHoldStatus extends js.Any
object ObjectLockLegalHoldStatus {
  val OFF = "OFF".asInstanceOf[ObjectLockLegalHoldStatus]
  val ON = "ON".asInstanceOf[ObjectLockLegalHoldStatus]
}

sealed trait ObjectLockMode extends js.Any
object ObjectLockMode {
  val COMPLIANCE = "COMPLIANCE".asInstanceOf[ObjectLockMode]
  val GOVERNANCE = "GOVERNANCE".asInstanceOf[ObjectLockMode]
}

sealed trait StorageClass extends js.Any
object StorageClass {
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[StorageClass]
  val EXPRESS_ONEZONE = "EXPRESS_ONEZONE".asInstanceOf[StorageClass]
  val FSX_ONTAP = "FSX_ONTAP".asInstanceOf[StorageClass]
  val FSX_OPENZFS = "FSX_OPENZFS".asInstanceOf[StorageClass]
  val GLACIER = "GLACIER".asInstanceOf[StorageClass]
  val GLACIER_IR = "GLACIER_IR".asInstanceOf[StorageClass]
  val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[StorageClass]
  val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[StorageClass]
  val OUTPOSTS = "OUTPOSTS".asInstanceOf[StorageClass]
  val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY".asInstanceOf[StorageClass]
  val SNOW = "SNOW".asInstanceOf[StorageClass]
  val STANDARD = "STANDARD".asInstanceOf[StorageClass]
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[StorageClass]
}

sealed trait TaggingDirective extends js.Any
object TaggingDirective {
  val COPY = "COPY".asInstanceOf[TaggingDirective]
  val REPLACE = "REPLACE".asInstanceOf[TaggingDirective]
}

sealed trait BucketCannedACL extends js.Any
object BucketCannedACL {
  val Authenticated_read = "authenticated-read".asInstanceOf[BucketCannedACL]
  val Private = "private".asInstanceOf[BucketCannedACL]
  val Public_read = "public-read".asInstanceOf[BucketCannedACL]
  val Public_read_write = "public-read-write".asInstanceOf[BucketCannedACL]
}

sealed trait BucketNamespace extends js.Any
object BucketNamespace {
  val ACCOUNT_REGIONAL = "account-regional".asInstanceOf[BucketNamespace]
  val GLOBAL = "global".asInstanceOf[BucketNamespace]
}

sealed trait DataRedundancy extends js.Any
object DataRedundancy {
  val SingleAvailabilityZone =
    "SingleAvailabilityZone".asInstanceOf[DataRedundancy]
  val SingleLocalZone = "SingleLocalZone".asInstanceOf[DataRedundancy]
}

sealed trait BucketType extends js.Any
object BucketType {
  val Directory = "Directory".asInstanceOf[BucketType]
}

sealed trait LocationType extends js.Any
object LocationType {
  val AvailabilityZone = "AvailabilityZone".asInstanceOf[LocationType]
  val LocalZone = "LocalZone".asInstanceOf[LocationType]
}

sealed trait BucketLocationConstraint extends js.Any
object BucketLocationConstraint {
  val EU = "EU".asInstanceOf[BucketLocationConstraint]
  val Af_south_1 = "af-south-1".asInstanceOf[BucketLocationConstraint]
  val Ap_east_1 = "ap-east-1".asInstanceOf[BucketLocationConstraint]
  val Ap_northeast_1 = "ap-northeast-1".asInstanceOf[BucketLocationConstraint]
  val Ap_northeast_2 = "ap-northeast-2".asInstanceOf[BucketLocationConstraint]
  val Ap_northeast_3 = "ap-northeast-3".asInstanceOf[BucketLocationConstraint]
  val Ap_south_1 = "ap-south-1".asInstanceOf[BucketLocationConstraint]
  val Ap_south_2 = "ap-south-2".asInstanceOf[BucketLocationConstraint]
  val Ap_southeast_1 = "ap-southeast-1".asInstanceOf[BucketLocationConstraint]
  val Ap_southeast_2 = "ap-southeast-2".asInstanceOf[BucketLocationConstraint]
  val Ap_southeast_3 = "ap-southeast-3".asInstanceOf[BucketLocationConstraint]
  val Ap_southeast_4 = "ap-southeast-4".asInstanceOf[BucketLocationConstraint]
  val Ap_southeast_5 = "ap-southeast-5".asInstanceOf[BucketLocationConstraint]
  val Ca_central_1 = "ca-central-1".asInstanceOf[BucketLocationConstraint]
  val Cn_north_1 = "cn-north-1".asInstanceOf[BucketLocationConstraint]
  val Cn_northwest_1 = "cn-northwest-1".asInstanceOf[BucketLocationConstraint]
  val Eu_central_1 = "eu-central-1".asInstanceOf[BucketLocationConstraint]
  val Eu_central_2 = "eu-central-2".asInstanceOf[BucketLocationConstraint]
  val Eu_north_1 = "eu-north-1".asInstanceOf[BucketLocationConstraint]
  val Eu_south_1 = "eu-south-1".asInstanceOf[BucketLocationConstraint]
  val Eu_south_2 = "eu-south-2".asInstanceOf[BucketLocationConstraint]
  val Eu_west_1 = "eu-west-1".asInstanceOf[BucketLocationConstraint]
  val Eu_west_2 = "eu-west-2".asInstanceOf[BucketLocationConstraint]
  val Eu_west_3 = "eu-west-3".asInstanceOf[BucketLocationConstraint]
  val Il_central_1 = "il-central-1".asInstanceOf[BucketLocationConstraint]
  val Me_central_1 = "me-central-1".asInstanceOf[BucketLocationConstraint]
  val Me_south_1 = "me-south-1".asInstanceOf[BucketLocationConstraint]
  val Sa_east_1 = "sa-east-1".asInstanceOf[BucketLocationConstraint]
  val Us_east_2 = "us-east-2".asInstanceOf[BucketLocationConstraint]
  val Us_gov_east_1 = "us-gov-east-1".asInstanceOf[BucketLocationConstraint]
  val Us_gov_west_1 = "us-gov-west-1".asInstanceOf[BucketLocationConstraint]
  val Us_west_1 = "us-west-1".asInstanceOf[BucketLocationConstraint]
  val Us_west_2 = "us-west-2".asInstanceOf[BucketLocationConstraint]
}

sealed trait ObjectOwnership extends js.Any
object ObjectOwnership {
  val BucketOwnerEnforced = "BucketOwnerEnforced".asInstanceOf[ObjectOwnership]
  val BucketOwnerPreferred =
    "BucketOwnerPreferred".asInstanceOf[ObjectOwnership]
  val ObjectWriter = "ObjectWriter".asInstanceOf[ObjectOwnership]
}

sealed trait InventoryConfigurationState extends js.Any
object InventoryConfigurationState {
  val DISABLED = "DISABLED".asInstanceOf[InventoryConfigurationState]
  val ENABLED = "ENABLED".asInstanceOf[InventoryConfigurationState]
}

sealed trait TableSseAlgorithm extends js.Any
object TableSseAlgorithm {
  val AES256 = "AES256".asInstanceOf[TableSseAlgorithm]
  val Aws_kms = "aws:kms".asInstanceOf[TableSseAlgorithm]
}

sealed trait ExpirationState extends js.Any
object ExpirationState {
  val DISABLED = "DISABLED".asInstanceOf[ExpirationState]
  val ENABLED = "ENABLED".asInstanceOf[ExpirationState]
}

sealed trait SessionMode extends js.Any
object SessionMode {
  val ReadOnly = "ReadOnly".asInstanceOf[SessionMode]
  val ReadWrite = "ReadWrite".asInstanceOf[SessionMode]
}

sealed trait AnalyticsS3ExportFileFormat extends js.Any
object AnalyticsS3ExportFileFormat {
  val CSV = "CSV".asInstanceOf[AnalyticsS3ExportFileFormat]
}

sealed trait StorageClassAnalysisSchemaVersion extends js.Any
object StorageClassAnalysisSchemaVersion {
  val V_1 = "V_1".asInstanceOf[StorageClassAnalysisSchemaVersion]
}

sealed trait EncryptionType extends js.Any
object EncryptionType {
  val NONE = "NONE".asInstanceOf[EncryptionType]
  val SSE_C = "SSE-C".asInstanceOf[EncryptionType]
}

sealed trait IntelligentTieringStatus extends js.Any
object IntelligentTieringStatus {
  val Disabled = "Disabled".asInstanceOf[IntelligentTieringStatus]
  val Enabled = "Enabled".asInstanceOf[IntelligentTieringStatus]
}

sealed trait IntelligentTieringAccessTier extends js.Any
object IntelligentTieringAccessTier {
  val ARCHIVE_ACCESS =
    "ARCHIVE_ACCESS".asInstanceOf[IntelligentTieringAccessTier]
  val DEEP_ARCHIVE_ACCESS =
    "DEEP_ARCHIVE_ACCESS".asInstanceOf[IntelligentTieringAccessTier]
}

sealed trait InventoryFormat extends js.Any
object InventoryFormat {
  val CSV = "CSV".asInstanceOf[InventoryFormat]
  val ORC = "ORC".asInstanceOf[InventoryFormat]
  val Parquet = "Parquet".asInstanceOf[InventoryFormat]
}

sealed trait InventoryIncludedObjectVersions extends js.Any
object InventoryIncludedObjectVersions {
  val All = "All".asInstanceOf[InventoryIncludedObjectVersions]
  val Current = "Current".asInstanceOf[InventoryIncludedObjectVersions]
}

sealed trait InventoryOptionalField extends js.Any
object InventoryOptionalField {
  val BucketKeyStatus = "BucketKeyStatus".asInstanceOf[InventoryOptionalField]
  val ChecksumAlgorithm =
    "ChecksumAlgorithm".asInstanceOf[InventoryOptionalField]
  val ETag = "ETag".asInstanceOf[InventoryOptionalField]
  val EncryptionStatus = "EncryptionStatus".asInstanceOf[InventoryOptionalField]
  val IntelligentTieringAccessTier =
    "IntelligentTieringAccessTier".asInstanceOf[InventoryOptionalField]
  val IsMultipartUploaded =
    "IsMultipartUploaded".asInstanceOf[InventoryOptionalField]
  val LastModifiedDate = "LastModifiedDate".asInstanceOf[InventoryOptionalField]
  val LifecycleExpirationDate =
    "LifecycleExpirationDate".asInstanceOf[InventoryOptionalField]
  val ObjectAccessControlList =
    "ObjectAccessControlList".asInstanceOf[InventoryOptionalField]
  val ObjectLockLegalHoldStatus =
    "ObjectLockLegalHoldStatus".asInstanceOf[InventoryOptionalField]
  val ObjectLockMode = "ObjectLockMode".asInstanceOf[InventoryOptionalField]
  val ObjectLockRetainUntilDate =
    "ObjectLockRetainUntilDate".asInstanceOf[InventoryOptionalField]
  val ObjectOwner = "ObjectOwner".asInstanceOf[InventoryOptionalField]
  val ReplicationStatus =
    "ReplicationStatus".asInstanceOf[InventoryOptionalField]
  val Size = "Size".asInstanceOf[InventoryOptionalField]
  val StorageClass = "StorageClass".asInstanceOf[InventoryOptionalField]
}

sealed trait InventoryFrequency extends js.Any
object InventoryFrequency {
  val Daily = "Daily".asInstanceOf[InventoryFrequency]
  val Weekly = "Weekly".asInstanceOf[InventoryFrequency]
}

sealed trait TransitionStorageClass extends js.Any
object TransitionStorageClass {
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[TransitionStorageClass]
  val GLACIER = "GLACIER".asInstanceOf[TransitionStorageClass]
  val GLACIER_IR = "GLACIER_IR".asInstanceOf[TransitionStorageClass]
  val INTELLIGENT_TIERING =
    "INTELLIGENT_TIERING".asInstanceOf[TransitionStorageClass]
  val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[TransitionStorageClass]
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[TransitionStorageClass]
}

sealed trait ExpirationStatus extends js.Any
object ExpirationStatus {
  val Disabled = "Disabled".asInstanceOf[ExpirationStatus]
  val Enabled = "Enabled".asInstanceOf[ExpirationStatus]
}

sealed trait TransitionDefaultMinimumObjectSize extends js.Any
object TransitionDefaultMinimumObjectSize {
  val All_storage_classes_128K =
    "all_storage_classes_128K".asInstanceOf[TransitionDefaultMinimumObjectSize]
  val Varies_by_storage_class =
    "varies_by_storage_class".asInstanceOf[TransitionDefaultMinimumObjectSize]
}

sealed trait BucketLogsPermission extends js.Any
object BucketLogsPermission {
  val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[BucketLogsPermission]
  val READ = "READ".asInstanceOf[BucketLogsPermission]
  val WRITE = "WRITE".asInstanceOf[BucketLogsPermission]
}

sealed trait PartitionDateSource extends js.Any
object PartitionDateSource {
  val DeliveryTime = "DeliveryTime".asInstanceOf[PartitionDateSource]
  val EventTime = "EventTime".asInstanceOf[PartitionDateSource]
}

sealed trait S3TablesBucketType extends js.Any
object S3TablesBucketType {
  val Aws = "aws".asInstanceOf[S3TablesBucketType]
  val Customer = "customer".asInstanceOf[S3TablesBucketType]
}

sealed trait Event extends js.Any
object Event {
  val S3_IntelligentTiering = "s3:IntelligentTiering".asInstanceOf[Event]
  val S3_LifecycleExpiration_ = "s3:LifecycleExpiration:*".asInstanceOf[Event]
  val S3_LifecycleExpiration_Delete =
    "s3:LifecycleExpiration:Delete".asInstanceOf[Event]
  val S3_LifecycleExpiration_DeleteMarkerCreated =
    "s3:LifecycleExpiration:DeleteMarkerCreated".asInstanceOf[Event]
  val S3_LifecycleTransition = "s3:LifecycleTransition".asInstanceOf[Event]
  val S3S3ObjectAcl_Put = "s3:ObjectAcl:Put".asInstanceOf[Event]
  val S3S3ObjectCreated_ = "s3:ObjectCreated:*".asInstanceOf[Event]
  val S3S3ObjectCreated_CompleteMultipartUpload =
    "s3:ObjectCreated:CompleteMultipartUpload".asInstanceOf[Event]
  val S3S3ObjectCreated_Copy = "s3:ObjectCreated:Copy".asInstanceOf[Event]
  val S3S3ObjectCreated_Post = "s3:ObjectCreated:Post".asInstanceOf[Event]
  val S3S3ObjectCreated_Put = "s3:ObjectCreated:Put".asInstanceOf[Event]
  val S3S3ObjectRemoved_ = "s3:ObjectRemoved:*".asInstanceOf[Event]
  val S3S3ObjectRemoved_Delete = "s3:ObjectRemoved:Delete".asInstanceOf[Event]
  val S3S3ObjectRemoved_DeleteMarkerCreated =
    "s3:ObjectRemoved:DeleteMarkerCreated".asInstanceOf[Event]
  val S3S3ObjectRestore_ = "s3:ObjectRestore:*".asInstanceOf[Event]
  val S3S3ObjectRestore_Completed =
    "s3:ObjectRestore:Completed".asInstanceOf[Event]
  val S3S3ObjectRestore_Delete = "s3:ObjectRestore:Delete".asInstanceOf[Event]
  val S3S3ObjectRestore_Post = "s3:ObjectRestore:Post".asInstanceOf[Event]
  val S3S3ObjectTagging_ = "s3:ObjectTagging:*".asInstanceOf[Event]
  val S3S3ObjectTagging_Delete = "s3:ObjectTagging:Delete".asInstanceOf[Event]
  val S3S3ObjectTagging_Put = "s3:ObjectTagging:Put".asInstanceOf[Event]
  val S3_ReducedRedundancyLostObject =
    "s3:ReducedRedundancyLostObject".asInstanceOf[Event]
  val S3_Replication_ = "s3:Replication:*".asInstanceOf[Event]
  val S3_Replication_OperationFailedReplication =
    "s3:Replication:OperationFailedReplication".asInstanceOf[Event]
  val S3_Replication_OperationMissedThreshold =
    "s3:Replication:OperationMissedThreshold".asInstanceOf[Event]
  val S3_Replication_OperationNotTracked =
    "s3:Replication:OperationNotTracked".asInstanceOf[Event]
  val S3_Replication_OperationReplicatedAfterThreshold =
    "s3:Replication:OperationReplicatedAfterThreshold".asInstanceOf[Event]
}

sealed trait FilterRuleName extends js.Any
object FilterRuleName {
  val Prefix = "prefix".asInstanceOf[FilterRuleName]
  val Suffix = "suffix".asInstanceOf[FilterRuleName]
}

sealed trait DeleteMarkerReplicationStatus extends js.Any
object DeleteMarkerReplicationStatus {
  val Disabled = "Disabled".asInstanceOf[DeleteMarkerReplicationStatus]
  val Enabled = "Enabled".asInstanceOf[DeleteMarkerReplicationStatus]
}

sealed trait MetricsStatus extends js.Any
object MetricsStatus {
  val Disabled = "Disabled".asInstanceOf[MetricsStatus]
  val Enabled = "Enabled".asInstanceOf[MetricsStatus]
}

sealed trait ReplicationTimeStatus extends js.Any
object ReplicationTimeStatus {
  val Disabled = "Disabled".asInstanceOf[ReplicationTimeStatus]
  val Enabled = "Enabled".asInstanceOf[ReplicationTimeStatus]
}

sealed trait ExistingObjectReplicationStatus extends js.Any
object ExistingObjectReplicationStatus {
  val Disabled = "Disabled".asInstanceOf[ExistingObjectReplicationStatus]
  val Enabled = "Enabled".asInstanceOf[ExistingObjectReplicationStatus]
}

sealed trait ReplicaModificationsStatus extends js.Any
object ReplicaModificationsStatus {
  val Disabled = "Disabled".asInstanceOf[ReplicaModificationsStatus]
  val Enabled = "Enabled".asInstanceOf[ReplicaModificationsStatus]
}

sealed trait SseKmsEncryptedObjectsStatus extends js.Any
object SseKmsEncryptedObjectsStatus {
  val Disabled = "Disabled".asInstanceOf[SseKmsEncryptedObjectsStatus]
  val Enabled = "Enabled".asInstanceOf[SseKmsEncryptedObjectsStatus]
}

sealed trait ReplicationRuleStatus extends js.Any
object ReplicationRuleStatus {
  val Disabled = "Disabled".asInstanceOf[ReplicationRuleStatus]
  val Enabled = "Enabled".asInstanceOf[ReplicationRuleStatus]
}

sealed trait Payer extends js.Any
object Payer {
  val BucketOwner = "BucketOwner".asInstanceOf[Payer]
  val Requester = "Requester".asInstanceOf[Payer]
}

sealed trait MFADeleteStatus extends js.Any
object MFADeleteStatus {
  val Disabled = "Disabled".asInstanceOf[MFADeleteStatus]
  val Enabled = "Enabled".asInstanceOf[MFADeleteStatus]
}

sealed trait BucketVersioningStatus extends js.Any
object BucketVersioningStatus {
  val Enabled = "Enabled".asInstanceOf[BucketVersioningStatus]
  val Suspended = "Suspended".asInstanceOf[BucketVersioningStatus]
}

sealed trait Protocol extends js.Any
object Protocol {
  val Http = "http".asInstanceOf[Protocol]
  val Https = "https".asInstanceOf[Protocol]
}

sealed trait ReplicationStatus extends js.Any
object ReplicationStatus {
  val COMPLETE = "COMPLETE".asInstanceOf[ReplicationStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ReplicationStatus]
  val FAILED = "FAILED".asInstanceOf[ReplicationStatus]
  val PENDING = "PENDING".asInstanceOf[ReplicationStatus]
  val REPLICA = "REPLICA".asInstanceOf[ReplicationStatus]
}

sealed trait ChecksumMode extends js.Any
object ChecksumMode {
  val ENABLED = "ENABLED".asInstanceOf[ChecksumMode]
}

sealed trait ObjectAttributes extends js.Any
object ObjectAttributes {
  val CHECKSUM = "Checksum".asInstanceOf[ObjectAttributes]
  val ETAG = "ETag".asInstanceOf[ObjectAttributes]
  val OBJECT_PARTS = "ObjectParts".asInstanceOf[ObjectAttributes]
  val OBJECT_SIZE = "ObjectSize".asInstanceOf[ObjectAttributes]
  val STORAGE_CLASS = "StorageClass".asInstanceOf[ObjectAttributes]
}

sealed trait ObjectLockEnabled extends js.Any
object ObjectLockEnabled {
  val Enabled = "Enabled".asInstanceOf[ObjectLockEnabled]
}

sealed trait ObjectLockRetentionMode extends js.Any
object ObjectLockRetentionMode {
  val COMPLIANCE = "COMPLIANCE".asInstanceOf[ObjectLockRetentionMode]
  val GOVERNANCE = "GOVERNANCE".asInstanceOf[ObjectLockRetentionMode]
}

sealed trait ArchiveStatus extends js.Any
object ArchiveStatus {
  val ARCHIVE_ACCESS = "ARCHIVE_ACCESS".asInstanceOf[ArchiveStatus]
  val DEEP_ARCHIVE_ACCESS = "DEEP_ARCHIVE_ACCESS".asInstanceOf[ArchiveStatus]
}

sealed trait EncodingType extends js.Any
object EncodingType {
  val Url = "url".asInstanceOf[EncodingType]
}

sealed trait OptionalObjectAttributes extends js.Any
object OptionalObjectAttributes {
  val RESTORE_STATUS = "RestoreStatus".asInstanceOf[OptionalObjectAttributes]
}

sealed trait ObjectVersionStorageClass extends js.Any
object ObjectVersionStorageClass {
  val STANDARD = "STANDARD".asInstanceOf[ObjectVersionStorageClass]
}

sealed trait MFADelete extends js.Any
object MFADelete {
  val Disabled = "Disabled".asInstanceOf[MFADelete]
  val Enabled = "Enabled".asInstanceOf[MFADelete]
}

sealed trait Tier extends js.Any
object Tier {
  val Bulk = "Bulk".asInstanceOf[Tier]
  val Expedited = "Expedited".asInstanceOf[Tier]
  val Standard = "Standard".asInstanceOf[Tier]
}

sealed trait ExpressionType extends js.Any
object ExpressionType {
  val SQL = "SQL".asInstanceOf[ExpressionType]
}

sealed trait CompressionType extends js.Any
object CompressionType {
  val BZIP2 = "BZIP2".asInstanceOf[CompressionType]
  val GZIP = "GZIP".asInstanceOf[CompressionType]
  val NONE = "NONE".asInstanceOf[CompressionType]
}

sealed trait FileHeaderInfo extends js.Any
object FileHeaderInfo {
  val IGNORE = "IGNORE".asInstanceOf[FileHeaderInfo]
  val NONE = "NONE".asInstanceOf[FileHeaderInfo]
  val USE = "USE".asInstanceOf[FileHeaderInfo]
}

sealed trait JSONType extends js.Any
object JSONType {
  val DOCUMENT = "DOCUMENT".asInstanceOf[JSONType]
  val LINES = "LINES".asInstanceOf[JSONType]
}

sealed trait QuoteFields extends js.Any
object QuoteFields {
  val ALWAYS = "ALWAYS".asInstanceOf[QuoteFields]
  val ASNEEDED = "ASNEEDED".asInstanceOf[QuoteFields]
}

sealed trait RestoreRequestType extends js.Any
object RestoreRequestType {
  val SELECT = "SELECT".asInstanceOf[RestoreRequestType]
}
