package lectures.part2

object methodnotation {
  class person(val name: String, bestmovie: String) {

    def like(movie: String): Boolean = movie == bestmovie
    def hangout(Person: person): String = s"$this.name is hanging out with $Person.name"
    def apply(): String= s"hi my name is $name"
  }

  val mary = new person ("mary", "wolf of wall street")
  println(mary.like("inception"))
  println(mary like "inception") // equivalent
  //  infix notation = operator notation

  //  "operators" in scala
  val tom = new person("tom", "real steel")
  println(mary hangout tom)
  println (mary.apply)
}

