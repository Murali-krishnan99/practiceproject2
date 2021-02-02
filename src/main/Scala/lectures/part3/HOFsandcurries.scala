package lectures.part3

object HOFsandcurries extends App {
  val superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = null
  // higher order functions (HOF's)

  //  function that applies a function n times over a value x
  //  ntimes(f,n,x)
  //  ntimes(f,3,x) = f(f(f(x))) = ntimes(f, 2, f(x)) = f(f(f(x)))
  //  ntimes(f,n,x) = f(f(.....f(x))) = ntimes(f, n-1, f(X))


  def ntimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else ntimes(f, n - 1, f(x))

  val plusone = (x: Int) => x + 1
  println(ntimes(plusone, 10, 1))

  // ntimesbetter(f,n) = x => f(f(f(....(x)))
  //increment10 = ntb(plusone, 10) = x => plusone(plusone....(x))
  //val y = increment10(1)
  def ntimesbetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0) (x: Int) =>x
    else (x: Int) => ntimesbetter(f, n - 1)(f(x))

  val plus10 = ntimesbetter(plusone, 10)
  println(plus10(2))

  //curried function
  val superadder = (x: Int) =>(y: Int) => x + y
val add3 = superadder(3) // y=> 3 + y
  println(add3(10))
  println(superadder(3)(10))

  //functions with multiple parameter lists
  def curriedformatter(c: String)(x: Double): String = c.format(x)

  val standardformat: (Double => String) = curriedformatter("%4.2f")
  val preciseformat: (Double => String) = curriedformatter("%10.8f")

  println(standardformat(Math.PI))
  println(preciseformat(Math.PI))


}
