import java.util.*;
import java.util.function.*;

interface Palindrome1
{

	public String palidome(String str);
	
}
class Demo304{

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String : ");
	String a=sc.next();
		 Palindrome1 p=x->{
	StringBuilder sb=new StringBuilder();
	if(x.equals(sb.reverse().toString()))
	{

		return "palindrome :";
	}
	else
	{

		return "Notpalindrome :";

	}

};
System.out.println(p.palidome(a));
	}

}

