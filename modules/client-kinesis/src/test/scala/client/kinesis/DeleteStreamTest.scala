package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import models._
import commands._

class DeleteStreamTest extends munit.CatsEffectSuite with KinesisFixtures {

  ResourceFunFixture {
    clientR
  }.test("DeleteStream should delete an existing stream") { client =>
    val streamName = s"test-delete-${new java.util.Random().nextInt.abs}"

    for {
      _ <- client.sendIO(
        CreateStreamCommand(
          CreateStreamCommandInput(
            StreamName = streamName,
            ShardCount = 1
          )
        )
      )
      _ <- waitForStreamActive(client, streamName)
      result <- client.sendIO(
        DeleteStreamCommand(
          DeleteStreamCommandInput(StreamName = streamName)
        )
      )
    } yield {
      assert(result.$metadata.httpStatusCode.contains(200))
    }
  }

  ResourceFunFixture {
    clientR
  }.test("DeleteStream should fail for non-existing stream") { client =>
    client
      .sendIO(
        DeleteStreamCommand(
          DeleteStreamCommandInput(
            StreamName = s"non-existing-${new java.util.Random().nextInt.abs}"
          )
        )
      )
      .attempt
      .map { result =>
        assert(result.isLeft)
      }
  }

}
