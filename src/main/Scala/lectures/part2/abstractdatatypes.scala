package lectures.part2

object abstractdatatypes  extends App {

  abstract class animal {
    val creaturetype: String

    def eat: Unit
  }

  class dog extends animal {
    override val creaturetype: String = "canine"

    def eat: Unit = println("crunnch crunch")
  }
//traits

  trait carnivore{
    def eat(animal: animal)
  }
  //traits vs abstract classes
// traits do not have constructor parameters
  //multiple traits can be inherited by same class
  // traits are behaviour, an abstract class is a a type of thing
}
