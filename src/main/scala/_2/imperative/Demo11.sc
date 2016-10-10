val n = 5
for {i <- 0 to n
     j <- 0 to n} {
  print("*")
  if (j == n)
    println("")
}