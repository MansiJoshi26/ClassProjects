/*
3. Factorial Calculator
Task:
Create a functional interface Factorial with calculate(int n).
Implement it using a lambda expression to return the factorial of n.
Accept a number and print its factorial.
*/

import java.util.*;
import java.util.function.*;

interface I3
{

	public int calculate(int n);	

}

class Demo302
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number  : ");
	int n=sc.nextInt();

	
	I3 obj=x->{

	for(int i=n-1;i>1;i--){
	
	 x*=i;	

	
	}
	return x;
	};
	System.out.println(obj.calculate(n));

}
}