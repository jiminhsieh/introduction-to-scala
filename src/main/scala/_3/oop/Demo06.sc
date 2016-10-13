sealed abstract class Expr
case class Add(first: Expr, second: Expr) extends Expr
case class Sub(first: Expr, second: Expr) extends Expr
case class Multi(first: Expr, second: Expr) extends Expr
case class Div(first: Expr, second: Expr) extends Expr
case class Value(n: Int) extends Expr

def calculate(combination: Expr): Int = {
  combination match {
    case Add(Multi(a, x), Multi(b, y)) if (x == y) =>
      // (3 + 4) * 2
      (calculate(a) + calculate(b)) * calculate(x)
    case Add(first, second) =>
      calculate(first) + calculate(second)
    case Sub(first, second) =>
      calculate(first) - calculate(second)
    case Multi(first, second) =>
      calculate(first) * calculate(second)
    case Div(first, second) =>
      calculate(first) / calculate(second)
    case Value(n) =>
      n
  }
}
// ((3 * 2) + (4 * 2))
calculate(Add(Multi(Value(3), Value(2)), Multi(Value(4), Value(2))))