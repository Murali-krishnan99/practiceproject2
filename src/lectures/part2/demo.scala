package lectures.part2

object demo extends App{
def calculations(x: Int, y: Int, z: Int): Int ={
  x+y+z
}
println(calculations(5,4,6))

  def calculations2(x: Int, y: Int, z: Int): Int={
    x-y-z
  }
println(calculations2(100,40,20))
  def claculations3(x: Int,y: Int,z: Int):Int = {
    x%y%z
  }
  println(claculations3(6,3,2))
  def stringprocessing(x: String, y: Int): String = {
    if (y <= 1) x
    else (x+ stringprocessing(x,y-1))
  }
  println(stringprocessing("murali",8))

}
