/* Create a java application where we have 1 class  it contains a non 
static method m1 having no parameter and returns float type of 
value and a non static method m2 having float as parameter and 
returns Boolean type of value then invoke these methods under main 
method pass m1 methods return value as parameter for m2 method. */ 



import java.util.Scanner;
class Methods
{
 static Scanner sc=new Scanner(System.in);
 static Methods obj=new Methods();
 float m1()
{
  return sc.nextFloat();
}
Boolean m2(float a)
{
  System.out.println(a);
  System.out.println("Enter Boolean as return  value");
return sc.nextBoolean();
}
public static void main(String[] args)
{
 System.out.println(obj.m2(obj.m1()));
}
}
