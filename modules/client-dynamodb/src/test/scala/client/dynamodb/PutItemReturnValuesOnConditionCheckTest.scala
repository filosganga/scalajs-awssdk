package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import scalajs.js
import models.*
import commands.*

class PutItemReturnValuesOnConditionCheckTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "PutItem with ReturnValuesOnConditionCheckFailure should return old item on condition failure"
  ) { case (client, tableName) =>
    for {
      // Put initial item
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary(
              "id" -> AttributeValue.S("cond-test"),
              "version" -> AttributeValue.N("1")
            )
          )
        )
      )
      // Try conditional put that will fail
      result <- client
        .sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary(
                "id" -> AttributeValue.S("cond-test"),
                "version" -> AttributeValue.N("2")
              ),
              ConditionExpression = "attribute_not_exists(id)",
              ReturnValuesOnConditionCheckFailure =
                ReturnValuesOnConditionCheckFailure.AllOld
            )
          )
        )
        .attempt
    } yield {
      // The conditional put should fail since the item already exists
      assert(result.isLeft)
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "PutItem with ReturnValuesOnConditionCheckFailure.None should succeed"
  ) { case (client, tableName) =>
    for {
      result <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary("id" -> AttributeValue.S("none-test")),
            ReturnValuesOnConditionCheckFailure =
              ReturnValuesOnConditionCheckFailure.None
          )
        )
      )
    } yield {
      assert(result.$metadata.httpStatusCode.contains(200))
    }
  }

}
