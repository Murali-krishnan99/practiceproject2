package lectures.part2

object caseclasses extends App{
/*\
equals, hashcode, tostring
 */
  case class person(name: String, age: Int)
  // 1. class parameters are promoted to fields

  val murali = new person("murali",22)
println (murali.name, murali.age)
  //2. sensible tostring

println(murali.toString)
  //3.println(instance) = println(instance.tostring) // syntatic sugar

  println(murali)
  val murali2 = new person ("murali", 22)
  println(murali == murali2)

  //4. CC's have handy copy methods

  val murali3 = murali.copy(age= 45)
  println(murali3)

  //5. CC's have companion objects
  val theperson = person
  val praveen = person("praveen", 45)

  //6.CC's are serializable

  //7. CC's have extractor patterns = CC's can be used in pattern matching

  case object unitedkingdom
  def name: String = "The UK of GB and NI"
}
