case class Point(a: Double, b: Double){
  def x: Double = a
  def y: Double = b

  def +(p: Point): Point ={
    Point(this.x+p.x, this.y+p.y)
  }

  def move(dx:Double, dy:Double): Point ={
    Point(this.x+dx, this.y+dy)
  }

  def distance(p:Point): Double ={
    math.pow(math.pow((this.x - p.x),2) + math.pow((this.y - p.y),2), 0.5)
  }

  def invert(): Point ={
    Point(this.y,this.x)
  }
}

object caseClass extends App{
  val p1 = Point(1,0)
  val p2 = Point(-5,2)
  println("p1 + p2 = " + (p1+p2))
  println("Move p1 by (dx=0.01, dy=0.02) = " + p1.move(0.01, 0.02))
  println("Distance between p1 and p2 = " + p1.distance(p2))
  println("p1 inverted = " + p1.invert())
}


/* OUTPUT

p1 + p2 = Point(-4.0,2.0)
Move p1 by (dx=0.01, dy=0.02) = Point(1.01,0.02)
Distance between p1 and p2 = 6.324555320336759
p1 inverted = Point(0.0,1.0)

*/

