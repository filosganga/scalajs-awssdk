package com.filippodeluca.jsfacade.awssdk
package client
package dynamodb
package models

import com.filippodeluca.jsfacade.awssdk.types.MetadataBearer
import scalajs.js
import scalajs.js.annotation.JSImport
import scalajs.js.typedarray.Uint8Array

/** <p>Represents the input of a <code>Scan</code> operation.</p>
  */
@js.native
trait ScanCommandInput extends js.Object {

  /** <p>The name of the table containing the requested items = js.native or, if
    * you provide <code>IndexName</code>, the name of the table to which that
    * index belongs.</p>
    */
  val TableName: String = js.native

  /** <p>The name of a secondary index to scan. This index can be any local
    * secondary index or global secondary index. Note that if you use the
    * <code>IndexName</code> parameter, you must also provide
    * <code>TableName</code>.</p>
    */
  val IndexName: js.UndefOr[String] = js.native

  /** <p>The maximum number of items to evaluate (not necessarily the number of
    * matching items). If DynamoDB processes the number of items up to the limit
    * while processing the results, it stops the operation and returns the
    * matching values up to that point, and a key in
    * <code>LastEvaluatedKey</code> to apply in a subsequent operation, so that
    * you can pick up where you left off. Also, if the processed dataset size
    * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
    * and returns the matching values up to the limit, and a key in
    * <code>LastEvaluatedKey</code> to apply in a subsequent operation to
    * continue the operation. For more information, see <a
    * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Working
    * with Queries</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  val Limit: js.UndefOr[Int] = js.native

  /** <p>The attributes to be returned in the result. You can retrieve all item
    * attributes, specific item attributes, the count of matching items, or in
    * the case of an index, some or all of the attributes projected into the
    * index.</p> <ul> <li> <p> <code>ALL_ATTRIBUTES</code> - Returns all of the
    * item attributes from the specified table or index. If you query a local
    * secondary index, then for each matching item in the index, DynamoDB
    * fetches the entire item from the parent table. If the index is configured
    * to project all item attributes, then all of the data can be obtained from
    * the local secondary index, and no fetching is required.</p> </li> <li> <p>
    * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
    * index. Retrieves all attributes that have been projected into the index.
    * If the index is configured to project all attributes, this return value is
    * equivalent to specifying <code>ALL_ATTRIBUTES</code>.</p> </li> <li> <p>
    * <code>COUNT</code> - Returns the number of matching items, rather than the
    * matching items themselves.</p> </li> <li> <p>
    * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
    * <code>ProjectionExpression</code>. This return value is equivalent to
    * specifying <code>ProjectionExpression</code> without specifying any value
    * for <code>Select</code>.</p> <p>If you query or scan a local secondary
    * index and request only attributes that are projected into that index, the
    * operation reads only the index and not the table. If any of the requested
    * attributes are not projected into the local secondary index, DynamoDB
    * fetches each of these attributes from the parent table. This extra
    * fetching incurs additional throughput cost and latency.</p> <p>If you
    * query or scan a global secondary index, you can only request attributes
    * that are projected into the index. Global secondary index queries cannot
    * fetch attributes from the parent table.</p> </li> </ul> <p>If neither
    * <code>Select</code> nor <code>ProjectionExpression</code> are specified,
    * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
    * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
    * cannot use both <code>Select</code> and <code>ProjectionExpression</code>
    * together in a single request, unless the value for <code>Select</code> is
    * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
    * <code>ProjectionExpression</code> without any value for
    * <code>Select</code>.)</p> <note> <p>If you use the
    * <code>ProjectionExpression</code> parameter, then the value for
    * <code>Select</code> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any
    * other value for <code>Select</code> will return an error.</p> </note>
    */
  val Select: js.UndefOr[Select] = js.native

  /** <p>The primary key of the first item that this operation will evaluate.
    * Use the value that was returned for <code>LastEvaluatedKey</code> in the
    * previous operation.</p> <p>The data type for
    * <code>ExclusiveStartKey</code> must be String, Number or Binary. No set
    * data types are allowed.</p> <p>In a parallel scan, a <code>Scan</code>
    * request that includes <code>ExclusiveStartKey</code> must specify the same
    * segment whose previous <code>Scan</code> returned the corresponding value
    * of <code>LastEvaluatedKey</code>.</p>
    */
  val ExclusiveStartKey: js.UndefOr[js.Dictionary[AttributeValue]] = js.native

  /** <p>Determines the level of detail about either provisioned or on-demand
    * throughput consumption that is returned in the response:</p> <ul> <li> <p>
    * <code>INDEXES</code> - The response includes the aggregate
    * <code>ConsumedCapacity</code> for the operation, together with
    * <code>ConsumedCapacity</code> for each table and secondary index that was
    * accessed.</p> <p>Note that some operations, such as <code>GetItem</code>
    * and <code>BatchGetItem</code>, do not access any indexes at all. In these
    * cases, specifying <code>INDEXES</code> will only return
    * <code>ConsumedCapacity</code> information for table(s).</p> </li> <li> <p>
    * <code>TOTAL</code> - The response includes only the aggregate
    * <code>ConsumedCapacity</code> for the operation.</p> </li> <li> <p>
    * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
    * in the response.</p> </li> </ul>
    */
  val ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.native

  /** <p>For a parallel <code>Scan</code> request, <code>TotalSegments</code>
    * represents the total number of segments into which the <code>Scan</code>
    * operation will be divided. The value of <code>TotalSegments</code>
    * corresponds to the number of application workers that will perform the
    * parallel scan. For example, if you want to use four application threads to
    * scan a table or an index, specify a <code>TotalSegments</code> value of
    * 4.</p> <p>The value for <code>TotalSegments</code> must be greater than or
    * equal to 1, and less than or equal to 1000000. If you specify a
    * <code>TotalSegments</code> value of 1, the <code>Scan</code> operation
    * will be sequential rather than parallel.</p> <p>If you specify
    * <code>TotalSegments</code>, you must also specify
    * <code>Segment</code>.</p>
    */
  val TotalSegments: js.UndefOr[Int] = js.native

  /** <p>For a parallel <code>Scan</code> request, <code>Segment</code>
    * identifies an individual segment to be scanned by an application
    * worker.</p> <p>Segment IDs are zero-based, so the first segment is always
    * 0. For example, if you want to use four application threads to scan a
    * table or an index, then the first thread specifies a <code>Segment</code>
    * value of 0, the second thread specifies 1, and so on.</p> <p>The value of
    * <code>LastEvaluatedKey</code> returned from a parallel <code>Scan</code>
    * request must be used as <code>ExclusiveStartKey</code> with the same
    * segment ID in a subsequent <code>Scan</code> operation.</p> <p>The value
    * for <code>Segment</code> must be greater than or equal to 0, and less than
    * the value provided for <code>TotalSegments</code>.</p> <p>If you provide
    * <code>Segment</code>, you must also provide
    * <code>TotalSegments</code>.</p>
    */
  val Segment: js.UndefOr[Int] = js.native

  /** <p>A string that identifies one or more attributes to retrieve from the
    * specified table or index. These attributes can include scalars, sets, or
    * elements of a JSON document. The attributes in the expression must be
    * separated by commas.</p> <p>If no attribute names are specified, then all
    * attributes will be returned. If any of the requested attributes are not
    * found, they will not appear in the result.</p> <p>For more information,
    * see <a
    * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Specifying
    * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  val ProjectionExpression: js.UndefOr[String] = js.native

  /** <p>A string that contains conditions that DynamoDB applies after the
    * <code>Scan</code> operation, but before the data is returned to you. Items
    * that do not satisfy the <code>FilterExpression</code> criteria are not
    * returned.</p> <note> <p>A <code>FilterExpression</code> is applied after
    * the items have already been read = js.native the process of filtering does
    * not consume any additional read capacity units.</p> </note> <p>For more
    * information, see <a
    * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Query.FilterExpression">Filter
    * Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  val FilterExpression: js.UndefOr[String] = js.native

  /** <p>One or more substitution tokens for attribute names in an expression.
    * The following are some use cases for using
    * <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p>To access an
    * attribute whose name conflicts with a DynamoDB reserved word.</p> </li>
    * <li> <p>To create a placeholder for repeating occurrences of an attribute
    * name in an expression.</p> </li> <li> <p>To prevent special characters in
    * an attribute name from being misinterpreted in an expression.</p> </li>
    * </ul> <p>Use the <b>#</b> character in an expression to dereference an
    * attribute name. For example, consider the following attribute name:</p>
    * <ul> <li> <p> <code>Percentile</code> </p> </li> </ul> <p>The name of this
    * attribute conflicts with a reserved word, so it cannot be used directly in
    * an expression. (For the complete list of reserved words, see <a
    * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
    * Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around
    * this, you could specify the following for
    * <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p>
    * <code>{"#P":"Percentile"}</code> </p> </li> </ul> <p>You could then use
    * this substitution in an expression, as in this example:</p> <ul> <li> <p>
    * <code>#P = :val</code> </p> </li> </ul> <note> <p>Tokens that begin with
    * the <b>:</b> character are <i>expression attribute values</i>, which are
    * placeholders for the actual value at runtime.</p> </note> <p>For more
    * information on expression attribute names, see <a
    * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Specifying
    * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  val ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] = js.native

  /** <p>One or more values that can be substituted in an expression.</p> <p>Use
    * the <b>:</b> (colon) character in an expression to dereference an
    * attribute value. For example, suppose that you wanted to check whether the
    * value of the <code>ProductStatus</code> attribute was one of the
    * following: </p> <p> <code>Available | Backordered | Discontinued</code>
    * </p> <p>You would first need to specify
    * <code>ExpressionAttributeValues</code> as follows:</p> <p> <code>{
    * ":avail":{"S":"Available"}, ":back":{"S":"Backordered"},
    * ":disc":{"S":"Discontinued"} }</code> </p> <p>You could then use these
    * values in an expression, such as this:</p> <p> <code>ProductStatus IN
    * (:avail, :back, :disc)</code> </p> <p>For more information on expression
    * attribute values, see <a
    * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition
    * Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  val ExpressionAttributeValues: js.UndefOr[js.Dictionary[AttributeValue]] =
    js.native

  /** <p>A Boolean value that determines the read consistency model during the
    * scan:</p> <ul> <li> <p>If <code>ConsistentRead</code> is
    * <code>false</code>, then the data returned from <code>Scan</code> might
    * not contain the results from other recently completed write operations
    * (<code>PutItem</code>, <code>UpdateItem</code>, or
    * <code>DeleteItem</code>).</p> </li> <li> <p>If <code>ConsistentRead</code>
    * is <code>true</code>, then all of the write operations that completed
    * before the <code>Scan</code> began are guaranteed to be contained in the
    * <code>Scan</code> response.</p> </li> </ul> <p>The default setting for
    * <code>ConsistentRead</code> is <code>false</code>.</p> <p>The
    * <code>ConsistentRead</code> parameter is not supported on global secondary
    * indexes. If you scan a global secondary index with
    * <code>ConsistentRead</code> set to true, you will receive a
    * <code>ValidationException</code>.</p>
    */
  val ConsistentRead: js.UndefOr[Boolean] = js.native
}

object ScanCommandInput {
  def apply(
      TableName: String,
      IndexName: js.UndefOr[String] = js.undefined,
      Limit: js.UndefOr[Double] = js.undefined,
      Select: js.UndefOr[Select] = js.undefined,
      ExclusiveStartKey: js.UndefOr[js.Dictionary[AttributeValue]] =
        js.undefined,
      TotalSegments: js.UndefOr[Int] = js.undefined,
      Segment: js.UndefOr[Int] = js.undefined,
      ProjectionExpression: js.UndefOr[String] = js.undefined,
      FilterExpression: js.UndefOr[String] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[js.Dictionary[String]] =
        js.undefined,
      ExpressionAttributeValues: js.UndefOr[js.Dictionary[AttributeValue]] =
        js.undefined,
      ConsistentRead: js.UndefOr[Boolean] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
  ): ScanCommandInput = js.Dynamic
    .literal(
      TableName = TableName.asInstanceOf[js.Any],
      IndexName = IndexName.asInstanceOf[js.Any],
      Limit = Limit.asInstanceOf[js.Any],
      Select = Select.asInstanceOf[js.Any],
      ExclusiveStartKey = ExclusiveStartKey.asInstanceOf[js.Any],
      ReturnConsumedCapacity = ReturnConsumedCapacity.asInstanceOf[js.Any],
      TotalSegments = TotalSegments.asInstanceOf[js.Any],
      Segment = Segment.asInstanceOf[js.Any],
      ProjectionExpression = ProjectionExpression.asInstanceOf[js.Any],
      FilterExpression = FilterExpression.asInstanceOf[js.Any],
      ExpressionAttributeNames = ExpressionAttributeNames.asInstanceOf[js.Any],
      ExpressionAttributeValues =
        ExpressionAttributeValues.asInstanceOf[js.Any],
      ConsistentRead = ConsistentRead.asInstanceOf[js.Any]
    )
    .asInstanceOf[ScanCommandInput]
}

/** <p>Represents the output of a <code>Scan</code> operation.</p>
  */
@js.native
trait ScanCommandOutput extends MetadataBearer {

  /** <p>An array of item attributes that match the scan criteria. Each element
    * in this array consists of an attribute name and the value for that
    * attribute.</p>
    */
  val Items: js.UndefOr[js.Dictionary[AttributeValue]] = js.native

  /** <p>The number of items in the response.</p> <p>If you set
    * <code>ScanFilter</code> in the request, then <code>Count</code> is the
    * number of items returned after the filter was applied, and
    * <code>ScannedCount</code> is the number of matching items before the
    * filter was applied.</p> <p>If you did not use a filter in the request,
    * then <code>Count</code> is the same as <code>ScannedCount</code>.</p>
    */
  val Count: js.UndefOr[Int] = js.native

  /** <p>The number of items evaluated, before any <code>ScanFilter</code> is
    * applied. A high <code>ScannedCount</code> value with few, or no,
    * <code>Count</code> results indicates an inefficient <code>Scan</code>
    * operation. For more information, see <a
    * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count
    * and ScannedCount</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    * <p>If you did not use a filter in the request, then
    * <code>ScannedCount</code> is the same as <code>Count</code>.</p>
    */
  val ScannedCount: js.UndefOr[Int] = js.native

  /** <p>The primary key of the item where the operation stopped, inclusive of
    * the previous result set. Use this value to start a new operation,
    * excluding this value in the new request.</p> <p>If
    * <code>LastEvaluatedKey</code> is empty, then the "last page" of results
    * has been processed and there is no more data to be retrieved.</p> <p>If
    * <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean
    * that there is more data in the result set. The only way to know when you
    * have reached the end of the result set is when
    * <code>LastEvaluatedKey</code> is empty.</p>
    */
  val LastEvaluatedKey: js.UndefOr[js.Dictionary[AttributeValue]] = js.native

  /** <p>The capacity units consumed by the <code>Scan</code> operation. The
    * data returned includes the total provisioned throughput consumed, along
    * with statistics for the table and any indexes involved in the operation.
    * <code>ConsumedCapacity</code> is only returned if the
    * <code>ReturnConsumedCapacity</code> parameter was specified. For more
    * information, see <a
    * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
    * Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  val ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.native
}
