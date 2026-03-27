package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import java.util.concurrent.TimeoutException
import scala.concurrent.duration.*

import cats.effect.IO

import models.*
import commands.*

class RegisterStreamConsumerTest
    extends munit.CatsEffectSuite
    with KinesisFixtures {

  private def waitForConsumerActive(
      client: KinesisClient,
      consumerArn: String,
      timeout: FiniteDuration = 30.seconds
  ): IO[Unit] = {
    val pause = 2.seconds
    val check = client
      .sendIO(
        DescribeStreamConsumerCommand(
          DescribeStreamConsumerCommandInput(ConsumerARN = consumerArn)
        )
      )
      .map(
        _.ConsumerDescription.exists(
          _.ConsumerStatus.exists(_ == ConsumerStatus.ACTIVE)
        )
      )

    check.ifM(
      IO.unit,
      if (timeout <= Duration.Zero)
        IO.raiseError(
          new TimeoutException(
            s"Consumer did not become active in time"
          )
        )
      else
        IO.sleep(pause) >> waitForConsumerActive(
          client,
          consumerArn,
          timeout - pause
        )
    )
  }

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
      summary <- client.sendIO(
        DescribeStreamSummaryCommand(
          DescribeStreamSummaryCommandInput(StreamName = streamName)
        )
      )
      streamArn = summary.StreamDescriptionSummary.get.StreamARN.get
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
      consumerArn = registerResult.Consumer.get.ConsumerARN.get
      _ <- waitForConsumerActive(client, consumerArn)
      described <- client.sendIO(
        DescribeStreamConsumerCommand(
          DescribeStreamConsumerCommandInput(ConsumerARN = consumerArn)
        )
      )
      _ = assertEquals(
        described.ConsumerDescription.get.ConsumerStatus.toOption,
        Some(ConsumerStatus.ACTIVE)
      )
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
