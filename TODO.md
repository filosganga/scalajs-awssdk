# Missing Commands TODO

## DynamoDB (46 missing out of 57)

Already implemented: BatchGetItem, BatchWriteItem, CreateTable, DeleteItem,
DeleteTable, DescribeTable, GetItem, PutItem, Query, Scan, UpdateItem

### Bugs in existing commands (type mismatches) — FIXED
- [x] `ScanCommandOutput.Items` — fixed to `js.Array[js.Dictionary[AttributeValue]]`
- [x] `BatchGetItemCommandOutput.ConsumedCapacity` — fixed to `js.Array[ConsumedCapacity]`
- [x] `BatchWriteItemCommandOutput.ConsumedCapacity` — fixed to `js.Array[ConsumedCapacity]`
- [x] `BatchWriteItemCommandOutput.ItemCollectionMetrics` — fixed to `js.Dictionary[js.Array[ItemCollectionMetrics]]`
- [x] `BatchWriteItemCommandOutput.UnprocessedKeys` — renamed to `UnprocessedItems`, fixed to `js.Dictionary[js.Array[WriteRequest]]`

### Missing fields in existing commands (non-legacy)
- [ ] `CreateTableCommandInput` — missing: `DeletionProtectionEnabled` (Boolean), `WarmThroughput`, `ResourcePolicy` (String), `OnDemandThroughput`, `GlobalTableSourceArn` (String), `GlobalTableSettingsReplicationMode`
- [ ] `PutItemCommandInput` — missing: `ReturnValuesOnConditionCheckFailure`
- [ ] `UpdateItemCommandInput` — missing: `ReturnValuesOnConditionCheckFailure`
- [ ] `DeleteItemCommandInput.ReturnValuesOnConditionCheckFailure` — typed as `String`, should use enum type

### Missing fields in existing commands (legacy, lower priority)
- [ ] `GetItemCommandInput` — missing: `AttributesToGet` (string[])
- [ ] `PutItemCommandInput` — missing: `Expected`, `ConditionalOperator`
- [ ] `DeleteItemCommandInput` — missing: `Expected`, `ConditionalOperator`
- [ ] `UpdateItemCommandInput` — missing: `AttributeUpdates`, `Expected`, `ConditionalOperator`
- [ ] `QueryCommandInput` — missing: `AttributesToGet`, `KeyConditions`, `QueryFilter`, `ConditionalOperator`
- [ ] `ScanCommandInput` — missing: `AttributesToGet`, `ScanFilter`, `ConditionalOperator`

### Core Operations
- [ ] TransactGetItems
- [ ] TransactWriteItems
- [ ] ExecuteStatement
- [ ] ExecuteTransaction
- [ ] BatchExecuteStatement

### Table Management
- [ ] UpdateTable
- [ ] ListTables
- [ ] DescribeTimeToLive
- [ ] UpdateTimeToLive
- [ ] DescribeLimits
- [ ] DescribeEndpoints
- [ ] TagResource
- [ ] UntagResource
- [ ] ListTagsOfResource

### Global Tables
- [ ] CreateGlobalTable
- [ ] DescribeGlobalTable
- [ ] DescribeGlobalTableSettings
- [ ] UpdateGlobalTable
- [ ] UpdateGlobalTableSettings
- [ ] ListGlobalTables
- [ ] DescribeTableReplicaAutoScaling
- [ ] UpdateTableReplicaAutoScaling

### Backups & Restore
- [ ] CreateBackup
- [ ] DeleteBackup
- [ ] DescribeBackup
- [ ] ListBackups
- [ ] RestoreTableFromBackup
- [ ] RestoreTableToPointInTime
- [ ] UpdateContinuousBackups
- [ ] DescribeContinuousBackups

### Export & Import
- [ ] ExportTableToPointInTime
- [ ] DescribeExport
- [ ] ListExports
- [ ] ImportTable
- [ ] DescribeImport
- [ ] ListImports

### Kinesis Streaming
- [ ] DescribeKinesisStreamingDestination
- [ ] EnableKinesisStreamingDestination
- [ ] DisableKinesisStreamingDestination
- [ ] UpdateKinesisStreamingDestination

### Contributor Insights
- [ ] DescribeContributorInsights
- [ ] UpdateContributorInsights
- [ ] ListContributorInsights

### Resource Policy
- [ ] GetResourcePolicy
- [ ] PutResourcePolicy
- [ ] DeleteResourcePolicy

---

## Kinesis (26 missing out of 39)

Already implemented: CreateStream, DeleteStream, DescribeStream,
DescribeStreamSummary, ListShards, ListStreams, PutRecord, PutRecords,
GetShardIterator, GetRecords, RegisterStreamConsumer,
DeregisterStreamConsumer, SubscribeToShard

### Stream Management
- [ ] UpdateStreamMode
- [ ] UpdateShardCount
- [ ] SplitShard
- [ ] MergeShards
- [ ] IncreaseStreamRetentionPeriod
- [ ] DecreaseStreamRetentionPeriod
- [ ] UpdateStreamWarmThroughput
- [ ] UpdateMaxRecordSize

### Encryption
- [ ] StartStreamEncryption
- [ ] StopStreamEncryption

### Monitoring
- [ ] EnableEnhancedMonitoring
- [ ] DisableEnhancedMonitoring

### Consumer Management
- [ ] DescribeStreamConsumer
- [ ] ListStreamConsumers

### Tagging
- [ ] AddTagsToStream
- [ ] RemoveTagsFromStream
- [ ] ListTagsForStream
- [ ] TagResource
- [ ] UntagResource
- [ ] ListTagsForResource

### Account
- [ ] DescribeAccountSettings
- [ ] UpdateAccountSettings
- [ ] DescribeLimits

### Resource Policy
- [ ] GetResourcePolicy
- [ ] PutResourcePolicy
- [ ] DeleteResourcePolicy

---

## Secrets Manager (23 — new module needed)

Module `client-secretsmanager` does not exist yet. Needs: client class,
build.sbt entry, npm dependency `@aws-sdk/client-secrets-manager`.

### Core Operations
- [ ] CreateSecret
- [ ] GetSecretValue
- [ ] PutSecretValue
- [ ] UpdateSecret
- [ ] DeleteSecret
- [ ] RestoreSecret
- [ ] DescribeSecret
- [ ] ListSecrets
- [ ] ListSecretVersionIds
- [ ] BatchGetSecretValue

### Secret Rotation
- [ ] RotateSecret
- [ ] CancelRotateSecret

### Secret Version Management
- [ ] UpdateSecretVersionStage

### Replication
- [ ] ReplicateSecretToRegions
- [ ] RemoveRegionsFromReplication
- [ ] StopReplicationToReplica

### Resource Policy
- [ ] GetResourcePolicy
- [ ] PutResourcePolicy
- [ ] DeleteResourcePolicy
- [ ] ValidateResourcePolicy

### Tagging
- [ ] TagResource
- [ ] UntagResource

### Utilities
- [ ] GetRandomPassword
