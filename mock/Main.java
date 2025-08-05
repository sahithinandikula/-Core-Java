import java.util.Scanner;
class Main
{
  static Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  void m1(long l)
  {
   int a=sc.nextInt();
   System.out.println("this:"+this.a);
   System.out.println("a"+a);
   System.out.println(l);
  }
  Main(char ch)
  {
    System.out.println(ch);
  }
  Main(float a)
  {
    this(sc.next().charAt(0));
    System.out.print(a);
  }
}
class B extends Main
{ 
  int a=sc.nextInt();
  void m2(String s)
  {
    super.m1(sc.nextLong());
    System.out.println(s);
      System.out.println("super :"+super.a+"a:"+a);
  }
  void m1(long l)
  {
    System.out.println(l);
  }
  B(int a)
  {
   super(sc.nextFloat());
  }
  public static void main(String[] args)
  { 
    B obj=new B(sc.nextInt());
    obj.m2(sc.next()); 
    obj.m1(sc.nextLong());
  }
}