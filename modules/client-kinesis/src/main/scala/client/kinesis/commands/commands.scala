package com.filippodeluca.jsfacade.awssdk
package client
package kinesis
package commands

import com.filippodeluca.jsfacade.awssdk.client.kinesis.models._
import scalajs.js
import scalajs.js.annotation.JSImport

@js.native
@JSImport("@aws-sdk/client-kinesis", "CreateStreamCommand")
class CreateStreamCommand(override val input: CreateStreamCommandInput)
    extends Command[CreateStreamCommandInput, CreateStreamCommandOutput]

object CreateStreamCommand {
  def apply(input: CreateStreamCommandInput): CreateStreamCommand =
    new CreateStreamCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "DeleteStreamCommand")
class DeleteStreamCommand(override val input: DeleteStreamCommandInput)
    extends Command[DeleteStreamCommandInput, DeleteStreamCommandOutput]

object DeleteStreamCommand {
  def apply(input: DeleteStreamCommandInput): DeleteStreamCommand =
    new DeleteStreamCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "DescribeStreamCommand")
class DescribeStreamCommand(override val input: DescribeStreamCommandInput)
    extends Command[DescribeStreamCommandInput, DescribeStreamCommandOutput]

object DescribeStreamCommand {
  def apply(input: DescribeStreamCommandInput): DescribeStreamCommand =
    new DescribeStreamCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "DescribeStreamSummaryCommand")
class DescribeStreamSummaryCommand(
    override val input: DescribeStreamSummaryCommandInput
) extends Command[
      DescribeStreamSummaryCommandInput,
      DescribeStreamSummaryCommandOutput
    ]

object DescribeStreamSummaryCommand {
  def apply(
      input: DescribeStreamSummaryCommandInput
  ): DescribeStreamSummaryCommand =
    new DescribeStreamSummaryCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "ListShardsCommand")
class ListShardsCommand(override val input: ListShardsCommandInput)
    extends Command[ListShardsCommandInput, ListShardsCommandOutput]

object ListShardsCommand {
  def apply(input: ListShardsCommandInput): ListShardsCommand =
    new ListShardsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "ListStreamsCommand")
class ListStreamsCommand(override val input: ListStreamsCommandInput)
    extends Command[ListStreamsCommandInput, ListStreamsCommandOutput]

object ListStreamsCommand {
  def apply(input: ListStreamsCommandInput): ListStreamsCommand =
    new ListStreamsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "PutRecordCommand")
class PutRecordCommand(override val input: PutRecordCommandInput)
    extends Command[PutRecordCommandInput, PutRecordCommandOutput]

object PutRecordCommand {
  def apply(input: PutRecordCommandInput): PutRecordCommand =
    new PutRecordCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "PutRecordsCommand")
class PutRecordsCommand(override val input: PutRecordsCommandInput)
    extends Command[PutRecordsCommandInput, PutRecordsCommandOutput]

object PutRecordsCommand {
  def apply(input: PutRecordsCommandInput): PutRecordsCommand =
    new PutRecordsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "GetShardIteratorCommand")
class GetShardIteratorCommand(override val input: GetShardIteratorCommandInput)
    extends Command[GetShardIteratorCommandInput, GetShardIteratorCommandOutput]

object GetShardIteratorCommand {
  def apply(input: GetShardIteratorCommandInput): GetShardIteratorCommand =
    new GetShardIteratorCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "GetRecordsCommand")
class GetRecordsCommand(override val input: GetRecordsCommandInput)
    extends Command[GetRecordsCommandInput, GetRecordsCommandOutput]

object GetRecordsCommand {
  def apply(input: GetRecordsCommandInput): GetRecordsCommand =
    new GetRecordsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "RegisterStreamConsumerCommand")
class RegisterStreamConsumerCommand(
    override val input: RegisterStreamConsumerCommandInput
) extends Command[
      RegisterStreamConsumerCommandInput,
      RegisterStreamConsumerCommandOutput
    ]

object RegisterStreamConsumerCommand {
  def apply(
      input: RegisterStreamConsumerCommandInput
  ): RegisterStreamConsumerCommand =
    new RegisterStreamConsumerCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "DeregisterStreamConsumerCommand")
class DeregisterStreamConsumerCommand(
    override val input: DeregisterStreamConsumerCommandInput
) extends Command[
      DeregisterStreamConsumerCommandInput,
      DeregisterStreamConsumerCommandOutput
    ]

object DeregisterStreamConsumerCommand {
  def apply(
      input: DeregisterStreamConsumerCommandInput
  ): DeregisterStreamConsumerCommand =
    new DeregisterStreamConsumerCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "SubscribeToShardCommand")
class SubscribeToShardCommand(
    override val input: SubscribeToShardCommandInput
) extends Command[
      SubscribeToShardCommandInput,
      SubscribeToShardCommandOutput
    ]

object SubscribeToShardCommand {
  def apply(
      input: SubscribeToShardCommandInput
  ): SubscribeToShardCommand =
    new SubscribeToShardCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-kinesis", "DescribeStreamConsumerCommand")
class DescribeStreamConsumerCommand(
    override val input: DescribeStreamConsumerCommandInput
) extends Command[
      DescribeStreamConsumerCommandInput,
      DescribeStreamConsumerCommandOutput
    ]

object DescribeStreamConsumerCommand {
  def apply(
      input: DescribeStreamConsumerCommandInput
  ): DescribeStreamConsumerCommand =
    new DescribeStreamConsumerCommand(
      input
    )
}
