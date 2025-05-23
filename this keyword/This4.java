//this at all level
import java.util.Scanner;
class This4
{
  static Scanner sc=new Scanner(System.in);
   String a=sc.next();
   void m1(int a)
   {
     System.out.print(this.a+" "+a);
     this.m1(sc.next().charAt(0));
   }
   void m1(char ch)
   {
       System.out.println(ch);
   }
   This4(Boolean a)
   {
     this(sc.nextInt());
     System.out.println(a);     
   }
   This4(int a)
   { 
      
      System.out.println(this.a);
      System.out.println(a);
   }
   public static void main(String[] args)
   {
      This4 obj=new This4(sc.nextBoolean());
      obj.m1(sc.nextInt());
   }
}
