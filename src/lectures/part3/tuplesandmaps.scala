package lectures.part3

object tuplesandmaps extends App {

  //tuples = finite ordered "lists"

  val aTuple = new Tuple2(99, "Murali") // Tuple2(Int,String) = (Int,String)
  println(aTuple._1)
  println(aTuple.copy(_2 = "scala is interesting!"))
  println(aTuple.swap) //("Murali",99)

  // maps- Keys --> values

  val aMap: Map[String, Int] = Map()

  val phonebook = Map(("Murali", 905), ("walter", 345), ("MURALI", 105)) withDefaultValue ("DHONI")
  //a --> b is sugar for (a,b)
  println(phonebook)

  //map ops
  println(phonebook.contains("Murali"))
  println(phonebook("walter"))

  //add a pairing
  val newPairing = "Scala" -> 809
  val newPhonebook = phonebook + newPairing
  println(newPhonebook)

  //functionals on maps
  //map, flatmap, filter

  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))

  //filterkeys
  println(phonebook.filterKeys(x => x.startsWith("M")))

  //mapvalues
  println(phonebook.mapValues(number => "37462-" + number))

  //conversions to other collections
  println(phonebook.toList)
  println(List(("Murali", 987)).toMap)
  val Names = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim", "Danny")
  println(Names.groupBy(name => name.charAt(0)))

  def add(network: Map[String, Set[String]], person: String): Map[String, Set[String]] =
    network + (person -> Set())

  def friend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA + b)) + (b -> (friendsB + b))

    def unfriend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
      val friendsA = network(a)
      val friendsB = network(b)

      network + (a -> (friendsA - b)) + (b -> (friendsB - a))

    }

    def remove(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
      def removeAux(friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] =
        if (friends.isEmpty) networkAcc
        else removeAux(friends.tail, unfriend(networkAcc, person, friends.head))

      val unfriended = removeAux(network(person), network)
      unfriended - person
    }

    val empty: Map[String, Set[String]] = Map()
    val network = add(add(empty, "bob"), "Mary")
    println(network)
  }
}