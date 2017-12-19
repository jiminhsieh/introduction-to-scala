/*
  More Option
 */

val list = List(0, 1, 2, 3, 4, 5)

def odd(n: Int) = {
  if (n % 2 == 1) Some(n)
  else None
}

list.map(odd(_))
list.flatMap(odd(_))

val listOption =
  List(Some(1), None, Some(2), None, Some(3))

Some(5566).map(x => x * 2)
listOption.flatMap(x => x.map(y => y * 2))
listOption.flatMap(_.map(_ * 2))

