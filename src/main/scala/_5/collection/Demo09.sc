val list = (0 to 5).toList
def sum(list: List[Int]): Int = {
  list match {
    case Nil => 0
    case head :: tail => head + sum(tail)
  }
}
sum(list)