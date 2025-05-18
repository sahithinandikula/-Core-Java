/* create a java application where we have a bank, it will provide
customer details like account number, IFSC Code, and ATM Pin No.
and available balance to the customer then, the customer has to
display all these values with respect to one user-defined method and
then invoke that method under the main method. */
import java.util.Scanner;
class Bank
{
   String actno;
   String IFSC;
   int Pin;
   double balance;
   Bank(String actno,String IFSC,int Pin,double balance)
   {
    this.actno=actno;
    this.IFSC=IFSC;
    this.Pin=Pin;
    this.balance=balance;
   }
}
class Customer extends Bank
{
   Customer(String actno,String IFSC,int Pin,double balance)
   {
    super(actno,IFSC,Pin,balance);
   }
   void display()
   {
     System.out.println("Customer Account Details:");
     System.out.println("Account Number:"+actno);
     System.out.println("IFSC code:"+IFSC);
     System.out.println("Pin:"+Pin);
     System.out.println("balance:"+balance);
   }
}
class account
{
 public static void main(String[] args)
 {
 Customer obj=new Customer("ADE123456","SBITS2323",9110,200000);
 obj.display();
 }
}