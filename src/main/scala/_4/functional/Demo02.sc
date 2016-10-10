def calculateTax(rate: BigDecimal => BigDecimal,
                 salary: BigDecimal): BigDecimal = {
  rate(salary)
}

val usaTax = (salary: BigDecimal) => {
  if (salary > 413201)
    salary * 0.396
  else
    salary * 0.3
}

val twTax: BigDecimal => BigDecimal = _ * 0.25

calculateTax(usaTax, 413202)
calculateTax(twTax, 100)
