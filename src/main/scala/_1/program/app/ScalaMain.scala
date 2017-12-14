package _1.program.app

/**
  * Created by jimin on 10/2/16.
  */
object ScalaMain {
  val todayEvent = "Workshop"
  val workshop = "Introduction to Scala"
  lazy val funStream = Stream.from(1).map(_ => "fun")

  def main(args: Array[String]): Unit = {
    println("Hello everybody!")
    print("Welcome to " + todayEvent + "!\n")
    println("I hope you can enjoy - "
      + workshop + ". :)")
    print("Scala is so much " +
      funStream.take(5).mkString(" ") + "!")
  }
}