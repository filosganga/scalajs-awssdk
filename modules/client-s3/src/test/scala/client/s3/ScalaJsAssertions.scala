package com.filippodeluca.jsfacade.awssdk
package client
package s3

import scalajs.js

trait ScalaJsAssertions {
  self: munit.Suite =>

  implicit def compareForJsDictionary[A, B](implicit
      compare: munit.Compare[A, B]
  ): munit.Compare[js.Dictionary[A], js.Dictionary[B]] =
    new munit.Compare[js.Dictionary[A], js.Dictionary[B]] {
      def isEqual(
          obtained: js.Dictionary[A],
          expected: js.Dictionary[B]
      ): Boolean = {
        if (obtained.size != expected.size) {
          false
        } else {
          expected.foldLeft(true) { case (acc, (key, b)) =>
            acc && obtained
              .get(key)
              .map { a =>
                compare.isEqual(a, b)
              }
              .getOrElse(false)
          }
        }
      }
    }

}
