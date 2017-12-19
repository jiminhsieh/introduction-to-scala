/*
  If you are interested in this,
  you could find `subtyping` and `Liskov substitution principle` for more information.
 */

sealed abstract class Animal(val name: String) {
  val footNumber: Integer
  val fly: Boolean
  def speak: String
}

class Dog(name: String) extends Animal(name) {
  override val footNumber: Integer = 4
  override val fly = false
  override def speak = "Spark"
}

class Bird(name: String) extends Animal(name) {
  val footNumber: Integer = 2
  val fly = true
  def speak = "chatter"
}

val dog: Animal = new Dog("Alex")
val bird: Animal = new Bird("Kiwi")

// Animal type with Dog behavior
dog.footNumber
dog.fly
dog.speak

// Animal type with Bird behavior
bird.footNumber
bird.fly
dog.speak