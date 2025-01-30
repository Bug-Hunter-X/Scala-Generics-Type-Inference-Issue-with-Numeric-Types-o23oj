```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10) // Type inference works
    myInt.printValue()

    val myString = new MyClass("Hello") // Type inference works
    myString.printValue()

    val myList = new MyClass(List(1, 2, 3)) // Type inference works
    myList.printValue()

    // The following line will result in type mismatch error. 
    // Cannot resolve type arguments to MyClass for expected type MyClass[Int].
    val myWrongType = new MyClass(10.5) 
    myWrongType.printValue()
  }
}
```