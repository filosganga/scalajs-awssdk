package com.filippodeluca.jsfacade.awssdk
package client
package sns

import com.filippodeluca.jsfacade.awssdk.config.resolver.RegionInputConfig
import com.filippodeluca.jsfacade.awssdk.middleware.endpoint._
import com.filippodeluca.jsfacade.awssdk.middleware.retry.RetryInputConfig
import com.filippodeluca.jsfacade.awssdk.middleware.signing.AwsAuthInputConfig
import com.filippodeluca.jsfacade.awssdk.middleware.userAgent.UserAgentInputConfig
import com.filippodeluca.jsfacade.awssdk.types._
import com.filippodeluca.jsfacade.awssdk.types.identity._
import scalajs.js
import scalajs.js._
import scalajs.js.annotation.JSImport

@js.native
@JSImport("@aws-sdk/client-sns", "SNSClient")
class SNSClient(configuration: SNSClientConfig) extends js.Object {
  def destroy(): Unit = js.native
  def send[InputType, OutputType](
      command: Command[InputType, OutputType]
  ): js.Promise[OutputType] = js.native
}

@js.native
@JSImport("@aws-sdk/client-sns", "Command")
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
trait SNSClientConfig
    extends js.Object
    with AwsAuthInputConfig
    with EndpointInputConfig
    with EndpointDiscoveryInputConfig
    with UserAgentInputConfig
    with RetryInputConfig
    with RegionInputConfig {

  val defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] =
    js.native

  val disableHostPrefix: js.UndefOr[Boolean] = js.native

  val retryMode: js.UndefOr[String | Int] = js.native

  val logger: js.UndefOr[Logger] = js.native

  val requestHandler: js.UndefOr[js.Any] = js.native
}

object SNSClientConfig {
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
  ): SNSClientConfig = {

    val properties = Map(
      "region" -> region.asInstanceOf[js.Any],
      "useFipsEndpoint" -> useFipsEndpoint.asInstanceOf[js.Any],
      "defaultsMode" -> defaultsMode.asInstanceOf[js.Any],
      "credentials" -> credentials.asInstanceOf[js.Any],
      "endpoint" -> endpoint.asInstanceOf[js.Any],
      "endpointProvider" -> endpointProvider.asInstanceOf[js.Any],
      "customUserAgent" -> customUserAgent.asInstanceOf[js.Any],
      "maxAttempts" -> maxAttempts.asInstanceOf[js.Any],
      "disableHostPrefix" -> disableHostPrefix.asInstanceOf[js.Any],
      "endpointCacheSize" -> endpointCacheSize.asInstanceOf[js.Any],
      "endpointDiscoveryEnabled" -> endpointDiscoveryEnabled
        .asInstanceOf[js.Any],
      "useDualstackEndpoint" -> useDualstackEndpoint.asInstanceOf[js.Any],
      "logger" -> logger.asInstanceOf[js.Any],
      "retryMode" -> retryMode.asInstanceOf[js.Any],
      "retryStrategy" -> retryStrategy.asInstanceOf[js.Any],
      "signer" -> signer.asInstanceOf[js.Any],
      "signingRegion" -> signingRegion.asInstanceOf[js.Any],
      "signingEscapePath" -> signingEscapePath.asInstanceOf[js.Any],
      "systemClockOffset" -> systemClockOffset.asInstanceOf[js.Any]
    ).view.filter { case (_, v) => !js.isUndefined(v) }.toList

    js.Dynamic.literal
      .applyDynamic("apply")(properties: _*)
      .asInstanceOf[SNSClientConfig]

  }
}
