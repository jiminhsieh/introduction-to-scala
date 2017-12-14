sealed abstract class Animal(val name: String) {
  val footNumber: Integer
  val fly: Boolean
  def speak: Unit
}

class Dog(name: String) extends Animal(name) {
  override val footNumber: Integer = 4
  override val fly = false
  override def speak: Unit = println("Spark")
}

class Bird(name: String) extends Animal(name) {
  val footNumber: Integer = 2
  val fly = true
  def speak: Unit = println("chatter")
}