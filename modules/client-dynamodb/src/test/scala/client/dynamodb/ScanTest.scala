package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import scalajs.js
import models._
import commands._

class ScanTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("Scan should return Items as an array of maps") {
    case (client, tableName) =>
      val itemOne = js.Dictionary(
        "id" -> AttributeValue.S("one"),
        "value" -> AttributeValue.S("first")
      )
      val itemTwo = js.Dictionary(
        "id" -> AttributeValue.S("two"),
        "value" -> AttributeValue.S("second")
      )

      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(TableName = tableName, Item = itemOne)
          )
        )
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(TableName = tableName, Item = itemTwo)
          )
        )
        result <- client.sendIO(
          ScanCommand(
            ScanCommandInput(TableName = tableName)
          )
        )
      } yield {
        assert(result.Items.isDefined)
        val items = result.Items.get
        assertEquals(items.length, 2)
        // Each item should be a Dictionary[AttributeValue]
        assert(items.exists(_.get("id").exists(_.S.toOption.contains("one"))))
        assert(items.exists(_.get("id").exists(_.S.toOption.contains("two"))))
        assertEquals(result.Count.toOption, Some(2))
        assertEquals(result.ScannedCount.toOption, Some(2))
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("Scan should return ConsumedCapacity when requested") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary("id" -> AttributeValue.S("test"))
            )
          )
        )
        result <- client.sendIO(
          ScanCommand(
            ScanCommandInput(
              TableName = tableName,
              ReturnConsumedCapacity = ReturnConsumedCapacity.Total
            )
          )
        )
      } yield {
        assert(result.ConsumedCapacity.isDefined)
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("Scan with Limit should respect the limit") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary("id" -> AttributeValue.S("a"))
            )
          )
        )
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary("id" -> AttributeValue.S("b"))
            )
          )
        )
        result <- client.sendIO(
          ScanCommand(
            ScanCommandInput(TableName = tableName, Limit = 1)
          )
        )
      } yield {
        assert(result.Items.isDefined)
        assertEquals(result.Items.get.length, 1)
        assert(result.LastEvaluatedKey.isDefined)
      }
  }

}
