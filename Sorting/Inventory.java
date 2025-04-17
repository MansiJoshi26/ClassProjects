import java.util.*;

class Pro implements Comparable<Pro>,Comparator<Pro>
{

	private int id;
	private String name;
	private double price;
	private int quan;

	Pro(int id, String name, double price, int quan)
	{

		this.id=id;
		this.name=name;
		this.price=price;
		this.quan=quan;
	}

	Pro(){}

	public int getId(){

	return id;
}

	public String getName(){
		return name;
}

	public double getPrice(){
		return price;
}

	public int getQuan(){
		return quan;
}
	
	


	public String toString()
	{
		return id+" "+name+" "+price+" "+ quan;

	}



	public int compare(Pro p1,Pro p2)
	{
		return Integer.compare(p1.getQuan(),p2.getQuan());

	}
	public int compareTo( Pro p)
	{
		return this.getName().compareTo(p.getName());
	}

}


class SortPrice implements Comparator<Pro>
{
	public int compare(Pro p1,Pro p2)
	{


		return Double.compare(p1.getPrice(),p2.getPrice());
	} 



}
 
class Inventory
{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	ArrayList<Pro> list=new ArrayList<Pro>();
	System.out.println("Enter the no of products ");
	
	int num=s.nextInt();

	for(int i=0;i<num;i++)
	{
		System.out.println("enter the Id    : ");

		int id=s.nextInt();
		System.out.println("enter the name  : ");
		String n=s.next();
		System.out.println("enter the price : ");
		double p=s.nextDouble();
		System.out.println("enter the quan  : ");
		int q=s.nextInt();
	Pro pro=new Pro(id,n,p,q);
		
	list.add(pro);

	}
	Collections.sort(list);
	System.out.println("name      :"+list);

	Collections.sort(list, new Pro());
	System.out.println("Quantity  :"+list);
	
	Collections.sort(list,new SortPrice());
	System.out.println("Price     :"+list);


}


}



















