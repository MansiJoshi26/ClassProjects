import java.util.Scanner;
abstract class Rbi
{
    abstract int roi();
    abstract void kyc();

} 
class Sbi extends Rbi
{
    int roi()
    {
        System.out.println("roi");
        return 8;
    }
    void kyc()
    {
        System.out.println("kyc");
    }
}
class Demo
{
    public static void main(String[] args) {
        Rbi r=new Sbi();
        r.kyc();
        System.out.println(r.roi());
    }
}
//--------------------------------------------------------------

class Customer 
{
int loyaltypoint;
int calculate_loyalty_points(int amountspent)
{

loyaltypoint=amountspent/10;
return loyaltypoint;

}
}


class Premier
{
int loyaltypoint;
int calculate_loyalty_points(int amountspent)
{

    loyaltypoint=(amountspent/10)*2;
    return loyaltypoint;

}
}


class Demo1
{

    public static void main(String[] args) 
    {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter the amount");
        int a=s.nextInt();
        Premier p=new Premier();
        Customer c=new Customer();
        if(a>100)
        {
            System.out.println("loyalty point for premier : "+p.calculate_loyalty_points(a));
        }
        if(a<50)
        {
            System.out.println("loyalty point for costumer :"+c.calculate_loyalty_points(a));
        }
    }
}
//--------------------------------------------------------
class Pizza
{
    int baseprice,toppingcost;
    Pizza(int baseprice,int toppingcost) 
    {
        this.baseprice=baseprice;
        this.toppingcost=toppingcost;
    }
    void calprice(int n)
    {
        baseprice=baseprice+n*toppingcost;
    System.out.println(baseprice);
    }
}

class Discount extends Pizza
{
    Discount(int x,int y)
    {
       super(x, y);
        System.out.println(baseprice+"   :   "+toppingcost);
    }
    void calprice(int n)
    {
        if(n>=3)
        {
          //  baseprice=baseprice+n*toppingcost;
            baseprice=baseprice/10;
            System.out.println(baseprice);
        }
    }
}
class Demo2
{

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Base price");
        int a=s.nextInt();
        System.out.println("Topping price");
        int b=s.nextInt();
        Discount d=new Discount(a,b);
        Pizza p=new Pizza(a, b);    
        System.out.println("no of topping");
        int c=s.nextInt();
        d.calprice(c);
        p.calprice(c);
    }
}
//--------------------------------------------------------------
abstract class App
{
    String brand;
    boolean ison;
    App(String brand,boolean ison)
    {

        this.brand=brand;
        this.ison=ison;

    }
    abstract  void operate();

    void turnon()
    {
        System.out.println("app is on");
    }
    void turnoff()
    {
        System.out.println("app is off");
    }
}

class Washingmachine extends App
{
    Washingmachine(String a,boolean b)
    {
        super(a, b);
    }
    void operate()
    {
        System.out.println("washing");
    }
}
class Refrigerator extends App
{
    Refrigerator(String a,boolean b)
    {
        super(a, b);
    }
    void operate()
    {
        System.out.println("freeze");
    }
}
class Demo3
{
    public static void main(String[] args) {
        Washingmachine w=new Washingmachine("brand",true);
        Refrigerator r=new Refrigerator("brand 1",false);
        w.turnon();
        w.operate();
        w.turnoff();
        r.turnon();
        r.operate();
        r.turnoff();
    }
}
//----------------------------------
abstract class Payment
{
    double amount;
    String id;
    Payment(double amount ,String id)
    {
        this.amount=amount;
        this.id=id;
    }
    abstract void processpayment();
    void display()
    {
        System.out.println("id is     :    "+id+"     :     amount     :    "+amount);
    }
}

class Credit extends Payment
{
    String Cardno;
    Credit (String Cardno )
    {
        super(10000,"101");
        this.Cardno=Cardno;
    }
    
    void processpayment()
    {
        System.out.println("Process Credit Card payment for amount  :  $"+amount);
    }
}
class Paypal extends Payment
{
    Paypal ()
    {
        super(10000,"102");
    }
    void processpayment()
    {
        System.out.println("Process Payment Card payment for amount  :  $"+amount);
    }
}
class Demo4
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("amount   :  ");
        double x=s.nextDouble();
        System.out.println("id       :  ");
        String y=s.next();
        //Payment obj=new Payment(a,b);
        Credit c=new Credit("1234455");
        Paypal p=new Paypal();
        c.processpayment();
        p.processpayment();
        c.display();
    }
}
//----------------------------------------------------------
abstract class Course
{
    String coursename;
    int duration;
    Course(String coursename,int duration)
    {
        this.coursename=coursename;
        this.duration=duration;
    }
    abstract void showcounter();
    void display()
    {
        System.out.println("course name    :    "+coursename+"     Duration    :    "+duration);
    }
}

class Programming extends Course
{
    String language;
    Programming(String language){
    super("coursename ", 2025);
    this.language=language;
    }

    void showcounter()
    {
        System.out.println("this course language is  :   "+language);
    }
}

class Design extends Course
{
    String tool;
    Design (String tool)
    {
        super("coursename ", 2025);
        this.tool=tool;
    }
    void showcounter()
    {
        System.out.println("this is tool designation   :   "+tool);
    }
}

class Demo5
{
     public static void main(String[] args) {
        Programming p=new Programming("java");
        Design d=new Design("tool");
        p.showcounter();
        d.showcounter();
        d.display();
    }
}
//-------------------------------------------------------
abstract class Libitem
{
    String title,author;
    Libitem(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
    abstract void checkout();
    abstract void returnitem();
    void displayinfo()
    {
        System.out.println("title   :   "+title+"    author     :   "+author);
    }
}
class Book extends Libitem
{
    int page;
    Book(int page)
    {
        super("chanakya neeti", "abc");
        this.page=page;
    }
    void checkout()
    {
        System.out.println("checking out book  :  "+title);
    }
    void returnitem()
    {
        System.out.println("return book        :"+title);
    }
}
class Dvd extends Libitem
{
    int duration;
    Dvd(int duration)
    {
        super("atomic habits", "xyz");
    }
    void checkout()
    {
        System.out.println("checking out Dvd  :  "+title);
    }
    void returnitem()
    {
        System.out.println("return Dvd        :"+title);
    }
}

class Demo6
{
    public static void main(String[] args) {   
    Book b=new Book(200);
    b.checkout();
    b.returnitem();
    b.displayinfo();
    Dvd d=new Dvd(12);
    d.checkout();
    d.returnitem();
    d.displayinfo();
}
}
