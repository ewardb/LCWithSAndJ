package scala.test

/**
 * Created by wq on 16-4-7.
 */
object Card extends Enumeration with App{
  val M = Value("a")
  val N = Value("b")
  val C = Value("c")
  val X = Value("d")


  print(Card.M)
  print(Card.N)
  print(Card.C)
  print(Card.X)
}
