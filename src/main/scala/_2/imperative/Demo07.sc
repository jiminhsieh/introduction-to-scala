val n = 5
val factorial = {
  var result = 1
  for (i <- 1 to n)
    result = result * i
  result
}