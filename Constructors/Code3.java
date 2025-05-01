import java.util.Scanner;
class Code3
{
  static Scanner sc=new Scanner(System.in);
  static int a=sc.nextInt();
  Boolean b=sc.nextBoolean();
  double d=sc.nextDouble();  
  long m1(char a)
  {
    System.out.println(a);
    return sc.nextLong();
  }
  Code3()
  {
    System.out.println("hello");
  }
  Code3(float f)
  {
    System.out.println(f);
  }
  public static void main(String[] args)
  {
    Code3 obj=new Code3();
    Code3 obj1=new Code3(sc.nextFloat);
  System.out.println(obj.m1(sc.next().charAt(0)));
  }

}