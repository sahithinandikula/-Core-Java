import java.util.Scanner;
class R
{   
   static Scanner sc=new Scanner(System.in);
   Boolean m1(char a)
   {
     System.out.println(a);
     System.out.println("Enter a Boolean  value to return for m1 method");
     return sc.nextBoolean();
   }
   public static void main(String[] args)
   {
     System.out.println("Enter char value");
     R obj=new R();
     System.out.println(obj.m1(sc.next().charAt(0)));
   }
}