package lectures.part2

object generic extends App{

  class mylist[+A] {
    //use the type A
    def add[B >: A](element: B): mylist[B] = ???
  }
  /*
  A = cat
  B = dog = animal
   */
  class mymap [key,value]
  val listofintegers = new mylist[Int]
  val listofstrings = new mylist[String]

  //generic methods

  object mylist {
    def empty[A]: mylist[A] = ???

  }
  val emptylistofintegers = mylist.empty[Int]

  //variance problem
  class animal
  class dog extends animal
  class cat extends animal

  //list of cat extends list of animals = covariance
  class covariantlist[+A]
val animal: animal= new cat
  val animallist: covariantlist[animal] = new covariantlist[cat]

  //list of cats and list of animals are of different list's
class invariantlist[A]
val invariantanimallist: invariantlist[animal] = new invariantlist[animal]

  //contravariant list opposite to that of covariant

  class Trainer[-A]
  val Trainer: Trainer[cat] = new Trainer[animal]

  //bounded types

  class cage[A <: animal](animal:A)
  val cage = new cage(new dog)


}
