package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import scalajs.js
import scalajs.js.JSConverters._
import models._
import commands._

class LegacyApiTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("GetItem with legacy AttributesToGet should project attributes") {
    case (client, tableName) =>
      for {
        _ <- client.sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary(
                "id" -> AttributeValue.S("legacy-get"),
                "name" -> AttributeValue.S("test"),
                "age" -> AttributeValue.N("30")
              )
            )
          )
        )
        result <- client.sendIO(
          GetItemCommand(
            GetItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("legacy-get")),
              AttributesToGet = js.Array("id", "name")
            )
          )
        )
      } yield {
        assert(result.Item.isDefined)
        val item = result.Item.get
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
  }.test(
    "PutItem with legacy Expected condition should enforce conditional write"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary("id" -> AttributeValue.S("legacy-put"))
          )
        )
      )
      // Should fail because item exists and Expected says it shouldn't
      result <- client
        .sendIO(
          PutItemCommand(
            PutItemCommandInput(
              TableName = tableName,
              Item = js.Dictionary("id" -> AttributeValue.S("legacy-put")),
              Expected = js.Dictionary(
                "id" -> ExpectedAttributeValue(Exists = false)
              )
            )
          )
        )
        .attempt
    } yield {
      assert(result.isLeft)
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "Scan with legacy ScanFilter should filter results"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary(
              "id" -> AttributeValue.S("a"),
              "status" -> AttributeValue.S("active")
            )
          )
        )
      )
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary(
              "id" -> AttributeValue.S("b"),
              "status" -> AttributeValue.S("inactive")
            )
          )
        )
      )
      result <- client.sendIO(
        ScanCommand(
          ScanCommandInput(
            TableName = tableName,
            ScanFilter = js.Dictionary(
              "status" -> Condition(
                ComparisonOperator = ComparisonOperator.EQ,
                AttributeValueList =
                  js.Array(AttributeValue.S("active"))
              )
            )
          )
        )
      )
    } yield {
      assert(result.Items.isDefined)
      assertEquals(result.Count.toOption, Some(1))
      assertEquals(
        result.Items.get(0).get("status").flatMap(_.S.toOption),
        Some("active")
      )
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "DeleteItem with legacy Expected condition should enforce conditional delete"
  ) { case (client, tableName) =>
    for {
      _ <- client.sendIO(
        PutItemCommand(
          PutItemCommandInput(
            TableName = tableName,
            Item = js.Dictionary(
              "id" -> AttributeValue.S("legacy-del"),
              "status" -> AttributeValue.S("active")
            )
          )
        )
      )
      // Should fail because Expected condition doesn't match
      result <- client
        .sendIO(
          DeleteItemCommand(
            DeleteItemCommandInput(
              TableName = tableName,
              Key = js.Dictionary("id" -> AttributeValue.S("legacy-del")),
              Expected = js.Dictionary(
                "status" -> ExpectedAttributeValue(
                  ComparisonOperator = ComparisonOperator.EQ,
                  AttributeValueList =
                    js.Array(AttributeValue.S("deleted"))
                )
              )
            )
          )
        )
        .attempt
    } yield {
      assert(result.isLeft)
    }
  }

}
