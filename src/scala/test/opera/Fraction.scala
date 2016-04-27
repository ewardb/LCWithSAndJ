package scala.test.opera



import scala.math.abs
/**
 * Created by wq on 16-4-11.
 */
class Fraction(n:Int,d:Int) {
  private val num:Int = if(d==0) 1 else n * sign(d)/gcd(n,d)
  private val den:Int = if(d==0) 0 else d * sign(d)/ gcd(n,d)
  override def toString = num + "/" + den
  def sign(a:Int) = if(a>0) 1 else if(a<0) -1 else 0
  def gcd(a:Int,b:Int) :Int = if(b==0) abs(a) else gcd(b,a%b)



}
