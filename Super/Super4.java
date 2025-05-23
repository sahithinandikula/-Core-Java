//super at all levels
import java.util.Scanner;
class Main
{
  static Scanner sc=new Scanner(System.in);
  String s=sc.next();
  long m1(int a)
  {
    String s=sc.nextInt();
    System.out.print(this.s);
    System.out.print(s);
    System.out.print(a);
    return sc.nextLong();
  }
  Main(char ch)
  {
    System.out.print(ch);
  }
}
class Super4 extends Main
{
  int m2(String s)
  {
    System.out.print(s);
    return sc.nextInt();
  }
   int callM1(int a) {
    return super.m2(a);
  }
  Super4(int a)
  {
    super(sc.next().charAt(0));
    System.out.print(a);
  }
   public static void main(String[] args)
   {
     Super4 obj=new Super4(sc.nextInt());
     System.out.println(obj.callM1(sc.nextInt());
    System.out.print(obj.m1(sc.next().charAt(0)));
    }
}
