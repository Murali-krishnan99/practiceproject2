package lectures.part2

object objects extends App{
  //scala does not have class level functionality("static")
  object person{
    val neyes=2
def cantfly: Boolean = false

  }
  class person(){

  }
println(person.neyes)
println(person.cantfly)
//scala object is a singleton instance
  val mary =new person
  val may =new person
  println(mary == may)

}

