package $packagename$

import com.typesafe.scalalogging.Logger

/**
  * @author Nicolas Jorand
  */
object $classname$ {

  val log = Logger[Main.type]

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {
    log.debug("Entering the main method ...")

    log.info("hello World!")

    println("Hello World!")
    println("concat arguments = " + foo(args))

    log.debug("The program is about to end ...")
  }

}