import scala.io.StdIn.readLine;
import scala.io.StdIn.readInt;
object scalaInput {
    def getInput(name: String, age: Int): Unit ={
        if (age > 16){
            println("You are allowed to drive vehicle")
        }
        else{
            println("You are not allowed to drive" + s"Please wait for ${16-age} years")
        }
    }
    def main(args: Array[String]) : Unit ={
        val name = readLine();
        val age = readInt();
        getInput(name, age);
    }
}