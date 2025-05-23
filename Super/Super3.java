//super at constructor level
import java.util.Scanner;
class Main
{
  static Scanner sc=new Scanner(System.in);
  Main(String s)
  {
    System.out.println(s);
  }
}
class Super3 extends Main
{
  Super3(int a)
  {
    super(sc.next());
    System.out.println(a);
  }
  public static void main(String[] args)
  {
    Super3 obj=new Super3(sc.nextInt());
  }
}
  