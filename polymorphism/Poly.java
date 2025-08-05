//caja where we need to satisfy method overloading

import java.util.Scanner;
class Poly
{
   static Scanner sc=new Scanner(System.in);
   int m1(double d)
   {
     System.out.println(d);
     return sc.nextInt();
   }
   static String m1(short a,short b)
   {
      System.out.println(a+b);
      return sc.next();
   }
   public static void main(String[] args)
   {
      Poly obj=new Poly();
      System.out.println(obj.m1(sc.nextDouble()));
      System.out.println(m1(sc.nextShort(),sc.nextShort()));
   }

}

/*


output:

1.2343
1.2343
12
12
12 34
46
hello
hello




*/