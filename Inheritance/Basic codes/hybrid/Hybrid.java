import java.util.Scanner;
class A
{
      static Scanner sc=new Scanner(System.in);  
   double sravika(boolean b)
   {
      System.out.println("This is Sravika "+b);
      return sc.nextDouble();
   }

}
class B extends A
{
   char Hello(int a)
  {
    System.out.println(a);
    return A.sc.next().charAt(0);
  }
}
class C extends A
{
   int m1(String a)
   {
     System.out.println(a);
     return A.sc.nextInt();
   }
}
class D extends C
{

   float m2(long l)
   {
     System.out.println(l);
     return A.sc.nextFloat();
   }
}
class Main
{
  public static void main(String[] args)
  {
    D obj=new D();
    System.out.println(obj.m2(A.sc.nextLong()));
    C obj1=new C();
    System.out.println(obj1.m1(A.sc.next()));
    B obj2=new B();
    System.out.println(obj2.Hello(A.sc.nextInt()));
    System.out.println(obj2.sravika(A.sc.nextBoolean()));
  }
}



C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\Inheritance>java Main
124
124
1.2
1.2
sahithi
sahithi
23
23
89
89
#
#
false
This is Sravika false
124.90
124.9
