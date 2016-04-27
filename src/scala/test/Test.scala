package scala.test


import scala.collection.mutable
import scala.io.Source
import java.io.PrintWriter

/**
 * Created by wq on 16-4-7.
 */
object Test extends App{
//  val pass = Console.readLine();
//  if(pass equals "password") println(System.getProperty("user.name")); else println('error)
//  import sys.process._
//  val x = "ls -la .." !
//
//  println(x)
//  ProcessLogger

  //编写一小段Scala代码，将某个文件中的行倒转顺序(将最后一行作为第一行,依此类推)
//  val path = "/etc/hosts"
//  val reader = Source.fromFile(path).getLines()
//
//  val result =reader.toArray.reverse
//
//  val pw = new PrintWriter(path)
//
//  result.foreach(line => pw.write(line+"\n"))
//  pw.close()





  //编写Scala程序,从一个带有制表符的文件读取内容,将每个制表符替换成一组空格,使得制表符隔开的n列仍然保持纵向对齐,并将结果写入同一个文件
//  val path = "/etc/hosts"
//  val reader = Source.fromFile(path).getLines()
//
//  val result = for(t <- reader) yield t.replaceAll("\\t","    ")
//  val pw = new PrintWriter(path)
//
//  result.foreach(line => pw.write(line))
//  pw.close()

  //编写一小段Scala代码,从一个文件读取内容并把所有字符数大于12的单词打印到控制台。如果你能用单行代码完成会有额外奖励
//
//  val path = "abc"
//  Source.fromFile(path).mkString.split("\\s+").foreach(arg => if(arg.length>12) println(arg))

  //编写Scala程序，从包含浮点数的文本文件读取内容，打印出文件中所有浮点数之和，平均值，最大值和最小值
//  val nums = Source.fromFile("abc").mkString.split("\\s+")
//
//  var totals = 0d
//  nums.foreach(totals += _.toDouble)
//

 // 编写Scala程序，向文件中写入2的n次方及其倒数，指数n从0到20。对齐各列:

//  val pw = new PrintWriter("test.txt")
//
//  for(n <- 0 to 20){
//
//    val t = BigDecimal(2).pow(n)
//    pw.write(t.toString)
//    pw.write("\t\t")
//    pw.write((1/t).toString)
//    pw.write("\n")
//  }
//
//  pw.close()
//
//  println((3+4->5).toString)    //3+4->   是 元祖
//
//  println((3->4+"5"))
//  Array(1,2,3,4).max
//
//
//

//  Array(1,2,3,4).min
//
//
//  println(List(1,3,5,2,7,4).reduceLeft(_+_))
//  println(List(1,3,5,2,7,4).reduce(_+_))
//
//  println(List(1,3,5,2,7,4).map(x=> x+1))
//  println(List(List(1,3),List(2,4)).flatMap(x=> x.map(_*2)))//flatMap  是map和 flatten操作的結合 先 進行MAp 操作   然後進行 flatten操作  flatMap 還可以取出掉空元素NONE



//  Array(12,3).map((x:Int)=>3*x)
//  def values(fun:(Int)=>Int,low:Int,high:Int):List[(Int,Int)] = {
//    var arr = List[(Int,Int)]()
//    low to high foreach{
//      num=> arr = (num,fun(num)) :: arr
//    }
//    arr
//  }
//  println(values(x=>x*x,-5,5).mkString)
//  println(values(x=>x*x,-5,5).reverse.mkString)

//  println(Array(1,2,3,45,56,7).reduceLeft((x,y)=> if(x>y) x else y))

//  println(1 to 10 reduceLeft(_*_))


//  var list = List[Int]()
//
//  def adjustToPair(fun:(Int,Int)=>Int)(tip:(Int,Int)) = {
//    list = fun(tip._1,tip._2) :: list
//  }
//  def map(fun:(Int,Int)=>Int):Int = {
//    list.reduceLeft(fun)
//  }
//  val pairs = (1 to 10 ).zip(11 to 20)
//  for((a,b)<-pairs){
//    adjustToPair(_ * _)((a,b))
//  }
//
//  println(map(_+_))



//  println((1 to 10 zip(11 to 20)).map(_ + _))

//  val digits = Set(3,2,7)
//  val primes = Set(2,3,5,7)
//  println(digits.intersect(primes))
//  println(digits&primes)
//
//  Numeric
//  println(digits.foldLeft(1)((x,y)=>x*y))
//  digits.product
//  println(digits.splitAt(3))
//    println("Scala".zipWithIndex.max)
//  val words = Source.fromFile("/etc/hosts").getLines().toStream
//  println(words)
//  words(7)
//  println(words)
//  val ran = 1 to 100
//  val lst = List(ran:_*)
//
//  val ran2 = 1 to 100 toList
//  val lst2 = List(ran2:_*)
////  println(lst.par.sum)
//  println(lst.par.filter(_%2==0).toList)
//  println(lst2.par.filter(_%2==1).toList)
////  println(lst.par.count( _%2==0))
//  for(i<-(0 until 100).toList.par)
//    print(" "+i+" ")
//
//  import scala.collection.mutable.{Map,HashMap,SortedSet}
//  def indexs(str:String):Map[Char,SortedSet[Int]] = {
//    val map = new HashMap[Char,SortedSet[Int]]
//    var i = 0 ;
//    str foreach{
//      c=>
//        map.get(c) match{
//          case Some(result) => println(result);map(c) = result +i
//          case None => map += (c->mutable.SortedSet(i))
//        }
//        i+=1
//    }
//    map
//  }
//  println(indexs("Mississippi"))

//  import scala.collection.immutable.HashMap
//  import scala.collection.mutable.ListBuffer
//  def indexs(str:String):Map[Char,ListBuffer[Int]] = {
//    var map = new HashMap[Char,ListBuffer[Int]]
//    var i = 0
//    str foreach {
//      c=>
//        map.get(c) match{
//          case Some(result) => result+=i
//          case None => map += (c -> ListBuffer(i))
//        }
//        i+=1
//    }
//    map
//  }
//
//  println(indexs("Mississippi"))
//

//  def removeZero(nums:List[Int]):List[Int] = {
//    nums.filter(_!=0)
//  }
//  val lst = List(1,2,3,4,0,0,5,6,8)
//  println(removeZero(lst))
//
//  import scala.collection.mutable.ListBuffer
//def strMap(strArr:Array[String],map:Map[String,Int]):Array[Int] ={
//  val arr = ListBuffer[Int]()
//  strArr.map{
//    map.get(_) match {
//      case x:Some[Int] => arr +=x.get
//      case m:Map[_,_] => println(m.keys)
//      case None =>
//    }
//  }
//  arr.toList.toArray
//}
//
//
//  val a = Array("Tom","Fred","Harrry")
//  val m = Map("Tom"->3,"Dick"->4,"Harrry"->5)
//  println(a.map(v=>m.get(v)).filter(_.isDefined).map(_.get).mkString(" "))
//  println(a.map(v=> m.get(v)).filter(_.isDefined).map(_.get).mkString)
//  println(strMap(a,m).mkString)
//
//  println(List(1,2,3,4,5,56).mkString)
//  println(Array(1,2,3,4,5,56).mkString)\
//  println(Array(Array(1,2),Array(3,4)).mkString) //[I@67b64c45[I@4411d970
//  def f(p:Traversable[Int]) ={
//    var r = p map(_+1)
//    println("Traversable" + r)
//    r.foreach(println)
//    r.foreach(println)
//}
//
//  f(List(1,2,3,4))
//  def f1(p:TraversableOnce[Int]) ={
//    var r = p map(_+1)
//    println("TraversableOnce" + r)
//    r.foreach(println)
//    r.foreach(println)
//  }
//
//  f1(List(1,2,3,4))
//
//  import collection.mutable
//  trait MyMkString{
//    this:mutable.Iterable[String]=>
//    def myMkString = if(this !=Nil) this.reduceLeft(_+_)
//    def myMkString2 = if(this !=Nil) this.reduceRight(_+_)
//  }
//
//  trait a{  //a 這個特質   國展了  Exception
//    this:Exception=>
//    this.getMessage
//  }
//
//  var a = new mutable.HashSet[String] with MyMkString
//  a+="1"
//  a+="2"
//  a+="3"
//
//  println(a.myMkString)


//  def divArr(arr:Array[Int],int:Int) = {
//    arr.grouped(int).toArray
//  }
//
//  var arr = Array(1,2,3,4,5)
//
//  divArr(arr,3).foreach(a=>println(a.mkString))




//  def middle[T](iter:Iterable[T]):T = {
//    val seq = iter.toArray
//    seq(seq.length/2)
//  }


//  val bugsy = new Bug
//  bugsy.move(4).show().move(6).show.turn().move(5).show
//
//
//  val x = Seq(1,2).map
//  List(1,2).map
//  Array(1,2).map
//  println(x.min)
























}
