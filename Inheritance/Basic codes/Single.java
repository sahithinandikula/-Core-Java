//Single inheritance
import java.util.Scanner;
class A
{
   static Scanner sc=new Scanner(System.in);
   int m1(Boolean b)
   {
     System.out.println("This is Boolean var"+b);
     return sc.nextInt();
   }
}
class Single extends A
{
   float m2(char a)
   {
     System.out.println(a);
     return sc.nextFloat();
   }
   public static void main(String[] args)
   {
      Single obj=new Single();
      System.out.println(obj.m2(sc.next().charAt(0)));
      //main method can be taken in any class .
      System.out.println(obj.m1(sc.nextBoolean()));
   }
}

/* 
  output:

>java Single
@
@
1.2
1.2
true
This is Boolean vartrue
89
89



*/