def min(x: Int, y: Int): Int = {
  def max(x: Int, y: Int) = {
    if (x > y) x
    else y
  }

  if (x == max(x, y))
    y
  else
    x
}