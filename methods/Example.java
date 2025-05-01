import java.util.Scanner;
class Example
{
  static Scanner sc=new Scanner(System.in);
  void m1(String a)
  {
   System.out.println(a);
  }
  void m2(Boolean a)
  {
   System.out.println(a);
   m1(sc.next());
  }
 public static void main(String[] args)
{
  Example obj=new Example();
  obj.m2(sc.nextBoolean());
}
  
}