import scala.collection.mutable.ArrayBuffer

object PrimeTools {
  def sieve(n: Int) = {
    val a = Array.fill(n + 1)(true)
    a(0) = false
    a(1) = false
    var i = 2
    while (i * i < n) {
      if (a(i)) {
        var j = i + i
        while (j <= n) {
          a(j) = false
          j = j + i
        }
      }
      i += 1
    }
    a
  }
  
  def toDigits(n: Int) = {
    var i = n
    val b = ArrayBuffer.empty[Int]
    while (i > 0) {
      b += i % 10
      i = i / 10
    }
    b
  }
}