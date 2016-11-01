val n = 5

// origin, this is not recommended by official documentation.
for {i <- 0 to n
     j <- 0 to n} {
  print("*")
  if (j == n)
    println("")
}

// Official documentation suggests this way.
// It's more readable than original version
// http://docs.scala-lang.org/style/control-structures.html
for (i <- 0 to n; j <- 0 to n) {
  print("*")
  if (j == n)
    println("")
}