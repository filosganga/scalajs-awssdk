package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb
package models

import com.filippodeluca.jsfacade.awssdk.types.*
import scalajs.js

@js.native
trait BatchExecuteStatementCommandInput extends js.Object {
  val Statements: js.UndefOr[js.Array[BatchStatementRequest]] = js.native
  val ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.native
}

object BatchExecuteStatementCommandInput {
  def apply(
      Statements: js.UndefOr[js.Array[BatchStatementRequest]] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
  ): BatchExecuteStatementCommandInput = {
    js.Dynamic
      .literal(
        Statements = Statements.asInstanceOf[js.Any],
        ReturnConsumedCapacity = ReturnConsumedCapacity.asInstanceOf[js.Any]
      )
      .asInstanceOf[BatchExecuteStatementCommandInput]
  }
}

@js.native
trait BatchExecuteStatementCommandOutput extends MetadataBearer {
  val Responses: js.UndefOr[js.Array[BatchStatementResponse]] = js.native
  val ConsumedCapacity: js.UndefOr[js.Array[ConsumedCapacity]] = js.native
}

// TODO: Limit — number type for 'Limit' — verify if Int or Double is appropriate
@js.native
trait ExecuteStatementCommandInput extends js.Object {
  val Statement: js.UndefOr[String] = js.native
  val Parameters: js.UndefOr[js.Array[AttributeValue]] = js.native
  val ConsistentRead: js.UndefOr[Boolean] = js.native
  val NextToken: js.UndefOr[String] = js.native
  val ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.native
  val Limit: js.UndefOr[Double] = js.native
  val ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.native
}

object ExecuteStatementCommandInput {
  def apply(
      Statement: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[js.Array[AttributeValue]] = js.undefined,
      ConsistentRead: js.UndefOr[Boolean] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      Limit: js.UndefOr[Double] = js.undefined,
      ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  ): ExecuteStatementCommandInput = {
    js.Dynamic
      .literal(
        Statement = Statement.asInstanceOf[js.Any],
        Parameters = Parameters.asInstanceOf[js.Any],
        ConsistentRead = ConsistentRead.asInstanceOf[js.Any],
        NextToken = NextToken.asInstanceOf[js.Any],
        ReturnConsumedCapacity = ReturnConsumedCapacity.asInstanceOf[js.Any],
        Limit = Limit.asInstanceOf[js.Any],
        ReturnValuesOnConditionCheckFailure = ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any]
      )
      .asInstanceOf[ExecuteStatementCommandInput]
  }
}

@js.native
trait ExecuteStatementCommandOutput extends MetadataBearer {
  val Items: js.UndefOr[js.Array[js.Dictionary[AttributeValue]]] = js.native
  val NextToken: js.UndefOr[String] = js.native
  val ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.native
  val LastEvaluatedKey: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
}

@js.native
trait ExecuteTransactionCommandInput extends js.Object {
  val TransactStatements: js.UndefOr[js.Array[ParameterizedStatement]] = js.native
  val ClientRequestToken: js.UndefOr[String] = js.native
  val ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.native
}

object ExecuteTransactionCommandInput {
  def apply(
      TransactStatements: js.UndefOr[js.Array[ParameterizedStatement]] = js.undefined,
      ClientRequestToken: js.UndefOr[String] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
  ): ExecuteTransactionCommandInput = {
    js.Dynamic
      .literal(
        TransactStatements = TransactStatements.asInstanceOf[js.Any],
        ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any],
        ReturnConsumedCapacity = ReturnConsumedCapacity.asInstanceOf[js.Any]
      )
      .asInstanceOf[ExecuteTransactionCommandInput]
  }
}

@js.native
trait ExecuteTransactionCommandOutput extends MetadataBearer {
  val Responses: js.UndefOr[js.Array[ItemResponse]] = js.native
  val ConsumedCapacity: js.UndefOr[js.Array[ConsumedCapacity]] = js.native
}

@js.native
trait TransactGetItemsCommandInput extends js.Object {
  val TransactItems: js.UndefOr[js.Array[TransactGetItem]] = js.native
  val ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.native
}

object TransactGetItemsCommandInput {
  def apply(
      TransactItems: js.UndefOr[js.Array[TransactGetItem]] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
  ): TransactGetItemsCommandInput = {
    js.Dynamic
      .literal(
        TransactItems = TransactItems.asInstanceOf[js.Any],
        ReturnConsumedCapacity = ReturnConsumedCapacity.asInstanceOf[js.Any]
      )
      .asInstanceOf[TransactGetItemsCommandInput]
  }
}

@js.native
trait TransactGetItemsCommandOutput extends MetadataBearer {
  val ConsumedCapacity: js.UndefOr[js.Array[ConsumedCapacity]] = js.native
  val Responses: js.UndefOr[js.Array[ItemResponse]] = js.native
}

@js.native
trait TransactWriteItemsCommandInput extends js.Object {
  val TransactItems: js.UndefOr[js.Array[TransactWriteItem]] = js.native
  val ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.native
  val ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.native
  val ClientRequestToken: js.UndefOr[String] = js.native
}

object TransactWriteItemsCommandInput {
  def apply(
      TransactItems: js.UndefOr[js.Array[TransactWriteItem]] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined,
      ClientRequestToken: js.UndefOr[String] = js.undefined
  ): TransactWriteItemsCommandInput = {
    js.Dynamic
      .literal(
        TransactItems = TransactItems.asInstanceOf[js.Any],
        ReturnConsumedCapacity = ReturnConsumedCapacity.asInstanceOf[js.Any],
        ReturnItemCollectionMetrics = ReturnItemCollectionMetrics.asInstanceOf[js.Any],
        ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any]
      )
      .asInstanceOf[TransactWriteItemsCommandInput]
  }
}

@js.native
trait TransactWriteItemsCommandOutput extends MetadataBearer {
  val ConsumedCapacity: js.UndefOr[js.Array[ConsumedCapacity]] = js.native
  val ItemCollectionMetrics: js.UndefOr[js.Dictionary[js.Array[ItemCollectionMetrics]]] = js.native
}

@js.native
trait BatchStatementRequest extends js.Object {
  val Statement: js.UndefOr[String] = js.native
  val Parameters: js.UndefOr[js.Array[AttributeValue]] = js.native
  val ConsistentRead: js.UndefOr[Boolean] = js.native
  val ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.native
}

object BatchStatementRequest {
  def apply(
      Statement: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[js.Array[AttributeValue]] = js.undefined,
      ConsistentRead: js.UndefOr[Boolean] = js.undefined,
      ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  ): BatchStatementRequest = {
    js.Dynamic
      .literal(
        Statement = Statement.asInstanceOf[js.Any],
        Parameters = Parameters.asInstanceOf[js.Any],
        ConsistentRead = ConsistentRead.asInstanceOf[js.Any],
        ReturnValuesOnConditionCheckFailure = ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any]
      )
      .asInstanceOf[BatchStatementRequest]
  }
}

@js.native
trait BatchStatementResponse extends js.Object {
  val Error: js.UndefOr[BatchStatementError] = js.native
  val TableName: js.UndefOr[String] = js.native
  val Item: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
}

object BatchStatementResponse {
  def apply(
      Error: js.UndefOr[BatchStatementError] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined,
      Item: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined
  ): BatchStatementResponse = {
    js.Dynamic
      .literal(
        Error = Error.asInstanceOf[js.Any],
        TableName = TableName.asInstanceOf[js.Any],
        Item = Item.asInstanceOf[js.Any]
      )
      .asInstanceOf[BatchStatementResponse]
  }
}

@js.native
trait BatchStatementError extends js.Object {
  val Code: js.UndefOr[BatchStatementErrorCodeEnum] = js.native
  val Message: js.UndefOr[String] = js.native
  val Item: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
}

object BatchStatementError {
  def apply(
      Code: js.UndefOr[BatchStatementErrorCodeEnum] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      Item: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined
  ): BatchStatementError = {
    js.Dynamic
      .literal(
        Code = Code.asInstanceOf[js.Any],
        Message = Message.asInstanceOf[js.Any],
        Item = Item.asInstanceOf[js.Any]
      )
      .asInstanceOf[BatchStatementError]
  }
}

@js.native
trait ConsumedCapacity extends js.Object {
  val TableName: js.UndefOr[String] = js.native
  val CapacityUnits: js.UndefOr[Double] = js.native
  val ReadCapacityUnits: js.UndefOr[Double] = js.native
  val WriteCapacityUnits: js.UndefOr[Double] = js.native
  val Table: js.UndefOr[Capacity] = js.native
  val LocalSecondaryIndexes: js.UndefOr[js.Dictionary[Capacity]] = js.native
  val GlobalSecondaryIndexes: js.UndefOr[js.Dictionary[Capacity]] = js.native
}

object ConsumedCapacity {
  def apply(
      TableName: js.UndefOr[String] = js.undefined,
      CapacityUnits: js.UndefOr[Double] = js.undefined,
      ReadCapacityUnits: js.UndefOr[Double] = js.undefined,
      WriteCapacityUnits: js.UndefOr[Double] = js.undefined,
      Table: js.UndefOr[Capacity] = js.undefined,
      LocalSecondaryIndexes: js.UndefOr[js.Dictionary[Capacity]] = js.undefined,
      GlobalSecondaryIndexes: js.UndefOr[js.Dictionary[Capacity]] = js.undefined
  ): ConsumedCapacity = {
    js.Dynamic
      .literal(
        TableName = TableName.asInstanceOf[js.Any],
        CapacityUnits = CapacityUnits.asInstanceOf[js.Any],
        ReadCapacityUnits = ReadCapacityUnits.asInstanceOf[js.Any],
        WriteCapacityUnits = WriteCapacityUnits.asInstanceOf[js.Any],
        Table = Table.asInstanceOf[js.Any],
        LocalSecondaryIndexes = LocalSecondaryIndexes.asInstanceOf[js.Any],
        GlobalSecondaryIndexes = GlobalSecondaryIndexes.asInstanceOf[js.Any]
      )
      .asInstanceOf[ConsumedCapacity]
  }
}

@js.native
trait Capacity extends js.Object {
  val ReadCapacityUnits: js.UndefOr[Double] = js.native
  val WriteCapacityUnits: js.UndefOr[Double] = js.native
  val CapacityUnits: js.UndefOr[Double] = js.native
}

object Capacity {
  def apply(
      ReadCapacityUnits: js.UndefOr[Double] = js.undefined,
      WriteCapacityUnits: js.UndefOr[Double] = js.undefined,
      CapacityUnits: js.UndefOr[Double] = js.undefined
  ): Capacity = {
    js.Dynamic
      .literal(
        ReadCapacityUnits = ReadCapacityUnits.asInstanceOf[js.Any],
        WriteCapacityUnits = WriteCapacityUnits.asInstanceOf[js.Any],
        CapacityUnits = CapacityUnits.asInstanceOf[js.Any]
      )
      .asInstanceOf[Capacity]
  }
}

@js.native
trait ParameterizedStatement extends js.Object {
  val Statement: js.UndefOr[String] = js.native
  val Parameters: js.UndefOr[js.Array[AttributeValue]] = js.native
  val ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.native
}

object ParameterizedStatement {
  def apply(
      Statement: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[js.Array[AttributeValue]] = js.undefined,
      ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  ): ParameterizedStatement = {
    js.Dynamic
      .literal(
        Statement = Statement.asInstanceOf[js.Any],
        Parameters = Parameters.asInstanceOf[js.Any],
        ReturnValuesOnConditionCheckFailure = ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any]
      )
      .asInstanceOf[ParameterizedStatement]
  }
}

@js.native
trait ItemResponse extends js.Object {
  val Item: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
}

object ItemResponse {
  def apply(
      Item: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined
  ): ItemResponse = {
    js.Dynamic
      .literal(
        Item = Item.asInstanceOf[js.Any]
      )
      .asInstanceOf[ItemResponse]
  }
}

@js.native
trait TransactGetItem extends js.Object {
  val Get: js.UndefOr[Get] = js.native
}

object TransactGetItem {
  def apply(
      Get: js.UndefOr[Get] = js.undefined
  ): TransactGetItem = {
    js.Dynamic
      .literal(
        Get = Get.asInstanceOf[js.Any]
      )
      .asInstanceOf[TransactGetItem]
  }
}

@js.native
trait Get extends js.Object {
  val Key: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  val TableName: js.UndefOr[String] = js.native
  val ProjectionExpression: js.UndefOr[String] = js.native
  val ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.native
}

object Get {
  def apply(
      Key: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined,
      ProjectionExpression: js.UndefOr[String] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.undefined
  ): Get = {
    js.Dynamic
      .literal(
        Key = Key.asInstanceOf[js.Any],
        TableName = TableName.asInstanceOf[js.Any],
        ProjectionExpression = ProjectionExpression.asInstanceOf[js.Any],
        ExpressionAttributeNames = ExpressionAttributeNames.asInstanceOf[js.Any]
      )
      .asInstanceOf[Get]
  }
}

@js.native
trait TransactWriteItem extends js.Object {
  val ConditionCheck: js.UndefOr[ConditionCheck] = js.native
  val Put: js.UndefOr[Put] = js.native
  val Delete: js.UndefOr[Delete] = js.native
  val Update: js.UndefOr[Update] = js.native
}

object TransactWriteItem {
  def apply(
      ConditionCheck: js.UndefOr[ConditionCheck] = js.undefined,
      Put: js.UndefOr[Put] = js.undefined,
      Delete: js.UndefOr[Delete] = js.undefined,
      Update: js.UndefOr[Update] = js.undefined
  ): TransactWriteItem = {
    js.Dynamic
      .literal(
        ConditionCheck = ConditionCheck.asInstanceOf[js.Any],
        Put = Put.asInstanceOf[js.Any],
        Delete = Delete.asInstanceOf[js.Any],
        Update = Update.asInstanceOf[js.Any]
      )
      .asInstanceOf[TransactWriteItem]
  }
}

@js.native
trait ConditionCheck extends js.Object {
  val Key: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  val TableName: js.UndefOr[String] = js.native
  val ConditionExpression: js.UndefOr[String] = js.native
  val ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.native
  val ExpressionAttributeValues: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  val ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.native
}

object ConditionCheck {
  def apply(
      Key: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined,
      ConditionExpression: js.UndefOr[String] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.undefined,
      ExpressionAttributeValues: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined,
      ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  ): ConditionCheck = {
    js.Dynamic
      .literal(
        Key = Key.asInstanceOf[js.Any],
        TableName = TableName.asInstanceOf[js.Any],
        ConditionExpression = ConditionExpression.asInstanceOf[js.Any],
        ExpressionAttributeNames = ExpressionAttributeNames.asInstanceOf[js.Any],
        ExpressionAttributeValues = ExpressionAttributeValues.asInstanceOf[js.Any],
        ReturnValuesOnConditionCheckFailure = ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any]
      )
      .asInstanceOf[ConditionCheck]
  }
}

@js.native
trait Put extends js.Object {
  val Item: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  val TableName: js.UndefOr[String] = js.native
  val ConditionExpression: js.UndefOr[String] = js.native
  val ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.native
  val ExpressionAttributeValues: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  val ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.native
}

object Put {
  def apply(
      Item: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined,
      ConditionExpression: js.UndefOr[String] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.undefined,
      ExpressionAttributeValues: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined,
      ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  ): Put = {
    js.Dynamic
      .literal(
        Item = Item.asInstanceOf[js.Any],
        TableName = TableName.asInstanceOf[js.Any],
        ConditionExpression = ConditionExpression.asInstanceOf[js.Any],
        ExpressionAttributeNames = ExpressionAttributeNames.asInstanceOf[js.Any],
        ExpressionAttributeValues = ExpressionAttributeValues.asInstanceOf[js.Any],
        ReturnValuesOnConditionCheckFailure = ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any]
      )
      .asInstanceOf[Put]
  }
}

@js.native
trait Delete extends js.Object {
  val Key: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  val TableName: js.UndefOr[String] = js.native
  val ConditionExpression: js.UndefOr[String] = js.native
  val ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.native
  val ExpressionAttributeValues: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  val ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.native
}

object Delete {
  def apply(
      Key: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined,
      ConditionExpression: js.UndefOr[String] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.undefined,
      ExpressionAttributeValues: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined,
      ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  ): Delete = {
    js.Dynamic
      .literal(
        Key = Key.asInstanceOf[js.Any],
        TableName = TableName.asInstanceOf[js.Any],
        ConditionExpression = ConditionExpression.asInstanceOf[js.Any],
        ExpressionAttributeNames = ExpressionAttributeNames.asInstanceOf[js.Any],
        ExpressionAttributeValues = ExpressionAttributeValues.asInstanceOf[js.Any],
        ReturnValuesOnConditionCheckFailure = ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any]
      )
      .asInstanceOf[Delete]
  }
}

@js.native
trait Update extends js.Object {
  val Key: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  val UpdateExpression: js.UndefOr[String] = js.native
  val TableName: js.UndefOr[String] = js.native
  val ConditionExpression: js.UndefOr[String] = js.native
  val ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.native
  val ExpressionAttributeValues: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  val ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.native
}

object Update {
  def apply(
      Key: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined,
      UpdateExpression: js.UndefOr[String] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined,
      ConditionExpression: js.UndefOr[String] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.undefined,
      ExpressionAttributeValues: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined,
      ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
  ): Update = {
    js.Dynamic
      .literal(
        Key = Key.asInstanceOf[js.Any],
        UpdateExpression = UpdateExpression.asInstanceOf[js.Any],
        TableName = TableName.asInstanceOf[js.Any],
        ConditionExpression = ConditionExpression.asInstanceOf[js.Any],
        ExpressionAttributeNames = ExpressionAttributeNames.asInstanceOf[js.Any],
        ExpressionAttributeValues = ExpressionAttributeValues.asInstanceOf[js.Any],
        ReturnValuesOnConditionCheckFailure = ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any]
      )
      .asInstanceOf[Update]
  }
}

@js.native
trait ItemCollectionMetrics extends js.Object {
  val ItemCollectionKey: js.UndefOr[js.Dictionary[AttributeValue]] = js.native
  val SizeEstimateRangeGB: js.UndefOr[js.Array[Double]] = js.native
}

object ItemCollectionMetrics {
  def apply(
      ItemCollectionKey: js.UndefOr[js.Dictionary[AttributeValue]] = js.undefined,
      SizeEstimateRangeGB: js.UndefOr[js.Array[Double]] = js.undefined
  ): ItemCollectionMetrics = {
    js.Dynamic
      .literal(
        ItemCollectionKey = ItemCollectionKey.asInstanceOf[js.Any],
        SizeEstimateRangeGB = SizeEstimateRangeGB.asInstanceOf[js.Any]
      )
      .asInstanceOf[ItemCollectionMetrics]
  }
}

// Enum types

sealed trait ReturnConsumedCapacity extends js.Any
object ReturnConsumedCapacity {
  val INDEXES = "INDEXES".asInstanceOf[ReturnConsumedCapacity]
  val NONE = "NONE".asInstanceOf[ReturnConsumedCapacity]
  val TOTAL = "TOTAL".asInstanceOf[ReturnConsumedCapacity]
}

sealed trait ReturnValuesOnConditionCheckFailure extends js.Any
object ReturnValuesOnConditionCheckFailure {
  val ALL_OLD = "ALL_OLD".asInstanceOf[ReturnValuesOnConditionCheckFailure]
  val NONE = "NONE".asInstanceOf[ReturnValuesOnConditionCheckFailure]
}

sealed trait BatchStatementErrorCodeEnum extends js.Any
object BatchStatementErrorCodeEnum {
  val AccessDenied = "AccessDenied".asInstanceOf[BatchStatementErrorCodeEnum]
  val ConditionalCheckFailed = "ConditionalCheckFailed".asInstanceOf[BatchStatementErrorCodeEnum]
  val DuplicateItem = "DuplicateItem".asInstanceOf[BatchStatementErrorCodeEnum]
  val InternalServerError = "InternalServerError".asInstanceOf[BatchStatementErrorCodeEnum]
  val ItemCollectionSizeLimitExceeded = "ItemCollectionSizeLimitExceeded".asInstanceOf[BatchStatementErrorCodeEnum]
  val ProvisionedThroughputExceeded = "ProvisionedThroughputExceeded".asInstanceOf[BatchStatementErrorCodeEnum]
  val RequestLimitExceeded = "RequestLimitExceeded".asInstanceOf[BatchStatementErrorCodeEnum]
  val ResourceNotFound = "ResourceNotFound".asInstanceOf[BatchStatementErrorCodeEnum]
  val ThrottlingError = "ThrottlingError".asInstanceOf[BatchStatementErrorCodeEnum]
  val TransactionConflict = "TransactionConflict".asInstanceOf[BatchStatementErrorCodeEnum]
  val ValidationError = "ValidationError".asInstanceOf[BatchStatementErrorCodeEnum]
}

sealed trait ReturnItemCollectionMetrics extends js.Any
object ReturnItemCollectionMetrics {
  val NONE = "NONE".asInstanceOf[ReturnItemCollectionMetrics]
  val SIZE = "SIZE".asInstanceOf[ReturnItemCollectionMetrics]
}
