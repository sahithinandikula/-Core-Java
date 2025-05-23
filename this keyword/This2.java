//this at method level
import java.util.Scanner;
class This2
{
   static Scanner sc=new Scanner(System.in);
   void m1(String a)
   {
     System.out.println(a);
   }
   float m1(int a)
   {
     System.out.println(a);
     this.m1(sc.next());
     return sc.nextFloat();
   }
   public static void main(String[] args)
    {
      This2 obj=new This2();
      System.out.println(obj.m1(sc.nextInt()));
    }
}