package lectures.part3

object mapflatmapfilterfor extends App {
  val list = List(1, 2, 3)
  println(list.head)
  println(list.tail)

  //map
  println(list.map(_ + 1))
  println(list.map(_ + "is a number"))

  //filter
  println(list.filter(_ % 2 == 0))

  //flatmap
  val topair = (x: Int) => List(x, x + 1)
  println(list.flatMap(topair))

  //print all combinations between two lists
  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("Black", "White")
  //list of ("a1""a2"......"d4")

  //iterations
  val chesscombinations = numbers.flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(chesscombinations)

  //foreach
  list.foreach(println)

  //for-comprehensions
  val forchesscombinations = for {
    n <- numbers if n % 2 ==0
    c <- chars
    color <- colors

  } yield "" + c + n + " " + color
println(forchesscombinations)

  for {
    n<- numbers
  } println(n)

  //syntax overload
  list.map (x =>
  x*2
  )
}
