package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb
package commands

import com.filippodeluca.jsfacade.awssdk.client.dynamodb.models.*
import scalajs.js
import scalajs.js.annotation.JSImport

@js.native
@JSImport("@aws-sdk/client-dynamodb", "BatchExecuteStatementCommand")
class BatchExecuteStatementCommand(override val input: BatchExecuteStatementCommandInput)
    extends Command[BatchExecuteStatementCommandInput, BatchExecuteStatementCommandOutput]

object BatchExecuteStatementCommand {
  def apply(input: BatchExecuteStatementCommandInput): BatchExecuteStatementCommand =
    new BatchExecuteStatementCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "ExecuteStatementCommand")
class ExecuteStatementCommand(override val input: ExecuteStatementCommandInput)
    extends Command[ExecuteStatementCommandInput, ExecuteStatementCommandOutput]

object ExecuteStatementCommand {
  def apply(input: ExecuteStatementCommandInput): ExecuteStatementCommand =
    new ExecuteStatementCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "ExecuteTransactionCommand")
class ExecuteTransactionCommand(override val input: ExecuteTransactionCommandInput)
    extends Command[ExecuteTransactionCommandInput, ExecuteTransactionCommandOutput]

object ExecuteTransactionCommand {
  def apply(input: ExecuteTransactionCommandInput): ExecuteTransactionCommand =
    new ExecuteTransactionCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "TransactGetItemsCommand")
class TransactGetItemsCommand(override val input: TransactGetItemsCommandInput)
    extends Command[TransactGetItemsCommandInput, TransactGetItemsCommandOutput]

object TransactGetItemsCommand {
  def apply(input: TransactGetItemsCommandInput): TransactGetItemsCommand =
    new TransactGetItemsCommand(
      input
    )
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "TransactWriteItemsCommand")
class TransactWriteItemsCommand(override val input: TransactWriteItemsCommandInput)
    extends Command[TransactWriteItemsCommandInput, TransactWriteItemsCommandOutput]

object TransactWriteItemsCommand {
  def apply(input: TransactWriteItemsCommandInput): TransactWriteItemsCommand =
    new TransactWriteItemsCommand(
      input
    )
}
