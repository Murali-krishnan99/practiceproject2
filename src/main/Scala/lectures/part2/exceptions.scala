package lectures.part2

object exceptions extends App {
  val x: String = null
  //println(x.length)

  //throwing and catching exceptions
  //this ^^ will crash with a NPE

// val aweirdvalue: String =  throw new NullPointerException
  //throwable classes extend the throwable class
  //exception and error are the major throwable subtypes
  def getint(withexception: Boolean): Int =
    if(withexception) throw new RuntimeException("no int for you!")
    else 42

  try{
    getint (true)
  }catch{
    case e: RuntimeException => println("caught a Runtime Exception")
  }finally{
    //code that will get executed NO MATTER WHAT
    println("FINALLY!")
  }

}
