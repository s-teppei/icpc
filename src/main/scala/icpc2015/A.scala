package icpc2015

import scala.io.StdIn

/**
  * Created by Teppei Shiroyama under MIT License.
  */
object A {
  def main(args: Array[String]): Unit = {
    f(StdIn.readInt())
  }

  def f(n:Int):Unit = n match {
    case 0 =>
    case _ =>
      val max = StdIn.readLine().split(" ").map(_.toInt).combinations(2).map({
        case Array(a,b) => Math.abs(a - b)
      }).max
      println(max)
      f(StdIn.readInt())
  }
}
