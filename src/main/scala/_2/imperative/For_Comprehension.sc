val n = 5

// origin, this is not recommended by official documentation.
for {_ <- 0 to n
     j <- 0 to n} {
  print("*")
  if (j == n)
    println("")
}

/*
  Official documentation suggests this way.
  It's more readable than original version
  @see http://docs.scala-lang.org/style/control-structures.html#comprehensions
 */
for (_ <- 0 to n; j <- 0 to n) {
  print("*")
  if (j == n)
    println("")
}