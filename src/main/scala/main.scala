import scala.math.{Pi, pow}
object main {
  def main(args: Array[String]) = {
    println(temperature())
    println(volumeOfSphere())
  }
  def temperature() : Double = {
    val celsius = 35
    val fahrenheit = celsius * 1.8 + 32
    fahrenheit
  }
  def volumeOfSphere() : Double = {
    val radius = 5
    val volume = (4 / 3) * Pi * pow(radius, 3)
    volume
  }
}