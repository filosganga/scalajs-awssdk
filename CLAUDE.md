# scalajs-awssdk

Scala.js facades for the AWS SDK JS v3. Each AWS service client gets its own
module (`client-dynamodb`, `client-s3`, `client-kinesis`, etc.) that depends on
a shared `core` module with base types (MetadataBearer, config traits, AsyncIterable, etc.).

## Project structure

```
modules/
  core/              — shared types, middleware config, AsyncIterable facade
  client-dynamodb/   — DynamoDB client, commands, models
  client-s3/         — S3 client, commands, models
  client-kinesis/    — Kinesis client, commands, models (+ fs2 stream bridge)
  client-sns/        — SNS client
  client-ses/        — SES client
codegen/             — TypeScript-based code generator (reads TS SDK source → Scala.js facades)
```

## File layout

Follows a flat, Rust-like module pattern. Use `package` declarations to define
the package — don't mirror package hierarchy with nested directories.

```
a.scala          — package a (the module itself)
a/b.scala        — package a.b (a submodule of a)
a/b/c.scala      — package a.b.c (a submodule of b)
```

For example, a service module looks like:

```
client/dynamodb/
  dynamodb.scala       — client class, config (package dynamodb)
  commands.scala       — all command classes (package dynamodb.commands)
  models.scala         — model types (package dynamodb.models)
  models/scan.scala    — scan-specific models (package dynamodb.models)
  models/updateItem.scala
```

## Code style

- **Scala 3 syntax only**: use `.*` for wildcard imports, never `._`. No curly
  braces for imports.
- **No package objects**: use top-level definitions in a `package` instead.
- `@js.native` constructor parameters that appear unused need `@nowarn` annotation
  (they are required by Scala.js at runtime).

## Facade pattern

Each command follows this pattern:

```scala
@js.native
@JSImport("@aws-sdk/client-xxx", "FooCommand")
class FooCommand(override val input: FooCommandInput)
    extends Command[FooCommandInput, FooCommandOutput]

object FooCommand {
  def apply(input: FooCommandInput): FooCommand = new FooCommand(input)
}
```

Model types are `@js.native trait`s with a companion `apply` using
`js.Dynamic.literal(...).asInstanceOf[T]`.

## Code generation

The `codegen/generate.ts` script reads AWS SDK TypeScript source and generates
Scala.js facades. It leaves `// TODO:` comments where human judgment is needed
(streaming types, ambiguous number→Int/Double).

```bash
cd codegen
npx tsx generate.ts /path/to/aws-sdk-js-v3/clients/client-xxx/src [Command1,Command2,...]
```

## Testing

Tests use munit + cats-effect + localstack. Test names follow the pattern:

```
<Subject> should <expected behavior>[ when <condition>[ and <condition>]]
```

Examples:
- "GetItem should retrieve an existing item"
- "DeleteItem should return old attributes with ReturnValues AllOld"
- "TransactWriteItems with ConditionCheck should fail if condition not met"

Each service has a `Fixtures` trait that provides:
- `clientR` — Resource that creates/destroys the client, reads endpoint from env var
- Resource helpers for test data (e.g. `tableR`, `bucketR`, `streamR`)

Tests run against localstack via `docker-compose.yml`. Env vars:
`DYNAMODB_ENDPOINT`, `S3_ENDPOINT`, `KINESIS_ENDPOINT`, `SNS_ENDPOINT`
(all default to `http://localhost:4566`).

## Build

```bash
sbt "+Test/compile"   # compile everything
sbt "+test"           # run all tests (needs localstack running)
docker compose up -d  # start localstack
```
