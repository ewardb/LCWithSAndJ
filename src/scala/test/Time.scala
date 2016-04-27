package scala.test

/**
 * Created by wq on 16-4-6.
 */
class Time(val hours:Int , val minutes:Int) {
  def before(other:Time):Boolean = {
    hours < other.hours || (hours == other.hours && minutes < other.minutes)
  }
  override def toString():String = {
    hours + ":" +minutes
  }
}
