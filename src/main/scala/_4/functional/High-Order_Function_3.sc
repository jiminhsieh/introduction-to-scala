def calculateTax(rate: BigDecimal => BigDecimal)
: BigDecimal => BigDecimal = {
  rate
}

def usaTax = calculateTax(x =>
  if (x > 413201) x * 0.396
  else x * 0.3
)
def twTax = calculateTax(x => x * 0.25)

usaTax(413202)
twTax(100)

calculateTax(usaTax)(413202)
calculateTax(twTax)(100)