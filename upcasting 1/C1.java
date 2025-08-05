import java.util.Scanner;
abstract class A
{
  static Scanner sc=new Scanner(System.in);
  abstract int m1(float a);
  abstract char m2(String s);
}
abstract class B extends A
{
  abstract double m3(Boolean b);
  abstract Boolean m4(String s);
}
abstract class C extends B
{
   abstract String m5(Boolean b);
   abstract int m6(char a);
}
class CC extends C
{
  int m1(float a)
  {
    System.out.println(a);
    return sc.nextInt();
  }
  char m2(String s)
  {
     System.out.println(s);
     return sc.next().charAt(0);
  }
  double m3(Boolean b)
  {
     System.out.println(b);
     return sc.nextDouble();
  }
  Boolean m4(String s)
  {
     System.out.println(s);
     return sc.nextBoolean();
  }
  String m5(Boolean b)
   {
      System.out.println(b);
      return sc.next();
   }
  int m6(char a)
  {
     System.out.println(a);
     return sc.nextInt();
  }
}
  class C1
  {
    public static void main(String[] args)
   {
    A obj=new CC();
    System.out.println(obj.m1(A.sc.nextFloat()));
    System.out.println(obj.m2(A.sc.next()));
    B obj1=new CC();
    System.out.println(obj1.m3(A.sc.nextBoolean()));
    System.out.println(obj1.m4(A.sc.next()));
    C obj2=new CC();
    System.out.println(obj2.m5(A.sc.nextBoolean()));
    System.out.println(obj2.m6(A.sc.next().charAt(0)));
  }
}
/*

 C:\Users\Lokesh\Desktop\java\b12\upcasting>java C1
 1.2
1.2
12
12
hello
hello
@
@
true
true
43.76
43.76
hiii
hiii
false
false
true
true
$
$
#
#
43
43  */