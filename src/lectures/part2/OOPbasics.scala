package lectures.part2

object OOPbasics extends App {

val Person = new Person("murali",21)
    println(Person.Age)
  Person.greet("Dan")
  Person.greet("murali")
val Author = new writer("charles", "dickens", 1812)
  val novel = new Novel( "Great expectations", 1861, Author)
  println(novel.authorage)
  println(novel.iswrittenby(Author))

}
  //constructor

  class Person(Name: String, var Age: Int) {
    //BODY
    val x: Int = 24
    println(x + 5)

    def greet(Name: String): Unit = println(s"$Name says hi $Name")

    def greet(): Unit = println(s"Hi, I am $Name")

    def this(Name: String) = this(Name, 0)

    def this() = this("willydoo")

  }


  class writer(firstname: String, surname: String, val Year: Int) {
    def fullname: String = firstname + " " + surname

    println(fullname)
  }

  class Novel(name: String, year: Int, Author: writer) {
    def authorage = year - Author.Year

    def iswrittenby(author: writer) = author == this.Author

    def copy(newyear: Int): Novel = new Novel(name, newyear, Author)


    class counter(val count: Int = 0) {
      def inc = {
        println("incrementing....")
        new counter(count + 1) //IMMUTABILITY
      }

      def dec = {
        println("decrementing....")
        new counter(count - 1)
      }

      def inc(n: Int): counter = {
        if (n <= 0) this
        else inc.inc(n - 1)
      }

      def dec(n: Int): counter =
        if (n <= 0) this
        else dec.dec(n - 1)

      def print = println(count)
    }




}

// class parameters are not FIELDS
