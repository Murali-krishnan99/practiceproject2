package lectures.part2

import Playground.{cinderella => princess, princecharming}
import lectures.part2.{SPEED_OF_LIGHT, sayhello, writer}
import java.util.Date


/**
 * created by Murali.
 */
object packagingandimports extends App {

  //package members are accessible by their simple name
  val writer = new writer ("murali","cuelebre",2021)

  //import the package
  val princess = new princess // playground.cindrella = fully qualified name
 //packages are in hierarchy

  //package object
  sayhello
  println(SPEED_OF_LIGHT)

  //imports
  val  prince = new princecharming
val d = new Date
val sqldate = new java.sql.Date(2018, 5, 4)
}
