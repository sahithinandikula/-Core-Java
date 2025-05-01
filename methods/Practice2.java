import java.util.Scanner;
class Practice2
{
  static Scanner sc=new Scanner(System.in);
  static Practice2 obj=new Practice2();
  int a=sc.nextInt();
  char ch=sc.next().charAt(0);
  static float f=sc.nextFloat();
  static Boolean b=sc.nextBoolean();
  int m1(char ch)
  { 
    System.out.println(ch);
    System.out.println("Enter int value to return");
    return sc.nextInt();
  }
  double m2(byte a)
  {
    System.out.println(a);
    System.out.println(obj.m1(sc.next().charAt(0)));
    System.out.println("Enter byte value to return");
    return sc.nextByte();

  }
  public static void main(String[] args)
  {
    System.out.println(obj.m2(sc.nextByte()));
    System.out.println("static variables are "+f+" " +b);
    System.out.println("non-static variables are "+obj.a+" "+obj.ch);
  }

}