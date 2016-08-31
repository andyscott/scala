// Testing predef masking by a nonleading import

object StringPlusConfusion {
  import Predef.{ any2stringadd => _ }

  def f[T](x: T) = x + 5

}
