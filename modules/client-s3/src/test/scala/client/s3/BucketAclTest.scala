package com.filippodeluca.jsfacade.awssdk
package client
package s3

import models.*
import commands.*

class BucketAclTest
    extends munit.CatsEffectSuite
    with S3Fixtures
    with ScalaJsAssertions {

  ResourceFunFixture {
    for {
      client <- clientR
      bucketName <- bucketR(client)
    } yield (client, bucketName)
  }.test("GetBucketAcl should return ACL") { case (client, bucketName) =>
    for {
      result <- client.sendIO(
        GetBucketAclCommand(
          GetBucketAclCommandInput(Bucket = bucketName)
        )
      )
    } yield {
      assert(result.Owner.isDefined)
      assert(result.Grants.isDefined)
    }
  }

}
