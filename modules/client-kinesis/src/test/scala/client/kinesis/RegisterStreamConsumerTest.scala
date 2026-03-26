package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import cats.effect._

import models._
import commands._

class RegisterStreamConsumerTest
    extends munit.CatsEffectSuite
    with KinesisFixtures {

  ResourceFunFixture {
    for {
      client <- clientR
      streamName <- streamR(client)
    } yield (client, streamName)
  }.test(
    "RegisterStreamConsumer should register and DeregisterStreamConsumer should deregister"
  ) { case (client, streamName) =>
    val consumerName = s"test-consumer-${new java.util.Random().nextInt.abs}"

    for {
      // Get stream ARN
      summary <- client.sendIO(
        DescribeStreamSummaryCommand(
          DescribeStreamSummaryCommandInput(StreamName = streamName)
        )
      )
      streamArn = summary.StreamDescriptionSummary.get.StreamARN.get
      // Register consumer
      registerResult <- client.sendIO(
        RegisterStreamConsumerCommand(
          RegisterStreamConsumerCommandInput(
            StreamARN = streamArn,
            ConsumerName = consumerName
          )
        )
      )
      _ = {
        assert(registerResult.Consumer.isDefined)
        assertEquals(
          registerResult.Consumer.get.ConsumerName.toOption,
          Some(consumerName)
        )
        assert(registerResult.Consumer.get.ConsumerARN.isDefined)
      }
      // Deregister consumer
      _ <- client.sendIO(
        DeregisterStreamConsumerCommand(
          DeregisterStreamConsumerCommandInput(
            StreamARN = streamArn,
            ConsumerName = consumerName
          )
        )
      )
    } yield ()
  }

}
