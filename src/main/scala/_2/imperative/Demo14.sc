// Recursion
def factorial(n: Int): BigInt = {
  if (n == 0) 1
  else n * factorial(n - 1)
}

factorial(15000)