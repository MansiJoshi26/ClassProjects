import java.util.*;
import java.util.function.*;

interface Power
{

	public double findPower(int base, int exponent);
	

}
class Demo303
{

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the based number  :");
	int a=sc.nextInt();
	System.out.println("enter the exponent      :");
	int b=sc.nextInt();
	Power p=(x,y)->Math.pow(x,y);
	System.out.println(p.findPower(a,b));
	
	}

}