package scala.test

/**
 * Created by wq on 16-4-8.
 */
abstract class Item {
  def price():Double
  def desription():String
  override def toString():String = {
    "des "+desription() + "price " + price()
  }
}

