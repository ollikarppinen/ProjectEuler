
object PrimeTools {
  def sieve(n: Int) = {
    val a = Array.fill(n - 1)(true)
    var i = 2
    while (i * i < n) {
      if (a(i - 2)) {
        var j = i + i
        while (j <= n) {
          a(j - 2) = false
          j = j + i
        }
      }
      i += 1
    }
    a.zipWithIndex.filter(_._1).map(_._2 + 2)
  }
}