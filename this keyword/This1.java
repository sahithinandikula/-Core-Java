import java.util.Scanner;
class This1
{
  static Scanner sc=new Scanner(System.in);
  String a=sc.next();
  void m1()
{
      int a=sc.nextInt();
    System.out.println(a);
    System.out.print(this.a);
}

  public static void main(String[] args)
  {
   This1 obj=new This1();
   obj.m1();
  }
}