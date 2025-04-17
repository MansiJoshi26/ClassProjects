import java.util.*;

class MySort1 implements Comparator<String>

{

	public int compare(String s1,String s2){
	return -s1.compareTo(s2);		

	}
}


class Mysort1{

public static void main(String args[])

	{

		Set<String> s=new TreeSet<String>();
		
		s.add("Indore");
		s.add("Bhopal");
		s.add("Dewas");
		System.out.println(s);
	}

}