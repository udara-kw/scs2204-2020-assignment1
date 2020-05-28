object assignment3 extends App {
  //--------------------------------------------------Q1, Q2------------------------------------
  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => GCD(x,a)
    case x => GCD(x,a%x)
  }
  def prime(p:Int,n:Int=2):Boolean= n match {
    case x if(x==p) => true
    case x if GCD(p,x)>1 => false
    case x => prime(p,x+1)
  }
  def primeSeq(n:Int):Unit ={
    if(n>2) primeSeq(n-1)
    if(prime(n)) println(n)
  }
  //--------------------------------------------------Q3---------------------------------------
  def sum(n:Int):Int = {
    if(n==1) 1
    else n + sum(n-1)
  }
  //--------------------------------------------------Q4, Q5-----------------------------------
  def even(n:Int):Boolean = if(n%2 == 0) true else false
  def oddOrEven(start:Int, end:Int):Unit = {
    if(end>=start){
      oddOrEven(start, end-1)
      if(even(end)) println(end + " is Even") else println(end + " is Odd")
    }
  }
  def evenSum(n:Int):Int={
    if(n==0) 0
    else if(even(n)) n+evenSum(n-2) else (n-1) + evenSum(n-3)
  }
  //--------------------------------------------------Q6---------------------------------------
  def fibonacci(n:Int):Int= n match{
    case x if x==0 => 0
    case x if x==1 => 1
    case x => fibonacci(n-1)+fibonacci(n-2)
  }
  def fibonacciSeq(n:Int):Unit={
    if(n>0) fibonacciSeq(n-1)
    println(fibonacci(n))
  }
}