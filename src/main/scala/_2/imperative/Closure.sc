/*
  Closure
 */
def min(x: Int, y: Int): Int = {
  def max = {
    if (x > y) x
    else y
  }

  if (x == max) y else x
}