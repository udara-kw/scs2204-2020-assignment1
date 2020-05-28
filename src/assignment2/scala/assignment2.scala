object q1 extends App {
  def hourlyIncome(hours:Double):Double = hours*150
  def OTIncome(hours:Double):Double = hours*75
  def totalSalary(normalHours:Double, OTHours:Double):Double = hourlyIncome(normalHours) + OTIncome(OTHours)
  def takeHomeSalary(normalHours:Double, OTHours:Double):Double = totalSalary(normalHours, OTHours)* (90/100)
}

object q2 extends App{
  def attendees(price:Int):Int = 120 + (15-price)/5*20
  def revenue(price:Int):Int = attendees(price) * price
  def cost(price:Int):Int = 500+ (3*attendees(price))
  def profit(price:Int):Int = revenue(price) - cost(price)
}