import java.util.Scanner;
class This4
{
  static Scanner sc=new Scanner(System.in);
   String a=sc.next();
   void m1(int a)
   {
     System.out.print(this.a+" "+a);
     this.m2(sc.next().charAt(0));
   }
   void m1(char ch)
   {
       System.out.println(ch);
   }
   This4(Boolean a)
   {
     System.out.println(a);
     System.out.println(this.a);
   }
   This4(int a)
   {
      System.out.println(a);
      System.out.println(this.a);
   }
   public static void main(String[] args)
   {
      This4 obj=new This4();
      obj.This4i((sc.nextLong()));
      obj.m1(sc.nextInt());
   }
}
