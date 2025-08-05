//2.create a java application where we have one class it contain one instance variable and one default constructor, single, double and triple parameterized constructors then invoke default constructor in single parameterized constructor and single parameterized constructor in double parameterized constructor and double parameterized constructor in triple parameterized constructor and triple parameterized constructor in main method

import java.util.Scanner;
class Parametrized2
{
   static Scanner sc=new Scanner(System.in);
   float a=sc.nextFloat();
   Parametrized2()
   {
     System.out.println("akhiiiiiiiiiiiiiiiiii");
   }
   Parametrized2(char b)
   {
     new Parametrized2();
     System.out.println(b);
   }
   Parametrized2(String a,long b)
   {
     System.out.println(a+" "+b);
     new Parametrized(sc.next().charAt(0));
   }
   Parametrized2(int a,float b,boolean c)
   {
     System.out.println(a+" "+b+" "+c);
     new Parametrized2(sc.next(),sc.nextLong());
   }
   public static void main(String[] args)
   {
      new Parametrized2(sc.nextInt(),sc.nextFloat(),sc.nextBoolean());
   }
}