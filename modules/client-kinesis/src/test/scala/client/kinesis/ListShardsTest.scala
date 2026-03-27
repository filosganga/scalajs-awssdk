package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import models.*
import commands.*

class ListShardsTest extends munit.CatsEffectSuite with KinesisFixtures {

  ResourceFunFixture {
    for {
      client <- clientR
      streamName <- streamR(client)
    } yield (client, streamName)
  }.test("ListShards should return shards for a stream") {
    case (client, streamName) =>
      for {
        result <- client.sendIO(
          ListShardsCommand(
            ListShardsCommandInput(StreamName = streamName)
          )
        )
      } yield {
        assert(result.Shards.isDefined)
        val shards = result.Shards.get
        assertEquals(shards.length, 1)
        assert(shards(0).ShardId.isDefined)
        assert(shards(0).HashKeyRange.isDefined)
        assert(shards(0).SequenceNumberRange.isDefined)
      }
  }

}
