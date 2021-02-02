package lectures.part3

object anonymousfunctions extends App{

  //anonymous function or (LAMBDA)
  val doubler = (x: Int) => x*2

  //multiple parameters in Lambda
  val adder : (Int, Int) => Int = (a: Int,b: Int) => a + b

  //no params
  val justdosomething = () => 3

  println(justdosomething)
  println(justdosomething())

  //curly braces with lambda
  val stringtoint = {(str: String) =>
    str.toInt
  }
//MOAR syntactic sugar
  val niceincrementer: Int => Int = _ + 1 //equivalent to x => x+1
  val niceadder: (Int,Int) => Int = _ + _ //equivalent to (a,b) => a+b

}

