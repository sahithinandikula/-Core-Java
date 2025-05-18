/* use palindrome-10% discount
use armstrong-20% discount */

import java.util.Scanner;
class PoorRest
{
 static Scanner sc=new Scanner(System.in);
 double amount;
 double veg(int quantity)
 {
  return 599*quantity;

 }
  double chic(int quantity)
 {
  return 99*quantity;

 }
 double mutton(int quantity)
 {
  return 129*quantity;
 }
}
class Swiggy extends PoorRest
{
  
  void select()
  {
                menu();
		System.out.println("Choose your menu");
		int n = sc.nextInt();
                Sytem.out.println("Enter Quantity");
                int q=sc.nextInt();
                if(n==1)
                {
		amount = amount + Veg(q);
                }
                if(n==2)
                {
		amount = amount + chic(q);
                }
                if(n==3)
                {
		amount = amount + mutton(q);
                }
		System.out.println("1 Menu Selected");
		System.out.println("1 for Extra Options 2 for Bill");
		int n1 = sc.nextInt();
		if(n1==1)		
			select();
		else
			bill();   

  }
  void menu()
  {
    System.out.println("1 for Veg Biryani");
    System.out.println("2 for Chicken Biryani");
    System.out.println("3 for Mutton Biryani");
  }
  void bill()
  {
    System.out.println("---------Invoice---------\n");
    System.out.println("Bill is     : "+amount);
    System.out.println("P charge    :  2/-");
    System.out.println("-------------------------");
    System.out.println("Total bill  : "+(amount+2));
    System.out.println("-------------------------");
    System.out.println("         Thank you       ");
  }
}
class Zomato extends PoorRest
{
  void select()
  {
    menu();
    System.out.println("Choose your menu");
    int n = sc.nextInt();
    Sytem.out.println("Enter Quantity");
    int q=sc.nextInt();
    if(n==1)
    {
      amount = amount + Veg(q);
    }
    if(n==2)
    {
      amount = amount + chic(q);
    }
                if(n==3)
                {
		amount = amount + mutton(q);
                } 	   
    System.out.println("1 Menu Selected");
    System.out.println("1 for Extra Options 2 for Bill");
    int n1 = sc.nextInt();
    if(n1==1)		
	select();
    else
	bill(); 

  }
  void menu()
  {
    System.out.println("1 for Veg Biryani");
    System.out.println("2 for Chicken Biryani");
    System.out.println("3 for Mutton Biryani");
  }
  void bill()
  {
    System.out.println("---------Invoice---------\n");
    System.out.println("Bill is     : "+amount);
    System.out.println("P charge    :  2/-");
    System.out.println("-------------------------");
    System.out.println("Total bill  : "+(amount+2));
    System.out.println("-------------------------");
    System.out.println("         Thank you       ");
  }
}
class User{
public static void main(String[] args)
{
 
   System.out.println("choose swiggy or zomato ");
   Swiggy obj=new Swiggy();
   Zomato obj1=new Zomato();
   int c=sc.nextInt(); 
   if(c==1)
   {
   obj.select();
   System.out.println("Thanks for choosing Swiggy");
   }
   if(c==2)
   {
   obj1.select();
   System.out.println("Thanks for choosing Zomato");
   }
}

}

