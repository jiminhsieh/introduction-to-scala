// High-order functions - Partially Applied Function
// Curry
def calculateTax(rate: BigDecimal => BigDecimal)
                (salary: BigDecimal): BigDecimal = {
  rate(salary)
}

// First way of Partially Applied Function
def usaTax = calculateTax(
  x =>
    if (x > 413201) x * 0.396
    else x * 0.3
) _
// Second way of Partially Applied Function
def twTax: BigDecimal => BigDecimal = calculateTax(_ * 0.25)

usaTax(413202)
twTax(100)