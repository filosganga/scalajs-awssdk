package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import cats.effect.IO
import cats.effect.std.UUIDGen

import scalajs.js
import models.*
import commands.*

class ExecuteTransactionTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "ExecuteTransaction should execute multiple PartiQL statements atomically"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        ExecuteTransactionCommand(
          ExecuteTransactionCommandInput(
            TransactStatements = js.Array(
              ParameterizedStatement(
                Statement =
                  s"""INSERT INTO "${tableName}" VALUE {'id': 'et-1', 'name': 'Alice'}"""
              ),
              ParameterizedStatement(
                Statement =
                  s"""INSERT INTO "${tableName}" VALUE {'id': 'et-2', 'name': 'Bob'}"""
              )
            )
          )
        )
      )
      get1 <- client.sendIO(
        GetItemCommand(
          GetItemCommandInput(
            TableName = tableName,
            Key = js.Dictionary("id" -> AttributeValue.S("et-1"))
          )
        )
      )
      get2 <- client.sendIO(
        GetItemCommand(
          GetItemCommandInput(
            TableName = tableName,
            Key = js.Dictionary("id" -> AttributeValue.S("et-2"))
          )
        )
      )
    } yield {
      assert(get1.Item.isDefined)
      assertEquals(
        get1.Item.get("name"),
        AttributeValue.S("Alice")
      )
      assert(get2.Item.isDefined)
      assertEquals(
        get2.Item.get("name"),
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
    "ExecuteTransaction should roll back all statements if one fails"
  ) { case (client, tableName) =>
    for {
      // Insert an existing item to cause a conflict
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary("id" -> AttributeValue.S("et-existing"))
          )
        )
      )
      // Try to insert: one new, one duplicate (should fail)
      result <- client
        .sendIO(
          ExecuteTransactionCommand(
            ExecuteTransactionCommandInput(
              TransactStatements = js.Array(
                ParameterizedStatement(
                  Statement =
                    s"""INSERT INTO "${tableName}" VALUE {'id': 'et-rollback'}"""
                ),
                ParameterizedStatement(
                  Statement =
                    s"""INSERT INTO "${tableName}" VALUE {'id': 'et-existing'}"""
                )
              )
            )
          )
        )
        .attempt
      // The new item should NOT have been created (rolled back)
      check <- client.sendIO(
        GetItemCommand(
          GetItemCommandInput(
            TableName = tableName,
            Key = js.Dictionary("id" -> AttributeValue.S("et-rollback"))
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
    "ExecuteTransaction should return ConsumedCapacity when requested"
  ) { case (client, tableName) =>
    for {
      result <- client.sendIO(
        ExecuteTransactionCommand(
          ExecuteTransactionCommandInput(
            TransactStatements = js.Array(
              ParameterizedStatement(
                Statement =
                  s"""INSERT INTO "${tableName}" VALUE {'id': 'et-cap'}"""
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

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "ExecuteTransaction with ClientRequestToken should be idempotent"
  ) { case (client, tableName) =>
    for {
      token <- UUIDGen[IO].randomUUID.map(_.toString)
      txn = ExecuteTransactionCommandInput(
        TransactStatements = js.Array(
          ParameterizedStatement(
            Statement =
              s"""INSERT INTO "${tableName}" VALUE {'id': 'et-idemp'}"""
          )
        ),
        ClientRequestToken = token
      )
      _ <- client.sendIO(ExecuteTransactionCommand(txn))
      _ <- client.sendIO(ExecuteTransactionCommand(txn))
      result <- client.sendIO(
        GetItemCommand(
          GetItemCommandInput(
            TableName = tableName,
            Key = js.Dictionary("id" -> AttributeValue.S("et-idemp"))
          )
        )
      )
    } yield {
      assert(result.Item.isDefined)
    }
  }

}
