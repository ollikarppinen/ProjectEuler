
object P49 extends App {
  /* Broken :<
  val t = System.currentTimeMillis()
  val p = PrimeTools.sieve(9999)
  var i = 1489
  var ans = 0l
  while (ans == 0) {
    if (p(i)) {
      var j = i + 2
      var k = j + j - i
      while (k < 9999) {
        if (p(j) && p(k)) {
          if (PrimeTools.toDigits(i) == PrimeTools.toDigits(k) &&
            PrimeTools.toDigits(i) == PrimeTools.toDigits(j))
            ans = (i.toString + j.toString + k.toString).toLong
        }
        j += 2
        k += 4
      }

    }

    i += 2
  }
  println(ans)
  println((System.currentTimeMillis() - t) + " ms.")

  val q = PrimeTools.sieve(9999).zipWithIndex
    .filter(_._1)
    .map(_._2)
    .dropWhile(_ < 1000)
    .groupBy((PrimeTools.toDigits(_).sorted))
    .map(_._2)
    .filter(_.size >= 3)
    .filter(a => a.map(x => a.filter(_ < x).map(y => (y << 1) - x)).map(a.contains(_)).reduce(_ ^ _))
  //                                .map(a => a.map(x => a.filter(_ < x).map(y => (y << 1) - x)).map(a.contains(_))).map(z => z.reduce(_ ^ _))//.map(a.contains(_))))
	*/
}