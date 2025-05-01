import java.util.Scanner;
class Bank
{
  static Scanner sc=new Scanner(System.in);
  static Bank obj=new Bank();
  static long balance=sc.nextLong();
  long withdraw(double amount)
  {
    balance=balance-amount;
    return balance;
  }
  long deposit(double amount)
  {
    balance=balance+amount;
    return balance;
  }
  public static void main(String[] args)
  {
    System.out.println("Enter your choice");
    String s=sc.next();
    if(s=="withdraw"){
  System.out.println(obj.withdraw(sc.nextDouble()));
}
    else
    {
    System.out.println(obj.deposit(sc.nextDouble()));
    }
   }
}