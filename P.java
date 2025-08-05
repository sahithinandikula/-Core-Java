//interface,non-static,static,abstract,method,variable
import java.util.Scanner;
interface I
{ 
    static Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    abstract int m1(char ch);
    static void m2()
    {
      System.out.println("This is an interface");
    }
    boolean b(long l);
}
class P implements I
{
  public int m1(char ch)
    {
      System.out.print(ch);
      return sc.nextInt();
    }
   public boolean b(long l)
   {
      System.out.print(l);
      return sc.nextBoolean();
   }
  public static void main(String args[])
  {
    P obj=new P();
    System.out.println(obj.m1(sc.next().charAt(0)));
System.out.println(obj.b(sc.nextLong()));
    I.m2();//static methods are called with interface name
  }

  }
       



