import java.util.Scanner;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(float a);
	abstract String m2(Boolean b);
	A(char a)
	{
		System.out.println(a);
	}
}
abstract class B extends A
{
	abstract short m3(long l);
	double m4(int a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
        B(char a)
	{
		System.out.println(a);
	}
}
class Concrete1 extends B
{
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	String m2(Boolean b)
	{
		System.out.println(b);
		return sc.next();
	}
	short m3(long l)
	{
		System.out.println(l);
		return sc.nextShort();
	}
        Concrete1(char a)
	{
		System.out.println(a);
	}
}
class Concrete2 extends B
{
 	int m1(float a)
 	{
 		System.out.println(a);
 		return sc.nextInt();
 	}
	String m2(Boolean b)
 	{
 		System.out.println(b);
 		return sc.next();
 	}

 	short m3(long l)
 	{
 		System.out.println(l);
 		return sc.nextShort();
 	}
	Concrete2()
	{
		super(sc.next().charAt(0));
	}
	
}
class Test 
{
	public static void mian(String args[])
	{
		Concrete2 obj=new Concrete2();
		obj.m1(A.sc.nextFloat());
		obj.m2(A.sc.nextBoolean());
		obj.m3(A.sc.nextLong());
		obj.m4(A.sc.nextInt());
	}
}