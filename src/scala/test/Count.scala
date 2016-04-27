package test

/**
 * Created by wq on 16-4-6.
 */
class Count {
  private var value = Int.MaxValue
  def increment(): Unit ={
    if(value < Int.MaxValue){
      value + 1
    }else{
      value
    }
    def current = value
  }
}
