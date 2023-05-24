class Play {
    def armstrong(num : Int) :Boolean = {
        var x = num
        var y = Math.log(num.toDouble).toInt + 1
        var result = 0
        while( x > 0){
            result = result + Math.pow(x, y).toInt
            x = x/10
        }
       if(result == num){
        return true
       }
       else{
        return false
       }
    }
}

object Main {
    def main(args : Array[String]): Unit = {
        var arms = new Play()

        if(arms.armstrong(args(0).toInt)){
            println("armstrong")
        }
        else{
            println("Non armstrong")
        }
    }
}