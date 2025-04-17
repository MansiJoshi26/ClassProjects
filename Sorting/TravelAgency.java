import java.util.*;
import java.lang.*;
class City implements Comparable<City>
{

	private String cname;
//constructor
	City(String cname)
	{

		this.cname=cname;

	}
	City(){}
//getter
	public String getCname()
	{
		return cname;

	}
//toString
	public String toString()
	{

		return "Name :"+ cname;

	} 
	
	public int compareTo(City c)
	{

		return this.cname.compareTo(c.getCname());
    
	}
}

class TravelAgency
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		Set<City> s=new TreeSet<City>();
	
	for(int i=0;i<=5;i++){
	System.out.println("enter the name  :");
		String str=sc.next();
		
		s.add(new City(str));
	
	}
		System.out.println(s);

	}


}



