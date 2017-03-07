/**
  * Created by emmanuelmaldonado on 07/03/17.
  */
object app {

  def main(args:Array[String]): Unit ={
    println(s"Value e^5 ==> ${eX(20.0000, 9, 1)}")
    println(s"Value e^5 ==> ${eX(5.0000, 9, 1)}")
    println(s"Value e^5 ==> ${eX(0.5000, 9, 1)}")
    println(s"Value e^5 ==> ${eX(-0.5000, 9, 1)}")


  }

  def eX(x:Double, count:Int, acc:Double):Double = count match{
    case c if c == 1 => x + acc
    case c if c > 1 => eX(x, count-1, acc + div (x, count))
  }

  def div(x:Double, i:Int):Double = {
    pow(x,i,1) / factorial(i,1)
  }

  def factorial(n:Int, acc:Int):Double = n match {
    case x if x == 1 => acc
    case x if x > 1 => factorial( n - 1, n * acc)
  }

  def pow(x:Double, pot:Int, acc:Double):Double = pot match {
    case n if n == 0 => acc
    case n if n > 0 => pow(x, pot-1, acc * x)
  }
}
