/**
  * Created by rajkumar on 7/1/17.
  */
object ReaderMonadDemo extends App {
  import scalaz._
  import Scalaz._

  val f = Reader[Int, Int] (_ + 2)

  val g = f map (_ * 3)

  println(s"g(3) ${g(3)}")

  val g1 = for (x <- f) yield x * 3
  println(s"g1(3) ${g1(3)}")
}
