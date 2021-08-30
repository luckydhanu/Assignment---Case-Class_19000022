object Q2{
    def main(args: Array[String]){
     val p1=Point(0,3)
    val p2=Point(5,6)
    val p3=p1.move(2,3)
    val p4=p2.move(5,2)
    

    println(p1)
    println(p2)
    println(p3)
    println(p4)
    println(p3)
    }
}

case class Point(a:Int,b:Int){
    def x:Int = a
    def y:Int = b

    def move(xm:Int,ym:Int)=Point(this.x+xm,this.y+ym)
    
}