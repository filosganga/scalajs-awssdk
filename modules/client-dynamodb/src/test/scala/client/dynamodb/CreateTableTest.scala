package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb

import cats.effect._

import scalajs.js
import scalajs.js.JSConverters._
import models._
import commands._

class CreateTableTest
    extends munit.CatsEffectSuite
    with DynamoDbFixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    clientR
  }.test("CreateTable with DeletionProtectionEnabled") { client =>
    val tableName = s"test-delprotect-${new java.util.Random().nextInt.abs}"

    for {
      result <- client.sendIO(
        CreateTableCommand(
          CreateTableCommandInput(
            TableName = tableName,
            AttributeDefinitions = js.Array(
              AttributeDefinition(
                AttributeName = "id",
                AttributeType = ScalarAttributeType.S
              )
            ),
            KeySchema = js.Array(
              KeySchemaElement(
                AttributeName = "id",
                KeyType = KeyType.Hash
              )
            ),
            BillingMode = BillingMode.PayPerRequest,
            DeletionProtectionEnabled = false
          )
        )
      )
      desc <- client.sendIO(
        DescribeTableCommand(
          DescribeTableCommandInput(TableName = tableName)
        )
      )
      _ <- client.sendIO(
        DeleteTableCommand(
          DeleteTableCommandInput(TableName = tableName)
        )
      )
    } yield {
      assert(result.TableDescription.isDefined)
      assertEquals(
        result.TableDescription.get.TableName.toOption,
        Some(tableName)
      )
    }
  }

  ResourceFunFixture {
    clientR
  }.test("CreateTable with OnDemandThroughput") { client =>
    val tableName = s"test-ondemand-${new java.util.Random().nextInt.abs}"

    for {
      result <- client.sendIO(
        CreateTableCommand(
          CreateTableCommandInput(
            TableName = tableName,
            AttributeDefinitions = js.Array(
              AttributeDefinition(
                AttributeName = "id",
                AttributeType = ScalarAttributeType.S
              )
            ),
            KeySchema = js.Array(
              KeySchemaElement(
                AttributeName = "id",
                KeyType = KeyType.Hash
              )
            ),
            BillingMode = BillingMode.PayPerRequest,
            OnDemandThroughput = OnDemandThroughput(
              MaxReadRequestUnits = 100,
              MaxWriteRequestUnits = 100
            )
          )
        )
      )
      _ <- client.sendIO(
        DeleteTableCommand(
          DeleteTableCommandInput(TableName = tableName)
        )
      )
    } yield {
      assert(result.TableDescription.isDefined)
    }
  }

}
