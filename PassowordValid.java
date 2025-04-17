package assignment;

import java.util.Scanner;

public class PassowordValid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		int upper =0;
		int lower = 0;
		int else1 =0;
		int number=0;
		int number1=0;
		String num []= {"0","1","2","3","4","5","6","7","8","9"};
		int strlen = num.length-1;
		String special []= {"@","$","#","&","*","^","/","?"};
		int speciallen = special.length-1;
		boolean ifnumber = false;
		boolean ifnumber1 = false;
		int len = s.length();
	 
	
		  
		  
		   if(len>8 && len<15 && !s.contains(" ")) {
			   System.out.println("Length valid");
			    			  
			   
		   
		   for(int i=0;i<s.length();i++) {
			    
			    
			   if(strlen>=0) {
				  ifnumber=s.contains(num[i]);
				  // number=1;
				   
				  if(ifnumber==true) {
					  number=1;
				  }
			    	strlen--;
			    }
			  
			      if(speciallen>=0) {
			       ifnumber1=s.contains(special[i]);
				   if(ifnumber1==true) {
			       number1=1;
				   }
				   speciallen--;
			    }
			       
			   
			  // System.out.println((int)(s.charAt(i)));
			   int j = s.charAt(i);
			 //  System.out.println(j);
			   if(j>=97 && j<=122) {
				  // System.out.println("Contain lower case");
				   lower=1;
				   
				   
			   }
			   else if(j>=65 && j<=90) {
				  // System.out.println("contain upper case");
				   upper=1;
				    
			   }  
			   else {
			   else1=5; 
			   }
		   }
		   
		   }
		   else {
			   System.out.println("Length is Not Valid or Space is there");
		   }
		   
		   
		   
		   if(lower==1 && upper==1 && number==1 && number1==1) {
			   System.out.println("Password is Valid");
		   }
		   else {
			   System.out.println("not contains"+number+" : "+number1);
		   }
		   
 
			 
	
		    
	}
}


/*
 
  boolean b=false;
		   int i2 = 0;
		   for(int i=0;i<num.length;i++) {
			    b= s.contains(num[i]);
			    System.out.println(b);
			    if(i2==0 && b==true) {
			    	i2=1;
			    }
 
//	//boolean b1 = str.contains("@") ||str.contains("$") || str.contains("*") ;
//
//				   
//			   }
 */
