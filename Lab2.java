import java.util.Scanner;
class ElectricityBill
{
Scanner sc=new Scanner(System.in);
Scanner scs=new Scanner(System.in);
String consumer_number;
String consumer_name;
double previous_month_reading;
double current_month_reading;
double amount;
String type;
ElectricityBill()
{
String consumer_number="";
String consumer_name="";
double previous_month_reading=0.0;
double current_month_reading=0.0;
String type="";
}
void getBillDetails()
{
System.out.println("enter consumer number:");
consumer_number=scs.next();
System.out.println("enter consumer name:");
consumer_name=scs.next();
System.out.println("enter previous month reading:");
previous_month_reading=sc.nextDouble();
System.out.println("enter current month reading:");
current_month_reading=sc.nextDouble();
System.out.println("enter type:");
type=scs.next();
}
void calculate_amount()
{
double units;
units=current_month_reading-previous_month_reading;
if(type=="d")
{
if(units<=100)
amount=units*1;
else if (units<=200)
amount=100+(units-100)*2.50;
else if(units<=500)
amount=100+250+(units-200)*4;
else
amount=units*6;
}

else
{
if(units<=100)
amount=units*2;
else if(units<=200)
amount=200+(units-100)*4.50;
else if(units<=500)
amount=200+450+(units-200)*6;
else
amount=units*7;
}
}
void showBill()
{
System.out.println("Consumer name:"+consumer_name);
System.out.println("consumer number:"+consumer_number);
if(type.equals("d"))
System.out.println("type=domestic");
else
System.out.println("type=commercial");
System.out.println("previous month reading"+previous_month_reading);
System.out.println("current month reading:"+current_month_reading);
System.out.println("electricityBill:"+amount);
}
}
public class Lab2
{
public static void main(String[] args)
{
ElectricityBill e=new ElectricityBill();
e.getBillDetails();
e.calculate_amount();
e.showBill();
}
}