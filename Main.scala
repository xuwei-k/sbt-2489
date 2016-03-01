package com.example

import upickle.default._
import java.time.Duration

object Main {

  case class Foo(
    a: Option[Duration],
    b: Option[Int],
    c: Option[Double]
  )

  def bar = {
    read[Foo]("foo")
  }

}
