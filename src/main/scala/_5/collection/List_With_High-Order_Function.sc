val vector = Vector(1, 2, 3)
val list = List(
  vector.map(_ + 10),
  vector.map(_ - 10),
  vector.map(_ * 100)
)

list.flatten

val flatmap =
  list.flatMap(x => x.filter(_ % 2 == 1))

val mapThenFlat =
  list.map(x => x.filter(_ % 2 == 1)).flatten

flatmap == mapThenFlat