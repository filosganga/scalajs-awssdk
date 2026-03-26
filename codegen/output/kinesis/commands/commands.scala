package com.filippodeluca.jsfacade.awssdk
package client
package kinesis
package commands

import com.filippodeluca.jsfacade.awssdk.client.kinesis.models.*
import scalajs.js
import scalajs.js.annotation.JSImport

@js.native
@JSImport("@aws-sdk/client-kinesis", "DescribeStreamConsumerCommand")
class DescribeStreamConsumerCommand(override val input: DescribeStreamConsumerCommandInput)
    extends Command[DescribeStreamConsumerCommandInput, DescribeStreamConsumerCommandOutput]

object DescribeStreamConsumerCommand {
  def apply(input: DescribeStreamConsumerCommandInput): DescribeStreamConsumerCommand =
    new DescribeStreamConsumerCommand(
      input
    )
}
