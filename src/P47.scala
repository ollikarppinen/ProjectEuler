/*
Distinct primes factors
Problem 47
The first two consecutive numbers to have two distinct prime factors are:

14 = 2 × 7
15 = 3 × 5

The first three consecutive numbers to have three distinct prime factors are:

644 = 2² × 7 × 23
645 = 3 × 5 × 43
646 = 2 × 17 × 19.

Find the first four consecutive integers to have four distinct prime factors. What is the first of these numbers?
 */

import scala.collection.mutable.Buffer

object P47 extends App {
  val t = System.currentTimeMillis()
  var n = 3 // Integer to scrutinize
  val pb = Buffer(2) // prime buffer
  var ans = 0 // answer
  val cb = Buffer.empty[Int] // Buffer for consecutive numbers to test

  def pf(x: Int) = { // returns number of distinct prime factors for n
    var i = 0
    var j = x
    var f = 0
    while (j > 1) {
      if (j % pb(i) == 0) {
        while (j % pb(i) == 0) j = j / pb(i)
        f += 1
      }
      i += 1
    }
    f
  }

  while (ans == 0) {
    if (pb.forall(n % _ != 0)) { // Primality test
      pb += n // If passed n is added to prime buffer
      cb.clear() // Consecutive number buffer is emptied
    } else {
      cb += n // If n is not a prime it's added to the consecutive number buffer
      if (cb.size == 4) {
        if (cb.map(pf(_)).forall(_ == 4)) { // Check if four consecutive numbers each have 4 distinct prime factors
          ans = cb.head
        } else {
          cb.remove(0)
        }
      }
    }
    n += 1
  }
  println("Run-time: " + (System.currentTimeMillis() - t) + "ms")
  println(ans)
  
}