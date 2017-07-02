/**
  * Created by rajkumar on 7/1/17.
  */
object Main extends App {
  val add2 : Int  => Int = _ + 2

  val threePlusTwo = add2(3)

  println(s"threePlusTwo $threePlusTwo")

  val add2Multiply4 = add2 andThen (_ * 4)

  println(s"add2Multiply4(3) ${add2Multiply4(3)}")

  // we can't use 'map' in place for `andThen`

}
