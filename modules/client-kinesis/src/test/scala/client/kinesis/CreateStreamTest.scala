package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import cats.effect._

import models._
import commands._

class CreateStreamTest
    extends munit.CatsEffectSuite
    with KinesisFixtures {

  ResourceFunFixture {
    clientR
  }.test("CreateStream should create a stream") { client =>
    val streamName = s"test-create-${new java.util.Random().nextInt.abs}"

    for {
      _ <- client.sendIO(
        CreateStreamCommand(
          CreateStreamCommandInput(
            StreamName = streamName,
            ShardCount = 1
          )
        )
      )
      summary <- client.sendIO(
        DescribeStreamSummaryCommand(
          DescribeStreamSummaryCommandInput(StreamName = streamName)
        )
      )
      _ <- client.sendIO(
        DeleteStreamCommand(
          DeleteStreamCommandInput(StreamName = streamName)
        )
      )
    } yield {
      assert(summary.StreamDescriptionSummary.isDefined)
      assertEquals(
        summary.StreamDescriptionSummary.get.StreamName.toOption,
        Some(streamName)
      )
    }
  }

}
