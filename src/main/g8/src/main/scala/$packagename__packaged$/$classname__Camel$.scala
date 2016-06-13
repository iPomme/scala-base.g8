package $packagename__packaged$

/**
  * @author Nicolas Jorand
  */
object $classname$ {

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {
    println("Hello World!")
    println("concat arguments = " + foo(args))
  }

}