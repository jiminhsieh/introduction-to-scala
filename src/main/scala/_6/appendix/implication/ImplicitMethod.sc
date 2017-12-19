/*
  implicit method
 */

import scala.language.implicitConversions

class MyInteger(n: Int) {
  def printFiveTimes = (0 until 5).foreach(println(_))
}

implicit def implicitIntToString(n: Int) = new MyInteger(n)

10.printFiveTimes






