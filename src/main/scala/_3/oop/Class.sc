class Employee(id: Int,
               val name: String,
               address: String,
               var salary: BigDecimal) {
  def this(id: Int, name: String, salary: BigDecimal) {
    this(id, name, "Earth", salary)
  }

  def getAddress = address
}