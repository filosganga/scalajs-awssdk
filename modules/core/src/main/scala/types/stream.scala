package com.filippodeluca.jsfacade.awssdk.types

import scalajs.js
import scalajs.js.annotation.JSName

/** Facade for the JavaScript AsyncIterable protocol. An AsyncIterable is an
  * object that implements `[Symbol.asyncIterator]()`, returning an
  * AsyncIterator. This is used by AWS SDK v3 for event streams (e.g.
  * SubscribeToShard, Bedrock streaming).
  */
@js.native
trait AsyncIterable[+A] extends js.Object {

  @JSName(js.Symbol.asyncIterator)
  def asyncIterator(): AsyncIterator[A] = js.native
}

/** Facade for the JavaScript AsyncIterator protocol. Each call to `next()`
  * returns a Promise that resolves to an IteratorResult.
  */
@js.native
trait AsyncIterator[+A] extends js.Object {
  def next(): js.Promise[IteratorResult[A]] = js.native
}

/** Facade for the JavaScript IteratorResult protocol.
  *   - `done`: true if the iterator has been exhausted
  *   - `value`: the yielded value (undefined when done)
  */
@js.native
trait IteratorResult[+A] extends js.Object {
  val done: Boolean = js.native
  val value: js.UndefOr[A] = js.native
}
