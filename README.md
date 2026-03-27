# scalajs-awssdk

[![Maven Central](https://img.shields.io/maven-central/v/com.filippodeluca/scalajs-awssdk-types_sjs1_3)](https://search.maven.org/search?q=g:com.filippodeluca%20AND%20a:scalajs-awssdk-*)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](LICENSE)

Scala.js facades for the [AWS SDK for JavaScript v3](https://github.com/aws/aws-sdk-js-v3).

## Modules

| Module | Artifact | AWS Service |
|--------|----------|-------------|
| Core | `scalajs-awssdk-types` | Shared types (MetadataBearer, credentials, config, AsyncIterable) |
| DynamoDB | `scalajs-awssdk-client-dynamodb` | Amazon DynamoDB |
| S3 | `scalajs-awssdk-client-s3` | Amazon S3 |
| Kinesis | `scalajs-awssdk-client-kinesis` | Amazon Kinesis Data Streams |
| SNS | `scalajs-awssdk-client-sns` | Amazon SNS |
| SES | `scalajs-awssdk-client-ses` | Amazon SES |

## Installation

Add the dependencies to your `build.sbt`:

```scala
// Core types (required)
libraryDependencies += "com.filippodeluca" %%% "scalajs-awssdk-types" % "<version>"

// Pick the clients you need
libraryDependencies += "com.filippodeluca" %%% "scalajs-awssdk-client-dynamodb" % "<version>"
libraryDependencies += "com.filippodeluca" %%% "scalajs-awssdk-client-s3" % "<version>"
libraryDependencies += "com.filippodeluca" %%% "scalajs-awssdk-client-kinesis" % "<version>"
libraryDependencies += "com.filippodeluca" %%% "scalajs-awssdk-client-sns" % "<version>"
libraryDependencies += "com.filippodeluca" %%% "scalajs-awssdk-client-ses" % "<version>"
```

You also need the corresponding npm dependencies via
[scalajs-bundler](https://scalacenter.github.io/scalajs-bundler/):

```scala
enablePlugins(ScalaJSBundlerPlugin)
Compile / npmDependencies += "@aws-sdk/client-dynamodb" -> "3.370.0"
```

## Usage

### DynamoDB

```scala
import com.filippodeluca.jsfacade.awssdk.client.dynamodb.*
import com.filippodeluca.jsfacade.awssdk.client.dynamodb.models.*
import com.filippodeluca.jsfacade.awssdk.client.dynamodb.commands.*
import scalajs.js

val client = new DynamoDBClient(DynamoDBClientConfig(region = "eu-west-1"))

// PutItem
val putResult = client.send(PutItemCommand(PutItemCommandInput(
  TableName = "my-table",
  Item = js.Dictionary(
    "id" -> AttributeValue.S("123"),
    "name" -> AttributeValue.S("Alice")
  )
)))

// GetItem
val getResult = client.send(GetItemCommand(GetItemCommandInput(
  TableName = "my-table",
  Key = js.Dictionary("id" -> AttributeValue.S("123"))
)))

// Query with PartiQL
val queryResult = client.send(ExecuteStatementCommand(
  ExecuteStatementCommandInput(
    Statement = """SELECT * FROM "my-table" WHERE "id" = ?""",
    Parameters = js.Array(AttributeValue.S("123"))
  )
))
```

### S3

```scala
import com.filippodeluca.jsfacade.awssdk.client.s3.*
import com.filippodeluca.jsfacade.awssdk.client.s3.models.*
import com.filippodeluca.jsfacade.awssdk.client.s3.commands.*

val client = new S3Client(S3ClientConfig(region = "eu-west-1"))

// PutObject
val putResult = client.send(PutObjectCommand(PutObjectCommandInput(
  Bucket = "my-bucket",
  Key = "hello.txt",
  Body = "Hello, World!",
  ContentType = "text/plain"
)))

// GetObject and read body
val getResult = client.send(GetObjectCommand(GetObjectCommandInput(
  Bucket = "my-bucket",
  Key = "hello.txt"
)))
// getResult.Body is an SdkStream with .transformToString() and .transformToByteArray()
```

### Kinesis with fs2 streaming

The Kinesis module includes an fs2 bridge for consuming event streams:

```scala
import com.filippodeluca.jsfacade.awssdk.client.kinesis.*
import com.filippodeluca.jsfacade.awssdk.client.kinesis.models.*
import com.filippodeluca.jsfacade.awssdk.client.kinesis.commands.*
import com.filippodeluca.jsfacade.awssdk.client.kinesis.streams

// Convert AsyncIterable event stream to fs2 Stream
val events: fs2.Stream[IO, SubscribeToShardEventStream] =
  streams.fromAsyncIterable[IO, SubscribeToShardEventStream](
    response.EventStream.get
  )
```

### Using with cats-effect

All `client.send()` calls return `js.Promise`. Convert to `IO` with:

```scala
import cats.effect.IO

val result: IO[GetItemCommandOutput] = IO.fromPromise(IO(
  client.send(GetItemCommand(input))
))
```

## Supported commands

### DynamoDB
GetItem, PutItem, DeleteItem, UpdateItem, Query, Scan, BatchGetItem,
BatchWriteItem, CreateTable, DeleteTable, DescribeTable,
TransactGetItems, TransactWriteItems, ExecuteStatement,
ExecuteTransaction, BatchExecuteStatement

### S3
All 107 S3 commands including: GetObject, PutObject, DeleteObject,
CopyObject, HeadObject, ListObjectsV2, CreateBucket, DeleteBucket,
multipart uploads, bucket configuration (CORS, versioning, encryption,
lifecycle, etc.), object tagging, ACLs, and more.

### Kinesis
CreateStream, DeleteStream, DescribeStream, DescribeStreamSummary,
DescribeStreamConsumer, ListStreams, ListShards, PutRecord, PutRecords,
GetShardIterator, GetRecords, RegisterStreamConsumer,
DeregisterStreamConsumer, SubscribeToShard

## Development

### Prerequisites

- JDK 17+
- Node.js (for Scala.js)
- Docker (for integration tests)

### Running tests

```bash
# Start localstack
docker compose up -d

# Run all tests
sbt "+test"
```

### Code generation

New commands can be generated from the AWS SDK TypeScript source:

```bash
cd codegen
npx tsx generate.ts /path/to/aws-sdk-js-v3/clients/client-xxx/src [Command1,Command2,...]
```

## License

Apache License 2.0 - see [LICENSE](LICENSE) for details.
