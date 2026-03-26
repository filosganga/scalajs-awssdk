package com.filippodeluca.jsfacade.awssdk
package client
package kinesis
package models

import com.filippodeluca.jsfacade.awssdk.types._
import scalajs.js

@js.native
trait CreateStreamCommandInput extends js.Object {
  val StreamName: js.UndefOr[String] = js.native
  val ShardCount: js.UndefOr[Int] = js.native
  val StreamModeDetails: js.UndefOr[StreamModeDetails] = js.native
  val Tags: js.UndefOr[js.Dictionary[String]] = js.native
  val WarmThroughputMiBps: js.UndefOr[Double] = js.native
  val MaxRecordSizeInKiB: js.UndefOr[Double] = js.native
}

object CreateStreamCommandInput {
  def apply(
      StreamName: js.UndefOr[String] = js.undefined,
      ShardCount: js.UndefOr[Int] = js.undefined,
      StreamModeDetails: js.UndefOr[StreamModeDetails] = js.undefined,
      Tags: js.UndefOr[js.Dictionary[String]] = js.undefined,
      WarmThroughputMiBps: js.UndefOr[Double] = js.undefined,
      MaxRecordSizeInKiB: js.UndefOr[Double] = js.undefined
  ): CreateStreamCommandInput = {
    js.Dynamic
      .literal(
        StreamName = StreamName.asInstanceOf[js.Any],
        ShardCount = ShardCount.asInstanceOf[js.Any],
        StreamModeDetails = StreamModeDetails.asInstanceOf[js.Any],
        Tags = Tags.asInstanceOf[js.Any],
        WarmThroughputMiBps = WarmThroughputMiBps.asInstanceOf[js.Any],
        MaxRecordSizeInKiB = MaxRecordSizeInKiB.asInstanceOf[js.Any]
      )
      .asInstanceOf[CreateStreamCommandInput]
  }
}

@js.native
trait CreateStreamCommandOutput extends MetadataBearer

@js.native
trait DeleteStreamCommandInput extends js.Object {
  val StreamName: js.UndefOr[String] = js.native
  val EnforceConsumerDeletion: js.UndefOr[Boolean] = js.native
  val StreamARN: js.UndefOr[String] = js.native
  val StreamId: js.UndefOr[String] = js.native
}

object DeleteStreamCommandInput {
  def apply(
      StreamName: js.UndefOr[String] = js.undefined,
      EnforceConsumerDeletion: js.UndefOr[Boolean] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined,
      StreamId: js.UndefOr[String] = js.undefined
  ): DeleteStreamCommandInput = {
    js.Dynamic
      .literal(
        StreamName = StreamName.asInstanceOf[js.Any],
        EnforceConsumerDeletion = EnforceConsumerDeletion.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any],
        StreamId = StreamId.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeleteStreamCommandInput]
  }
}

@js.native
trait DeleteStreamCommandOutput extends MetadataBearer

@js.native
trait DescribeStreamCommandInput extends js.Object {
  val StreamName: js.UndefOr[String] = js.native
  val Limit: js.UndefOr[Int] = js.native
  val ExclusiveStartShardId: js.UndefOr[String] = js.native
  val StreamARN: js.UndefOr[String] = js.native
  val StreamId: js.UndefOr[String] = js.native
}

object DescribeStreamCommandInput {
  def apply(
      StreamName: js.UndefOr[String] = js.undefined,
      Limit: js.UndefOr[Int] = js.undefined,
      ExclusiveStartShardId: js.UndefOr[String] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined,
      StreamId: js.UndefOr[String] = js.undefined
  ): DescribeStreamCommandInput = {
    js.Dynamic
      .literal(
        StreamName = StreamName.asInstanceOf[js.Any],
        Limit = Limit.asInstanceOf[js.Any],
        ExclusiveStartShardId = ExclusiveStartShardId.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any],
        StreamId = StreamId.asInstanceOf[js.Any]
      )
      .asInstanceOf[DescribeStreamCommandInput]
  }
}

@js.native
trait DescribeStreamCommandOutput extends MetadataBearer {
  val StreamDescription: js.UndefOr[StreamDescription] = js.native
}

@js.native
trait DescribeStreamSummaryCommandInput extends js.Object {
  val StreamName: js.UndefOr[String] = js.native
  val StreamARN: js.UndefOr[String] = js.native
  val StreamId: js.UndefOr[String] = js.native
}

object DescribeStreamSummaryCommandInput {
  def apply(
      StreamName: js.UndefOr[String] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined,
      StreamId: js.UndefOr[String] = js.undefined
  ): DescribeStreamSummaryCommandInput = {
    js.Dynamic
      .literal(
        StreamName = StreamName.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any],
        StreamId = StreamId.asInstanceOf[js.Any]
      )
      .asInstanceOf[DescribeStreamSummaryCommandInput]
  }
}

@js.native
trait DescribeStreamSummaryCommandOutput extends MetadataBearer {
  val StreamDescriptionSummary: js.UndefOr[StreamDescriptionSummary] = js.native
}

@js.native
trait ListShardsCommandInput extends js.Object {
  val StreamName: js.UndefOr[String] = js.native
  val NextToken: js.UndefOr[String] = js.native
  val ExclusiveStartShardId: js.UndefOr[String] = js.native
  val MaxResults: js.UndefOr[Int] = js.native
  val StreamCreationTimestamp: js.UndefOr[js.Date] = js.native
  val ShardFilter: js.UndefOr[ShardFilter] = js.native
  val StreamARN: js.UndefOr[String] = js.native
  val StreamId: js.UndefOr[String] = js.native
}

object ListShardsCommandInput {
  def apply(
      StreamName: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      ExclusiveStartShardId: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      StreamCreationTimestamp: js.UndefOr[js.Date] = js.undefined,
      ShardFilter: js.UndefOr[ShardFilter] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined,
      StreamId: js.UndefOr[String] = js.undefined
  ): ListShardsCommandInput = {
    js.Dynamic
      .literal(
        StreamName = StreamName.asInstanceOf[js.Any],
        NextToken = NextToken.asInstanceOf[js.Any],
        ExclusiveStartShardId = ExclusiveStartShardId.asInstanceOf[js.Any],
        MaxResults = MaxResults.asInstanceOf[js.Any],
        StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any],
        ShardFilter = ShardFilter.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any],
        StreamId = StreamId.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListShardsCommandInput]
  }
}

@js.native
trait ListShardsCommandOutput extends MetadataBearer {
  val Shards: js.UndefOr[js.Array[Shard]] = js.native
  val NextToken: js.UndefOr[String] = js.native
}

@js.native
trait ListStreamsCommandInput extends js.Object {
  val Limit: js.UndefOr[Int] = js.native
  val ExclusiveStartStreamName: js.UndefOr[String] = js.native
  val NextToken: js.UndefOr[String] = js.native
}

object ListStreamsCommandInput {
  def apply(
      Limit: js.UndefOr[Int] = js.undefined,
      ExclusiveStartStreamName: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
  ): ListStreamsCommandInput = {
    js.Dynamic
      .literal(
        Limit = Limit.asInstanceOf[js.Any],
        ExclusiveStartStreamName =
          ExclusiveStartStreamName.asInstanceOf[js.Any],
        NextToken = NextToken.asInstanceOf[js.Any]
      )
      .asInstanceOf[ListStreamsCommandInput]
  }
}

@js.native
trait ListStreamsCommandOutput extends MetadataBearer {
  val StreamNames: js.UndefOr[js.Array[String]] = js.native
  val HasMoreStreams: js.UndefOr[Boolean] = js.native
  val NextToken: js.UndefOr[String] = js.native
  val StreamSummaries: js.UndefOr[js.Array[StreamSummary]] = js.native
}

@js.native
trait StreamModeDetails extends js.Object {
  val StreamMode: js.UndefOr[StreamMode] = js.native
}

object StreamModeDetails {
  def apply(
      StreamMode: js.UndefOr[StreamMode] = js.undefined
  ): StreamModeDetails = {
    js.Dynamic
      .literal(
        StreamMode = StreamMode.asInstanceOf[js.Any]
      )
      .asInstanceOf[StreamModeDetails]
  }
}

@js.native
trait StreamDescription extends js.Object {
  val StreamName: js.UndefOr[String] = js.native
  val StreamARN: js.UndefOr[String] = js.native
  val StreamStatus: js.UndefOr[StreamStatus] = js.native
  val StreamModeDetails: js.UndefOr[StreamModeDetails] = js.native
  val Shards: js.UndefOr[js.Array[Shard]] = js.native
  val HasMoreShards: js.UndefOr[Boolean] = js.native
  val RetentionPeriodHours: js.UndefOr[Int] = js.native
  val StreamCreationTimestamp: js.UndefOr[js.Date] = js.native
  val EnhancedMonitoring: js.UndefOr[js.Array[EnhancedMetrics]] = js.native
  val EncryptionType: js.UndefOr[EncryptionType] = js.native
  val KeyId: js.UndefOr[String] = js.native
}

object StreamDescription {
  def apply(
      StreamName: js.UndefOr[String] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined,
      StreamStatus: js.UndefOr[StreamStatus] = js.undefined,
      StreamModeDetails: js.UndefOr[StreamModeDetails] = js.undefined,
      Shards: js.UndefOr[js.Array[Shard]] = js.undefined,
      HasMoreShards: js.UndefOr[Boolean] = js.undefined,
      RetentionPeriodHours: js.UndefOr[Int] = js.undefined,
      StreamCreationTimestamp: js.UndefOr[js.Date] = js.undefined,
      EnhancedMonitoring: js.UndefOr[js.Array[EnhancedMetrics]] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
      KeyId: js.UndefOr[String] = js.undefined
  ): StreamDescription = {
    js.Dynamic
      .literal(
        StreamName = StreamName.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any],
        StreamStatus = StreamStatus.asInstanceOf[js.Any],
        StreamModeDetails = StreamModeDetails.asInstanceOf[js.Any],
        Shards = Shards.asInstanceOf[js.Any],
        HasMoreShards = HasMoreShards.asInstanceOf[js.Any],
        RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any],
        StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any],
        EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any],
        EncryptionType = EncryptionType.asInstanceOf[js.Any],
        KeyId = KeyId.asInstanceOf[js.Any]
      )
      .asInstanceOf[StreamDescription]
  }
}

@js.native
trait Shard extends js.Object {
  val ShardId: js.UndefOr[String] = js.native
  val ParentShardId: js.UndefOr[String] = js.native
  val AdjacentParentShardId: js.UndefOr[String] = js.native
  val HashKeyRange: js.UndefOr[HashKeyRange] = js.native
  val SequenceNumberRange: js.UndefOr[SequenceNumberRange] = js.native
}

object Shard {
  def apply(
      ShardId: js.UndefOr[String] = js.undefined,
      ParentShardId: js.UndefOr[String] = js.undefined,
      AdjacentParentShardId: js.UndefOr[String] = js.undefined,
      HashKeyRange: js.UndefOr[HashKeyRange] = js.undefined,
      SequenceNumberRange: js.UndefOr[SequenceNumberRange] = js.undefined
  ): Shard = {
    js.Dynamic
      .literal(
        ShardId = ShardId.asInstanceOf[js.Any],
        ParentShardId = ParentShardId.asInstanceOf[js.Any],
        AdjacentParentShardId = AdjacentParentShardId.asInstanceOf[js.Any],
        HashKeyRange = HashKeyRange.asInstanceOf[js.Any],
        SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any]
      )
      .asInstanceOf[Shard]
  }
}

@js.native
trait HashKeyRange extends js.Object {
  val StartingHashKey: js.UndefOr[String] = js.native
  val EndingHashKey: js.UndefOr[String] = js.native
}

object HashKeyRange {
  def apply(
      StartingHashKey: js.UndefOr[String] = js.undefined,
      EndingHashKey: js.UndefOr[String] = js.undefined
  ): HashKeyRange = {
    js.Dynamic
      .literal(
        StartingHashKey = StartingHashKey.asInstanceOf[js.Any],
        EndingHashKey = EndingHashKey.asInstanceOf[js.Any]
      )
      .asInstanceOf[HashKeyRange]
  }
}

@js.native
trait SequenceNumberRange extends js.Object {
  val StartingSequenceNumber: js.UndefOr[String] = js.native
  val EndingSequenceNumber: js.UndefOr[String] = js.native
}

object SequenceNumberRange {
  def apply(
      StartingSequenceNumber: js.UndefOr[String] = js.undefined,
      EndingSequenceNumber: js.UndefOr[String] = js.undefined
  ): SequenceNumberRange = {
    js.Dynamic
      .literal(
        StartingSequenceNumber = StartingSequenceNumber.asInstanceOf[js.Any],
        EndingSequenceNumber = EndingSequenceNumber.asInstanceOf[js.Any]
      )
      .asInstanceOf[SequenceNumberRange]
  }
}

@js.native
trait EnhancedMetrics extends js.Object {
  val ShardLevelMetrics: js.UndefOr[js.Array[MetricsName]] = js.native
}

object EnhancedMetrics {
  def apply(
      ShardLevelMetrics: js.UndefOr[js.Array[MetricsName]] = js.undefined
  ): EnhancedMetrics = {
    js.Dynamic
      .literal(
        ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any]
      )
      .asInstanceOf[EnhancedMetrics]
  }
}

@js.native
trait StreamDescriptionSummary extends js.Object {
  val StreamName: js.UndefOr[String] = js.native
  val StreamARN: js.UndefOr[String] = js.native
  val StreamId: js.UndefOr[String] = js.native
  val StreamStatus: js.UndefOr[StreamStatus] = js.native
  val StreamModeDetails: js.UndefOr[StreamModeDetails] = js.native
  val RetentionPeriodHours: js.UndefOr[Int] = js.native
  val StreamCreationTimestamp: js.UndefOr[js.Date] = js.native
  val EnhancedMonitoring: js.UndefOr[js.Array[EnhancedMetrics]] = js.native
  val EncryptionType: js.UndefOr[EncryptionType] = js.native
  val KeyId: js.UndefOr[String] = js.native
  val OpenShardCount: js.UndefOr[Int] = js.native
  val ConsumerCount: js.UndefOr[Int] = js.native
  val WarmThroughput: js.UndefOr[WarmThroughputObject] = js.native
  val MaxRecordSizeInKiB: js.UndefOr[Double] = js.native
}

object StreamDescriptionSummary {
  def apply(
      StreamName: js.UndefOr[String] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined,
      StreamId: js.UndefOr[String] = js.undefined,
      StreamStatus: js.UndefOr[StreamStatus] = js.undefined,
      StreamModeDetails: js.UndefOr[StreamModeDetails] = js.undefined,
      RetentionPeriodHours: js.UndefOr[Int] = js.undefined,
      StreamCreationTimestamp: js.UndefOr[js.Date] = js.undefined,
      EnhancedMonitoring: js.UndefOr[js.Array[EnhancedMetrics]] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
      KeyId: js.UndefOr[String] = js.undefined,
      OpenShardCount: js.UndefOr[Int] = js.undefined,
      ConsumerCount: js.UndefOr[Int] = js.undefined,
      WarmThroughput: js.UndefOr[WarmThroughputObject] = js.undefined,
      MaxRecordSizeInKiB: js.UndefOr[Double] = js.undefined
  ): StreamDescriptionSummary = {
    js.Dynamic
      .literal(
        StreamName = StreamName.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any],
        StreamId = StreamId.asInstanceOf[js.Any],
        StreamStatus = StreamStatus.asInstanceOf[js.Any],
        StreamModeDetails = StreamModeDetails.asInstanceOf[js.Any],
        RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any],
        StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any],
        EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any],
        EncryptionType = EncryptionType.asInstanceOf[js.Any],
        KeyId = KeyId.asInstanceOf[js.Any],
        OpenShardCount = OpenShardCount.asInstanceOf[js.Any],
        ConsumerCount = ConsumerCount.asInstanceOf[js.Any],
        WarmThroughput = WarmThroughput.asInstanceOf[js.Any],
        MaxRecordSizeInKiB = MaxRecordSizeInKiB.asInstanceOf[js.Any]
      )
      .asInstanceOf[StreamDescriptionSummary]
  }
}

@js.native
trait WarmThroughputObject extends js.Object {
  val TargetMiBps: js.UndefOr[Double] = js.native
  val CurrentMiBps: js.UndefOr[Double] = js.native
}

object WarmThroughputObject {
  def apply(
      TargetMiBps: js.UndefOr[Double] = js.undefined,
      CurrentMiBps: js.UndefOr[Double] = js.undefined
  ): WarmThroughputObject = {
    js.Dynamic
      .literal(
        TargetMiBps = TargetMiBps.asInstanceOf[js.Any],
        CurrentMiBps = CurrentMiBps.asInstanceOf[js.Any]
      )
      .asInstanceOf[WarmThroughputObject]
  }
}

@js.native
trait ShardFilter extends js.Object {
  val Type: js.UndefOr[ShardFilterType] = js.native
  val ShardId: js.UndefOr[String] = js.native
  val Timestamp: js.UndefOr[js.Date] = js.native
}

object ShardFilter {
  def apply(
      Type: js.UndefOr[ShardFilterType] = js.undefined,
      ShardId: js.UndefOr[String] = js.undefined,
      Timestamp: js.UndefOr[js.Date] = js.undefined
  ): ShardFilter = {
    js.Dynamic
      .literal(
        Type = Type.asInstanceOf[js.Any],
        ShardId = ShardId.asInstanceOf[js.Any],
        Timestamp = Timestamp.asInstanceOf[js.Any]
      )
      .asInstanceOf[ShardFilter]
  }
}

@js.native
trait StreamSummary extends js.Object {
  val StreamName: js.UndefOr[String] = js.native
  val StreamARN: js.UndefOr[String] = js.native
  val StreamStatus: js.UndefOr[StreamStatus] = js.native
  val StreamModeDetails: js.UndefOr[StreamModeDetails] = js.native
  val StreamCreationTimestamp: js.UndefOr[js.Date] = js.native
}

object StreamSummary {
  def apply(
      StreamName: js.UndefOr[String] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined,
      StreamStatus: js.UndefOr[StreamStatus] = js.undefined,
      StreamModeDetails: js.UndefOr[StreamModeDetails] = js.undefined,
      StreamCreationTimestamp: js.UndefOr[js.Date] = js.undefined
  ): StreamSummary = {
    js.Dynamic
      .literal(
        StreamName = StreamName.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any],
        StreamStatus = StreamStatus.asInstanceOf[js.Any],
        StreamModeDetails = StreamModeDetails.asInstanceOf[js.Any],
        StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any]
      )
      .asInstanceOf[StreamSummary]
  }
}

@js.native
trait PutRecordCommandInput extends js.Object {
  val StreamName: js.UndefOr[String] = js.native
  val Data: js.UndefOr[js.typedarray.Uint8Array] = js.native
  val PartitionKey: js.UndefOr[String] = js.native
  val ExplicitHashKey: js.UndefOr[String] = js.native
  val SequenceNumberForOrdering: js.UndefOr[String] = js.native
  val StreamARN: js.UndefOr[String] = js.native
}

object PutRecordCommandInput {
  def apply(
      StreamName: js.UndefOr[String] = js.undefined,
      Data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined,
      PartitionKey: js.UndefOr[String] = js.undefined,
      ExplicitHashKey: js.UndefOr[String] = js.undefined,
      SequenceNumberForOrdering: js.UndefOr[String] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined
  ): PutRecordCommandInput = {
    js.Dynamic
      .literal(
        StreamName = StreamName.asInstanceOf[js.Any],
        Data = Data.asInstanceOf[js.Any],
        PartitionKey = PartitionKey.asInstanceOf[js.Any],
        ExplicitHashKey = ExplicitHashKey.asInstanceOf[js.Any],
        SequenceNumberForOrdering =
          SequenceNumberForOrdering.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutRecordCommandInput]
  }
}

@js.native
trait PutRecordCommandOutput extends MetadataBearer {
  val ShardId: js.UndefOr[String] = js.native
  val SequenceNumber: js.UndefOr[String] = js.native
  val EncryptionType: js.UndefOr[EncryptionType] = js.native
}

@js.native
trait PutRecordsCommandInput extends js.Object {
  val Records: js.UndefOr[js.Array[PutRecordsRequestEntry]] = js.native
  val StreamName: js.UndefOr[String] = js.native
  val StreamARN: js.UndefOr[String] = js.native
}

object PutRecordsCommandInput {
  def apply(
      Records: js.UndefOr[js.Array[PutRecordsRequestEntry]] = js.undefined,
      StreamName: js.UndefOr[String] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined
  ): PutRecordsCommandInput = {
    js.Dynamic
      .literal(
        Records = Records.asInstanceOf[js.Any],
        StreamName = StreamName.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutRecordsCommandInput]
  }
}

@js.native
trait PutRecordsCommandOutput extends MetadataBearer {
  val FailedRecordCount: js.UndefOr[Int] = js.native
  val Records: js.UndefOr[js.Array[PutRecordsResultEntry]] = js.native
  val EncryptionType: js.UndefOr[EncryptionType] = js.native
}

@js.native
trait PutRecordsRequestEntry extends js.Object {
  val Data: js.UndefOr[js.typedarray.Uint8Array] = js.native
  val ExplicitHashKey: js.UndefOr[String] = js.native
  val PartitionKey: js.UndefOr[String] = js.native
}

object PutRecordsRequestEntry {
  def apply(
      Data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined,
      ExplicitHashKey: js.UndefOr[String] = js.undefined,
      PartitionKey: js.UndefOr[String] = js.undefined
  ): PutRecordsRequestEntry = {
    js.Dynamic
      .literal(
        Data = Data.asInstanceOf[js.Any],
        ExplicitHashKey = ExplicitHashKey.asInstanceOf[js.Any],
        PartitionKey = PartitionKey.asInstanceOf[js.Any]
      )
      .asInstanceOf[PutRecordsRequestEntry]
  }
}

@js.native
trait PutRecordsResultEntry extends js.Object {
  val SequenceNumber: js.UndefOr[String] = js.native
  val ShardId: js.UndefOr[String] = js.native
  val ErrorCode: js.UndefOr[String] = js.native
  val ErrorMessage: js.UndefOr[String] = js.native
}

@js.native
trait GetShardIteratorCommandInput extends js.Object {
  val StreamName: js.UndefOr[String] = js.native
  val ShardId: js.UndefOr[String] = js.native
  val ShardIteratorType: js.UndefOr[ShardIteratorType] = js.native
  val StartingSequenceNumber: js.UndefOr[String] = js.native
  val Timestamp: js.UndefOr[js.Date] = js.native
  val StreamARN: js.UndefOr[String] = js.native
}

object GetShardIteratorCommandInput {
  def apply(
      StreamName: js.UndefOr[String] = js.undefined,
      ShardId: js.UndefOr[String] = js.undefined,
      ShardIteratorType: js.UndefOr[ShardIteratorType] = js.undefined,
      StartingSequenceNumber: js.UndefOr[String] = js.undefined,
      Timestamp: js.UndefOr[js.Date] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined
  ): GetShardIteratorCommandInput = {
    js.Dynamic
      .literal(
        StreamName = StreamName.asInstanceOf[js.Any],
        ShardId = ShardId.asInstanceOf[js.Any],
        ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any],
        StartingSequenceNumber = StartingSequenceNumber.asInstanceOf[js.Any],
        Timestamp = Timestamp.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetShardIteratorCommandInput]
  }
}

@js.native
trait GetShardIteratorCommandOutput extends MetadataBearer {
  val ShardIterator: js.UndefOr[String] = js.native
}

@js.native
trait GetRecordsCommandInput extends js.Object {
  val ShardIterator: js.UndefOr[String] = js.native
  val Limit: js.UndefOr[Int] = js.native
  val StreamARN: js.UndefOr[String] = js.native
}

object GetRecordsCommandInput {
  def apply(
      ShardIterator: js.UndefOr[String] = js.undefined,
      Limit: js.UndefOr[Int] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined
  ): GetRecordsCommandInput = {
    js.Dynamic
      .literal(
        ShardIterator = ShardIterator.asInstanceOf[js.Any],
        Limit = Limit.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any]
      )
      .asInstanceOf[GetRecordsCommandInput]
  }
}

@js.native
trait GetRecordsCommandOutput extends MetadataBearer {
  val Records: js.UndefOr[js.Array[Record]] = js.native
  val NextShardIterator: js.UndefOr[String] = js.native
  val MillisBehindLatest: js.UndefOr[Double] = js.native
  val ChildShards: js.UndefOr[js.Array[ChildShard]] = js.native
}

@js.native
trait Record extends js.Object {
  val SequenceNumber: js.UndefOr[String] = js.native
  val ApproximateArrivalTimestamp: js.UndefOr[js.Date] = js.native
  val Data: js.UndefOr[js.typedarray.Uint8Array] = js.native
  val PartitionKey: js.UndefOr[String] = js.native
  val EncryptionType: js.UndefOr[EncryptionType] = js.native
}

@js.native
trait ChildShard extends js.Object {
  val ShardId: js.UndefOr[String] = js.native
  val ParentShards: js.UndefOr[js.Array[String]] = js.native
  val HashKeyRange: js.UndefOr[HashKeyRange] = js.native
}

@js.native
trait RegisterStreamConsumerCommandInput extends js.Object {
  val StreamARN: js.UndefOr[String] = js.native
  val ConsumerName: js.UndefOr[String] = js.native
  val Tags: js.UndefOr[js.Dictionary[String]] = js.native
}

object RegisterStreamConsumerCommandInput {
  def apply(
      StreamARN: js.UndefOr[String] = js.undefined,
      ConsumerName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[js.Dictionary[String]] = js.undefined
  ): RegisterStreamConsumerCommandInput = {
    js.Dynamic
      .literal(
        StreamARN = StreamARN.asInstanceOf[js.Any],
        ConsumerName = ConsumerName.asInstanceOf[js.Any],
        Tags = Tags.asInstanceOf[js.Any]
      )
      .asInstanceOf[RegisterStreamConsumerCommandInput]
  }
}

@js.native
trait RegisterStreamConsumerCommandOutput extends MetadataBearer {
  val Consumer: js.UndefOr[Consumer] = js.native
}

@js.native
trait Consumer extends js.Object {
  val ConsumerName: js.UndefOr[String] = js.native
  val ConsumerARN: js.UndefOr[String] = js.native
  val ConsumerStatus: js.UndefOr[ConsumerStatus] = js.native
  val ConsumerCreationTimestamp: js.UndefOr[js.Date] = js.native
}

@js.native
trait DeregisterStreamConsumerCommandInput extends js.Object {
  val StreamARN: js.UndefOr[String] = js.native
  val ConsumerName: js.UndefOr[String] = js.native
  val ConsumerARN: js.UndefOr[String] = js.native
}

object DeregisterStreamConsumerCommandInput {
  def apply(
      StreamARN: js.UndefOr[String] = js.undefined,
      ConsumerName: js.UndefOr[String] = js.undefined,
      ConsumerARN: js.UndefOr[String] = js.undefined
  ): DeregisterStreamConsumerCommandInput = {
    js.Dynamic
      .literal(
        StreamARN = StreamARN.asInstanceOf[js.Any],
        ConsumerName = ConsumerName.asInstanceOf[js.Any],
        ConsumerARN = ConsumerARN.asInstanceOf[js.Any]
      )
      .asInstanceOf[DeregisterStreamConsumerCommandInput]
  }
}

@js.native
trait DeregisterStreamConsumerCommandOutput extends MetadataBearer

@js.native
trait DescribeStreamConsumerCommandInput extends js.Object {
  val StreamARN: js.UndefOr[String] = js.native
  val ConsumerName: js.UndefOr[String] = js.native
  val ConsumerARN: js.UndefOr[String] = js.native
}

object DescribeStreamConsumerCommandInput {
  def apply(
      StreamARN: js.UndefOr[String] = js.undefined,
      ConsumerName: js.UndefOr[String] = js.undefined,
      ConsumerARN: js.UndefOr[String] = js.undefined
  ): DescribeStreamConsumerCommandInput = {
    js.Dynamic
      .literal(
        StreamARN = StreamARN.asInstanceOf[js.Any],
        ConsumerName = ConsumerName.asInstanceOf[js.Any],
        ConsumerARN = ConsumerARN.asInstanceOf[js.Any]
      )
      .asInstanceOf[DescribeStreamConsumerCommandInput]
  }
}

@js.native
trait DescribeStreamConsumerCommandOutput extends MetadataBearer {
  val ConsumerDescription: js.UndefOr[ConsumerDescription] = js.native
}

@js.native
trait ConsumerDescription extends js.Object {
  val ConsumerName: js.UndefOr[String] = js.native
  val ConsumerARN: js.UndefOr[String] = js.native
  val ConsumerStatus: js.UndefOr[ConsumerStatus] = js.native
  val ConsumerCreationTimestamp: js.UndefOr[js.Date] = js.native
  val StreamARN: js.UndefOr[String] = js.native
}

@js.native
trait SubscribeToShardCommandInput extends js.Object {
  val ConsumerARN: js.UndefOr[String] = js.native
  val ShardId: js.UndefOr[String] = js.native
  val StartingPosition: js.UndefOr[StartingPosition] = js.native
}

object SubscribeToShardCommandInput {
  def apply(
      ConsumerARN: js.UndefOr[String] = js.undefined,
      ShardId: js.UndefOr[String] = js.undefined,
      StartingPosition: js.UndefOr[StartingPosition] = js.undefined
  ): SubscribeToShardCommandInput = {
    js.Dynamic
      .literal(
        ConsumerARN = ConsumerARN.asInstanceOf[js.Any],
        ShardId = ShardId.asInstanceOf[js.Any],
        StartingPosition = StartingPosition.asInstanceOf[js.Any]
      )
      .asInstanceOf[SubscribeToShardCommandInput]
  }
}

@js.native
trait SubscribeToShardCommandOutput extends MetadataBearer {
  val EventStream: js.UndefOr[AsyncIterable[SubscribeToShardEventStream]] =
    js.native
}

@js.native
trait StartingPosition extends js.Object {
  val Type: js.UndefOr[ShardIteratorType] = js.native
  val SequenceNumber: js.UndefOr[String] = js.native
  val Timestamp: js.UndefOr[js.Date] = js.native
}

object StartingPosition {
  def apply(
      Type: js.UndefOr[ShardIteratorType] = js.undefined,
      SequenceNumber: js.UndefOr[String] = js.undefined,
      Timestamp: js.UndefOr[js.Date] = js.undefined
  ): StartingPosition = {
    js.Dynamic
      .literal(
        Type = Type.asInstanceOf[js.Any],
        SequenceNumber = SequenceNumber.asInstanceOf[js.Any],
        Timestamp = Timestamp.asInstanceOf[js.Any]
      )
      .asInstanceOf[StartingPosition]
  }
}

/** Tagged union for SubscribeToShard events. In the JS SDK this is a
  * discriminated union that can also carry error variants
  * (ResourceNotFoundException, KMSDisabledException, InternalFailureException,
  * etc.). Only the happy-path SubscribeToShardEvent member is modeled here;
  * error cases surface as failed promises / IO errors instead.
  */
@js.native
trait SubscribeToShardEventStream extends js.Object {
  val SubscribeToShardEvent: js.UndefOr[SubscribeToShardEvent] = js.native
}

@js.native
trait SubscribeToShardEvent extends js.Object {
  val Records: js.UndefOr[js.Array[Record]] = js.native
  val ContinuationSequenceNumber: js.UndefOr[String] = js.native
  val MillisBehindLatest: js.UndefOr[Double] = js.native
  val ChildShards: js.UndefOr[js.Array[ChildShard]] = js.native
}

// Enum types

sealed trait StreamMode extends js.Any
object StreamMode {
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[StreamMode]
  val PROVISIONED = "PROVISIONED".asInstanceOf[StreamMode]
}

sealed trait EncryptionType extends js.Any
object EncryptionType {
  val KMS = "KMS".asInstanceOf[EncryptionType]
  val NONE = "NONE".asInstanceOf[EncryptionType]
}

sealed trait MetricsName extends js.Any
object MetricsName {
  val ALL = "ALL".asInstanceOf[MetricsName]
  val INCOMING_BYTES = "IncomingBytes".asInstanceOf[MetricsName]
  val INCOMING_RECORDS = "IncomingRecords".asInstanceOf[MetricsName]
  val ITERATOR_AGE_MILLISECONDS =
    "IteratorAgeMilliseconds".asInstanceOf[MetricsName]
  val OUTGOING_BYTES = "OutgoingBytes".asInstanceOf[MetricsName]
  val OUTGOING_RECORDS = "OutgoingRecords".asInstanceOf[MetricsName]
  val READ_PROVISIONED_THROUGHPUT_EXCEEDED =
    "ReadProvisionedThroughputExceeded".asInstanceOf[MetricsName]
  val WRITE_PROVISIONED_THROUGHPUT_EXCEEDED =
    "WriteProvisionedThroughputExceeded".asInstanceOf[MetricsName]
}

sealed trait StreamStatus extends js.Any
object StreamStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[StreamStatus]
  val CREATING = "CREATING".asInstanceOf[StreamStatus]
  val DELETING = "DELETING".asInstanceOf[StreamStatus]
  val UPDATING = "UPDATING".asInstanceOf[StreamStatus]
}

sealed trait ShardFilterType extends js.Any
object ShardFilterType {
  val AFTER_SHARD_ID = "AFTER_SHARD_ID".asInstanceOf[ShardFilterType]
  val AT_LATEST = "AT_LATEST".asInstanceOf[ShardFilterType]
  val AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[ShardFilterType]
  val AT_TRIM_HORIZON = "AT_TRIM_HORIZON".asInstanceOf[ShardFilterType]
  val FROM_TIMESTAMP = "FROM_TIMESTAMP".asInstanceOf[ShardFilterType]
  val FROM_TRIM_HORIZON = "FROM_TRIM_HORIZON".asInstanceOf[ShardFilterType]
}

sealed trait ShardIteratorType extends js.Any
object ShardIteratorType {
  val AFTER_SEQUENCE_NUMBER =
    "AFTER_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]
  val AT_SEQUENCE_NUMBER =
    "AT_SEQUENCE_NUMBER".asInstanceOf[ShardIteratorType]
  val AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[ShardIteratorType]
  val LATEST = "LATEST".asInstanceOf[ShardIteratorType]
  val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[ShardIteratorType]
}

sealed trait ConsumerStatus extends js.Any
object ConsumerStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ConsumerStatus]
  val CREATING = "CREATING".asInstanceOf[ConsumerStatus]
  val DELETING = "DELETING".asInstanceOf[ConsumerStatus]
}
