package lectures.part2

import javax.swing.plaf.multi.MultiListUI

abstract class mylist {
  /*
  method head = int first element of the list
  method tail = int remainder of the list
  method isempty =  is this list empty
  method add(int) => new list with this element added
  tostring => a string representation of the list
  */
  def head: Int
  def tail: mylist
  def isempty: Boolean
  def add(element: Int): mylist
  def printelements: String
// polymorphic call
  override def toString: String = "(" + printelements + ")"
}

object empty extends mylist{
  def head: Int = throw new NoSuchElementException
  def tail: mylist = throw new NoSuchElementException
  def isempty: Boolean = true
  def add(element: Int): mylist = new cons(element,empty)
  def printelements: String = ""
}
class cons(h: Int, t: mylist) extends mylist{
  def head: Int = h
  def tail: mylist = t
  def isempty: Boolean = false
  def add(element: Int): mylist = new cons(element,this)

  def printelements: String = {
    if (t.isempty)""+h
    else h+" "+t.printelements
  }
}

object listtest extends App{
  val list =  new cons(1,new cons(2, new cons(3, empty)))
  println(list.tail.head)
  println(list.add(4).head)
  println(list.isempty)
  println(list.toString)
}