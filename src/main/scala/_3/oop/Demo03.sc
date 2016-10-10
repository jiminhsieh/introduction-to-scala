object MathUtil {
  def doubleHalfUp(precision: Int,
                   origin: Double): Double = {
    val tmp = Math.pow(10, precision)
    Math.round(origin * tmp) / tmp
  }
}