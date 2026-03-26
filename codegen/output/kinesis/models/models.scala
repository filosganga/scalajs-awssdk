package com.filippodeluca.jsfacade.awssdk
package client
package kinesis
package models

import com.filippodeluca.jsfacade.awssdk.types.*
import scalajs.js

@js.native
trait DescribeStreamConsumerCommandInput extends js.Object {
  val StreamARN: js.UndefOr[String] = js.native
  val ConsumerName: js.UndefOr[String] = js.native
  val ConsumerARN: js.UndefOr[String] = js.native
  val StreamId: js.UndefOr[String] = js.native
}

object DescribeStreamConsumerCommandInput {
  def apply(
      StreamARN: js.UndefOr[String] = js.undefined,
      ConsumerName: js.UndefOr[String] = js.undefined,
      ConsumerARN: js.UndefOr[String] = js.undefined,
      StreamId: js.UndefOr[String] = js.undefined
  ): DescribeStreamConsumerCommandInput = {
    js.Dynamic
      .literal(
        StreamARN = StreamARN.asInstanceOf[js.Any],
        ConsumerName = ConsumerName.asInstanceOf[js.Any],
        ConsumerARN = ConsumerARN.asInstanceOf[js.Any],
        StreamId = StreamId.asInstanceOf[js.Any]
      )
      .asInstanceOf[DescribeStreamConsumerCommandInput]
  }
}

@js.native
trait DescribeStreamConsumerCommandOutput extends MetadataBearer {
  val ConsumerDescription: js.UndefOr[ConsumerDescription] = js.native
}

@js.native
trait ConsumerDescription extends js.Object {
  val ConsumerName: js.UndefOr[String] = js.native
  val ConsumerARN: js.UndefOr[String] = js.native
  val ConsumerStatus: js.UndefOr[ConsumerStatus] = js.native
  val ConsumerCreationTimestamp: js.UndefOr[js.Date] = js.native
  val StreamARN: js.UndefOr[String] = js.native
}

object ConsumerDescription {
  def apply(
      ConsumerName: js.UndefOr[String] = js.undefined,
      ConsumerARN: js.UndefOr[String] = js.undefined,
      ConsumerStatus: js.UndefOr[ConsumerStatus] = js.undefined,
      ConsumerCreationTimestamp: js.UndefOr[js.Date] = js.undefined,
      StreamARN: js.UndefOr[String] = js.undefined
  ): ConsumerDescription = {
    js.Dynamic
      .literal(
        ConsumerName = ConsumerName.asInstanceOf[js.Any],
        ConsumerARN = ConsumerARN.asInstanceOf[js.Any],
        ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any],
        ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any],
        StreamARN = StreamARN.asInstanceOf[js.Any]
      )
      .asInstanceOf[ConsumerDescription]
  }
}

// Enum types

sealed trait ConsumerStatus extends js.Any
object ConsumerStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ConsumerStatus]
  val CREATING = "CREATING".asInstanceOf[ConsumerStatus]
  val DELETING = "DELETING".asInstanceOf[ConsumerStatus]
}
