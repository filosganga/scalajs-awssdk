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
class DescribeStreamSummaryCommand(override val input: DescribeStreamSummaryCommandInput)
    extends Command[DescribeStreamSummaryCommandInput, DescribeStreamSummaryCommandOutput]

object DescribeStreamSummaryCommand {
  def apply(input: DescribeStreamSummaryCommandInput): DescribeStreamSummaryCommand =
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
