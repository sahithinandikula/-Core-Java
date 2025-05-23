import java.util.Scanner;
class Main
{
  static Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  static void m1()
  {
    System.out.println("Hello");
  }
}
class Test extends Main
{
  int n=sc.nextInt();
   void display()
  {
  System.out.println(super.n);
  System.out.println(n);
  } 
  public static void main(String[] args)
  {
    m1();
    Test t=new Test();
    t.display(); 
  }
}