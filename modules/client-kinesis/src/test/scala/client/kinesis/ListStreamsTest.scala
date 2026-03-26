package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import cats.effect._

import models._
import commands._

class ListStreamsTest extends munit.CatsEffectSuite with KinesisFixtures {

  ResourceFunFixture {
    for {
      client <- clientR
      streamName <- streamR(client)
    } yield (client, streamName)
  }.test("ListStreams should return the created stream") {
    case (client, streamName) =>
      for {
        result <- client.sendIO(
          ListStreamsCommand(
            ListStreamsCommandInput()
          )
        )
      } yield {
        assert(result.StreamNames.isDefined)
        assert(result.StreamNames.get.contains(streamName))
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      streamName <- streamR(client)
    } yield (client, streamName)
  }.test("ListStreams should respect Limit") { case (client, streamName) =>
    for {
      result <- client.sendIO(
        ListStreamsCommand(
          ListStreamsCommandInput(Limit = 1)
        )
      )
    } yield {
      assert(result.StreamNames.isDefined)
      assert(result.StreamNames.get.length <= 1)
    }
  }

}
