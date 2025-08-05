//super at variable level
import java.util.Scanner;
class A
{
   static Scanner sc=new Scanner(System.in);
   String s=sc.next();
   int m1(String a)
   {
     System.out.println(a);
     return sc.nextInt();
   }
}
class Super extends A
{
   int s=sc.nextInt();//variable name should be same
   void m2()
   {
   System.out.println(s);
   System.out.println(super.s);
   }
   //super can be used with sop ,cannot be called in main method so must use another method
   public static void main(String[] args)
   {
      Super obj=new Super();
      System.out.println(obj.m1(sc.next()));
      obj.m2();
   }
}


/* 
   output:
   C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\Super>java Super
welcome
2
hello
hello
89
89
2
welcome



*/