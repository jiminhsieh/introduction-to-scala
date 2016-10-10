val list =
  List(4, 3, 0, 1, 2)

val twoDim = list.map(_ + 1) ::
  list.map(_ - 1) ::
  list.map(_ * 2) ::
  Nil
twoDim.flatten
// map + flatten 
twoDim.flatMap(x => x.filter(_ % 2 == 1))