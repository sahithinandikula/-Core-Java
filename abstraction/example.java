/*create a java application where we have one abstract class it contains 2 undefined methods then provide functionality for those methods in a concrete class and invoke them by providing dynamic inputs */

import java.util.Scanner;
abstract class A
{
   abstract int m1(String s);
   abstract char m2(long l);
}
class example extends A
{
   static Scanner sc=new Scanner(System.in);
   int m1(String s)
   {
     System.out.println(s);
     return sc.nextInt();
   }
   char m2(long l)
   {
     System.out.println(l);
     return sc.next().charAt(0);
   }
    public static void main(String[] args)
    {
      example obj=new example();
      System.out.println(obj.m1(sc.next()));
      System.out.println(obj.m2(sc.nextLong()));
    }
}

/*
output:
abstaction
abstaction
34
34
56775
56775
@
@
*/

