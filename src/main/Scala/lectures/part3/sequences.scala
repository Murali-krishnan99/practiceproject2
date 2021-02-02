package lectures.part3

import scala.util.Random

object sequences extends App{

  //seq
  val aSequence = Seq(1,2,3,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(7,5,6))
  println(aSequence.sorted)

  //ranges
  val aRange: Seq[Int] = 1 to 100
  aRange.foreach(println)

  (1 to 100).foreach(x => println("Hello"))

  //lists
  val aList = List(1,2,3,4,5,6)
  val prepended = 42 +: aList :+ 89
  println(prepended)

  val Apples5 =List.fill(5)("Apple")
  println(Apples5)
  println(aList.mkString("|_|_|"))

  //arrays
  val numbers = Array(1,2,3,4,5,6,7,8,9,0)
  val threeelemnets = Array.ofDim[String](3)
  threeelemnets.foreach(println)

//mutation
  numbers(2) = 0 //syntax sugar for numbers.update (2,0)
println(numbers.mkString(" "))

//arrays and seq
  val numberSeq: Seq[Int] = numbers //implicit conversion
  println(numberSeq)

  //vectors
  val vector: Vector[Int] = Vector(1,2,3)
  println(Vector)

  //vectors vs lists
  val maxRuns = 1000
    val maxCapacity = 100000


  def getwritetime(collection: Seq[Int]): Double = {
    val r = new Random
    val times = for{
      it <- 1 to maxRuns
    } yield{
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), 0)
      System.nanoTime() - currentTime
    }
   times.sum* 1.0 / maxRuns
  }
val numberList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector


  //keeps reference to tail
  //updating an element in the middle takes long
  println(getwritetime(numberList))


  //depth of the tree is small
  //needs to replace an entire 32 element chunk
  println(getwritetime(numbersVector))
}
