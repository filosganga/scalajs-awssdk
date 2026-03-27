package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import models.*
import commands.*

import scalajs.js

class PutRecordTest extends munit.CatsEffectSuite with KinesisFixtures {

  ResourceFunFixture {
    for {
      client <- clientR
      streamName <- streamR(client)
    } yield (client, streamName)
  }.test(
    "PutRecord should put a record and return ShardId and SequenceNumber"
  ) { case (client, streamName) =>
    val data = new js.typedarray.Uint8Array(
      js.Array[Short](72, 101, 108, 108, 111) // "Hello"
    )

    for {
      result <- client.sendIO(
        PutRecordCommand(
          PutRecordCommandInput(
            StreamName = streamName,
            Data = data,
            PartitionKey = "test-partition"
          )
        )
      )
    } yield {
      assert(result.ShardId.isDefined)
      assert(result.SequenceNumber.isDefined)
    }
  }

}
