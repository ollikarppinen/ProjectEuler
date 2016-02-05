/*
 * Combinatoric selections
 * Problem 53
 * 	
 * First solution uses Pascals triangle.
 * It's quite a bit faster than the more naive 2nd solution.
 * 
 */

object P53 extends App {
  val result = timer.timer{
    var ans = 0
    var pascalTriangleLayer = Vector(0, 1, 0).map(BigInt(_))
    var n = 0
    def nextLayer(l: Vector[BigInt]) = BigInt(0) +: l.sliding(2).map(_.sum).toVector :+ BigInt(0)
    while(n <= 100) {
      ans += pascalTriangleLayer.filter(_>1000000).size
      pascalTriangleLayer = nextLayer(pascalTriangleLayer)
      n += 1
    }
    ans
  }
//  val result = timer.timer{
//    def factorial(i: Int): BigInt = if (i == 0) 1l else (1 to i).map(BigInt(_)).reduce(_ * _)
//    def nChooseK(n:Int, k:Int) = factorial(n)/(factorial(n - k) * factorial(k))
//    (1 to 100).flatMap((n: Int) => (1 to n).map((k: Int) => nChooseK(n, k)).filter(_ > 1000000)).size
//  }
  timer.printResult(result)
}