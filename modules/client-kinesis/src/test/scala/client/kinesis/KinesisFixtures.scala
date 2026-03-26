package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import java.util.concurrent.TimeoutException
import scala.concurrent.duration._

import cats.effect._
import cats.effect.std.Env
import cats.syntax.all.*

import scalajs.js.JSConverters._
import models._
import commands._

trait KinesisFixtures {
  self: munit.FunSuite =>

  implicit class RichKinesisClient(client: KinesisClient) {
    def sendIO[Input, Output](cmd: Command[Input, Output]) = IO
      .fromPromise {
        IO {
          client.send(cmd)
        }
      }
      .onError { e =>
        cats.effect.std
          .Console[IO]
          .errorln(s"Error sending Kinesis request: ${e.getMessage}")
      }

  }

  def clientR =
    Resource.eval(Env[IO].get("KINESIS_ENDPOINT")).flatMap { endpoint =>
      Resource.make {
        IO {
          val config =
            KinesisClientConfig(
              region = "eu-west-1",
              endpoint = endpoint.orUndefined
            )
          new KinesisClient(config)
        }
      }(c => IO(c.destroy()))
    }

  def waitForStreamActive(
      client: KinesisClient,
      streamName: String,
      timeout: FiniteDuration = 30.seconds
  ): IO[Unit] = {
    val pause = 2.seconds

    val checkStreamIsActive = client
      .sendIO(
        DescribeStreamSummaryCommand(
          DescribeStreamSummaryCommandInput(StreamName = streamName)
        )
      )
      .map(
        _.StreamDescriptionSummary.exists(
          _.StreamStatus.exists(_ == StreamStatus.ACTIVE)
        )
      )

    checkStreamIsActive.ifM(
      IO.unit,
      if (timeout <= Duration.Zero) {
        IO.raiseError[Unit](
          new TimeoutException(
            s"Stream ${streamName} did not become active in time"
          )
        )
      } else {
        IO.sleep(pause) >> waitForStreamActive(
          client,
          streamName,
          timeout - pause
        )
      }
    )
  }

  def streamR(client: KinesisClient, shardCount: Int = 1) = Resource
    .eval(IO { new java.util.Random().nextInt.abs })
    .map(id => s"test-stream-${id.toString}")
    .flatMap { streamName =>
      Resource.make {

        val createStream = client
          .sendIO(
            CreateStreamCommand(
              CreateStreamCommandInput(
                StreamName = streamName,
                ShardCount = shardCount
              )
            )
          )
          .as(streamName)

        createStream >> waitForStreamActive(
          client,
          streamName
        ) >> streamName.pure[IO]

      } { streamName =>
        client
          .sendIO(
            DeleteStreamCommand(
              DeleteStreamCommandInput(
                StreamName = streamName,
                EnforceConsumerDeletion = true
              )
            )
          )
          .void
      }
    }

}
