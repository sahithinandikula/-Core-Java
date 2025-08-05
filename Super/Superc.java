/* CAJP where we have 1 class,an instance variable & a paramterized constructor then inherit this class into other class  which contains an instance variable and a parameterized constructor & invoke its properties by using dynamic input */  

import java.util.Scanner;
class A
{
   static Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   A(String s)
   {
      System.out.println(s);
   }
}
class Superc extends A
{
  Boolean b=sc.nextBoolean();
  Superc(long l)
  {
    super(sc.next());
    System.out.println(l);
  }
  public static void main(String[] args)
  {
     Superc obj=new Superc(sc.nextLong());
     System.out.println(obj.a);
     System.out.println(obj.b);
  }
}


/*  
  output
  876565
  hello
  89
  hello
  true
  876565
  89
  true

*/
    