package lectures.part1

object valuesvariablestypes extends App {
  var x: Int = 42
val y: Int = 54
  x=22
println(x,y)
  //VALS ARE IMMUTABLE

  /*DATA TYPES ARE OPTIONAL
COMPILER CAN INFER TYPES*/
  val aString: String = "MURALI"
  val anotherString: String = " is 21 years old!"
  val aBoolean: Boolean = false
  val aChar: Char = 'A'
  val aInt:   Int = 1234
  val aShort: Short = 10
  val aLong: Long = 2356
  val aFloat: Float = 0.2f
  val aDouble: Double = 0.23
println(aString+anotherString+ aBoolean + aChar + aInt + aShort + aLong + aFloat + aDouble)
  //variables has SIDE EFFECTS
}

