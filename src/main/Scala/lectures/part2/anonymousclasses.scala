package lectures.part2

object anonymousclasses extends App {

  abstract class Animal {

  def eat: Unit
}


  val funnyanimal: Animal = new Animal {
    override def eat: Unit = println("hahahahaha!")
  }
  println(funnyanimal.getClass)

class person(name: String){
  def sayhi: Unit = println(s"Hi, my name is $name, How can I help you?")
}
  val jim = new person("jim"){
    override def sayhi: Unit = println(s"Hi, My name is jim,How can I help you?")
  }


}
