package com.filippodeluca.jsfacade.aws
package dynamodb

import scalajs.js
import scalajs.js.annotation.JSImport

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
trait CreateTableCommandInput extends js.Object {
  def AttributeDefinitions: js.Array[AttributeDefinition] =
    js.native

  def BillingMode: js.UndefOr[BillingMode] =
    js.native
  def GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndex]] =
    js.native
  def KeySchema: js.Array[KeySchemaElement] = js.native
  def LocalSecondaryIndexes: js.UndefOr[js.Array[LocalSecondaryIndex]] =
    js.native
  def ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.native
  def StreamSpecification: js.UndefOr[StreamSpecification] = js.native

  /** Valid values are STANDARD and STANDARD_INFREQUENT_ACCESS */
  def TableClass: js.UndefOr[String] = js.native
  def TableName: String = js.native

  // def tags: js.Array[Tag]  = js.native
}

object CreateTableCommandInput {
  def apply(
      TableName: String,
      AttributeDefinitions: js.Array[AttributeDefinition],
      KeySchema: js.Array[KeySchemaElement],
      BillingMode: js.UndefOr[BillingMode] = js.undefined,
      GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndex]] =
        js.undefined,
      LocalSecondaryIndexes: js.UndefOr[js.Array[LocalSecondaryIndex]] =
        js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined,
      StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined,
      TableClass: js.UndefOr[String] = js.undefined
  ): CreateTableCommandInput = js.Dynamic
    .literal(
      TableName = TableName,
      AttributeDefinitions = AttributeDefinitions,
      KeySchema = KeySchema,
      BillingMode = BillingMode.asInstanceOf[js.Any],
      GlobalSecondaryIndexes = GlobalSecondaryIndexes.asInstanceOf[js.Any],
      LocalSecondaryIndexes = LocalSecondaryIndexes.asInstanceOf[js.Any],
      ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any],
      StreamSpecification = StreamSpecification.asInstanceOf[js.Any],
      TableClass = TableClass.asInstanceOf[js.Any]
    )
    .asInstanceOf[CreateTableCommandInput]
}

@js.native
trait CreateTableCommandOutput extends js.Object {
  def $metadata: ResponseMetadata = js.native
  def TableDescription: js.UndefOr[TableDescription] = js.native
}
