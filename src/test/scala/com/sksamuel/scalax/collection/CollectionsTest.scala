package com.sksamuel.scalax.collection

import org.scalatest.{Matchers, WordSpec}

class CollectionsTest extends WordSpec with Matchers {

  import Collections._

  "Collections" should {
    "distinct by" in {
      val seq = Seq("1", "2", "10", "11")
      seq.distinctBy(_.length) shouldBe Seq("1", "10")
    }
  }
}
