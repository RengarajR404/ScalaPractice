
object Fact {
    def main(args : Array[String]):Unit = {
        val x = args(0).toInt;
        println(factorial(x, 1))
    }

    def factorial(num: Int,  result: Int): BigInt = {
        if(num < 0 ){
            return -1 ;
        }
        else if (num == 1 || num == 0){
            return result;
        }
        else{
            println(num*result)
            return factorial(num-1, num*result);
        }

    }
}