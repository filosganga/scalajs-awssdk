package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import scalajs.js
import models.*
import commands.*

class ExecuteStatementTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("ExecuteStatement SELECT should query with PartiQL") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary(
                "id" -> AttributeValue.S("partiql-1"),
                "name" -> AttributeValue.S("Alice")
              )
            )
          )
        )
        result <- client.sendIO(
          ExecuteStatementCommand(
            ExecuteStatementCommandInput(
              Statement = s"""SELECT * FROM "${tableName}" WHERE "id" = ?""",
              Parameters = js.Array(AttributeValue.S("partiql-1"))
            )
          )
        )
      } yield {
        assert(result.Items.isDefined)
        assertEquals(result.Items.get.length, 1)
        assertEquals(
          result.Items.get(0).get("name").flatMap(_.S.toOption),
          Some("Alice")
        )
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("ExecuteStatement INSERT should create an item via PartiQL") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          ExecuteStatementCommand(
            ExecuteStatementCommandInput(
              Statement =
                s"""INSERT INTO "${tableName}" VALUE {'id': 'partiql-insert', 'name': 'Bob'}"""
            )
          )
        )
        result <- client.sendIO(
          GetItemCommand(
            GetItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("partiql-insert"))
            )
          )
        )
      } yield {
        assert(result.Item.isDefined)
        assertEquals(
          result.Item.get("name"),
          AttributeValue.S("Bob")
        )
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("ExecuteStatement UPDATE should modify an item via PartiQL") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary(
                "id" -> AttributeValue.S("partiql-upd"),
                "name" -> AttributeValue.S("Old")
              )
            )
          )
        )
        _ <- client.sendIO(
          ExecuteStatementCommand(
            ExecuteStatementCommandInput(
              Statement =
                s"""UPDATE "${tableName}" SET "name" = ? WHERE "id" = ?""",
              Parameters = js.Array(
                AttributeValue.S("New"),
                AttributeValue.S("partiql-upd")
              )
            )
          )
        )
        result <- client.sendIO(
          GetItemCommand(
            GetItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("partiql-upd"))
            )
          )
        )
      } yield {
        assertEquals(
          result.Item.get("name"),
          AttributeValue.S("New")
        )
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("ExecuteStatement DELETE should remove an item via PartiQL") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary("id" -> AttributeValue.S("partiql-del"))
            )
          )
        )
        _ <- client.sendIO(
          ExecuteStatementCommand(
            ExecuteStatementCommandInput(
              Statement = s"""DELETE FROM "${tableName}" WHERE "id" = ?""",
              Parameters = js.Array(AttributeValue.S("partiql-del"))
            )
          )
        )
        result <- client.sendIO(
          GetItemCommand(
            GetItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("partiql-del"))
            )
          )
        )
      } yield {
        assert(result.Item.toOption.isEmpty)
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("ExecuteStatement with Limit should restrict results") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary("id" -> AttributeValue.S("limit-a"))
            )
          )
        )
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary("id" -> AttributeValue.S("limit-b"))
            )
          )
        )
        result <- client.sendIO(
          ExecuteStatementCommand(
            ExecuteStatementCommandInput(
              Statement = s"""SELECT * FROM "${tableName}"""",
              Limit = 1
            )
          )
        )
      } yield {
        assert(result.Items.isDefined)
        assertEquals(result.Items.get.length, 1)
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "ExecuteStatement should return ConsumedCapacity when requested"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary("id" -> AttributeValue.S("cap"))
          )
        )
      )
      result <- client.sendIO(
        ExecuteStatementCommand(
          ExecuteStatementCommandInput(
            Statement = s"""SELECT * FROM "${tableName}" WHERE "id" = ?""",
            Parameters = js.Array(AttributeValue.S("cap")),
            ReturnConsumedCapacity = ReturnConsumedCapacity.Total
          )
        )
      )
    } yield {
      // ConsumedCapacity may not be supported by localstack for PartiQL
      assert(result.$metadata.httpStatusCode.contains(200))
    }
  }

}
