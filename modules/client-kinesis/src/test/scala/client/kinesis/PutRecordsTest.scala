package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import models.*
import commands.*

import scalajs.js
import scalajs.js.JSConverters.*

class PutRecordsTest extends munit.CatsEffectSuite with KinesisFixtures {

  ResourceFunFixture {
    for {
      client <- clientR
      streamName <- streamR(client)
    } yield (client, streamName)
  }.test("PutRecords should put multiple records") {
    case (client, streamName) =>
      val entries = List(
        PutRecordsRequestEntry(
          Data = new js.typedarray.Uint8Array(
            js.Array[Short](72, 101, 108, 108, 111)
          ),
          PartitionKey = "key-1"
        ),
        PutRecordsRequestEntry(
          Data = new js.typedarray.Uint8Array(
            js.Array[Short](87, 111, 114, 108, 100)
          ),
          PartitionKey = "key-2"
        )
      ).toJSArray

      for {
        result <- client.sendIO(
          PutRecordsCommand(
            PutRecordsCommandInput(
              StreamName = streamName,
              Records = entries
            )
          )
        )
      } yield {
        assert(result.Records.isDefined)
        assertEquals(result.Records.get.length, 2)
        assertEquals(result.FailedRecordCount.toOption, Some(0))
        assert(result.Records.get(0).SequenceNumber.isDefined)
        assert(result.Records.get(1).SequenceNumber.isDefined)
      }
  }

}
