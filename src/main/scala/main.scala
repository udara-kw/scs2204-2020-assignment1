import scala.math.{Pi, pow}

object main {
  def main(args: Array[String]) = {
    println(temperature(celsius = 35))
    println(volumeOfSphere(radius = 5))
    println(wholesaleCost(amount = 60))
  }

  def temperature(celsius:Double) : Double = {
    celsius * 1.8 + 32
  }

  def volumeOfSphere(radius:Double) : Double = {
    (4 / 3) * Pi * pow(if (radius>0) radius else 0, 3)
  }

  def wholesaleCost(amount:Int) : Double = {
    val coverPrice : Double = 24.95
    val discount : Double = coverPrice * (40/100)
    val shippingCost : Double = if (amount<=50) 3 else 3 + (amount-50)*0.75 //considered shipping cost for whole first 50 books as Rs.3
    val wholesaleCost : Double = shippingCost + ((coverPrice - discount) * amount)
    wholesaleCost
  }
}