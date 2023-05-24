import scala.io.StdIn.readLine

object SumOfNumbersInString {
  def main(args: Array[String]): Unit = {
    val inputString = "reg 1231 -34.67"

    val pattern = """-?\d+(\.\d+)?""".r
    val result = pattern.findAllIn(inputString).toList
    println(s"The given string is: $inputString")
    println(s"The sum of the numbers in the said string is: "+result.map(_.toDouble).sum)
  }
}
