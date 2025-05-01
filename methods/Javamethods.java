/*create a java application where we have one class it contains two static methods m1 and m2 having parameters and return type invoke both the methods under main method note: m2 parameter should be same as m1 return value*/ 

import java.util.Scanner;
class Javamethods
{
static Scanner sc=new Scanner(System.in);
static String m1(char a)
{
  System.out.println(a);
  System.out.println("Enter String value for m1 to return");
  return sc.next();
}
static int m2(String a)
{
  System.out.println(a);
  System.out.println("Enter int value for m2 to return");
  return sc.nextInt();
}
public static void main(String[] args)
{
   System.out.println("Enter char value");
  String b= m1(sc.next().charAt(0));               
  System.out.println(m2(b));
}
}