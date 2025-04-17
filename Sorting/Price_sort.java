import java.util.*;
import java.lang.*;
/*Top 5 Product Prices
Scenario:
An e-commerce platform wants to store unique product prices and display them in descending order to highlight the most expensive products first.

Task:
Use a TreeSet<Double> to store product prices.
Sort in descending order.
Note:Read data from user.

*/

class ProductSort implements Comparator<ProductSort>{


private String proname;
private double proprice;

ProductSort(String  proname , double proprice)
{

this.proname=proname ;
this.proprice=proprice;

}
ProductSort(){}
public String getName()
{

return proname;
}
public double getPrice()
{

return proprice;
}

public String toString()
{

return proname +"   :  "+proprice;

}

public int compare(ProductSort p1,ProductSort p2){

  	return -(int)p2.getPrice()-(int)p1.getPrice();       //shortcut for compare to


}

}

class Price_sort
{

public static void main(String args[])

{	Scanner sc=new Scanner(System.in);

	Set<ProductSort> sort=new TreeSet<ProductSort>(new ProductSort());
	System.out.println("enter number of products   :  ");
	int num=sc.nextInt();

	for(int i=0;i<num ;i++){
	System.out.println("name    :");

	String n=sc.next();

	System.out.println("Price   :");
	double price=sc.nextDouble();
	//ProductSort pro=new  ProductSort(n,price); 
	

	sort.add(new ProductSort(n,price));


}

System.out.println(sort);
}


}










