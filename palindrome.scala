import scala.io.StdIn

class Play {
  def checkPalindrome(num: Int): Boolean = {
    var x = num
    var y = 0
    while (x > 0) {
      y = (y * 10) + x % 10
      x = x / 10
    }
    if (y == num) true else false
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val play = new Play()
    if (play.checkPalindrome(args(0).toInt)) {
      println("Number is a palindrome")
    } else {
      println("Number is not a palindrome")
    }
  }
}


