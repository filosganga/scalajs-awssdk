package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import scalajs.js
import models._
import commands._

class UpdateItemReturnValuesOnConditionCheckTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "UpdateItem with ReturnValuesOnConditionCheckFailure should accept enum type"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary(
              "id" -> AttributeValue.S("update-cond"),
              "counter" -> AttributeValue.N("1")
            )
          )
        )
      )
      result <- client.sendIO(
        UpdateItemCommand(
          UpdateItemCommandInput(
            TableName = tableName,
            Key = js.Dictionary("id" -> AttributeValue.S("update-cond")),
            UpdateExpression = "SET #c = #c + :inc",
            ExpressionAttributeNames = js.Dictionary("#c" -> "counter"),
            ExpressionAttributeValues = js.Dictionary(
              ":inc" -> AttributeValue.N("1")
            ),
            ReturnValuesOnConditionCheckFailure =
              ReturnValuesOnConditionCheckFailure.AllOld
          )
        )
      )
    } yield {
      assert(result.$metadata.httpStatusCode.contains(200))
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "UpdateItem with failing condition and ReturnValuesOnConditionCheckFailure should fail"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary(
              "id" -> AttributeValue.S("update-fail"),
              "status" -> AttributeValue.S("active")
            )
          )
        )
      )
      result <- client
        .sendIO(
          UpdateItemCommand(
            UpdateItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("update-fail")),
              UpdateExpression = "SET status = :new",
              ConditionExpression = "status = :expected",
              ExpressionAttributeValues = js.Dictionary(
                ":new" -> AttributeValue.S("inactive"),
                ":expected" -> AttributeValue.S("nonexistent")
              ),
              ReturnValuesOnConditionCheckFailure =
                ReturnValuesOnConditionCheckFailure.AllOld
            )
          )
        )
        .attempt
    } yield {
      assert(result.isLeft)
    }
  }

}
