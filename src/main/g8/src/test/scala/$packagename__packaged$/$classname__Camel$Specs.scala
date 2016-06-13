package $packagename$

import org.scalatest.{Matchers, WordSpecLike}


/**
  * Sample specification.
  */
class $classname$Specs extends WordSpecLike with Matchers {
  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world" should have size (11)
    }
    "start with 'Hello'" in {
      "Hello world" should startWith("Hello")
    }
    "end with 'world'" in {
      "Hello world" should endWith("world")
    }
  }
}
