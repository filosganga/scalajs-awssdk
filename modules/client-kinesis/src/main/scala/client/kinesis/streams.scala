package com.filippodeluca.jsfacade.awssdk
package client
package kinesis

import cats.effect.kernel.Async
import cats.syntax.all.*
import fs2.Stream

import com.filippodeluca.jsfacade.awssdk.types.AsyncIterable
import scalajs.js

object streams {

  /** Converts a JavaScript AsyncIterable into an fs2 Stream. This is useful for
    * consuming AWS SDK v3 event streams such as SubscribeToShard.
    */
  def fromAsyncIterable[F[_], A](
      iterable: AsyncIterable[A]
  )(implicit F: Async[F]): Stream[F, A] = {
    Stream
      .eval(F.delay(iterable.asyncIterator()))
      .flatMap { iterator =>
        Stream.unfoldEval(iterator) { it =>
          F.fromPromise(F.delay(it.next())).map { result =>
            if (result.done) None
            else result.value.toOption.map(v => (v, it))
          }
        }
      }
  }

}
