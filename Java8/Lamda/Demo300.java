import java.util.*;
import java.util.function.*;
interface I1
{
	public String compare(int a, int b);
	
}
class Demo300{

public static void main(String args[]){
	
I1 obj=(x,y)->{
	if( x > y){
	return "Greater";
}
	else if( x < y){
	return "smaller";
}	
	else{
	return "equal";
}

	
};
System.out.println(obj.compare(12,13));
	}
}