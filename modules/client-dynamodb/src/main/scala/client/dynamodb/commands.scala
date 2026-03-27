package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb
package commands

import com.filippodeluca.jsfacade.awssdk.client.dynamodb.models.*
import scalajs.js
import scalajs.js.annotation.JSImport

@js.native
@JSImport("@aws-sdk/client-dynamodb", "BatchGetItemCommand")
class BatchGetItemCommand(override val input: BatchGetItemCommandInput)
    extends Command[BatchGetItemCommandInput, BatchGetItemCommandOutput]

object BatchGetItemCommand {
  def apply(input: BatchGetItemCommandInput): BatchGetItemCommand =
    new BatchGetItemCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "BatchWriteItemCommand")
class BatchWriteItemCommand(override val input: BatchWriteItemCommandInput)
    extends Command[BatchWriteItemCommandInput, BatchWriteItemCommandOutput]

object BatchWriteItemCommand {
  def apply(input: BatchWriteItemCommandInput): BatchWriteItemCommand =
    new BatchWriteItemCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "CreateTableCommand")
class CreateTableCommand(override val input: CreateTableCommandInput)
    extends Command[CreateTableCommandInput, CreateTableCommandOutput]

object CreateTableCommand {
  def apply(input: CreateTableCommandInput): CreateTableCommand =
    new CreateTableCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "DeleteItemCommand")
class DeleteItemCommand(override val input: DeleteItemCommandInput)
    extends Command[DeleteItemCommandInput, DeleteItemCommandOutput]

object DeleteItemCommand {
  def apply(input: DeleteItemCommandInput): DeleteItemCommand =
    new DeleteItemCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "DeleteTableCommand")
class DeleteTableCommand(override val input: DeleteTableCommandInput)
    extends Command[DeleteTableCommandInput, DeleteTableCommandOutput]

object DeleteTableCommand {
  def apply(input: DeleteTableCommandInput): DeleteTableCommand =
    new DeleteTableCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "GetItemCommand")
class GetItemCommand(override val input: GetItemCommandInput)
    extends Command[GetItemCommandInput, GetItemCommandOutput]

object GetItemCommand {
  def apply(input: GetItemCommandInput): GetItemCommand = new GetItemCommand(
    input
  )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "PutItemCommand")
class PutItemCommand(override val input: PutItemCommandInput)
    extends Command[PutItemCommandInput, PutItemCommandOutput]

object PutItemCommand {
  def apply(input: PutItemCommandInput): PutItemCommand = new PutItemCommand(
    input
  )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "QueryCommand")
class QueryCommand(override val input: QueryCommandInput)
    extends Command[QueryCommandInput, QueryCommandOutput]

object QueryCommand {
  def apply(input: QueryCommandInput): QueryCommand = new QueryCommand(
    input
  )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "ScanCommand")
class ScanCommand(override val input: ScanCommandInput)
    extends Command[ScanCommandInput, ScanCommandOutput]

object ScanCommand {
  def apply(input: ScanCommandInput): ScanCommand = new ScanCommand(
    input
  )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "DescribeTableCommand")
class DescribeTableCommand(override val input: DescribeTableCommandInput)
    extends Command[DescribeTableCommandInput, DescribeTableCommandOutput]

object DescribeTableCommand {
  def apply(input: DescribeTableCommandInput): DescribeTableCommand =
    new DescribeTableCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "UpdateItemCommand")
class UpdateItemCommand(override val input: UpdateItemCommandInput)
    extends Command[UpdateItemCommandInput, UpdateItemCommandOutput]

object UpdateItemCommand {
  def apply(input: UpdateItemCommandInput): UpdateItemCommand =
    new UpdateItemCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "TransactGetItemsCommand")
class TransactGetItemsCommand(override val input: TransactGetItemsCommandInput)
    extends Command[TransactGetItemsCommandInput, TransactGetItemsCommandOutput]

object TransactGetItemsCommand {
  def apply(input: TransactGetItemsCommandInput): TransactGetItemsCommand =
    new TransactGetItemsCommand(input)
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "TransactWriteItemsCommand")
class TransactWriteItemsCommand(
    override val input: TransactWriteItemsCommandInput
) extends Command[
      TransactWriteItemsCommandInput,
      TransactWriteItemsCommandOutput
    ]

object TransactWriteItemsCommand {
  def apply(
      input: TransactWriteItemsCommandInput
  ): TransactWriteItemsCommand =
    new TransactWriteItemsCommand(input)
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "ExecuteStatementCommand")
class ExecuteStatementCommand(
    override val input: ExecuteStatementCommandInput
) extends Command[
      ExecuteStatementCommandInput,
      ExecuteStatementCommandOutput
    ]

object ExecuteStatementCommand {
  def apply(input: ExecuteStatementCommandInput): ExecuteStatementCommand =
    new ExecuteStatementCommand(input)
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "ExecuteTransactionCommand")
class ExecuteTransactionCommand(
    override val input: ExecuteTransactionCommandInput
) extends Command[
      ExecuteTransactionCommandInput,
      ExecuteTransactionCommandOutput
    ]

object ExecuteTransactionCommand {
  def apply(
      input: ExecuteTransactionCommandInput
  ): ExecuteTransactionCommand =
    new ExecuteTransactionCommand(input)
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "BatchExecuteStatementCommand")
class BatchExecuteStatementCommand(
    override val input: BatchExecuteStatementCommandInput
) extends Command[
      BatchExecuteStatementCommandInput,
      BatchExecuteStatementCommandOutput
    ]

object BatchExecuteStatementCommand {
  def apply(
      input: BatchExecuteStatementCommandInput
  ): BatchExecuteStatementCommand =
    new BatchExecuteStatementCommand(input)
}
