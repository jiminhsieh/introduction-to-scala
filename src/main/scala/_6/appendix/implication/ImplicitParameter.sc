/*
  implicit parameter
 */

// declaration
def intToString(implicit n: Int) = n.toString

def max(x: Int)(implicit y: Int) = {
  x + y
}

implicit val x = 5566

// execution
intToString

max(8787)
