val munitV = "1.2.4"
val scalacheckEffectV = "2.1.0"
val munitCatsEffectV = "2.2.0"
val catsScalacheckV = "0.3.2"
val catsEffectV = "3.7.0"
val fs2V = "3.13.0"

val awsSdkJsV = "3.370.0"

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / scalaVersion := "3.7.4"
ThisBuild / organization := "com.filippodeluca"
ThisBuild / organizationName := "Filippo De Luca"
ThisBuild / dynverSeparator := "-"
ThisBuild / resolvers += "Sonatype Public" at "https://oss.sonatype.org/content/groups/public/"
ThisBuild / evictionErrorLevel := Level.Warn
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / dynverSonatypeSnapshots := true

ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true
ThisBuild / credentials ++= {
  for {
    usr <- sys.env.get("SONATYPE_USER")
    password <- sys.env.get("SONATYPE_PASS")
  } yield Credentials(
    "Sonatype Nexus Repository Manager",
    "s01.oss.sonatype.org",
    usr,
    password
  )
}.toList

ThisBuild / developers := List(
  Developer(
    id = "filosganga",
    name = "Filippo De Luca",
    email = "me@filippodeluca.com",
    url = url("https://github.com/filosganga")
  )
)

ThisBuild / licenses := List(
  License.Apache2
)

ThisBuild / homepage := Some(
  url("https://github.com/filosganga/scalajs-awssdk")
)

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/filosganga/scalajs-awssdk"),
    "scm:git@github.com:filosganga/scalajs-awssdk.git"
  )
)

val commonsSettings = List(
  scalacOptions -= "-Xfatal-warnings",
  scalacOptions -= "-Wdead-code"
)

val testSettings = List(
  libraryDependencies ++= List(
    "org.scalameta" %%% "munit" % munitV % Test,
    "org.typelevel" %%% "munit-cats-effect" % munitCatsEffectV % Test,
    "org.typelevel" %%% "cats-effect" % catsEffectV % Test,
    "org.typelevel" %%% "scalacheck-effect-munit" % scalacheckEffectV % Test,
    "io.chrisdavenport" %%% "cats-scalacheck" % catsScalacheckV % Test
  )
)

lazy val root = project
  .in(file("."))
  .aggregate(
    core,
    clientDynamodb,
    clientS3,
    clientSes,
    clientKinesis,
    clientSns
  )

lazy val core = project
  .in(file("modules/core"))
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .settings(
    name := "scalajs-awssdk-types",
    commonsSettings,
    testSettings,
    scalaJSUseMainModuleInitializer := false,
    Compile / npmDependencies ++= List(
      "@aws-sdk/types" -> awsSdkJsV,
      "@aws-sdk/middleware-signing" -> awsSdkJsV,
      "@aws-sdk/middleware-retry" -> awsSdkJsV,
      "@aws-sdk/util-retry" -> awsSdkJsV
    )
  )

lazy val clientDynamodb = project
  .in(file("modules/client-dynamodb"))
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .dependsOn(core)
  .settings(
    name := "scalajs-awssdk-client-dynamodb",
    commonsSettings,
    testSettings,
    scalaJSUseMainModuleInitializer := false,
    Compile / npmDependencies += "@aws-sdk/client-dynamodb" -> awsSdkJsV
  )

lazy val clientS3 = project
  .in(file("modules/client-s3"))
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .dependsOn(core)
  .settings(
    name := "scalajs-awssdk-client-s3",
    commonsSettings,
    testSettings,
    scalaJSUseMainModuleInitializer := false,
    Compile / npmDependencies += "@aws-sdk/client-s3" -> awsSdkJsV,
    libraryDependencies += "co.fs2" %%% "fs2-io" % fs2V % Test
  )

lazy val clientSes = project
  .in(file("modules/client-ses"))
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .dependsOn(core)
  .settings(
    name := "scalajs-awssdk-client-ses",
    commonsSettings,
    testSettings,
    scalaJSUseMainModuleInitializer := false,
    Compile / npmDependencies += "@aws-sdk/client-ses" -> awsSdkJsV
  )

lazy val clientKinesis = project
  .in(file("modules/client-kinesis"))
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .dependsOn(core)
  .settings(
    name := "scalajs-awssdk-client-kinesis",
    commonsSettings,
    testSettings,
    scalaJSUseMainModuleInitializer := false,
    Compile / npmDependencies += "@aws-sdk/client-kinesis" -> awsSdkJsV,
    libraryDependencies += "co.fs2" %%% "fs2-io" % fs2V
  )

lazy val clientSns = project
  .in(file("modules/client-sns"))
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .dependsOn(core)
  .settings(
    name := "scalajs-awssdk-client-sns",
    commonsSettings,
    testSettings,
    scalaJSUseMainModuleInitializer := false,
    Compile / npmDependencies += "@aws-sdk/client-sns" -> awsSdkJsV
  )
