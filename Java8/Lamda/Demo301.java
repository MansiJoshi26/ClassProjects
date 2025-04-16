import java.util.*;
import java.util.function.*;

interface I2
{

	public int getLen(String str);


}
class Demo301
{

	public static void main(String args[]){
	
	I2 obj=s->s.length();
	System.out.println(obj.getLen("Krishna"));

	}

}
