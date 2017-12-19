/*
  implicit class
  syntax sugar of implicit method
 */

implicit class MyInteger(n: Int) {
  def printFiveTimes = (0 until 5).foreach(println(_))
}

10.printFiveTimes
