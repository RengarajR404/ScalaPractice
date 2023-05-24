import scala.io.StdIn.readLine

import scala.io.StdIn.readInt
@main def UserHello () = {
	val a  = readInt();
	val b = readInt();
	if(a==b){
		println(3*a);
	}
	else{
		println(s"The value of a+b is ${a+b}");
	}

}
