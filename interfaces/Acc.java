/* CAJA where we have one interface it contains one abstract method inherit this interface into another interface which contains one abstract and two defined methods then inherit this interface into abstract class which contains one abstract method and a parameterized constructor then provide functionality for this in a concrete class and invoke them by providing dynamic inputs */


import java.util.Scanner;
interface A
{
  long m1(String s);
}
interface B extends A
{
  static Scanner sc=new Scanner(System.in);
  int m2(Boolean b);
  default String m3(int a)
  {
     System.out.println(a);
     return sc.next();
  }
  default int m4(float f)
  {
     System.out.println(f);
     return sc.nextInt();
  }
}
abstract class Ab implements B
{
   abstract Boolean m5(short s);
   Ab(char a)
   {
      System.out.println(a);
   }
}
class Acc extends Ab
{
   Acc(char a)
   {
     super(a);
   }
   public long m1(String s)
   {
      System.out.println(s);
     return sc.nextLong();
   }
   public int m2(Boolean b)
   {
      System.out.println(b);
     return sc.nextInt();
   }
   Boolean m5(short s)
   {
     System.out.println(s);
     return sc.nextBoolean();
   }
   public static void main(String[] args)
   {
     Acc obj=new Acc(sc.next().charAt(0));
     System.out.println(obj.m3(sc.nextInt()));
     System.out.println(obj.m4(sc.nextFloat()));
     System.out.println(obj.m1(sc.next()));
     System.out.println(obj.m2(sc.nextBoolean()));
     System.out.println(obj.m5(sc.nextShort()));
   }
}
     
/*
output:
C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\interfaces>java Acc
@
@
67
67
interface
interface
1.23
1.23
89
89
welcome
welcome
76546
76546
true
true
45
45
9
9
false
false
*/
   


