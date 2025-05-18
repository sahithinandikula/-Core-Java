/* Create a java application where we have one class it contains one instance variable Boolean and non static method m1 having parameter and return type inherit this class into another class it contains one instance variable like long, static variable like String and one instance method like m2 having parameter and return type and a parameterized constructer then invoke all under main method by dynamic inputs.*/

import java.util.Scanner;
class Properties
{
  static Scanner sc=new Scanner(System.in);
  Boolean a=sc.nextBoolean();
  int m1(char ch)
  { 
    System.out.print(ch);
    return sc.nextInt();
  }
}
class Box extends Properties
{
  long l=sc.nextLong();
  static String s=sc.next();
  char m2(int a)
  {
    System.out.print(a);
    return sc.next().charAt(0);
  }
  Box(float f)
  {
    System.out.print(f);
   }
}
class User extends Box
{
  public static void main(String[] args)
  {
    User obj=new User(sc.nextFloat());
    System.out.println(obj.l);
    System.out.println(s);
    System.out.println(obj.m2(sc.nextInt()));
    System.out.println(obj.m1(sc.next().charAt(0)));
  }
}