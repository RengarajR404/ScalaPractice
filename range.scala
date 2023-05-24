object range{
    def rangeCheck(num1:Int, num2: Int):Int = {
        if (num1 > 30 || num1 < 20 && num2 > 30 || num2 < 20) {
            return -1
        }
        else{
            if(num1 > num2) return num1
            else return num2
        }
    }

    def main(args: Array[String]) :Unit = {
        println("rangeCheck: "+ rangeCheck(10, 20))
    }
}