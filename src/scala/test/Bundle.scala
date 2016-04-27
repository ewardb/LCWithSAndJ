package scala.test

import scala.collection.mutable.ArrayBuffer

/**
 * Created by wq on 16-4-8.
 */
class Bundle extends Item{

  val items = new ArrayBuffer[Item]()

  def addItem(item:Item) = {
    items += item
  }

  def price():Double = {
    var total = 0d
    items.foreach(total += _.price())
    total
  }


  def desription():String = {
    items.mkString(" ")
  }
}
