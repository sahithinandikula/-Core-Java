/* create a java application where we have class student  it contains  
Non static fields like Std_name,Std_id,Std_batch then we have a 
method display which displays the student details, enter the data of 
4 students and after that ask user to which student details he need 
to see and based on his input display that respective student details 
by providing dynamic inputs. */ 

import java.util.Scanner;
class CSE
{
  static Scanner sc=new Scanner(System.in);
  String std_name=sc.next();
  int std_id=sc.nextInt();
  int std_batch=sc.nextInt();
  void display(stud x)
  {
    System.out.println(x.std_name);
    System.out.println(x.std_id);
    System.out.println(x.std_batch);
  }
  public static void main(String[] args)
  {
    CSE obj1=new obj1();
    CSE obj2=new obj2();
    CSE obj3=new obj3();
    CSE obj4=new obj4();
    System.out.println("Select student to    display the details");
   int n=sc.nextInt();
    if(n==1)
			obj3.Display(obj1);
		else if(n==2)
			obj2.Display(obj2);

		else if(n==3)
			obj1.Display(obj3);
		else if(n==4)
			obj1.Display(obj4);
		else if(n==5)
			obj1.Display(obj5);

   }
}