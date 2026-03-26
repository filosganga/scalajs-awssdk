package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import models._
import commands._

class GetShardIteratorTest extends munit.CatsEffectSuite with KinesisFixtures {

  ResourceFunFixture {
    for {
      client <- clientR
      streamName <- streamR(client)
    } yield (client, streamName)
  }.test("GetShardIterator should return a shard iterator") {
    case (client, streamName) =>
      for {
        shards <- client.sendIO(
          ListShardsCommand(
            ListShardsCommandInput(StreamName = streamName)
          )
        )
        shardId = shards.Shards.get(0).ShardId.get
        result <- client.sendIO(
          GetShardIteratorCommand(
            GetShardIteratorCommandInput(
              StreamName = streamName,
              ShardId = shardId,
              ShardIteratorType = ShardIteratorType.TRIM_HORIZON
            )
          )
        )
      } yield {
        assert(result.ShardIterator.isDefined)
      }
  }

}
