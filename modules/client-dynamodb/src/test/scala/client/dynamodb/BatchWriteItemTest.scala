package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import scalajs.js
import models.*
import commands.*

class BatchWriteItemTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("BatchWriteItem should write multiple Items") {
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
          BatchWriteItemCommand(
            BatchWriteItemCommandInput(
              js.Dictionary(
                tableName ->
                  js.Array(
                    WriteRequest.putRequest(PutRequest(itemOne)),
                    WriteRequest.putRequest(PutRequest(itemTwo))
                  )
              )
            )
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
    "BatchWriteItem should return ConsumedCapacity as an array when requested"
  ) { case (client, tableName) =>
    for {
      writeResult <- client.sendIO(
        BatchWriteItemCommand(
          BatchWriteItemCommandInput(
            RequestItems = js.Dictionary(
              tableName ->
                js.Array(
                  WriteRequest.putRequest(
                    PutRequest(
                      js.Dictionary("id" -> AttributeValue.S("cap-test"))
                    )
                  )
                )
            ),
            ReturnConsumedCapacity = ReturnConsumedCapacity.Total
          )
        )
      )
    } yield {
      assert(writeResult.ConsumedCapacity.isDefined)
      val capacities = writeResult.ConsumedCapacity.get
      assert(capacities.length >= 1)
      assert(capacities(0).TableName.isDefined)
    }
  }

  ResourceFunFixture {
    for {
      client <- clientR
      tableName <- simpleTableR(client, "id")
    } yield (client, tableName)
  }.test("BatchWriteItem should return UnprocessedItems (empty on success)") {
    case (client, tableName) =>
      for {
        writeResult <- client.sendIO(
          BatchWriteItemCommand(
            BatchWriteItemCommandInput(
              RequestItems = js.Dictionary(
                tableName ->
                  js.Array(
                    WriteRequest.putRequest(
                      PutRequest(
                        js.Dictionary("id" -> AttributeValue.S("unproc-test"))
                      )
                    )
                  )
              )
            )
          )
        )
      } yield {
        // On a successful write with no throttling, UnprocessedItems should
        // be undefined or an empty dictionary
        writeResult.UnprocessedItems.toOption.foreach { unprocessed =>
          assertEquals(unprocessed.size, 0)
        }
      }
  }

}
