/*CAJA where we have one abstract class which contains two defined and two undefined methods and a parameterized constructor then provide functionality for this properties in a concrete class and invoke them by providing dynamic inputs. */

import java.util.Scanner;
abstract class Main
{
   static Scanner sc=new Scanner(System.in);
   abstract long m1(String s);
   abstract char m2(Boolean b);
   int m3(short a)
   {
     System.out.println(a);
     return sc.nextInt();
   }
   float m4(double d)
   {
     System.out.println(d);
     return sc.nextFloat();  
   }
   Main(float f)
   {
     System.out.println(f);
    }
}
class B extends Main
{
   B(float f)
   {
      super(f);
   }
   long m1(String s)
   {
      System.out.println(s);
     return sc.nextLong();
   }
   char m2(Boolean b)
   {
     System.out.println(b);
     return sc.next().charAt(0);
   }
   public static void main(String[] args)
   {
     B obj=new B(sc.nextFloat());
     System.out.println(obj.m1(sc.next()));
     System.out.println(obj.m2(sc.nextBoolean()));
    System.out.println(obj.m3(sc.nextShort()));
    System.out.println(obj.m4(sc.nextDouble()));
   }
}

/*
output:
1.2
1.2
hello
hello
17556
17556
true
true
@
@
2
2
23
23
12.345
12.345
1.2
1.2
*/
    