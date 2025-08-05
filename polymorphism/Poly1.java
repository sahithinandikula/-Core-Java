//caja where we need to satisfy method overriding

import java.util.Scanner;
class Av
{
   static Scanner sc=new Scanner(System.in);
   int m1(double d)
   {
     System.out.println(d);
     return sc.nextInt();
   }
}
class Poly1 extends Av
{
   int m1(double d)
   {
      System.out.println(super.m1(sc.nextDouble()));
      System.out.println("This is overridden parameter : "+d);
      return sc.nextInt();
   }
   public static void main(String[] args)
   {
      Poly1 obj=new Poly1();
      System.out.println(obj.m1(sc.nextDouble()));
   }

}


/*
output:
1.245
34.4587
34.4587
12
12
This is overridden parameter : 1.245
5
5
*/
