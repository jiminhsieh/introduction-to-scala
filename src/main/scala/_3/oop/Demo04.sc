trait Iterator[A] {
  def hasNext: Boolean
  def next: A
}

trait RichIterator[A]
  extends Iterator[A] {
  def foreach(f: A => Unit): Unit = {
    while (hasNext)
      f(next)
  }
}

class CharIterator(s: String)
  extends Iterator[Char] {
  var i = 0
  def hasNext = i < s.length
  def next = {
    val c = s(i)
    i += 1
    c
  }
}

val ci = new CharIterator("hello") with RichIterator[Char]
ci.foreach(println)