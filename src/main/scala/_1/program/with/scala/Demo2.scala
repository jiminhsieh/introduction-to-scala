package _1.program.`with`.scala

/**
  * Created by jimin on 10/2/16.
  */
object Demo2 extends App {
  val todayEvent = "JCConf"
  val workshop = "Introduction to Scala"
  lazy val fun =
    (0 to 4).map(x => "fun").mkString(" ")

  println("Hello everybody!")
  print("Welcome to " + todayEvent + "!\n")
  println("I hope you can enjoy this workshop - "
    + workshop + ". :P")
  print("Scala is so much " + fun + "!")
}