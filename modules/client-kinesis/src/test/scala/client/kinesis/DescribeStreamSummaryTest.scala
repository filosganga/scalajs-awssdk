package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import models.*
import commands.*

class DescribeStreamSummaryTest
    extends munit.CatsEffectSuite
    with KinesisFixtures {

  ResourceFunFixture {
    for {
      client <- clientR
      streamName <- streamR(client)
    } yield (client, streamName)
  }.test("DescribeStreamSummary should return stream summary") {
    case (client, streamName) =>
      for {
        result <- client.sendIO(
          DescribeStreamSummaryCommand(
            DescribeStreamSummaryCommandInput(StreamName = streamName)
          )
        )
      } yield {
        assert(result.StreamDescriptionSummary.isDefined)
        val summary = result.StreamDescriptionSummary.get
        assertEquals(summary.StreamName.toOption, Some(streamName))
        assertEquals(
          summary.StreamStatus.toOption,
          Some(StreamStatus.ACTIVE)
        )
        assert(summary.StreamARN.isDefined)
        assert(summary.OpenShardCount.isDefined)
        assertEquals(summary.OpenShardCount.toOption, Some(1))
      }
  }

}
