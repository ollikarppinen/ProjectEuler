
/*

Goldbach's other conjecture
Problem 46
It was proposed by Christian Goldbach that every odd composite number can be written as the sum of a prime and twice a square.

9 = 7 + 2×12
15 = 7 + 2×22
21 = 3 + 2×32
25 = 7 + 2×32
27 = 19 + 2×22
33 = 31 + 2×12

It turns out that the conjecture was false.

What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?

 */
import scala.collection.mutable.Buffer

object P46 extends App {
  val t = System.currentTimeMillis()
  val i = Iterator.from(1).map(_ * 2 + 1) // Odd number iterator
  val pb = Buffer(2) // Prime buffer
  val cb = Buffer.empty[Int] //Odd composite number buffer
  var ans = 0
  while (ans == 0) {
    val n = i.next
    if (pb.forall(n % _ != 0)) { // Primality test
      pb += n // If test is passed add n to prime buffer
    } else {
      cb += n // Else add n to composite buffer
      if (pb.forall(p => math.sqrt((n - p) / 2) % 1 != 0)) ans = n // Check if conjecture holds for n
    }
  }
  println("Run-time: " + (System.currentTimeMillis() - t) + "ms")
  println("Answer: " + ans)
}

