
import java.util.*;
class StdRank implements Comparable<StdRank>,Comparator<StdRank>
{

	private int roll;
	private String name;
	private int marks;
	
	StdRank(int roll, String name, int marks){

		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}

	StdRank(){}
	public int getId()
	{
		return roll;	
	}
	public String getName()
	{
		return name;
	}	
	public int getMarks()
	{
		return marks;	
	}	


	public String toString()
	{

		return roll+" "+name+" "+marks;
	}


	public int compareTo(StdRank sr){

		return Integer.compare(this.getMarks(),sr.getMarks());

	}
	public int compare(StdRank sr1, StdRank sr2){

		return sr1.getName().compareTo(sr2.getName());
	}
}


class SortRoll implements Comparator<StdRank>
{

	public int compare(StdRank sr1,StdRank sr2){

		return Integer.compare(sr1.getId(),sr2.getId());

	}
}

class Rank
{

	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	ArrayList<StdRank> list=new ArrayList<StdRank>();
	System.out.println("Enter number of Student");
	int num=s.nextInt();
	for(int i=0;i<num ;i++){
		
		System.out.println("Enter Id  no  : ");
		int id=s.nextInt();
		System.out.println("Enter Name    : ");
		String n=s.next();
		System.out.println("Enter Marks   : ");
		int m=s.nextInt();
	

	StdRank rank=new StdRank(id,n,m);
	list.add(rank);
	
	}


	Collections.sort(list);
	System.out.println("marks     :"+list);
	Collections.sort(list,new StdRank());
	System.out.println("name      :"+list);
	Collections.sort(list,new SortRoll());
	System.out.println("roll      :"+list);
	}

}








