package scala.test

/**
 * Created by wq on 16-4-13.
 */
//定义一个不可变类Pair[T,S], 带一个swap方法，返回组件交换过位置的新对偶
//class Pair[T,S](val t:T,val s:S) {
//  def swap() = new Pair(s,t)
//}
//

// 反省類  如果 new Pair(3,"abc")    則 推斷類型爲    Pair[Int,String]       swap 後  返回 交換的 幾番會一個   Pair[String,Int] 的 Pair 對象


///定义一个可变类Pair[T]，带一个swap方法，交换对偶中组件的位置。
//class Pair[T](val t:T,val s:T) {
//  def swap() = new Pair(s,t)
//}

//给定类Pair[T, S] ，编写一个泛型方法swap，接受对偶作为参数并返回组件交换过位置的新对偶
class Pair[T](val t:T,val s:T) {
  def swap[T,S](t:T,s:S) = new Pair(s,t)
}