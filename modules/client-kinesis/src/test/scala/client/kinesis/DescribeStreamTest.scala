package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import models.*
import commands.*

class DescribeStreamTest extends munit.CatsEffectSuite with KinesisFixtures {

  ResourceFunFixture {
    for {
      client <- clientR
      streamName <- streamR(client)
    } yield (client, streamName)
  }.test("DescribeStream should return stream description") {
    case (client, streamName) =>
      for {
        result <- client.sendIO(
          DescribeStreamCommand(
            DescribeStreamCommandInput(StreamName = streamName)
          )
        )
      } yield {
        assert(result.StreamDescription.isDefined)
        val desc = result.StreamDescription.get
        assertEquals(desc.StreamName.toOption, Some(streamName))
        assertEquals(
          desc.StreamStatus.toOption,
          Some(StreamStatus.ACTIVE)
        )
        assert(desc.Shards.isDefined)
        assert(desc.StreamARN.isDefined)
      }
  }

}
