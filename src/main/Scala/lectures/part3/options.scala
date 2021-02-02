package lectures.part3

import com.sun.jndi.ldap.Connection

import scala.util.Random

object options extends App{

  val myfirstopt: Option[Int] = Some(4)
  val noopt: Option[Int] = None

  println(myfirstopt)

  //unsafe API's

  def unsafeMethod(): String = null
  // val result = Some(unsafeMethod()) // WRONG
  val result = Option(unsafeMethod()) //Some or None
  println(result)

  //chained methods
  def backupMethod(): String = "A Valid Result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  //Design unsafe API's
  def betterUnSafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A Valid Result")
  val betterChainedResult = betterUnSafeMethod() orElse betterBackupMethod()

  //functions on options
  println(myfirstopt.isEmpty)
  println(myfirstopt.get) //UNSAFE - DO NOT USE THIS

  //Map, flatmap, filter
  println(myfirstopt.map(_ * 2))
  println(myfirstopt.filter(x => x > 10))
  println(myfirstopt.flatMap(x => Option(x * 10)))

  //for comprehensions
  val config: Map[String, String] = Map{
    //Fetched from elsewhere
    "host" -> "176.45.36.1"
    "port" -> "80"
  }
class connection{
  def connect = "connection" //connect to server
}
  object connection {
    val random = new Random(System.nanoTime())

    def apply(host: String, port: String): Option[Connection] =
      if(random.nextBoolean()) Some(new Connection)
      else None
  }
  val host = config.get("host")
  val port = config.get("port")
  /*
  if (h != null)
  if(p != null)
  return connection.apply(h,p)

  return null
   */
  val connection = host.flatMap(h => port.flatMap(p => connection.apply(h, p)))
  /*
  if(c != null)
  return c.connect
  return null
   */
  val connectionStatus = connection.map(c => c.connect)
  //if (connection status == null) println(Name) else print (Some(ConnectionStatus.get))
  println(connectionStatus)
  /*
  if (status != null)
  println(status)
   */
  connectionStatus.foreach(println)

  //chained calls
  config.get("host")
    .flatMap(host => config.get("port")
    .flatMap(port => connection(host, port))
    .map(connection => connection.connect))
    .foreach(println)

  //for comprehensions
  val forconnectionStatus = for {
    host <- config.get("host")
    port <- config.get("port")
    connection <- connection(host, port)
  } yield connection.connect
  forconnectionStatus.foreach(println)
}
