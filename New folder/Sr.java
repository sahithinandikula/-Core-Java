//mock 201 QNO:4
import java.util.Scanner;
class Sr
{
   static Scanner sc=new Scanner(System.in);
   static Sr obj=new Sr();
   void m1()
   {
      System.out.println("Hello, Sravika"); 
   }
   static void m2(String s)
   {
     System.out.println(s);
     obj.m1();
   }
   char m3()
   {
     m2(sc.next());
     System.out.println("m3 method called");
     return sc.next().charAt(0);
   }
   static double m4(int a)
   {
     System.out.println(obj.m3());
     System.out.println(a);
     return sc.nextDouble();
   }
   public static void main(String[] args)
   {
      System.out.println(m4(sc.nextInt()));
   }
} 

/*
output:
15
hello
hello
Hello, Sravika
m3 method called
@
@
15
1.2345
1.2345
*/