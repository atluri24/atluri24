
import java.util.Scanner;
class SavingsAccount
{
private static double a_i;
private double s_b;
public SavingsAccount()
{
s_b=0; //s_b=savings balance
a_i=0; //annual interest rate
}
public SavingsAccount(double balance)
{
s_b=balance;
a_i=0;
}
public void calculateMonthlyInterestRate()
{
System.out.println("current balance:"+s_b);
double mi;
mi=(s_b*a_i)/12;
s_b=s_b+mi;
System.out.println("new balance:"+s_b);
}
double getbalance()
{
return s_b;
}

static void modifyInterest(double new_interest)
{
a_i=new_interest;
}
}
class Lab3
{
public static void main(String args[])
{
SavingsAccount s1=new SavingsAccount(2000);
SavingsAccount s2=new SavingsAccount(3000);
s1.modifyInterest(0.04);
s1.calculateMonthlyInterestRate();
s2.modifyInterest(0.04);
s2.calculateMonthlyInterestRate();
System.out.println("after changing interest rate from 4% to 5%");
s1.modifyInterest(0.05);
s1.calculateMonthlyInterestRate();
s2.modifyInterest(0.05);
s2.calculateMonthlyInterestRate();
}
}