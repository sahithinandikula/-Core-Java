/* Create a java application where we have 1 class  it contains three 
instance variables and a non static method m1 having float,Boolean 
as parameters and returns nothing and a static method m2 having 
parameter as String and returns Boolean then print instance 
variables under both the methods and invoke those methods under 
main method by providing dynamic inputs. */




import java.util.Scanner;
class Main
{
static Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
float f=sc.nextFloat();
double d=sc.nextDouble();
static Main obj=new Main();
void m1(float a,boolean b)
{
System.out.println(a);
System.out.println("a="+obj.a+"f="+obj.f+"d="+obj.d);

}
static Boolean m2(String s)
{
System.out.println(s);
System.out.println("a="+obj.a+"f="+obj.f+"d="+obj.d);
System.out.println("Enter Boolean value to return");
return sc.nextBoolean();
}
public static void main(String[] args)
{
obj.m1(sc.nextFloat(),sc.nextBoolean());
System.out.println(m2(sc.next()));
}
}
