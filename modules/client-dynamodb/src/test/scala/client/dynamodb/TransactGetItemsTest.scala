package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import scalajs.js
import models.*
import commands.*

class TransactGetItemsTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("TransactGetItems should get multiple items atomically") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary(
                "id" -> AttributeValue.S("tx-get-1"),
                "value" -> AttributeValue.S("one")
              )
            )
          )
        )
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary(
                "id" -> AttributeValue.S("tx-get-2"),
                "value" -> AttributeValue.S("two")
              )
            )
          )
        )
        result <- client.sendIO(
          TransactGetItemsCommand(
            TransactGetItemsCommandInput(
              TransactItems = js.Array(
                TransactGetItem(
                  Get = Get(
                    TableName = tableName,
                    Key = js.Dictionary("id" -> AttributeValue.S("tx-get-1"))
                  )
                ),
                TransactGetItem(
                  Get = Get(
                    TableName = tableName,
                    Key = js.Dictionary("id" -> AttributeValue.S("tx-get-2"))
                  )
                )
              )
            )
          )
        )
      } yield {
        assert(result.Responses.isDefined)
        assertEquals(result.Responses.get.length, 2)
        assert(result.Responses.get(0).Item.isDefined)
        assertEquals(
          result.Responses.get(0).Item.get("value"),
          AttributeValue.S("one")
        )
        assert(result.Responses.get(1).Item.isDefined)
        assertEquals(
          result.Responses.get(1).Item.get("value"),
          AttributeValue.S("two")
        )
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "TransactGetItems for non-existent items should return empty Item responses"
  ) { case (client, tableName) =>
    for {
      result <- client.sendIO(
        TransactGetItemsCommand(
          TransactGetItemsCommandInput(
            TransactItems = js.Array(
              TransactGetItem(
                Get = Get(
                  TableName = tableName,
                  Key =
                    js.Dictionary("id" -> AttributeValue.S("does-not-exist"))
                )
              )
            )
          )
        )
      )
    } yield {
      assert(result.Responses.isDefined)
      assertEquals(result.Responses.get.length, 1)
      // Item should be undefined for non-existent keys
      assert(result.Responses.get(0).Item.toOption.isEmpty)
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("TransactGetItems with ProjectionExpression should project fields") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary(
                "id" -> AttributeValue.S("tx-proj"),
                "name" -> AttributeValue.S("Alice"),
                "age" -> AttributeValue.N("30")
              )
            )
          )
        )
        result <- client.sendIO(
          TransactGetItemsCommand(
            TransactGetItemsCommandInput(
              TransactItems = js.Array(
                TransactGetItem(
                  Get = Get(
                    TableName = tableName,
                    Key = js.Dictionary("id" -> AttributeValue.S("tx-proj")),
                    ProjectionExpression = "id, #n",
                    ExpressionAttributeNames = js.Dictionary("#n" -> "name")
                  )
                )
              )
            )
          )
        )
      } yield {
        assert(result.Responses.isDefined)
        val item = result.Responses.get(0).Item.get
        assert(item.get("id").isDefined)
        assert(item.get("name").isDefined)
        assert(item.get("age").isEmpty)
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("TransactGetItems should return ConsumedCapacity when requested") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary("id" -> AttributeValue.S("tx-cap"))
            )
          )
        )
        result <- client.sendIO(
          TransactGetItemsCommand(
            TransactGetItemsCommandInput(
              TransactItems = js.Array(
                TransactGetItem(
                  Get = Get(
                    TableName = tableName,
                    Key = js.Dictionary("id" -> AttributeValue.S("tx-cap"))
                  )
                )
              ),
              ReturnConsumedCapacity = ReturnConsumedCapacity.Total
            )
          )
        )
      } yield {
        assert(result.ConsumedCapacity.isDefined)
        assert(result.ConsumedCapacity.get.length >= 1)
      }
  }

}
