package Bill;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;


public class Electric_bill2_ {
	public static void main(String[] args) {
		
    int final_bill=0;
    int unitcons=0 ;
    double total_bill=0;
    double bill =0;
    double subsidy=0;
    double fixedCharge = 0;
    double final_fixedCharge = 0;
    double energyCharge =0;
    double surcharge =0;
    double dutyRate=0;
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Name : ");
	String name = sc.next();
	
	System.out.println("Enter the Address :");
	String add = sc.next();
	
    System.out.println("Enter the Mobile Number :");
	long mob = sc.nextLong();
	
	System.out.println("Enter the Meter Serial No : ");
	String meter = sc.next();
	
	System.out.println("Enter the Zone : ");
	String zone = sc.next();
	
	System.out.println("Enter the Previous reading :");
	int pre = sc.nextInt();
	
	System.out.println("Enter the Current reading :");
	int curr = sc.nextInt();
	
	System.out.println("Enter the Connection load in Kw :");
	float load = sc.nextFloat();
	
	if (curr<pre) {
		System.out.println("please enter the correct reading ");
		return;
	}
//	else {
		unitcons = curr - pre;
		double avgUnitday = (double) unitcons /30;
//	}
	
	// select domestic and commerical 
		System.out.println("Enter the Connection Type (D for Domestic and C for Commerical) ⚠ : ");
		char type = sc.next().charAt(0);
		
	switch(type){
	case 'D' : if(unitcons<=30)
	{
		bill = unitcons*3.34;
		energyCharge += (unitcons -30)*3.34;
		fixedCharge =25;
	    dutyRate = energyCharge*0.09;
	    
	}
	else if (unitcons <= 50) {
		bill = unitcons*4.27;
		energyCharge += (unitcons -50)*4.27;
		fixedCharge =25;
		dutyRate = energyCharge*0.09; 
	} 
	else if (unitcons >=51 || unitcons<=150) {
		bill = unitcons*5.23;
		energyCharge += (unitcons -51)*5.23;
		fixedCharge =50;
		dutyRate = energyCharge*0.09;
	} 
	else if (unitcons >=151 || unitcons<=300) {
		bill = unitcons*6.61;
		energyCharge += (unitcons -151)*6.61;
		fixedCharge =100;
		dutyRate = energyCharge*0.12;

	} 
	else {
		bill = unitcons*6.80;
		energyCharge += (unitcons -300)*6.80;
		fixedCharge =125;
		dutyRate = energyCharge*0.12;
		
	}
	final_fixedCharge = fixedCharge*load;
	surcharge = 0.05*energyCharge;
	if(unitcons<=100) {
    	subsidy = 500;
		System.out.println(total_bill=( final_fixedCharge+surcharge+bill+energyCharge+dutyRate)-500);
	}
	else {
	total_bill = final_fixedCharge+surcharge+bill+energyCharge+dutyRate;
	}
//	final_bill = total_bill+89-0.10;
	//apply Subsidy
//	bill = Math.max(0, bill-subsidy);
break;
	case 'C' : 
		bill = unitcons*10;
		energyCharge += (unitcons -100)*6.80;
		fixedCharge=50;
		final_fixedCharge = fixedCharge*load;
		dutyRate = energyCharge*0.12;
		surcharge = 0.05*energyCharge;
		total_bill = final_fixedCharge+surcharge+bill+energyCharge+dutyRate;
//        final_bill = total_bill+89;
		break;
		default : 
	 System.out.println("Invalid Connection type !");
	}
System.out.println(total_bill);
System.out.println(final_bill);
//public class Electric_bill {
//public static void main(String[] args) {
//	
//	   Electric_bill2_ obj = new Electric_bill2_();
//	   
//	   obj.calculateBill();
//	// year and month current
		LocalDate currentDate = LocalDate.now();
		int year = currentDate.getYear();
		String monthNameString = currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		
		//year and month previous
		LocalDate previousMonthDate = currentDate.minusMonths(1);
		int prevYear = previousMonthDate.getYear();
		String prevMonthNameString = previousMonthDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
	
	
		System.out.println("                      Madhya Pradesh Paschim Kshetra Vidyut Vitran Company Ltd.                               |");
	        System.out.println("                              G.P.H. Compound, Pologround, Indore (M.P.)                                      |");
          	System.out.println("                                    (Wholly Owned by Govt. of M.P.)                                           |");
	        System.out.println("  GST No. 11DEV2004VERMA     CIN No.M2004MP2002DEV1106     Call Centre No.1912       https://www.mpwz.co.in   |");
		System.out.println("   Security Deposited :           INR 1403.00                   Total Amount Payable Till Due Date:  NFP**      ");
         	System.out.println("   Security Deposited Pending:    INR 0.00                      Total Amount Payable After Due Date: NFP**      ");
		System.out.println("                                                                Due Date:                       "+currentDate+" ");
		System.out.println("| Consumer No. MP23828389                     (DVK47-4)    | Connection Type "+type+"(LV1.2)       URBAN              |");
		System.out.println("| Purpose: Domestic Light and fan                          | Sanctioned Load: "+load+"KW                Phase:THREE |");
		System.out.println("| Mr./Ms"+name+"                                            | Meter serial No. "+meter+"                        |");
		System.out.println("| "+add+"                                                   | DC/Zone:         "+zone+"                          |");
		System.out.println("| "+mob+"                                               | Feeder code:     1106200426                       |");
		System.out.println("|                                                          | DTR code:        DEV11062004                      |");
		System.out.println("| Costumer Care Details                                    | Bill No.      "+monthNameString+"M005619728                  |");
	
	
	    System.out.println("  Reading Detail                                                                                                ");
	    System.out.println("| Current    | Current Read-  | Previous   | M.F.   | Meter Unit    | Assessed    | Final      | Average Unit  |");
	    System.out.println("| Reading    | -ing Date      | Reading    |        | Consumption   | Units       | Consumption| Per Day       |");
	    System.out.println("| "+curr+"   |"+currentDate+" | "+pre+"    |  1     | "+unitcons +" | 0.00        |"+unitcons+"        | "+avgUnitday+"|");
	    System.out.println("  Last Payment Detail                                                                                           ");
	    System.out.println("| Bill Month     |   Amount Paid     |         Payment Reference No.        |     Payment Date                 |");
	    System.out.println("| "+prevMonthNameString+"-"+prevYear+"   |    2025           |   DEV966954877011062004              | "+previousMonthDate+"                       |");
	    System.out.println("|----------------|-------------------|--------------------------------------|----------------------------------|");
	    System.out.println("| Dec-2024m      |    2105           |   VER110620049669548770              |     30-12-2024                   |");
	    System.out.println("+----------------+-------------------+--------------------------------------+----------------------------------+");
	    System.out.println("|   Last Six Months Consumption      | |  Billing Detail                                 | Amount in INR       |");
	    System.out.println("|------------------------------------| |-------------------------------------------------|---------------------|");
            System.out.println("| Bill    | Date    | Reading | Unit | | Energy Charges                                  |"+energyCharge+"              |");
	System.out.println("|---------|---------|---------|------| |-------------------------------------------------|---------------------|");
    System.out.println("| Dec-2024| 21-12-24| "+pre+"   | 121  | | Fuel and Power Purchase Adjustment surcharge    |"+surcharge+"        |");
	System.out.println("|---------|---------|---------|------| |-------------------------------------------------|---------------------|");
    System.out.println("| Nov-2024| 19-11-24| 23054   | 103  | | Fixed Charge                                    |"+final_fixedCharge+"           |");
	System.out.println("|---------|---------|---------|------| |-------------------------------------------------|---------------------|");
    System.out.println("| OCT-2024| 16-10-24| 22951   | 134  | | Electricity Duty                                |         89.00       |");
	System.out.println("|---------|---------|---------|------| |-------------------------------------------------|---------------------|");
    System.out.println("| SEP-2024| 17-09-24| 22817   | 111  | | Additional SD Installment                       |         0.00        |");
	System.out.println("|---------|---------|---------|------| |-------------------------------------------------|---------------------|");
    System.out.println("| AUG-2024| 21-08-24| 22706   | 138  | | Other Charges                                   |         0.00        |");
	System.out.println("|---------|---------|---------|------| |-------------------------------------------------|---------------------|");
    System.out.println("| JUl-2024| 22-07-24| 22706   | 149  | | Current Month Bill Amount                       | "+total_bill+"   |");
	System.out.println("+------------------------------------+ |-------------------------------------------------|---------------------|");
    System.out.println("                                       | MP.Govt. Subsidy Amount                         |   "+subsidy+"             |");
	System.out.println("                                       |-------------------------------------------------|---------------------|");
    System.out.println("                                       | Interest on Security Deposit(-)                 |         0.10        |");
	System.out.println("                                       |-------------------------------------------------|---------------------|");
    System.out.println("                                       | CCB Adjustment                                  |         0.00        |");
	System.out.println("                                       |-------------------------------------------------|---------------------|");
    System.out.println("                                       | Lock Credit/Employee Rebate(-)                  |         0.00        |");
	System.out.println("                                       |-------------------------------------------------|---------------------|");
    System.out.println("                                       | Previous Month Delayed Payment Surcharge        |         0.00        |");
	System.out.println("                                       |-------------------------------------------------|---------------------|");
    System.out.println("                                       | Online/Advance Payment Incentive                |         0.00        |");
	System.out.println("                                       |-------------------------------------------------|---------------------|");
    System.out.println("                                       | Amount Received Aganist Bill                    |         0.00        |");
	System.out.println("                                       |-------------------------------------------------|---------------------|");
    System.out.println("                                       | Total Payment Payable                           |   "+final_bill+"    |");
	System.out.println("                                       +-----------------------------------------------------------------------+");
}

}