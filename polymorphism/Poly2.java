//both method overloading and method overriding
import java.util.Scanner;
class Both
{
  static  Scanner sc=new Scanner(System.in);
   String m1(float f)
   {
      System.out.println(this.m1(sc.nextBoolean()));
      System.out.println(f);
      return sc.next();
   }
   long m1(Boolean b)
   {
     System.out.println("overloading method m1 parameter value: "+b);
     return sc.nextLong();
   }
}
class Poly2 extends Both
{
   String m1(float f)
   {
      System.out.println(super.m1(Both.sc.nextFloat()));
      System.out.println("This is overridden parameter : "+f);
      return sc.next();
   }
   public static void main(String[] args)
   {
         Poly2 obj=new Poly2();
      System.out.println(obj.m1(Both.sc.nextFloat()));
    }
}


/*
output:
C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\polymorphism>java Poly2
1.23
2.34
true
overloading method m1 parameter value: true
234
234
2.34
sravika
sravika
This is overridden parameter : 1.23
cvcorp
cvcorp
*/
