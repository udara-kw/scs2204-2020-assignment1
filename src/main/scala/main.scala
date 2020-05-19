object main {
  def main(args: Array[String]) = {
    println(temperature())
  }
  def temperature() : Double = {
    val celsius = 35
    val fahrenheit = celsius * 1.8 + 32
    fahrenheit
  }
}