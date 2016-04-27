package scala.test

/**
 * Created by wq on 16-4-7.
 */
class Point(x:Int,y:Int){
  override def toString = "x=" + x + "y= "+y

}

object Point extends App{
  def apply(x:Int,y:Int) ={
    new Point (x,y)
  }



  val pp = Point(3,4)
  println(pp)
}
