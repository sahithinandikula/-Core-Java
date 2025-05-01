import java.util.Scanner;
class code4
{
 static Scanner sc=new Scanner(System.in);
static Boolean m1(Boolean b)
{
  System.out.println(b);
  System.out.println("Enter Boolean value for m1 to return");
  return sc.nextBoolean();
}
char m2(char a)
{
   System.out.println(a);
  System.out.println("Enter char value for m2 to return");
  return sc.next().charAt(0);
}
static double m3(double a)
{
   System.out.println(a);
  System.out.println("Enter double value for m3 to return");
  return sc.nextDouble();
}
long m4(long a)
{
  System.out.println(a);
  System.out.println("Enter long value for m4 to return");
  return sc.nextLong();
}
static float m5(float a)
{
  System.out.println(a);
  System.out.println("Enter float value for m5 to return");
  return sc.nextFloat();
}
String m6(String a)
{
   System.out.println(a);
  System.out.println("Enter string value for m6 to return");
  return sc.next();
}
public static void main(String[] args)
{
 System.out.println("Enter boolean value");
 boolean b=sc.nextBoolean();
 System.out.println(m1(b));
 System.out.println("Enter double value");
 double a=sc.nextDouble();
 System.out.println(m3(a));
 System.out.println("Enter float value");
 float f=sc.nextFloat();
 System.out.println(m5(f));
 code4 obj=new code4();
 System.out.println(obj.m2(sc.next().charAt(0)));
 System.out.println(obj.m4(sc.nextLong()));
 System.out.println(obj.m6(sc.next()));
}
}


