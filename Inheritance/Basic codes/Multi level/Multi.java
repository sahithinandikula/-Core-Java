//Multi level inheritance
import java.util.Scanner;
class A
{
   static Scanner sc=new Scanner(System.in);
   String m1(long l)
   {
     System.out.println(l);
     return sc.next();
   }
}
class B extends A
{
   Double m2(float f)
   {
     System.out.println(f);
     return sc.nextDouble();
   }
}
class C extends B
{
   short m3(int a)
   {
     System.out.println("Radio mirchi "+a);
     return sc.nextShort();
   }
}
class Multi
{
  public static void main(String[] args)
  {
    C obj=new C();
    System.out.println(obj.m1(A.sc.nextLong()));
    System.out.println(obj.m2(A.sc.nextFloat()));
    System.out.println(obj.m3(A.sc.nextInt())); 
    //main method is in seperate class so we are refering scanner class through  class 'A'
  }
}

/* 
  output:
  1242635
1242635
sravika
sravika
1.2
1.2
243.3756
243.3756
87
Radio mirchi 87
34
34

*/