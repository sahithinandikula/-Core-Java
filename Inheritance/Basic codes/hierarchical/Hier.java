//hierarchical inheritance
import java.util.Scanner;
class A
{
   static Scanner sc=new Scanner(System.in);
   short m1(String s)
   {
     System.out.println("This is "+s);
     return sc.nextShort();
   }
}
class B extends A
{
   long m2(float f)
   {
     System.out.println(f);
     return sc.nextLong();
   }
}
class Hier extends A
{
   String m3(double d)
   {
     System.out.println(d);
     return sc.next();
   }
   public static void main(String[] args)
   {
     Hier obj=new Hier();
     System.out.println(obj.m3(sc.nextDouble()));
     B obj1=new B();
     System.out.println(obj1.m2(sc.nextFloat()));
     System.out.println(obj1.m1(sc.next()));
   }
}

/*  
  output:
\hierarchical>java Hier
123.89
123.89
madhu
madhu
1.5
1.5
24542544
24542544
ammu
This is ammu
89
89

*/