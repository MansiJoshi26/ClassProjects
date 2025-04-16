import java.util.*;
import java.util.function.*;
import java.util.function.Function.*;
import java.util.stream.Collectors;

class Stud {
//implements Comparable<Stud>
private String name;
private int marks;

Stud(String name,int marks){

this.name=name;
this.marks=marks;

}

public String getName(){
	return name;
}
public int getMarks(){

	return marks;
}

public String toString (){

	return name+" "+marks;
}

//public int compareTo(Stud s){

//return compare( this.getMarks(),s.getMarks());
//}
}

class Demo2003{

public static void main(String arg[]){

	ArrayList<Stud> ls=new ArrayList<Stud>();
	

	Stud s1=new Stud("mansi",120);
	Stud s2=new Stud("mj",100);
	Stud s3=new Stud("mansi joshi",90);
	Stud s4=new Stud("joshi",112);
	

	ls.add(s1);
	ls.add(s2);
	ls.add(s3);
	ls.add(s4);
//ls.stream().sorted((x,y)->Integer.compare(x.getMarks(),y.getMarks())).forEach(w->System.out.println(w));


List<Stud>l=ls.stream().sorted((x,y)->Integer.compare(x.getMarks(),y.getMarks())).collect(Collectors.toList());


//Collections.sort(ls);
System.out.println(l);

}


}








