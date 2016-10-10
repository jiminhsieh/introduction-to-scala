val list =
  List(4, 3, 0, 1, 2)
list.head
list.tail
list.max
list.min
list.sum
list.contains(5)
list.mkString(",")
list.drop(2)
list.reverse


list.sortWith(_ > _)
list.map(x => x * 2)
list.map(_ * 2)
list.reduce((x, y) => x + y)
list.reduce(_ + _)
list.filter(x => x % 2 == 0)
list.filter(_ % 2 == 0)
list.groupBy(x => x % 2 == 0)
list.groupBy(_ % 2 == 0)


