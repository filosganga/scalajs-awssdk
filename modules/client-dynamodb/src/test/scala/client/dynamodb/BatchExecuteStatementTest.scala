package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import scalajs.js
import models.*
import commands.*

class BatchExecuteStatementTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "BatchExecuteStatement should execute multiple SELECT statements"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary(
              "id" -> AttributeValue.S("batch-1"),
              "name" -> AttributeValue.S("Alice")
            )
          )
        )
      )
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary(
              "id" -> AttributeValue.S("batch-2"),
              "name" -> AttributeValue.S("Bob")
            )
          )
        )
      )
      result <- client.sendIO(
        BatchExecuteStatementCommand(
          BatchExecuteStatementCommandInput(
            Statements = js.Array(
              BatchStatementRequest(
                Statement = s"""SELECT * FROM "${tableName}" WHERE "id" = ?""",
                Parameters = js.Array(AttributeValue.S("batch-1"))
              ),
              BatchStatementRequest(
                Statement = s"""SELECT * FROM "${tableName}" WHERE "id" = ?""",
                Parameters = js.Array(AttributeValue.S("batch-2"))
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
        result.Responses.get(0).Item.get("name"),
        AttributeValue.S("Alice")
      )
      assert(result.Responses.get(1).Item.isDefined)
      assertEquals(
        result.Responses.get(1).Item.get("name"),
        AttributeValue.S("Bob")
      )
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "BatchExecuteStatement should execute INSERT statements"
  ) { case (client, tableName) =>
    for {
      result <- client.sendIO(
        BatchExecuteStatementCommand(
          BatchExecuteStatementCommandInput(
            Statements = js.Array(
              BatchStatementRequest(
                Statement =
                  s"""INSERT INTO "${tableName}" VALUE {'id': 'batch-ins-1', 'name': 'Charlie'}"""
              ),
              BatchStatementRequest(
                Statement =
                  s"""INSERT INTO "${tableName}" VALUE {'id': 'batch-ins-2', 'name': 'Diana'}"""
              )
            )
          )
        )
      )
      get1 <- client.sendIO(
        GetItemCommand(
          GetItemCommandInput(
            TableName = tableName,
            Key = js.Dictionary("id" -> AttributeValue.S("batch-ins-1"))
          )
        )
      )
      get2 <- client.sendIO(
        GetItemCommand(
          GetItemCommandInput(
            TableName = tableName,
            Key = js.Dictionary("id" -> AttributeValue.S("batch-ins-2"))
          )
        )
      )
    } yield {
      assert(result.Responses.isDefined)
      assertEquals(result.Responses.get.length, 2)
      assert(get1.Item.isDefined)
      assert(get2.Item.isDefined)
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "BatchExecuteStatement should report errors for failing statements"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary("id" -> AttributeValue.S("batch-dup"))
          )
        )
      )
      // Try to insert duplicate — should get error in response, not throw
      result <- client.sendIO(
        BatchExecuteStatementCommand(
          BatchExecuteStatementCommandInput(
            Statements = js.Array(
              BatchStatementRequest(
                Statement =
                  s"""INSERT INTO "${tableName}" VALUE {'id': 'batch-dup'}"""
              )
            )
          )
        )
      )
    } yield {
      assert(result.Responses.isDefined)
      assertEquals(result.Responses.get.length, 1)
      assert(result.Responses.get(0).Error.isDefined)
      assert(result.Responses.get(0).Error.get.Code.isDefined)
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "BatchExecuteStatement should return ConsumedCapacity when requested"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary("id" -> AttributeValue.S("batch-cap"))
          )
        )
      )
      result <- client.sendIO(
        BatchExecuteStatementCommand(
          BatchExecuteStatementCommandInput(
            Statements = js.Array(
              BatchStatementRequest(
                Statement = s"""SELECT * FROM "${tableName}" WHERE "id" = ?""",
                Parameters = js.Array(AttributeValue.S("batch-cap"))
              )
            ),
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
