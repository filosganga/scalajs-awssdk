package com.filippodeluca.jsfacade.awssdk
package client
package s3
package commands

import com.filippodeluca.jsfacade.awssdk.client.s3.models.*
import scalajs.js
import scalajs.js.annotation.JSImport

@js.native
@JSImport("@aws-sdk/client-s3", "AbortMultipartUploadCommand")
class AbortMultipartUploadCommand(
    override val input: AbortMultipartUploadCommandInput
) extends Command[
      AbortMultipartUploadCommandInput,
      AbortMultipartUploadCommandOutput
    ]

object AbortMultipartUploadCommand {
  def apply(
      input: AbortMultipartUploadCommandInput
  ): AbortMultipartUploadCommand =
    new AbortMultipartUploadCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "CompleteMultipartUploadCommand")
class CompleteMultipartUploadCommand(
    override val input: CompleteMultipartUploadCommandInput
) extends Command[
      CompleteMultipartUploadCommandInput,
      CompleteMultipartUploadCommandOutput
    ]

object CompleteMultipartUploadCommand {
  def apply(
      input: CompleteMultipartUploadCommandInput
  ): CompleteMultipartUploadCommand =
    new CompleteMultipartUploadCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "CopyObjectCommand")
class CopyObjectCommand(override val input: CopyObjectCommandInput)
    extends Command[CopyObjectCommandInput, CopyObjectCommandOutput]

object CopyObjectCommand {
  def apply(input: CopyObjectCommandInput): CopyObjectCommand =
    new CopyObjectCommand(
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
@JSImport("@aws-sdk/client-s3", "CreateBucketMetadataConfigurationCommand")
class CreateBucketMetadataConfigurationCommand(
    override val input: CreateBucketMetadataConfigurationCommandInput
) extends Command[
      CreateBucketMetadataConfigurationCommandInput,
      CreateBucketMetadataConfigurationCommandOutput
    ]

object CreateBucketMetadataConfigurationCommand {
  def apply(
      input: CreateBucketMetadataConfigurationCommandInput
  ): CreateBucketMetadataConfigurationCommand =
    new CreateBucketMetadataConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "CreateBucketMetadataTableConfigurationCommand")
class CreateBucketMetadataTableConfigurationCommand(
    override val input: CreateBucketMetadataTableConfigurationCommandInput
) extends Command[
      CreateBucketMetadataTableConfigurationCommandInput,
      CreateBucketMetadataTableConfigurationCommandOutput
    ]

object CreateBucketMetadataTableConfigurationCommand {
  def apply(
      input: CreateBucketMetadataTableConfigurationCommandInput
  ): CreateBucketMetadataTableConfigurationCommand =
    new CreateBucketMetadataTableConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "CreateMultipartUploadCommand")
class CreateMultipartUploadCommand(
    override val input: CreateMultipartUploadCommandInput
) extends Command[
      CreateMultipartUploadCommandInput,
      CreateMultipartUploadCommandOutput
    ]

object CreateMultipartUploadCommand {
  def apply(
      input: CreateMultipartUploadCommandInput
  ): CreateMultipartUploadCommand =
    new CreateMultipartUploadCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "CreateSessionCommand")
class CreateSessionCommand(override val input: CreateSessionCommandInput)
    extends Command[CreateSessionCommandInput, CreateSessionCommandOutput]

object CreateSessionCommand {
  def apply(input: CreateSessionCommandInput): CreateSessionCommand =
    new CreateSessionCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketAnalyticsConfigurationCommand")
class DeleteBucketAnalyticsConfigurationCommand(
    override val input: DeleteBucketAnalyticsConfigurationCommandInput
) extends Command[
      DeleteBucketAnalyticsConfigurationCommandInput,
      DeleteBucketAnalyticsConfigurationCommandOutput
    ]

object DeleteBucketAnalyticsConfigurationCommand {
  def apply(
      input: DeleteBucketAnalyticsConfigurationCommandInput
  ): DeleteBucketAnalyticsConfigurationCommand =
    new DeleteBucketAnalyticsConfigurationCommand(
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
@JSImport("@aws-sdk/client-s3", "DeleteBucketCorsCommand")
class DeleteBucketCorsCommand(override val input: DeleteBucketCorsCommandInput)
    extends Command[DeleteBucketCorsCommandInput, DeleteBucketCorsCommandOutput]

object DeleteBucketCorsCommand {
  def apply(input: DeleteBucketCorsCommandInput): DeleteBucketCorsCommand =
    new DeleteBucketCorsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketEncryptionCommand")
class DeleteBucketEncryptionCommand(
    override val input: DeleteBucketEncryptionCommandInput
) extends Command[
      DeleteBucketEncryptionCommandInput,
      DeleteBucketEncryptionCommandOutput
    ]

object DeleteBucketEncryptionCommand {
  def apply(
      input: DeleteBucketEncryptionCommandInput
  ): DeleteBucketEncryptionCommand =
    new DeleteBucketEncryptionCommand(
      input
    )
}

@js.native
@JSImport(
  "@aws-sdk/client-s3",
  "DeleteBucketIntelligentTieringConfigurationCommand"
)
class DeleteBucketIntelligentTieringConfigurationCommand(
    override val input: DeleteBucketIntelligentTieringConfigurationCommandInput
) extends Command[
      DeleteBucketIntelligentTieringConfigurationCommandInput,
      DeleteBucketIntelligentTieringConfigurationCommandOutput
    ]

object DeleteBucketIntelligentTieringConfigurationCommand {
  def apply(
      input: DeleteBucketIntelligentTieringConfigurationCommandInput
  ): DeleteBucketIntelligentTieringConfigurationCommand =
    new DeleteBucketIntelligentTieringConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketInventoryConfigurationCommand")
class DeleteBucketInventoryConfigurationCommand(
    override val input: DeleteBucketInventoryConfigurationCommandInput
) extends Command[
      DeleteBucketInventoryConfigurationCommandInput,
      DeleteBucketInventoryConfigurationCommandOutput
    ]

object DeleteBucketInventoryConfigurationCommand {
  def apply(
      input: DeleteBucketInventoryConfigurationCommandInput
  ): DeleteBucketInventoryConfigurationCommand =
    new DeleteBucketInventoryConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketLifecycleCommand")
class DeleteBucketLifecycleCommand(
    override val input: DeleteBucketLifecycleCommandInput
) extends Command[
      DeleteBucketLifecycleCommandInput,
      DeleteBucketLifecycleCommandOutput
    ]

object DeleteBucketLifecycleCommand {
  def apply(
      input: DeleteBucketLifecycleCommandInput
  ): DeleteBucketLifecycleCommand =
    new DeleteBucketLifecycleCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketMetadataConfigurationCommand")
class DeleteBucketMetadataConfigurationCommand(
    override val input: DeleteBucketMetadataConfigurationCommandInput
) extends Command[
      DeleteBucketMetadataConfigurationCommandInput,
      DeleteBucketMetadataConfigurationCommandOutput
    ]

object DeleteBucketMetadataConfigurationCommand {
  def apply(
      input: DeleteBucketMetadataConfigurationCommandInput
  ): DeleteBucketMetadataConfigurationCommand =
    new DeleteBucketMetadataConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketMetadataTableConfigurationCommand")
class DeleteBucketMetadataTableConfigurationCommand(
    override val input: DeleteBucketMetadataTableConfigurationCommandInput
) extends Command[
      DeleteBucketMetadataTableConfigurationCommandInput,
      DeleteBucketMetadataTableConfigurationCommandOutput
    ]

object DeleteBucketMetadataTableConfigurationCommand {
  def apply(
      input: DeleteBucketMetadataTableConfigurationCommandInput
  ): DeleteBucketMetadataTableConfigurationCommand =
    new DeleteBucketMetadataTableConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketMetricsConfigurationCommand")
class DeleteBucketMetricsConfigurationCommand(
    override val input: DeleteBucketMetricsConfigurationCommandInput
) extends Command[
      DeleteBucketMetricsConfigurationCommandInput,
      DeleteBucketMetricsConfigurationCommandOutput
    ]

object DeleteBucketMetricsConfigurationCommand {
  def apply(
      input: DeleteBucketMetricsConfigurationCommandInput
  ): DeleteBucketMetricsConfigurationCommand =
    new DeleteBucketMetricsConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketOwnershipControlsCommand")
class DeleteBucketOwnershipControlsCommand(
    override val input: DeleteBucketOwnershipControlsCommandInput
) extends Command[
      DeleteBucketOwnershipControlsCommandInput,
      DeleteBucketOwnershipControlsCommandOutput
    ]

object DeleteBucketOwnershipControlsCommand {
  def apply(
      input: DeleteBucketOwnershipControlsCommandInput
  ): DeleteBucketOwnershipControlsCommand =
    new DeleteBucketOwnershipControlsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketPolicyCommand")
class DeleteBucketPolicyCommand(
    override val input: DeleteBucketPolicyCommandInput
) extends Command[
      DeleteBucketPolicyCommandInput,
      DeleteBucketPolicyCommandOutput
    ]

object DeleteBucketPolicyCommand {
  def apply(input: DeleteBucketPolicyCommandInput): DeleteBucketPolicyCommand =
    new DeleteBucketPolicyCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketReplicationCommand")
class DeleteBucketReplicationCommand(
    override val input: DeleteBucketReplicationCommandInput
) extends Command[
      DeleteBucketReplicationCommandInput,
      DeleteBucketReplicationCommandOutput
    ]

object DeleteBucketReplicationCommand {
  def apply(
      input: DeleteBucketReplicationCommandInput
  ): DeleteBucketReplicationCommand =
    new DeleteBucketReplicationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketTaggingCommand")
class DeleteBucketTaggingCommand(
    override val input: DeleteBucketTaggingCommandInput
) extends Command[
      DeleteBucketTaggingCommandInput,
      DeleteBucketTaggingCommandOutput
    ]

object DeleteBucketTaggingCommand {
  def apply(
      input: DeleteBucketTaggingCommandInput
  ): DeleteBucketTaggingCommand =
    new DeleteBucketTaggingCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteBucketWebsiteCommand")
class DeleteBucketWebsiteCommand(
    override val input: DeleteBucketWebsiteCommandInput
) extends Command[
      DeleteBucketWebsiteCommandInput,
      DeleteBucketWebsiteCommandOutput
    ]

object DeleteBucketWebsiteCommand {
  def apply(
      input: DeleteBucketWebsiteCommandInput
  ): DeleteBucketWebsiteCommand =
    new DeleteBucketWebsiteCommand(
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
@JSImport("@aws-sdk/client-s3", "DeleteObjectTaggingCommand")
class DeleteObjectTaggingCommand(
    override val input: DeleteObjectTaggingCommandInput
) extends Command[
      DeleteObjectTaggingCommandInput,
      DeleteObjectTaggingCommandOutput
    ]

object DeleteObjectTaggingCommand {
  def apply(
      input: DeleteObjectTaggingCommandInput
  ): DeleteObjectTaggingCommand =
    new DeleteObjectTaggingCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeleteObjectsCommand")
class DeleteObjectsCommand(override val input: DeleteObjectsCommandInput)
    extends Command[DeleteObjectsCommandInput, DeleteObjectsCommandOutput]

object DeleteObjectsCommand {
  def apply(input: DeleteObjectsCommandInput): DeleteObjectsCommand =
    new DeleteObjectsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "DeletePublicAccessBlockCommand")
class DeletePublicAccessBlockCommand(
    override val input: DeletePublicAccessBlockCommandInput
) extends Command[
      DeletePublicAccessBlockCommandInput,
      DeletePublicAccessBlockCommandOutput
    ]

object DeletePublicAccessBlockCommand {
  def apply(
      input: DeletePublicAccessBlockCommandInput
  ): DeletePublicAccessBlockCommand =
    new DeletePublicAccessBlockCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketAbacCommand")
class GetBucketAbacCommand(override val input: GetBucketAbacCommandInput)
    extends Command[GetBucketAbacCommandInput, GetBucketAbacCommandOutput]

object GetBucketAbacCommand {
  def apply(input: GetBucketAbacCommandInput): GetBucketAbacCommand =
    new GetBucketAbacCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketAccelerateConfigurationCommand")
class GetBucketAccelerateConfigurationCommand(
    override val input: GetBucketAccelerateConfigurationCommandInput
) extends Command[
      GetBucketAccelerateConfigurationCommandInput,
      GetBucketAccelerateConfigurationCommandOutput
    ]

object GetBucketAccelerateConfigurationCommand {
  def apply(
      input: GetBucketAccelerateConfigurationCommandInput
  ): GetBucketAccelerateConfigurationCommand =
    new GetBucketAccelerateConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketAclCommand")
class GetBucketAclCommand(override val input: GetBucketAclCommandInput)
    extends Command[GetBucketAclCommandInput, GetBucketAclCommandOutput]

object GetBucketAclCommand {
  def apply(input: GetBucketAclCommandInput): GetBucketAclCommand =
    new GetBucketAclCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketAnalyticsConfigurationCommand")
class GetBucketAnalyticsConfigurationCommand(
    override val input: GetBucketAnalyticsConfigurationCommandInput
) extends Command[
      GetBucketAnalyticsConfigurationCommandInput,
      GetBucketAnalyticsConfigurationCommandOutput
    ]

object GetBucketAnalyticsConfigurationCommand {
  def apply(
      input: GetBucketAnalyticsConfigurationCommandInput
  ): GetBucketAnalyticsConfigurationCommand =
    new GetBucketAnalyticsConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketCorsCommand")
class GetBucketCorsCommand(override val input: GetBucketCorsCommandInput)
    extends Command[GetBucketCorsCommandInput, GetBucketCorsCommandOutput]

object GetBucketCorsCommand {
  def apply(input: GetBucketCorsCommandInput): GetBucketCorsCommand =
    new GetBucketCorsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketEncryptionCommand")
class GetBucketEncryptionCommand(
    override val input: GetBucketEncryptionCommandInput
) extends Command[
      GetBucketEncryptionCommandInput,
      GetBucketEncryptionCommandOutput
    ]

object GetBucketEncryptionCommand {
  def apply(
      input: GetBucketEncryptionCommandInput
  ): GetBucketEncryptionCommand =
    new GetBucketEncryptionCommand(
      input
    )
}

@js.native
@JSImport(
  "@aws-sdk/client-s3",
  "GetBucketIntelligentTieringConfigurationCommand"
)
class GetBucketIntelligentTieringConfigurationCommand(
    override val input: GetBucketIntelligentTieringConfigurationCommandInput
) extends Command[
      GetBucketIntelligentTieringConfigurationCommandInput,
      GetBucketIntelligentTieringConfigurationCommandOutput
    ]

object GetBucketIntelligentTieringConfigurationCommand {
  def apply(
      input: GetBucketIntelligentTieringConfigurationCommandInput
  ): GetBucketIntelligentTieringConfigurationCommand =
    new GetBucketIntelligentTieringConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketInventoryConfigurationCommand")
class GetBucketInventoryConfigurationCommand(
    override val input: GetBucketInventoryConfigurationCommandInput
) extends Command[
      GetBucketInventoryConfigurationCommandInput,
      GetBucketInventoryConfigurationCommandOutput
    ]

object GetBucketInventoryConfigurationCommand {
  def apply(
      input: GetBucketInventoryConfigurationCommandInput
  ): GetBucketInventoryConfigurationCommand =
    new GetBucketInventoryConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketLifecycleConfigurationCommand")
class GetBucketLifecycleConfigurationCommand(
    override val input: GetBucketLifecycleConfigurationCommandInput
) extends Command[
      GetBucketLifecycleConfigurationCommandInput,
      GetBucketLifecycleConfigurationCommandOutput
    ]

object GetBucketLifecycleConfigurationCommand {
  def apply(
      input: GetBucketLifecycleConfigurationCommandInput
  ): GetBucketLifecycleConfigurationCommand =
    new GetBucketLifecycleConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketLocationCommand")
class GetBucketLocationCommand(
    override val input: GetBucketLocationCommandInput
) extends Command[GetBucketLocationCommandInput, GetBucketLocationCommandOutput]

object GetBucketLocationCommand {
  def apply(input: GetBucketLocationCommandInput): GetBucketLocationCommand =
    new GetBucketLocationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketLoggingCommand")
class GetBucketLoggingCommand(override val input: GetBucketLoggingCommandInput)
    extends Command[GetBucketLoggingCommandInput, GetBucketLoggingCommandOutput]

object GetBucketLoggingCommand {
  def apply(input: GetBucketLoggingCommandInput): GetBucketLoggingCommand =
    new GetBucketLoggingCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketMetadataConfigurationCommand")
class GetBucketMetadataConfigurationCommand(
    override val input: GetBucketMetadataConfigurationCommandInput
) extends Command[
      GetBucketMetadataConfigurationCommandInput,
      GetBucketMetadataConfigurationCommandOutput
    ]

object GetBucketMetadataConfigurationCommand {
  def apply(
      input: GetBucketMetadataConfigurationCommandInput
  ): GetBucketMetadataConfigurationCommand =
    new GetBucketMetadataConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketMetadataTableConfigurationCommand")
class GetBucketMetadataTableConfigurationCommand(
    override val input: GetBucketMetadataTableConfigurationCommandInput
) extends Command[
      GetBucketMetadataTableConfigurationCommandInput,
      GetBucketMetadataTableConfigurationCommandOutput
    ]

object GetBucketMetadataTableConfigurationCommand {
  def apply(
      input: GetBucketMetadataTableConfigurationCommandInput
  ): GetBucketMetadataTableConfigurationCommand =
    new GetBucketMetadataTableConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketMetricsConfigurationCommand")
class GetBucketMetricsConfigurationCommand(
    override val input: GetBucketMetricsConfigurationCommandInput
) extends Command[
      GetBucketMetricsConfigurationCommandInput,
      GetBucketMetricsConfigurationCommandOutput
    ]

object GetBucketMetricsConfigurationCommand {
  def apply(
      input: GetBucketMetricsConfigurationCommandInput
  ): GetBucketMetricsConfigurationCommand =
    new GetBucketMetricsConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketNotificationConfigurationCommand")
class GetBucketNotificationConfigurationCommand(
    override val input: GetBucketNotificationConfigurationCommandInput
) extends Command[
      GetBucketNotificationConfigurationCommandInput,
      GetBucketNotificationConfigurationCommandOutput
    ]

object GetBucketNotificationConfigurationCommand {
  def apply(
      input: GetBucketNotificationConfigurationCommandInput
  ): GetBucketNotificationConfigurationCommand =
    new GetBucketNotificationConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketOwnershipControlsCommand")
class GetBucketOwnershipControlsCommand(
    override val input: GetBucketOwnershipControlsCommandInput
) extends Command[
      GetBucketOwnershipControlsCommandInput,
      GetBucketOwnershipControlsCommandOutput
    ]

object GetBucketOwnershipControlsCommand {
  def apply(
      input: GetBucketOwnershipControlsCommandInput
  ): GetBucketOwnershipControlsCommand =
    new GetBucketOwnershipControlsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketPolicyCommand")
class GetBucketPolicyCommand(override val input: GetBucketPolicyCommandInput)
    extends Command[GetBucketPolicyCommandInput, GetBucketPolicyCommandOutput]

object GetBucketPolicyCommand {
  def apply(input: GetBucketPolicyCommandInput): GetBucketPolicyCommand =
    new GetBucketPolicyCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketPolicyStatusCommand")
class GetBucketPolicyStatusCommand(
    override val input: GetBucketPolicyStatusCommandInput
) extends Command[
      GetBucketPolicyStatusCommandInput,
      GetBucketPolicyStatusCommandOutput
    ]

object GetBucketPolicyStatusCommand {
  def apply(
      input: GetBucketPolicyStatusCommandInput
  ): GetBucketPolicyStatusCommand =
    new GetBucketPolicyStatusCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketReplicationCommand")
class GetBucketReplicationCommand(
    override val input: GetBucketReplicationCommandInput
) extends Command[
      GetBucketReplicationCommandInput,
      GetBucketReplicationCommandOutput
    ]

object GetBucketReplicationCommand {
  def apply(
      input: GetBucketReplicationCommandInput
  ): GetBucketReplicationCommand =
    new GetBucketReplicationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketRequestPaymentCommand")
class GetBucketRequestPaymentCommand(
    override val input: GetBucketRequestPaymentCommandInput
) extends Command[
      GetBucketRequestPaymentCommandInput,
      GetBucketRequestPaymentCommandOutput
    ]

object GetBucketRequestPaymentCommand {
  def apply(
      input: GetBucketRequestPaymentCommandInput
  ): GetBucketRequestPaymentCommand =
    new GetBucketRequestPaymentCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketTaggingCommand")
class GetBucketTaggingCommand(override val input: GetBucketTaggingCommandInput)
    extends Command[GetBucketTaggingCommandInput, GetBucketTaggingCommandOutput]

object GetBucketTaggingCommand {
  def apply(input: GetBucketTaggingCommandInput): GetBucketTaggingCommand =
    new GetBucketTaggingCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketVersioningCommand")
class GetBucketVersioningCommand(
    override val input: GetBucketVersioningCommandInput
) extends Command[
      GetBucketVersioningCommandInput,
      GetBucketVersioningCommandOutput
    ]

object GetBucketVersioningCommand {
  def apply(
      input: GetBucketVersioningCommandInput
  ): GetBucketVersioningCommand =
    new GetBucketVersioningCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetBucketWebsiteCommand")
class GetBucketWebsiteCommand(override val input: GetBucketWebsiteCommandInput)
    extends Command[GetBucketWebsiteCommandInput, GetBucketWebsiteCommandOutput]

object GetBucketWebsiteCommand {
  def apply(input: GetBucketWebsiteCommandInput): GetBucketWebsiteCommand =
    new GetBucketWebsiteCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetObjectAclCommand")
class GetObjectAclCommand(override val input: GetObjectAclCommandInput)
    extends Command[GetObjectAclCommandInput, GetObjectAclCommandOutput]

object GetObjectAclCommand {
  def apply(input: GetObjectAclCommandInput): GetObjectAclCommand =
    new GetObjectAclCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetObjectAttributesCommand")
class GetObjectAttributesCommand(
    override val input: GetObjectAttributesCommandInput
) extends Command[
      GetObjectAttributesCommandInput,
      GetObjectAttributesCommandOutput
    ]

object GetObjectAttributesCommand {
  def apply(
      input: GetObjectAttributesCommandInput
  ): GetObjectAttributesCommand =
    new GetObjectAttributesCommand(
      input
    )
}

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
@JSImport("@aws-sdk/client-s3", "GetObjectLegalHoldCommand")
class GetObjectLegalHoldCommand(
    override val input: GetObjectLegalHoldCommandInput
) extends Command[
      GetObjectLegalHoldCommandInput,
      GetObjectLegalHoldCommandOutput
    ]

object GetObjectLegalHoldCommand {
  def apply(input: GetObjectLegalHoldCommandInput): GetObjectLegalHoldCommand =
    new GetObjectLegalHoldCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetObjectLockConfigurationCommand")
class GetObjectLockConfigurationCommand(
    override val input: GetObjectLockConfigurationCommandInput
) extends Command[
      GetObjectLockConfigurationCommandInput,
      GetObjectLockConfigurationCommandOutput
    ]

object GetObjectLockConfigurationCommand {
  def apply(
      input: GetObjectLockConfigurationCommandInput
  ): GetObjectLockConfigurationCommand =
    new GetObjectLockConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetObjectRetentionCommand")
class GetObjectRetentionCommand(
    override val input: GetObjectRetentionCommandInput
) extends Command[
      GetObjectRetentionCommandInput,
      GetObjectRetentionCommandOutput
    ]

object GetObjectRetentionCommand {
  def apply(input: GetObjectRetentionCommandInput): GetObjectRetentionCommand =
    new GetObjectRetentionCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetObjectTaggingCommand")
class GetObjectTaggingCommand(override val input: GetObjectTaggingCommandInput)
    extends Command[GetObjectTaggingCommandInput, GetObjectTaggingCommandOutput]

object GetObjectTaggingCommand {
  def apply(input: GetObjectTaggingCommandInput): GetObjectTaggingCommand =
    new GetObjectTaggingCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetObjectTorrentCommand")
class GetObjectTorrentCommand(override val input: GetObjectTorrentCommandInput)
    extends Command[GetObjectTorrentCommandInput, GetObjectTorrentCommandOutput]

object GetObjectTorrentCommand {
  def apply(input: GetObjectTorrentCommandInput): GetObjectTorrentCommand =
    new GetObjectTorrentCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "GetPublicAccessBlockCommand")
class GetPublicAccessBlockCommand(
    override val input: GetPublicAccessBlockCommandInput
) extends Command[
      GetPublicAccessBlockCommandInput,
      GetPublicAccessBlockCommandOutput
    ]

object GetPublicAccessBlockCommand {
  def apply(
      input: GetPublicAccessBlockCommandInput
  ): GetPublicAccessBlockCommand =
    new GetPublicAccessBlockCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "HeadBucketCommand")
class HeadBucketCommand(override val input: HeadBucketCommandInput)
    extends Command[HeadBucketCommandInput, HeadBucketCommandOutput]

object HeadBucketCommand {
  def apply(input: HeadBucketCommandInput): HeadBucketCommand =
    new HeadBucketCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "HeadObjectCommand")
class HeadObjectCommand(override val input: HeadObjectCommandInput)
    extends Command[HeadObjectCommandInput, HeadObjectCommandOutput]

object HeadObjectCommand {
  def apply(input: HeadObjectCommandInput): HeadObjectCommand =
    new HeadObjectCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "ListBucketAnalyticsConfigurationsCommand")
class ListBucketAnalyticsConfigurationsCommand(
    override val input: ListBucketAnalyticsConfigurationsCommandInput
) extends Command[
      ListBucketAnalyticsConfigurationsCommandInput,
      ListBucketAnalyticsConfigurationsCommandOutput
    ]

object ListBucketAnalyticsConfigurationsCommand {
  def apply(
      input: ListBucketAnalyticsConfigurationsCommandInput
  ): ListBucketAnalyticsConfigurationsCommand =
    new ListBucketAnalyticsConfigurationsCommand(
      input
    )
}

@js.native
@JSImport(
  "@aws-sdk/client-s3",
  "ListBucketIntelligentTieringConfigurationsCommand"
)
class ListBucketIntelligentTieringConfigurationsCommand(
    override val input: ListBucketIntelligentTieringConfigurationsCommandInput
) extends Command[
      ListBucketIntelligentTieringConfigurationsCommandInput,
      ListBucketIntelligentTieringConfigurationsCommandOutput
    ]

object ListBucketIntelligentTieringConfigurationsCommand {
  def apply(
      input: ListBucketIntelligentTieringConfigurationsCommandInput
  ): ListBucketIntelligentTieringConfigurationsCommand =
    new ListBucketIntelligentTieringConfigurationsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "ListBucketInventoryConfigurationsCommand")
class ListBucketInventoryConfigurationsCommand(
    override val input: ListBucketInventoryConfigurationsCommandInput
) extends Command[
      ListBucketInventoryConfigurationsCommandInput,
      ListBucketInventoryConfigurationsCommandOutput
    ]

object ListBucketInventoryConfigurationsCommand {
  def apply(
      input: ListBucketInventoryConfigurationsCommandInput
  ): ListBucketInventoryConfigurationsCommand =
    new ListBucketInventoryConfigurationsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "ListBucketMetricsConfigurationsCommand")
class ListBucketMetricsConfigurationsCommand(
    override val input: ListBucketMetricsConfigurationsCommandInput
) extends Command[
      ListBucketMetricsConfigurationsCommandInput,
      ListBucketMetricsConfigurationsCommandOutput
    ]

object ListBucketMetricsConfigurationsCommand {
  def apply(
      input: ListBucketMetricsConfigurationsCommandInput
  ): ListBucketMetricsConfigurationsCommand =
    new ListBucketMetricsConfigurationsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "ListBucketsCommand")
class ListBucketsCommand(override val input: ListBucketsCommandInput)
    extends Command[ListBucketsCommandInput, ListBucketsCommandOutput]

object ListBucketsCommand {
  def apply(input: ListBucketsCommandInput): ListBucketsCommand =
    new ListBucketsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "ListDirectoryBucketsCommand")
class ListDirectoryBucketsCommand(
    override val input: ListDirectoryBucketsCommandInput
) extends Command[
      ListDirectoryBucketsCommandInput,
      ListDirectoryBucketsCommandOutput
    ]

object ListDirectoryBucketsCommand {
  def apply(
      input: ListDirectoryBucketsCommandInput
  ): ListDirectoryBucketsCommand =
    new ListDirectoryBucketsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "ListMultipartUploadsCommand")
class ListMultipartUploadsCommand(
    override val input: ListMultipartUploadsCommandInput
) extends Command[
      ListMultipartUploadsCommandInput,
      ListMultipartUploadsCommandOutput
    ]

object ListMultipartUploadsCommand {
  def apply(
      input: ListMultipartUploadsCommandInput
  ): ListMultipartUploadsCommand =
    new ListMultipartUploadsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "ListObjectVersionsCommand")
class ListObjectVersionsCommand(
    override val input: ListObjectVersionsCommandInput
) extends Command[
      ListObjectVersionsCommandInput,
      ListObjectVersionsCommandOutput
    ]

object ListObjectVersionsCommand {
  def apply(input: ListObjectVersionsCommandInput): ListObjectVersionsCommand =
    new ListObjectVersionsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "ListObjectsCommand")
class ListObjectsCommand(override val input: ListObjectsCommandInput)
    extends Command[ListObjectsCommandInput, ListObjectsCommandOutput]

object ListObjectsCommand {
  def apply(input: ListObjectsCommandInput): ListObjectsCommand =
    new ListObjectsCommand(
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

@js.native
@JSImport("@aws-sdk/client-s3", "ListPartsCommand")
class ListPartsCommand(override val input: ListPartsCommandInput)
    extends Command[ListPartsCommandInput, ListPartsCommandOutput]

object ListPartsCommand {
  def apply(input: ListPartsCommandInput): ListPartsCommand =
    new ListPartsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketAbacCommand")
class PutBucketAbacCommand(override val input: PutBucketAbacCommandInput)
    extends Command[PutBucketAbacCommandInput, PutBucketAbacCommandOutput]

object PutBucketAbacCommand {
  def apply(input: PutBucketAbacCommandInput): PutBucketAbacCommand =
    new PutBucketAbacCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketAccelerateConfigurationCommand")
class PutBucketAccelerateConfigurationCommand(
    override val input: PutBucketAccelerateConfigurationCommandInput
) extends Command[
      PutBucketAccelerateConfigurationCommandInput,
      PutBucketAccelerateConfigurationCommandOutput
    ]

object PutBucketAccelerateConfigurationCommand {
  def apply(
      input: PutBucketAccelerateConfigurationCommandInput
  ): PutBucketAccelerateConfigurationCommand =
    new PutBucketAccelerateConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketAclCommand")
class PutBucketAclCommand(override val input: PutBucketAclCommandInput)
    extends Command[PutBucketAclCommandInput, PutBucketAclCommandOutput]

object PutBucketAclCommand {
  def apply(input: PutBucketAclCommandInput): PutBucketAclCommand =
    new PutBucketAclCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketAnalyticsConfigurationCommand")
class PutBucketAnalyticsConfigurationCommand(
    override val input: PutBucketAnalyticsConfigurationCommandInput
) extends Command[
      PutBucketAnalyticsConfigurationCommandInput,
      PutBucketAnalyticsConfigurationCommandOutput
    ]

object PutBucketAnalyticsConfigurationCommand {
  def apply(
      input: PutBucketAnalyticsConfigurationCommandInput
  ): PutBucketAnalyticsConfigurationCommand =
    new PutBucketAnalyticsConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketCorsCommand")
class PutBucketCorsCommand(override val input: PutBucketCorsCommandInput)
    extends Command[PutBucketCorsCommandInput, PutBucketCorsCommandOutput]

object PutBucketCorsCommand {
  def apply(input: PutBucketCorsCommandInput): PutBucketCorsCommand =
    new PutBucketCorsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketEncryptionCommand")
class PutBucketEncryptionCommand(
    override val input: PutBucketEncryptionCommandInput
) extends Command[
      PutBucketEncryptionCommandInput,
      PutBucketEncryptionCommandOutput
    ]

object PutBucketEncryptionCommand {
  def apply(
      input: PutBucketEncryptionCommandInput
  ): PutBucketEncryptionCommand =
    new PutBucketEncryptionCommand(
      input
    )
}

@js.native
@JSImport(
  "@aws-sdk/client-s3",
  "PutBucketIntelligentTieringConfigurationCommand"
)
class PutBucketIntelligentTieringConfigurationCommand(
    override val input: PutBucketIntelligentTieringConfigurationCommandInput
) extends Command[
      PutBucketIntelligentTieringConfigurationCommandInput,
      PutBucketIntelligentTieringConfigurationCommandOutput
    ]

object PutBucketIntelligentTieringConfigurationCommand {
  def apply(
      input: PutBucketIntelligentTieringConfigurationCommandInput
  ): PutBucketIntelligentTieringConfigurationCommand =
    new PutBucketIntelligentTieringConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketInventoryConfigurationCommand")
class PutBucketInventoryConfigurationCommand(
    override val input: PutBucketInventoryConfigurationCommandInput
) extends Command[
      PutBucketInventoryConfigurationCommandInput,
      PutBucketInventoryConfigurationCommandOutput
    ]

object PutBucketInventoryConfigurationCommand {
  def apply(
      input: PutBucketInventoryConfigurationCommandInput
  ): PutBucketInventoryConfigurationCommand =
    new PutBucketInventoryConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketLifecycleConfigurationCommand")
class PutBucketLifecycleConfigurationCommand(
    override val input: PutBucketLifecycleConfigurationCommandInput
) extends Command[
      PutBucketLifecycleConfigurationCommandInput,
      PutBucketLifecycleConfigurationCommandOutput
    ]

object PutBucketLifecycleConfigurationCommand {
  def apply(
      input: PutBucketLifecycleConfigurationCommandInput
  ): PutBucketLifecycleConfigurationCommand =
    new PutBucketLifecycleConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketLoggingCommand")
class PutBucketLoggingCommand(override val input: PutBucketLoggingCommandInput)
    extends Command[PutBucketLoggingCommandInput, PutBucketLoggingCommandOutput]

object PutBucketLoggingCommand {
  def apply(input: PutBucketLoggingCommandInput): PutBucketLoggingCommand =
    new PutBucketLoggingCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketMetricsConfigurationCommand")
class PutBucketMetricsConfigurationCommand(
    override val input: PutBucketMetricsConfigurationCommandInput
) extends Command[
      PutBucketMetricsConfigurationCommandInput,
      PutBucketMetricsConfigurationCommandOutput
    ]

object PutBucketMetricsConfigurationCommand {
  def apply(
      input: PutBucketMetricsConfigurationCommandInput
  ): PutBucketMetricsConfigurationCommand =
    new PutBucketMetricsConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketNotificationConfigurationCommand")
class PutBucketNotificationConfigurationCommand(
    override val input: PutBucketNotificationConfigurationCommandInput
) extends Command[
      PutBucketNotificationConfigurationCommandInput,
      PutBucketNotificationConfigurationCommandOutput
    ]

object PutBucketNotificationConfigurationCommand {
  def apply(
      input: PutBucketNotificationConfigurationCommandInput
  ): PutBucketNotificationConfigurationCommand =
    new PutBucketNotificationConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketOwnershipControlsCommand")
class PutBucketOwnershipControlsCommand(
    override val input: PutBucketOwnershipControlsCommandInput
) extends Command[
      PutBucketOwnershipControlsCommandInput,
      PutBucketOwnershipControlsCommandOutput
    ]

object PutBucketOwnershipControlsCommand {
  def apply(
      input: PutBucketOwnershipControlsCommandInput
  ): PutBucketOwnershipControlsCommand =
    new PutBucketOwnershipControlsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketPolicyCommand")
class PutBucketPolicyCommand(override val input: PutBucketPolicyCommandInput)
    extends Command[PutBucketPolicyCommandInput, PutBucketPolicyCommandOutput]

object PutBucketPolicyCommand {
  def apply(input: PutBucketPolicyCommandInput): PutBucketPolicyCommand =
    new PutBucketPolicyCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketReplicationCommand")
class PutBucketReplicationCommand(
    override val input: PutBucketReplicationCommandInput
) extends Command[
      PutBucketReplicationCommandInput,
      PutBucketReplicationCommandOutput
    ]

object PutBucketReplicationCommand {
  def apply(
      input: PutBucketReplicationCommandInput
  ): PutBucketReplicationCommand =
    new PutBucketReplicationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketRequestPaymentCommand")
class PutBucketRequestPaymentCommand(
    override val input: PutBucketRequestPaymentCommandInput
) extends Command[
      PutBucketRequestPaymentCommandInput,
      PutBucketRequestPaymentCommandOutput
    ]

object PutBucketRequestPaymentCommand {
  def apply(
      input: PutBucketRequestPaymentCommandInput
  ): PutBucketRequestPaymentCommand =
    new PutBucketRequestPaymentCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketTaggingCommand")
class PutBucketTaggingCommand(override val input: PutBucketTaggingCommandInput)
    extends Command[PutBucketTaggingCommandInput, PutBucketTaggingCommandOutput]

object PutBucketTaggingCommand {
  def apply(input: PutBucketTaggingCommandInput): PutBucketTaggingCommand =
    new PutBucketTaggingCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketVersioningCommand")
class PutBucketVersioningCommand(
    override val input: PutBucketVersioningCommandInput
) extends Command[
      PutBucketVersioningCommandInput,
      PutBucketVersioningCommandOutput
    ]

object PutBucketVersioningCommand {
  def apply(
      input: PutBucketVersioningCommandInput
  ): PutBucketVersioningCommand =
    new PutBucketVersioningCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutBucketWebsiteCommand")
class PutBucketWebsiteCommand(override val input: PutBucketWebsiteCommandInput)
    extends Command[PutBucketWebsiteCommandInput, PutBucketWebsiteCommandOutput]

object PutBucketWebsiteCommand {
  def apply(input: PutBucketWebsiteCommandInput): PutBucketWebsiteCommand =
    new PutBucketWebsiteCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutObjectAclCommand")
class PutObjectAclCommand(override val input: PutObjectAclCommandInput)
    extends Command[PutObjectAclCommandInput, PutObjectAclCommandOutput]

object PutObjectAclCommand {
  def apply(input: PutObjectAclCommandInput): PutObjectAclCommand =
    new PutObjectAclCommand(
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
@JSImport("@aws-sdk/client-s3", "PutObjectLegalHoldCommand")
class PutObjectLegalHoldCommand(
    override val input: PutObjectLegalHoldCommandInput
) extends Command[
      PutObjectLegalHoldCommandInput,
      PutObjectLegalHoldCommandOutput
    ]

object PutObjectLegalHoldCommand {
  def apply(input: PutObjectLegalHoldCommandInput): PutObjectLegalHoldCommand =
    new PutObjectLegalHoldCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutObjectLockConfigurationCommand")
class PutObjectLockConfigurationCommand(
    override val input: PutObjectLockConfigurationCommandInput
) extends Command[
      PutObjectLockConfigurationCommandInput,
      PutObjectLockConfigurationCommandOutput
    ]

object PutObjectLockConfigurationCommand {
  def apply(
      input: PutObjectLockConfigurationCommandInput
  ): PutObjectLockConfigurationCommand =
    new PutObjectLockConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutObjectRetentionCommand")
class PutObjectRetentionCommand(
    override val input: PutObjectRetentionCommandInput
) extends Command[
      PutObjectRetentionCommandInput,
      PutObjectRetentionCommandOutput
    ]

object PutObjectRetentionCommand {
  def apply(input: PutObjectRetentionCommandInput): PutObjectRetentionCommand =
    new PutObjectRetentionCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutObjectTaggingCommand")
class PutObjectTaggingCommand(override val input: PutObjectTaggingCommandInput)
    extends Command[PutObjectTaggingCommandInput, PutObjectTaggingCommandOutput]

object PutObjectTaggingCommand {
  def apply(input: PutObjectTaggingCommandInput): PutObjectTaggingCommand =
    new PutObjectTaggingCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "PutPublicAccessBlockCommand")
class PutPublicAccessBlockCommand(
    override val input: PutPublicAccessBlockCommandInput
) extends Command[
      PutPublicAccessBlockCommandInput,
      PutPublicAccessBlockCommandOutput
    ]

object PutPublicAccessBlockCommand {
  def apply(
      input: PutPublicAccessBlockCommandInput
  ): PutPublicAccessBlockCommand =
    new PutPublicAccessBlockCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "RenameObjectCommand")
class RenameObjectCommand(override val input: RenameObjectCommandInput)
    extends Command[RenameObjectCommandInput, RenameObjectCommandOutput]

object RenameObjectCommand {
  def apply(input: RenameObjectCommandInput): RenameObjectCommand =
    new RenameObjectCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "RestoreObjectCommand")
class RestoreObjectCommand(override val input: RestoreObjectCommandInput)
    extends Command[RestoreObjectCommandInput, RestoreObjectCommandOutput]

object RestoreObjectCommand {
  def apply(input: RestoreObjectCommandInput): RestoreObjectCommand =
    new RestoreObjectCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "SelectObjectContentCommand")
class SelectObjectContentCommand(
    override val input: SelectObjectContentCommandInput
) extends Command[
      SelectObjectContentCommandInput,
      SelectObjectContentCommandOutput
    ]

object SelectObjectContentCommand {
  def apply(
      input: SelectObjectContentCommandInput
  ): SelectObjectContentCommand =
    new SelectObjectContentCommand(
      input
    )
}

@js.native
@JSImport(
  "@aws-sdk/client-s3",
  "UpdateBucketMetadataInventoryTableConfigurationCommand"
)
class UpdateBucketMetadataInventoryTableConfigurationCommand(
    override val input: UpdateBucketMetadataInventoryTableConfigurationCommandInput
) extends Command[
      UpdateBucketMetadataInventoryTableConfigurationCommandInput,
      UpdateBucketMetadataInventoryTableConfigurationCommandOutput
    ]

object UpdateBucketMetadataInventoryTableConfigurationCommand {
  def apply(
      input: UpdateBucketMetadataInventoryTableConfigurationCommandInput
  ): UpdateBucketMetadataInventoryTableConfigurationCommand =
    new UpdateBucketMetadataInventoryTableConfigurationCommand(
      input
    )
}

@js.native
@JSImport(
  "@aws-sdk/client-s3",
  "UpdateBucketMetadataJournalTableConfigurationCommand"
)
class UpdateBucketMetadataJournalTableConfigurationCommand(
    override val input: UpdateBucketMetadataJournalTableConfigurationCommandInput
) extends Command[
      UpdateBucketMetadataJournalTableConfigurationCommandInput,
      UpdateBucketMetadataJournalTableConfigurationCommandOutput
    ]

object UpdateBucketMetadataJournalTableConfigurationCommand {
  def apply(
      input: UpdateBucketMetadataJournalTableConfigurationCommandInput
  ): UpdateBucketMetadataJournalTableConfigurationCommand =
    new UpdateBucketMetadataJournalTableConfigurationCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "UpdateObjectEncryptionCommand")
class UpdateObjectEncryptionCommand(
    override val input: UpdateObjectEncryptionCommandInput
) extends Command[
      UpdateObjectEncryptionCommandInput,
      UpdateObjectEncryptionCommandOutput
    ]

object UpdateObjectEncryptionCommand {
  def apply(
      input: UpdateObjectEncryptionCommandInput
  ): UpdateObjectEncryptionCommand =
    new UpdateObjectEncryptionCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "UploadPartCommand")
class UploadPartCommand(override val input: UploadPartCommandInput)
    extends Command[UploadPartCommandInput, UploadPartCommandOutput]

object UploadPartCommand {
  def apply(input: UploadPartCommandInput): UploadPartCommand =
    new UploadPartCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "UploadPartCopyCommand")
class UploadPartCopyCommand(override val input: UploadPartCopyCommandInput)
    extends Command[UploadPartCopyCommandInput, UploadPartCopyCommandOutput]

object UploadPartCopyCommand {
  def apply(input: UploadPartCopyCommandInput): UploadPartCopyCommand =
    new UploadPartCopyCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-s3", "WriteGetObjectResponseCommand")
class WriteGetObjectResponseCommand(
    override val input: WriteGetObjectResponseCommandInput
) extends Command[
      WriteGetObjectResponseCommandInput,
      WriteGetObjectResponseCommandOutput
    ]

object WriteGetObjectResponseCommand {
  def apply(
      input: WriteGetObjectResponseCommandInput
  ): WriteGetObjectResponseCommand =
    new WriteGetObjectResponseCommand(
      input
    )
}
