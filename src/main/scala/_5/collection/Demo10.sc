val list = (0 until 9).toList
def sumTail(list: List[Int]): Int = {
  def help(list: List[Int],
           previous: Int): Int = list match {
    case Nil => 0
    case List(onlyOne) => previous + onlyOne
    case head :: tail => help(tail, previous + head)
  }
  help(list, 0)
}
sumTail(list)