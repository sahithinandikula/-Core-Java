/* CAJP where a we have a class containing 1 static and 1 instance variable and a static block which displays a user friendly message and having a local variable and instance block which displays a user friendly msg and a variable then one static and 1 instance variable and parameterized constructor then invoke all this properties by providing dynamic I/ps */

import java.util.Scanner;
class A
{ 
  static Scanner sc=new Scanner(System.in);
  static Boolean b=sc.nextBoolean();
  char c=sc.next().charAt(0);
  static
  {
     float a=sc.nextFloat();
     System.out.println("hello");
  }
  //Instance block
  {
    System.out.println("Instance");
    String s=sc.next();
  }
  static int a=sc.nextInt();
  long l=sc.nextLong();
  A(short s)
  {
    System.out.println("hi Madhu");
    System.out.println(s);
  }
  public static void main(String[] args)
  {
     A obj1=new A(sc.nextShort());
  }
}


/* output
true
1.2
hello
87
3
h
Instance
hello
3654345
hi Madhu
3

 