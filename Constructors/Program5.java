//Create a java app where we have one class, it contains a default constructor, double parameterized constructor, Triple parameterized constructor, methods like m1, m2, and m3 with parameters and return types then invoke all constructors under main by providing dynamic inputs, invoke m1 under default constructor, m2 under double parameterized constructor and m3 under Triple parameterized constructor by giving dynamic inputs

import java.util.Scanner;
class  Program5
{
  static Scanner sc=new Scanner(System.in);
 Program5()
{
  System.out.println("hello");
  m1(sc.nextFloat());
}
Program5(float a,String b)
{
System.out.println(a+" "+b);
m2(sc.next());
}
Program5(boolean a,long b,int c)
{
  System.out.println(a+" "+b+" "+c);
m3(sc.nextDouble());
}
char m1(float a)
{
  System.out.println(a);
 return sc.next().charAt(0);
}
Boolean m2(String s)
{
  System.out.println(s);

 return sc.nextBoolean();
}
short m3(double d)
{
  System.out.println(d);
 return sc.nextShort();
}
public static void main(String[] args)
{
  new Program5();
 new Program5(sc.nextFloat(),sc.next());
new Program5(sc.nextBoolean(),sc.nextLong(),sc.nextInt());
}
}