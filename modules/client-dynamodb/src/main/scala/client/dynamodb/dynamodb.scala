package com.filippodeluca.jsfacade.awssdkv
package client
package dynamodb

import scalajs.js
import scalajs.js._
import scalajs.js.annotation.JSImport

import com.filippodeluca.jsfacade.awssdkv.types._
import com.filippodeluca.jsfacade.awssdkv.middleware.endpoint._
import com.filippodeluca.jsfacade.awssdkv.types.identity._
import com.filippodeluca.jsfacade.awssdkv.middleware.userAgent.UserAgentInputConfig
import com.filippodeluca.jsfacade.awssdkv.middleware.signing.AwsAuthInputConfig
import com.filippodeluca.jsfacade.awssdkv.middleware.retry.RetryInputConfig
import com.filippodeluca.jsfacade.awssdkv.config.resolver.RegionInputConfig

@js.native
@JSImport("@aws-sdk/client-dynamodb", "DynamoDBClient")
class DynamoDBClient(configuration: DynamoDBClientConfig) extends js.Object {
  def destroy(): Unit = js.native
  def send[InputType, OutputType](
      command: Command[InputType, OutputType]
  ): js.Promise[OutputType] = js.native
}

@js.native
@JSImport("@aws-sdk/client-dynamodb", "Command")
class Command[ClientInput, ClientOutput] extends js.Object {
  val input: ClientInput = js.native
}

sealed trait DefaultsMode
object DefaultsMode {
  val Standard = "standard".asInstanceOf[DefaultsMode]
  val InRegion = "in-region".asInstanceOf[DefaultsMode]
  val CrossRegion = "cross-region".asInstanceOf[DefaultsMode]
  val Mobile = "mobile".asInstanceOf[DefaultsMode]
  val Auto = "auto".asInstanceOf[DefaultsMode]
  val Legacy = "legacy".asInstanceOf[DefaultsMode]
}

@js.native
trait DynamoDBClientConfig
    extends js.Object
    // with AwsAuthInputConfig
    // with EndpointInputConfig
    // with EndpointDiscoveryInputConfig
    // with UserAgentInputConfig
    // with RetryInputConfig
    with RegionInputConfig {

  // val defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] =
  //   js.native

  // val disableHostPrefix: js.UndefOr[Boolean] = js.native

  // val retryMode: js.UndefOr[String | Int] = js.native

  // val logger: js.UndefOr[Logger] = js.native

  // TODO https://docs.aws.amazon.com/AWSJavaScriptSDK/v3/latest/clients/client-dynamodb/interfaces/dynamodbclientconfig.html#requesthandler
  // val requestHandler: js.UndefOr[js.Any] = js.native
}

object DynamoDBClientConfig {
  def apply(
      region: js.UndefOr[String | Provider[String]] = js.undefined,
      useFipsEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined,
      defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] =
        js.undefined,
      credentials: js.UndefOr[Provider[
        AwsCredentialIdentity
      ] | AwsCredentialIdentity] = js.undefined,
      endpoint: js.UndefOr[String] = js.undefined,
      endpointProvider: js.UndefOr[
        js.Function2[EndpointParameters, EndpointProviderContext, EndpointV2]
      ] = js.undefined,
      customUserAgent: js.UndefOr[String] = js.undefined,
      maxAttempts: js.UndefOr[Int] = js.undefined,
      disableHostPrefix: js.UndefOr[Boolean] = js.undefined,
      endpointCacheSize: js.UndefOr[Int] = js.undefined,
      endpointDiscoveryEnabled: js.UndefOr[Int] = js.undefined,
      useDualstackEndpoint: js.UndefOr[Boolean | Provider[Boolean]] =
        js.undefined,
      logger: js.UndefOr[Logger] = js.undefined,
      retryMode: js.UndefOr[String | Provider[String]] = js.undefined,
      retryStrategy: js.UndefOr[RetryStrategy | RetryStrategyV2] = js.undefined,
      signer: js.UndefOr[
        RequestSigner | (AuthScheme) => js.Promise[RequestSigner]
      ] = js.undefined,
      signingRegion: js.UndefOr[String] = js.undefined,
      signingEscapePath: js.UndefOr[Boolean] = js.undefined,
      systemClockOffset: js.UndefOr[Int] = js.undefined
  ): DynamoDBClientConfig = {

    val foo = js.Dynamic.literal("foo" -> "foo")

    def toEntry[A](name: String, x: js.UndefOr[A]): List[(String, js.Any)] =
      x.fold(List.empty[(String, js.Any)]) { x =>
        List(name -> x.asInstanceOf[js.Any])
      }

    val entries = List(
      toEntry("region", region),
      toEntry("useFipsEndpoint", useFipsEndpoint),
      // toEntry("defaultsMode", defaultsMode),
      toEntry("credentials", credentials),
      toEntry("endpoint", endpoint),
      toEntry("endpointProvider", endpointProvider),
      toEntry("customUserAgent", customUserAgent),
      toEntry("maxAttempts", maxAttempts),
      toEntry("disableHostPrefix", disableHostPrefix),
      toEntry("endpointCacheSize", endpointCacheSize),
      toEntry("endpointDiscoveryEnabled", endpointDiscoveryEnabled),
      toEntry("useDualstackEndpoint", useDualstackEndpoint),
      toEntry("logger", logger),
      toEntry("retryMode", retryMode),
      toEntry("retryStrategy", retryStrategy),
      toEntry("signer", signer),
      toEntry("signingRegion", signingRegion),
      toEntry("signingEscapePath", signingEscapePath),
      toEntry("systemClockOffset", systemClockOffset)
    ).flatten

    js.Dictionary(entries: _*).asInstanceOf[DynamoDBClientConfig]
  }
}
