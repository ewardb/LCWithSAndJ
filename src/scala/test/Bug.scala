package scala.test

/**
 * Created by wq on 16-4-13.
 */
class Bug {
  var forword:Int = 0

  def move(up:Int):this.type = {
    forword += up
    this
  }

  def show():this.type = {
    println(forword + "   ")
    this
  }

  def turn():this.type ={
    forword = -forword
    this
  }

}

