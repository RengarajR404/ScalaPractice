import scala.io.StdIn.readInt
import java.lang.Math;
@main def AbsoluteDifference = {
	var a  = readInt();
	val c  = Math.abs(a-51);
	if(c > 51){
		println(s"The triple of their difference is ${3*c}");
	}
	else{
		println(s"Absolute Difference is, {c}");

	}

}
