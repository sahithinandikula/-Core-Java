import java.util.Scanner;
abstract class A
{
  static Scanner sc=new Scanner(System.in);
  abstract int m1(float a);
  abstract char m2(String s);
}
abstract class B extends A
{
  abstract double m3(Boolean b);
  abstract Boolean m4(String s);
}
abstract class C extends B
{
   abstract String m5(Boolean b);
   int m6(char a)
  {
     System.out.println(a);
     return sc.nextInt();
  }
 
      
}
class CC extends C
{
  int m1(float a)
  {
    System.out.println(a);
    return sc.nextInt();
  }
  char m2(String s)
  {
     System.out.println(s);
     return sc.next().charAt(0);
  }
  double m3(Boolean b)
  {
     System.out.println(b);
     return sc.nextDouble();
  }
  Boolean m4(String s)
  {
     System.out.println(s);
     return sc.nextBoolean();
  }
  String m5(Boolean b)
   {
      System.out.println(b);
      return sc.next();
   }
  

}
  class C1
  {
    public static void main(String[] args)
   {
    CC obj=new CC();
    A obj1=obj;
    System.out.println(obj1.m1(A.sc.nextFloat()));
    System.out.println(obj1.m2(A.sc.next()));
    B obj2=obj;
    System.out.println(obj2.m3(A.sc.nextBoolean()));
    System.out.println(obj2.m4(A.sc.next()));
    C obj3=obj;
    System.out.println(obj3.m5(A.sc.nextBoolean()));
    System.out.println(obj3.m6(A.sc.next().charAt(0)));
  }
}