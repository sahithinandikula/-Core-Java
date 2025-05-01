import java.util.Scanner;
class Z
{
 static Scanner sc=new Scanner(System.in);
static Z obj=new Z();
  void m1()
{
  
}
static void m2()
{
  obj.m1();
}
void m3(float f)
{
System.out.println(f);
m2();
}
static void m4(Boolean a)
{
 System.out.println(a);
 obj.m3(sc.nextFloat());
}
String m5()
{
m4(sc.nextBoolean());
return sc.next();
}
static long m6() {
 System.out.println(obj.m5());
return sc.nextLong();
} 
short m7(double d)
{
System.out.println(d);
System.out.println(m6());
return sc.nextShort();
}
static char m8(int a)
{
System.out.println(a);
System.out.println(obj.m7(sc.nextDouble()));
return sc.next().charAt(0);
}
public static void main(String[] args)
{
 System.out.println("Enter int value as parameter");
 System.out.println(m8(sc.nextInt()));
}

}