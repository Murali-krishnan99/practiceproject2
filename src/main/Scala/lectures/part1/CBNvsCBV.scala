package lectures.part1

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }
  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite():Int = 1 + infinite()
  def printfirst(x: Int, y: => Int) = println(x)
  //printfirst(infinite(),34)
printfirst(34, infinite())
}