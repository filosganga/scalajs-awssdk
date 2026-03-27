package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import scala.concurrent.duration.*

import cats.effect.IO

import models.*
import commands.*
import scalajs.js

class GetRecordsTest extends munit.CatsEffectSuite with KinesisFixtures {

  ResourceFunFixture {
    for {
      client <- clientR
      streamName <- streamR(client)
    } yield (client, streamName)
  }.test("GetRecords should retrieve previously put records") {
    case (client, streamName) =>
      val data = new js.typedarray.Uint8Array(
        js.Array[Short](72, 101, 108, 108, 111) // "Hello"
      )

      for {
        // Put a record
        _ <- client.sendIO(
          PutRecordCommand(
            PutRecordCommandInput(
              StreamName = streamName,
              Data = data,
              PartitionKey = "test-partition"
            )
          )
        )
        // Get shard iterator
        shards <- client.sendIO(
          ListShardsCommand(
            ListShardsCommandInput(StreamName = streamName)
          )
        )
        shardId = shards.Shards.get(0).ShardId.get
        iteratorResult <- client.sendIO(
          GetShardIteratorCommand(
            GetShardIteratorCommandInput(
              StreamName = streamName,
              ShardId = shardId,
              ShardIteratorType = ShardIteratorType.TRIM_HORIZON
            )
          )
        )
        // Small delay to allow propagation
        _ <- IO.sleep(1.second)
        // Get records
        records <- client.sendIO(
          GetRecordsCommand(
            GetRecordsCommandInput(
              ShardIterator = iteratorResult.ShardIterator.get
            )
          )
        )
      } yield {
        assert(records.Records.isDefined)
        assert(records.Records.get.length >= 1)
        assert(records.Records.get(0).Data.isDefined)
        assert(records.Records.get(0).PartitionKey.isDefined)
        assertEquals(
          records.Records.get(0).PartitionKey.toOption,
          Some("test-partition")
        )
      }
  }

}
