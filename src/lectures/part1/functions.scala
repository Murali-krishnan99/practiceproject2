package lectures.part1

object functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("billionaire at", 30))

  def aRepeatedfunction(aName: String, aNumber: Int): String = {
    if (aNumber == 1) aName
    else aName + aRepeatedfunction(aName, aNumber - 1)
  }

  println(aRepeatedfunction(" murali is a billionaire ", 3))

  // WHEN YOU NEED LOOPS USE RECURSION
  def aFunctionwithsideeffects(aString: String): Unit = println(aString)

  def aBigfunction(n: Int): Int = {
    def aSmallfunction(a: Int, b: Int): Int = a + b

    aSmallfunction(n, n - 1)
  }

  def greet(aName: String, anAge: Int): String = {
   "Hi, my Name is" + aName + "and i am " + anAge + " years old"
  }
  println (greet(" barack obama ", 54))

  def factorial(n: Int): Int = {
    if(n<=1)1
    else n* factorial(n-1)
  }
println(factorial(5))
  def fibonacci(n: Int): Int = {
    if (n <= 1) 1
    else fibonacci(n-1) + fibonacci(n-2)
}
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isprimeuntil (t: Int): Boolean =
      if(t <= 1)true
      else n % t != 0 && isprimeuntil(t-1)

    isprimeuntil(n/2)
  }
println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37*17))
}
