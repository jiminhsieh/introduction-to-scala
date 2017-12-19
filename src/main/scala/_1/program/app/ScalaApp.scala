package _1.program.app

/**
  * Created by jimin on 10/2/16.
  */
object ScalaApp extends App {
  val todayEvent = "Workshop"
  val workshop = "Introduction to Scala"
  lazy val fun = (0 to 4).map(_ => "fun").mkString(" ")

  println("Hello everybody!")
  print("Welcome to " + todayEvent + "!\n")
  println(
    "I hope you can enjoy this workshop - "
      + workshop + ". :)")
  print("Scala is so much " + fun + "!")
}
