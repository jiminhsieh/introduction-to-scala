def calculateTax(rate: BigDecimal => BigDecimal)
               (salary: BigDecimal): BigDecimal = {
  rate(salary)
}

def usaTax(salary: BigDecimal) =
  calculateTax(x =>
    if (x > 413201) x * 0.396
    else x * 0.3)(salary)
def twTax(salary: BigDecimal) =
  calculateTax(x => x * 0.25)(salary)

usaTax(413202)
twTax(100)