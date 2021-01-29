package lectures.part2

object inheritance extends App{

  //single class inheritance

  //types of access modifier in scala- 1. protected 2.private
  class animal{
    val animaltype = "wild"
    val creaturetype = "k9"
    def eat = println("meat")
  }
class cat extends animal{
  def crunch = {
    eat
    println("meat and milk")
  }
}
  val cat = new cat
  cat.eat

  //constructors

  class person (name: String , age: Int){
    def this (name: String)= this(name,0)
  }
  class adult (name: String, age: Int, IDcard: String) extends person(name,age)

  //overriding

  class dog(override val animaltype: String) extends animal{
//    override val animaltype: String = "domestic"
    override def eat = {
      super.eat
      println("meat, milk, cooked food")
    }
  }
  val dog = new dog("k9")
  dog.eat
  println(dog.animaltype)

  //type substitution

  val unknownanimal: animal = new dog("k9")
  unknownanimal.eat

  //super
//final keywords are used to prevent overriding in statements and class.
  //sealed are used to seal a particular class
}
