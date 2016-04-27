package scala.test.traitA

/**
 * Created by wq on 16-4-8.
 */
class BlueBird extends Bird with Fly with Walk{
  def flyWithnowing(): Unit ={
    println("BlueBird flyWithnowing")
  }
}
