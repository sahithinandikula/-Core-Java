import java.util.Scanner;
class Outer
{
  Scanner sc=new Scanner(System.in);
  private String name="sahithi";
  Boolean m1(int a)
  {
     System.out.println(a);
     return sc.nextBoolean();
  } 
  class Inner
  {
     long m2(float f)
     {
        System.out.println("private field :"+name);
        System.out.print(f);
        return sc.nextLong();
     }
     
   }
   public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         Outer obj=new Outer();
         System.out.println(obj.m1(sc.nextInt()));
         Outer.Inner x=obj.new Inner();
         System.out.println(x.m2(sc.nextFloat()));

     }
}

/*
output:
C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\inner classes\member inner class>java Outer
12
12
true
true
1.2
private field :sahithi
1.2
164265
164265
*/
  