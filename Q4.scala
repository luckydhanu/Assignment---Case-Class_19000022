object Q4{
  def main(args: Array[String]){
        val p1=Point(0,3)
    val p2=Point(5,6)
   
    println(p1)
    println(p1.invert())
    
    println(p2)
    println(p2.invert())
  }
}

case class Point(a:Int,b:Int){
    def x:Int = a
    def y:Int = b

    def invert()=Point(y,x)
    
}