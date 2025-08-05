//super at all levels
/* create a java application where we need to satisfy super at all levels */
import java.util.Scanner;
class Main
{
  static Scanner sc=new Scanner(System.in);
  String s=sc.next();
  long m1(int a)
  {
    System.out.println(s);
    System.out.println(a);
    return sc.nextLong();
  }
  Main(char ch)
  {
    System.out.println(ch);
  }
}
class Super4 extends Main
{
  short s=sc.nextShort();
  int m2(double d)
  {
    System.out.println(super.s);
    System.out.println(s);
    return sc.nextInt();
  }
  long m1(boolean a)
  {
    System.out.println(super.m1(sc.nextInt()));
    System.out.println(a);
    return sc.nextLong();
  }
   
  Super4(float a)
  {
    super(sc.next().charAt(0));
    System.out.println(a);
  }
   public static void main(String[] args)
   {
     Super4 obj=new Super4(sc.nextFloat());
  System.out.println(obj.m2(sc.nextDouble()));
  System.out.print(obj.m1(sc.nextBoolean()));
    }
}

/*
 
output


2.4
@
welcome
@
5
2.4
456.83
welcome
5
34
34
true
89
welcome
89
87665
87665
true
43213
43213

*/