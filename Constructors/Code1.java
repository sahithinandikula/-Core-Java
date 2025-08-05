//create a java application that has a non static variable,a static variable,a constructor and a non sratic method.call the constructor and method m1 in the main method 
import java.util.Scanner;
class Code1
{
  static Scanner sc=new Scanner(System.in);
  static double d=sc.nextDouble();
  int a=sc.nextInt();
  Code1()
  {
    System.out.println("Hello");
  }
  int m1(float f)
  {
    System.out.print(f);
    return sc.nextInt();
  }
  public static void main(String[] args)
  {
     Code1 obj=new Code1();
    System.out.print(obj.m1(sc.nextFloat()));
  }
}