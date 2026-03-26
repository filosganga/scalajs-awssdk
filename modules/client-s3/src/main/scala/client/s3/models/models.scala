package com.filippodeluca.jsfacade.awssdk
package client
package s3
package models

import com.filippodeluca.jsfacade.awssdk.types._
import scalajs.js
import scalajs.js.|

@js.native
trait GetObjectCommandInput extends js.Object {
  val Bucket: String = js.native
  val Key: String = js.native

  val IfMatch: js.UndefOr[String] = js.native
  val IfModifiedSince: js.UndefOr[js.Date] = js.native
  val IfNoneMatch: js.UndefOr[String] = js.native
  val IfUnmodifiedSince: js.UndefOr[js.Date] = js.native
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
      Bucket: String,
      Key: String,
      IfMatch: js.UndefOr[String] = js.undefined,
      IfModifiedSince: js.UndefOr[js.Date] = js.undefined,
      IfNoneMatch: js.UndefOr[String] = js.undefined,
      IfUnmodifiedSince: js.UndefOr[js.Date] = js.undefined,
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
        Bucket = Bucket,
        Key = Key,
        IfMatch = IfMatch.asInstanceOf[js.Any],
        IfModifiedSince = IfModifiedSince.asInstanceOf[js.Any],
        IfNoneMatch = IfNoneMatch.asInstanceOf[js.Any],
        IfUnmodifiedSince = IfUnmodifiedSince.asInstanceOf[js.Any],
        Range = Range.asInstanceOf[js.Any],
        ResponseCacheControl = ResponseCacheControl.asInstanceOf[js.Any],
        ResponseContentDisposition =
          ResponseContentDisposition.asInstanceOf[js.Any],
        ResponseContentEncoding =
          ResponseContentEncoding.asInstanceOf[js.Any],
        ResponseContentLanguage =
          ResponseContentLanguage.asInstanceOf[js.Any],
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

@js.native
trait SdkStream extends js.Object {
  def transformToByteArray(): js.Promise[js.typedarray.Uint8Array] = js.native
  def transformToString(encoding: js.UndefOr[String] = js.undefined): js.Promise[String] = js.native
}

@js.native
trait GetObjectCommandOutput extends MetadataBearer {
  val Body: js.UndefOr[SdkStream] = js.native
  val DeleteMarker: js.UndefOr[Boolean] = js.native
  val AcceptRanges: js.UndefOr[String] = js.native
  val Expiration: js.UndefOr[String] = js.native
  val Restore: js.UndefOr[String] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val ContentLength: js.UndefOr[Double] = js.native
  val ETag: js.UndefOr[String] = js.native
  val ChecksumCRC32: js.UndefOr[String] = js.native
  val ChecksumCRC32C: js.UndefOr[String] = js.native
  val ChecksumSHA1: js.UndefOr[String] = js.native
  val ChecksumSHA256: js.UndefOr[String] = js.native
  val MissingMeta: js.UndefOr[Int] = js.native
  val VersionId: js.UndefOr[String] = js.native
  val CacheControl: js.UndefOr[String] = js.native
  val ContentDisposition: js.UndefOr[String] = js.native
  val ContentEncoding: js.UndefOr[String] = js.native
  val ContentLanguage: js.UndefOr[String] = js.native
  val ContentRange: js.UndefOr[String] = js.native
  val ContentType: js.UndefOr[String] = js.native
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
  val ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  val ObjectLockMode: js.UndefOr[ObjectLockMode] = js.native
  val ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.native
  val ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] =
    js.native
}

@js.native
trait PutObjectCommandInput extends js.Object {
  val Bucket: String = js.native
  val Key: String = js.native

  val ACL: js.UndefOr[ObjectCannedACL] = js.native
  val Body: js.UndefOr[js.Any] = js.native
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
}

object PutObjectCommandInput {
  def apply(
      Bucket: String,
      Key: String,
      ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      Body: js.UndefOr[js.Any] = js.undefined,
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
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): PutObjectCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket,
        Key = Key,
        ACL = ACL.asInstanceOf[js.Any],
        Body = Body.asInstanceOf[js.Any],
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
        WriteOffsetBytes = WriteOffsetBytes.asInstanceOf[js.Any],
        Metadata = Metadata.asInstanceOf[js.Any],
        ServerSideEncryption = ServerSideEncryption.asInstanceOf[js.Any],
        StorageClass = StorageClass.asInstanceOf[js.Any],
        WebsiteRedirectLocation =
          WebsiteRedirectLocation.asInstanceOf[js.Any],
        SSECustomerAlgorithm = SSECustomerAlgorithm.asInstanceOf[js.Any],
        SSECustomerKey = SSECustomerKey.asInstanceOf[js.Any],
        SSECustomerKeyMD5 = SSECustomerKeyMD5.asInstanceOf[js.Any],
        SSEKMSKeyId = SSEKMSKeyId.asInstanceOf[js.Any],
        SSEKMSEncryptionContext =
          SSEKMSEncryptionContext.asInstanceOf[js.Any],
        BucketKeyEnabled = BucketKeyEnabled.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        Tagging = Tagging.asInstanceOf[js.Any],
        ObjectLockMode = ObjectLockMode.asInstanceOf[js.Any],
        ObjectLockRetainUntilDate =
          ObjectLockRetainUntilDate.asInstanceOf[js.Any],
        ObjectLockLegalHoldStatus =
          ObjectLockLegalHoldStatus.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
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
trait CreateBucketCommandInput extends js.Object {
  val Bucket: String = js.native
  val ACL: js.UndefOr[BucketCannedACL] = js.native
  val CreateBucketConfiguration: js.UndefOr[CreateBucketConfiguration] =
    js.native
  val GrantFullControl: js.UndefOr[String] = js.native
  val GrantRead: js.UndefOr[String] = js.native
  val GrantReadACP: js.UndefOr[String] = js.native
  val GrantWrite: js.UndefOr[String] = js.native
  val GrantWriteACP: js.UndefOr[String] = js.native
  val ObjectLockEnabledForBucket: js.UndefOr[Boolean] = js.native
  val ObjectOwnership: js.UndefOr[ObjectOwnership] = js.native
}

object CreateBucketCommandInput {
  def apply(
      Bucket: String,
      ACL: js.UndefOr[BucketCannedACL] = js.undefined,
      CreateBucketConfiguration: js.UndefOr[CreateBucketConfiguration] =
        js.undefined,
      GrantFullControl: js.UndefOr[String] = js.undefined,
      GrantRead: js.UndefOr[String] = js.undefined,
      GrantReadACP: js.UndefOr[String] = js.undefined,
      GrantWrite: js.UndefOr[String] = js.undefined,
      GrantWriteACP: js.UndefOr[String] = js.undefined,
      ObjectLockEnabledForBucket: js.UndefOr[Boolean] = js.undefined,
      ObjectOwnership: js.UndefOr[ObjectOwnership] = js.undefined
  ): CreateBucketCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket,
        ACL = ACL.asInstanceOf[js.Any],
        CreateBucketConfiguration =
          CreateBucketConfiguration.asInstanceOf[js.Any],
        GrantFullControl = GrantFullControl.asInstanceOf[js.Any],
        GrantRead = GrantRead.asInstanceOf[js.Any],
        GrantReadACP = GrantReadACP.asInstanceOf[js.Any],
        GrantWrite = GrantWrite.asInstanceOf[js.Any],
        GrantWriteACP = GrantWriteACP.asInstanceOf[js.Any],
        ObjectLockEnabledForBucket =
          ObjectLockEnabledForBucket.asInstanceOf[js.Any],
        ObjectOwnership = ObjectOwnership.asInstanceOf[js.Any]
      )
      .asInstanceOf[CreateBucketCommandInput]
  }
}

@js.native
trait CreateBucketConfiguration extends js.Object {
  val LocationConstraint: js.UndefOr[String] = js.native
}

object CreateBucketConfiguration {
  def apply(
      LocationConstraint: js.UndefOr[String] = js.undefined
  ): CreateBucketConfiguration = {
    js.Dynamic
      .literal(
        LocationConstraint = LocationConstraint.asInstanceOf[js.Any]
      )
      .asInstanceOf[CreateBucketConfiguration]
  }
}

@js.native
trait CreateBucketCommandOutput extends MetadataBearer {
  val Location: js.UndefOr[String] = js.native
  val BucketArn: js.UndefOr[String] = js.native
}

@js.native
trait DeleteBucketCommandInput extends js.Object {
  val Bucket: String = js.native
  val ExpectedBucketOwner: js.UndefOr[String] = js.native
}

object DeleteBucketCommandInput {
  def apply(
      Bucket: String,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  ): DeleteBucketCommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket,
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteBucketCommandInput]
  }
}

@js.native
trait DeleteBucketCommandOutput extends MetadataBearer

@js.native
trait DeleteObjectCommandInput extends js.Object {
  val Bucket: String = js.native
  val Key: String = js.native
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
      Bucket: String,
      Key: String,
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
        Bucket = Bucket,
        Key = Key,
        MFA = MFA.asInstanceOf[js.Any],
        VersionId = VersionId.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        BypassGovernanceRetention =
          BypassGovernanceRetention.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        IfMatch = IfMatch.asInstanceOf[js.Any],
        IfMatchLastModifiedTime =
          IfMatchLastModifiedTime.asInstanceOf[js.Any],
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
trait ListObjectsV2CommandInput extends js.Object {
  val Bucket: String = js.native
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
      Bucket: String,
      Delimiter: js.UndefOr[String] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      MaxKeys: js.UndefOr[Int] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      ContinuationToken: js.UndefOr[String] = js.undefined,
      FetchOwner: js.UndefOr[Boolean] = js.undefined,
      StartAfter: js.UndefOr[String] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      ExpectedBucketOwner: js.UndefOr[String] = js.undefined,
      OptionalObjectAttributes: js.UndefOr[
        js.Array[OptionalObjectAttributes]
      ] = js.undefined
  ): ListObjectsV2CommandInput = {
    js.Dynamic
      .literal(
        Bucket = Bucket,
        Delimiter = Delimiter.asInstanceOf[js.Any],
        EncodingType = EncodingType.asInstanceOf[js.Any],
        MaxKeys = MaxKeys.asInstanceOf[js.Any],
        Prefix = Prefix.asInstanceOf[js.Any],
        ContinuationToken = ContinuationToken.asInstanceOf[js.Any],
        FetchOwner = FetchOwner.asInstanceOf[js.Any],
        StartAfter = StartAfter.asInstanceOf[js.Any],
        RequestPayer = RequestPayer.asInstanceOf[js.Any],
        ExpectedBucketOwner = ExpectedBucketOwner.asInstanceOf[js.Any],
        OptionalObjectAttributes =
          OptionalObjectAttributes.asInstanceOf[js.Any]
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
trait S3Object extends js.Object {
  val Key: js.UndefOr[String] = js.native
  val LastModified: js.UndefOr[js.Date] = js.native
  val ETag: js.UndefOr[String] = js.native
  val ChecksumAlgorithm: js.UndefOr[js.Array[ChecksumAlgorithm]] = js.native
  val Size: js.UndefOr[Double] = js.native
  val StorageClass: js.UndefOr[ObjectStorageClass] = js.native
  val Owner: js.UndefOr[Owner] = js.native
}

@js.native
trait CommonPrefix extends js.Object {
  val Prefix: js.UndefOr[String] = js.native
}

@js.native
trait Owner extends js.Object {
  val DisplayName: js.UndefOr[String] = js.native
  val ID: js.UndefOr[String] = js.native
}

// Enum types

sealed trait ObjectCannedACL extends js.Any
object ObjectCannedACL {
  val Private = "private".asInstanceOf[ObjectCannedACL]
  val PublicRead = "public-read".asInstanceOf[ObjectCannedACL]
  val PublicReadWrite = "public-read-write".asInstanceOf[ObjectCannedACL]
  val AuthenticatedRead = "authenticated-read".asInstanceOf[ObjectCannedACL]
  val AwsExecRead = "aws-exec-read".asInstanceOf[ObjectCannedACL]
  val BucketOwnerRead = "bucket-owner-read".asInstanceOf[ObjectCannedACL]
  val BucketOwnerFullControl =
    "bucket-owner-full-control".asInstanceOf[ObjectCannedACL]
}

sealed trait ChecksumAlgorithm extends js.Any
object ChecksumAlgorithm {
  val CRC32 = "CRC32".asInstanceOf[ChecksumAlgorithm]
  val CRC32C = "CRC32C".asInstanceOf[ChecksumAlgorithm]
  val CRC64NVME = "CRC64NVME".asInstanceOf[ChecksumAlgorithm]
  val SHA1 = "SHA1".asInstanceOf[ChecksumAlgorithm]
  val SHA256 = "SHA256".asInstanceOf[ChecksumAlgorithm]
}

sealed trait RequestPayer extends js.Any
object RequestPayer {
  val Requester = "requester".asInstanceOf[RequestPayer]
}

sealed trait ChecksumMode extends js.Any
object ChecksumMode {
  val Enabled = "ENABLED".asInstanceOf[ChecksumMode]
}

sealed trait StorageClass extends js.Any
object StorageClass {
  val Standard = "STANDARD".asInstanceOf[StorageClass]
  val ReducedRedundancy = "REDUCED_REDUNDANCY".asInstanceOf[StorageClass]
  val StandardIa = "STANDARD_IA".asInstanceOf[StorageClass]
  val OnezoneIa = "ONEZONE_IA".asInstanceOf[StorageClass]
  val IntelligentTiering = "INTELLIGENT_TIERING".asInstanceOf[StorageClass]
  val Glacier = "GLACIER".asInstanceOf[StorageClass]
  val DeepArchive = "DEEP_ARCHIVE".asInstanceOf[StorageClass]
  val Outposts = "OUTPOSTS".asInstanceOf[StorageClass]
  val GlacierIr = "GLACIER_IR".asInstanceOf[StorageClass]
  val Snow = "SNOW".asInstanceOf[StorageClass]
  val ExpressOnezone = "EXPRESS_ONEZONE".asInstanceOf[StorageClass]
}

sealed trait RequestCharged extends js.Any
object RequestCharged {
  val Requester = "requester".asInstanceOf[RequestCharged]
}

sealed trait ReplicationStatus extends js.Any
object ReplicationStatus {
  val Complete = "COMPLETE".asInstanceOf[ReplicationStatus]
  val Pending = "PENDING".asInstanceOf[ReplicationStatus]
  val Failed = "FAILED".asInstanceOf[ReplicationStatus]
  val Replica = "REPLICA".asInstanceOf[ReplicationStatus]
  val Completed = "COMPLETED".asInstanceOf[ReplicationStatus]
}

sealed trait ServerSideEncryption extends js.Any
object ServerSideEncryption {
  val Aes256 = "AES256".asInstanceOf[ServerSideEncryption]
  val AwsKms = "aws:kms".asInstanceOf[ServerSideEncryption]
  val AwsKmsDsse = "aws:kms:dsse".asInstanceOf[ServerSideEncryption]
}

sealed trait ObjectLockMode extends js.Any
object ObjectLockMode {
  val Governance = "GOVERNANCE".asInstanceOf[ObjectLockMode]
  val Compliance = "COMPLIANCE".asInstanceOf[ObjectLockMode]
}

sealed trait ObjectLockLegalHoldStatus extends js.Any
object ObjectLockLegalHoldStatus {
  val On = "ON".asInstanceOf[ObjectLockLegalHoldStatus]
  val Off = "OFF".asInstanceOf[ObjectLockLegalHoldStatus]
}

sealed trait BucketCannedACL extends js.Any
object BucketCannedACL {
  val Private = "private".asInstanceOf[BucketCannedACL]
  val PublicRead = "public-read".asInstanceOf[BucketCannedACL]
  val PublicReadWrite = "public-read-write".asInstanceOf[BucketCannedACL]
  val AuthenticatedRead = "authenticated-read".asInstanceOf[BucketCannedACL]
}

sealed trait ObjectOwnership extends js.Any
object ObjectOwnership {
  val BucketOwnerPreferred =
    "BucketOwnerPreferred".asInstanceOf[ObjectOwnership]
  val ObjectWriter = "ObjectWriter".asInstanceOf[ObjectOwnership]
  val BucketOwnerEnforced =
    "BucketOwnerEnforced".asInstanceOf[ObjectOwnership]
}

sealed trait EncodingType extends js.Any
object EncodingType {
  val Url = "url".asInstanceOf[EncodingType]
}

sealed trait ObjectStorageClass extends js.Any
object ObjectStorageClass {
  val Standard = "STANDARD".asInstanceOf[ObjectStorageClass]
  val ReducedRedundancy = "REDUCED_REDUNDANCY".asInstanceOf[ObjectStorageClass]
  val Glacier = "GLACIER".asInstanceOf[ObjectStorageClass]
  val StandardIa = "STANDARD_IA".asInstanceOf[ObjectStorageClass]
  val OnezoneIa = "ONEZONE_IA".asInstanceOf[ObjectStorageClass]
  val IntelligentTiering =
    "INTELLIGENT_TIERING".asInstanceOf[ObjectStorageClass]
  val DeepArchive = "DEEP_ARCHIVE".asInstanceOf[ObjectStorageClass]
  val Outposts = "OUTPOSTS".asInstanceOf[ObjectStorageClass]
  val GlacierIr = "GLACIER_IR".asInstanceOf[ObjectStorageClass]
  val Snow = "SNOW".asInstanceOf[ObjectStorageClass]
  val ExpressOnezone = "EXPRESS_ONEZONE".asInstanceOf[ObjectStorageClass]
}

sealed trait OptionalObjectAttributes extends js.Any
object OptionalObjectAttributes {
  val RestoreStatus = "RestoreStatus".asInstanceOf[OptionalObjectAttributes]
}
