package scala.test

/**
 * Created by wq on 16-4-6.
 */
class Person(var age:Int) {
  age = if(age<0) 0 else age
}
//class Person(val name:String){
//  val firstName:String
//  val lastName:String
//
//}