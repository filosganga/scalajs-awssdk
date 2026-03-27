package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import scalajs.js
import models._
import commands._

class BatchGetItemTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("BatchGetItemTest should return multiple Items") {
    case (client, tableName) =>
      val itemOne = js.Dictionary(
        "id" -> AttributeValue.S("testOne"),
        "foo" -> AttributeValue.S("bar")
      )

      val itemTwo = js.Dictionary(
        "id" -> AttributeValue.S("testTwo"),
        "foo" -> AttributeValue.S("bar")
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
          BatchGetItemCommand(
            BatchGetItemCommandInput(
              RequestItems = js.Dictionary(
                tableName -> KeysAndAttributes(
                  Keys = js.Array(
                    js.Dictionary("id" -> AttributeValue.S("testOne")),
                    js.Dictionary("id" -> AttributeValue.S("testTwo"))
                  ),
                  ConsistentRead = true
                )
              )
            )
          )
        )
      } yield {
        assert(result.Responses.isDefined)
        val items = result.Responses.get(tableName)
        assertEquals(items.toSet, Set(itemOne, itemTwo))
      }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test(
    "BatchGetItem should return ConsumedCapacity as an array when requested"
  ) { case (client, tableName) =>
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
        BatchGetItemCommand(
          BatchGetItemCommandInput(
            RequestItems = js.Dictionary(
              tableName -> KeysAndAttributes(
                Keys = js.Array(
                  js.Dictionary("id" -> AttributeValue.S("test"))
                ),
                ConsistentRead = true
              )
            ),
            ReturnConsumedCapacity = ReturnConsumedCapacity.Total
          )
        )
      )
    } yield {
      assert(result.ConsumedCapacity.isDefined)
      val capacities = result.ConsumedCapacity.get
      assert(capacities.length >= 1)
      assert(capacities(0).TableName.isDefined)
    }
  }

}
