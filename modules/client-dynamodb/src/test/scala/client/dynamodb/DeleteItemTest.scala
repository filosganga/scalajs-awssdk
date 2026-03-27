package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import scalajs.js
import models.*
import commands.*

class DeleteItemTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("DeleteItem should delete an existing item") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary("id" -> AttributeValue.S("to-delete"))
            )
          )
        )
        _ <- client.sendIO(
          DeleteItemCommand(
            DeleteItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("to-delete"))
            )
          )
        )
        getResult <- client.sendIO(
          GetItemCommand(
            GetItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("to-delete"))
            )
          )
        )
      } yield {
        assert(getResult.Item.toOption.isEmpty)
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("DeleteItem should return old attributes with ReturnValues AllOld") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary(
                "id" -> AttributeValue.S("ret-old"),
                "value" -> AttributeValue.S("original")
              )
            )
          )
        )
        result <- client.sendIO(
          DeleteItemCommand(
            DeleteItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("ret-old")),
              ReturnValues = ReturnValues.AllOld
            )
          )
        )
      } yield {
        assert(result.Attributes.isDefined)
        assertEquals(
          result.Attributes.get("value"),
          AttributeValue.S("original")
        )
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "DeleteItem with ReturnValuesOnConditionCheckFailure should accept enum type"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary("id" -> AttributeValue.S("cond-check"))
          )
        )
      )
      result <- client.sendIO(
        DeleteItemCommand(
          DeleteItemCommandInput(
            TableName = tableName,
            Key = js.Dictionary("id" -> AttributeValue.S("cond-check")),
            ReturnValuesOnConditionCheckFailure =
              ReturnValuesOnConditionCheckFailure.AllOld
          )
        )
      )
    } yield {
      assert(result.$metadata.httpStatusCode.contains(200))
    }
  }

}
