import java.util.*;

class UniqueStudent implements Comparable<UniqueStudent>{


	private int rollno;

	UniqueStudent(int rollno){

	this.rollno=rollno;

	}
	UniqueStudent()

	{

	}
	public int getRollno()
	{

	return rollno;
	}


public int compareTo(UniqueStudent u)
{

if(this.getRollno()<u.getRollno())
{
	
	return -1;
}
else if(this.getRollno()>u.getRollno())
{
	
	return 1;
}

else{
	
	return 0;
}

}

public String toString()
{

return rollno+"  ";
}


}


class RollSort{
public static void main(String args[])
{
Set<UniqueStudent> s=new TreeSet<UniqueStudent>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of student : ");
int n=sc.nextInt();
for(int i=0;i<n;i++){
	UniqueStudent u1=new UniqueStudent(sc.nextInt());
      //  UniqueStudent u2=new UniqueStudent(102);
	//UniqueStudent u3=new UniqueStudent(103);
s.add(u1);
}



//s.add(u2);
//s.add(u3);
System.out.println(s);
}


}