import scala.math.pow


object Q3{
    def main(args: Array[String]){
        val p1=Point(3,2)
    val p2=Point(7,8)
    val p3=Point(3,5)
    def distance(a:Point,b:Point)=math.sqrt((math.pow(a.x-b.x , 2))+(math.pow(a.y-b.y, 2)))
   
    println(p1)
    println(p2)
    println(p3)
    println(distance(p1, p2))
    println(distance(p1,p3))
   
    }
    
}

case class Point(a:Int,b:Int){
    def x:Int = a
    def y:Int = b

    
}