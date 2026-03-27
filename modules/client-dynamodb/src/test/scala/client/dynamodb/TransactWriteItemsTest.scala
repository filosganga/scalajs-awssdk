package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import cats.effect.IO
import cats.effect.std.UUIDGen

import scalajs.js
import models.*
import commands.*

class TransactWriteItemsTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("TransactWriteItems should put and delete atomically") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary("id" -> AttributeValue.S("tx-del"))
            )
          )
        )
        _ <- client.sendIO(
          TransactWriteItemsCommand(
            TransactWriteItemsCommandInput(
              TransactItems = js.Array(
                TransactWriteItem(
                  Put = Put(
                    TableName = tableName,
                    Item = js.Dictionary(
                      "id" -> AttributeValue.S("tx-new"),
                      "value" -> AttributeValue.S("created")
                    )
                  )
                ),
                TransactWriteItem(
                  Delete = Delete(
                    TableName = tableName,
                    Key = js.Dictionary("id" -> AttributeValue.S("tx-del"))
                  )
                )
              )
            )
          )
        )
        getNew <- client.sendIO(
          GetItemCommand(
            GetItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("tx-new"))
            )
          )
        )
        getDel <- client.sendIO(
          GetItemCommand(
            GetItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("tx-del"))
            )
          )
        )
      } yield {
        assert(getNew.Item.isDefined)
        assertEquals(
          getNew.Item.get("value"),
          AttributeValue.S("created")
        )
        assert(getDel.Item.toOption.isEmpty)
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("TransactWriteItems with Update action should update an item") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary(
                "id" -> AttributeValue.S("tx-upd"),
                "version" -> AttributeValue.N("1")
              )
            )
          )
        )
        _ <- client.sendIO(
          TransactWriteItemsCommand(
            TransactWriteItemsCommandInput(
              TransactItems = js.Array(
                TransactWriteItem(
                  Update = Update(
                    TableName = tableName,
                    Key = js.Dictionary("id" -> AttributeValue.S("tx-upd")),
                    UpdateExpression = "SET version = :v",
                    ExpressionAttributeValues = js.Dictionary(
                      ":v" -> AttributeValue.N("2")
                    )
                  )
                )
              )
            )
          )
        )
        result <- client.sendIO(
          GetItemCommand(
            GetItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("tx-upd"))
            )
          )
        )
      } yield {
        assert(result.Item.isDefined)
        assertEquals(
          result.Item.get("version"),
          AttributeValue.N("2")
        )
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "TransactWriteItems with ConditionCheck should fail if condition not met"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary(
              "id" -> AttributeValue.S("tx-cond"),
              "status" -> AttributeValue.S("active")
            )
          )
        )
      )
      result <- client
        .sendIO(
          TransactWriteItemsCommand(
            TransactWriteItemsCommandInput(
              TransactItems = js.Array(
                TransactWriteItem(
                  ConditionCheck = ConditionCheck(
                    TableName = tableName,
                    Key = js.Dictionary("id" -> AttributeValue.S("tx-cond")),
                    ConditionExpression = "status = :expected",
                    ExpressionAttributeValues = js.Dictionary(
                      ":expected" -> AttributeValue.S("deleted")
                    )
                  )
                ),
                TransactWriteItem(
                  Put = Put(
                    TableName = tableName,
                    Item = js.Dictionary(
                      "id" -> AttributeValue.S("should-not-exist")
                    )
                  )
                )
              )
            )
          )
        )
        .attempt

      check <- client.sendIO(
        GetItemCommand(
          GetItemCommandInput(
            TableName = tableName,
            Key = js.Dictionary("id" -> AttributeValue.S("should-not-exist"))
          )
        )
      )
    } yield {
      assert(result.isLeft)
      assert(check.Item.toOption.isEmpty)
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "TransactWriteItems with ClientRequestToken should be idempotent"
  ) { case (client, tableName) =>
    for {
      token <- UUIDGen[IO].randomUUID.map(_.toString)
      txn = TransactWriteItemsCommandInput(
        TransactItems = js.Array(
          TransactWriteItem(
            Put = Put(
              TableName = tableName,
              Item = js.Dictionary(
                "id" -> AttributeValue.S("tx-idemp"),
                "value" -> AttributeValue.S("once")
              )
            )
          )
        ),
        ClientRequestToken = token
      )
      _ <- client.sendIO(TransactWriteItemsCommand(txn))
      // Second call with same token should succeed (idempotent)
      _ <- client.sendIO(TransactWriteItemsCommand(txn))
      result <- client.sendIO(
        GetItemCommand(
          GetItemCommandInput(
            TableName = tableName,
            Key = js.Dictionary("id" -> AttributeValue.S("tx-idemp"))
          )
        )
      )
    } yield {
      assert(result.Item.isDefined)
      assertEquals(
        result.Item.get("value"),
        AttributeValue.S("once")
      )
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "TransactWriteItems should return ConsumedCapacity when requested"
  ) { case (client, tableName) =>
    for {
      result <- client.sendIO(
        TransactWriteItemsCommand(
          TransactWriteItemsCommandInput(
            TransactItems = js.Array(
              TransactWriteItem(
                Put = Put(
                  TableName = tableName,
                  Item = js.Dictionary(
                    "id" -> AttributeValue.S("tx-cap")
                  )
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
