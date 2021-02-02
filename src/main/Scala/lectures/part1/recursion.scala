package lectures.part1

import scala.annotation.tailrec

object recursion extends App{
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("computing factorial of " + n + " I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("computed factorial of " + n)

      result
    }
    println(factorial(10))
  def factorial2 (n: Int): BigInt = {
    def facthelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else facthelper(x - 1, x * accumulator) // TAIL RECURSION= use recursive call as the LAST expression
// when loops are necessary , use tail recursion.
    facthelper(n, 3)
  }

  println(factorial2(20000))
    /*
    factorial2(5)= facthelper(5,1)
    =facthelper(4,5*1)
    =facthelper(3,4*5*1)
    =facthelper(2,3*4*5*1)
    =facthelper(1,2*3*4*5*1)
    =facthelper(1*2*3*4*5)
    1 * 2 * 3 * 4 * 5
    */
  def stringrec(aString: String,n: Int, accumulator: String): String ={
    if(n <= 0) accumulator
    else stringrec(aString, n-1 , aString + accumulator )
  }
  println(stringrec(" hoorah! success,",3, " "))



  def isprime(n: Int): Boolean = {
    @tailrec
    def isprimetailrec (t: Int, isstillprime: Boolean): Boolean =
      if (!isstillprime) false
      else if (t <= 1) true
      else isprimetailrec (t-1, n % t != 0 && isstillprime)

      isprimetailrec(n/2, true)
    }
  println(isprime(2003))

  def fibonacci(n: Int): Int ={
    def fibotailrec(i: Int, last: Int, nexttolast: Int): Int =
      if(i >= n) last
      else fibotailrec(i+1, last+ nexttolast, last)

    if(n<=2)1
    else fibotailrec(2,1,1)

  }
  println(fibonacci(8))
  }
