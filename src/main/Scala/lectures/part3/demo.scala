package lectures.part3

object demo extends App{
  val lst =List(1,2,3,4,5,6,7,8,9,0);
  val mymap = Map(1 -> "Murali", 2 -> "Pradeep", 3 -> "praveenji");
  def Main (args: Array[String]): Unit ={
  println(lst.map(x => x/0.2))
  }

}
