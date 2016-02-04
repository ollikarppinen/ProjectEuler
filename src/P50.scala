object P50 extends App {
  val result = timer.timer{
    var ans = 0
    var bn = 0
    var n = 0
    var i = 0
    var j = 0
    var sum = 0
    val p = PrimeTools.sieve(1000000)
                      .zipWithIndex
                      .filter(_._1)
                      .map(_._2)
    while (bn <= n) {
      n = 1
      j = i
      sum = p(j)
      while (sum < 1000000) {
        j += 1
        n += 1
        sum += p(j)
        if (p.contains(sum) && n > bn) {
          ans = sum
          bn = n
        }
      }
      i += 1
    }
    ans
  }
  timer.printResult(result)
}