package lectures.part1

object stringops extends App{
val str: String ="Hello! i'm learning SCALA."
  println (str.charAt(5))
  println(str.substring(3,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","_"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberstring = "2"
  val aNumber = aNumberstring.toInt
  println('a' +: aNumberstring :+ 'Z')
  println(str.reverse)
  println(str.take(2))

  //scala-specific: string interpolators

  // s-interpolators

  val name = "David"
  val age = 12
  val greeting = s"hello, my name is $name and i'm $age years old"
  val anothername = "Murali"
  val anothergreeting = s"$anothername says hello $name"
  println(greeting,anothergreeting)

  //f-interpolators

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw interpolator
  println(raw"this is a \n new line")
  val escaped = "this is a \n new line"
  println(raw"$escaped")
}
