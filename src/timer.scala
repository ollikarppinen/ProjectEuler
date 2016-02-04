/*
 * Helper method to measure execution time
 */

object timer {
  
  def timer[A](task: => A) = {
    val startTime = System.currentTimeMillis()
    val result = task
    val stopTime = System.currentTimeMillis()
    val delta = stopTime - startTime
    (result, delta)
  }
  
  def printResult(details: (Int, Any)) = {
    println("Runtime: " + details._1 + " ms")
    println("Result: " + details._2)
  }
}