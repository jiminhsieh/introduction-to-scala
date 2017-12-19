/*
  It also calls anonymous function.
 */

(0 until 10).map((value: Int) => value * value)
(0 until 10).map(value => value * value)

(0 until 10).map(value => value + 1)
(0 until 10).map(_ + 1)
