package lectures.part1

object expressions extends App {
  val x = 1+2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1==x)
  // == != > >= < <=

  println(!(1==x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=........ SIDE EFFECTS
  println(aVariable)

  // Instructions(doing something) vs Expressions(VALUE)

  //IF expression
  val aCondition = true
  val aConditionedvalue = if(aCondition)5 else 3
  println(aConditionedvalue)

  var i=0
  while (i <= 10) {
println(i)
i += 1
  }

  //NEVER WRITE LOOPS IN SCALA.

  //EVERYTHING in scala is an expression

  val aWeirdvalue = (aVariable = 3) // unit == void
  println(aWeirdvalue)

  // SIDE EFFECTS are expressions that return unit. Eg - while loops, println(), reassigning.

  //code blocks
  val aCodeblock = {
    val c = 5
    val d = c + 1
    if (c > 5)"hello" else "goodbye"
  }
val comparisson ={
  2 < 3
}
println(comparisson)
}
