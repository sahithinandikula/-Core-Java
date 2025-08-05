//this at all levels
import java.util.Scanner;
class Main
{
  static Scanner sc=new Scanner(System.in);
  Double d=sc.nextDouble();
  String m1(long d)
  {
    System.out.println(d);
    System.out.println(this.d);
    //System.out.println(this.m1(sc.next().charAt(0)));
    return sc.next();
  }
  short m1(char a)
  {
    System.out.println(a);
    return sc.nextShort();
  }
  Main()
  {
    System.out.println(this.m1(sc.next().charAt(0)));
    System.out.println("Hi");
  }
  Main(int a)
  {
    this();
    System.out.println(a);
  }
  public static void main(String[] args)
  {
    Main obj=new Main(sc.nextInt());
    System.out.println(obj.m1(sc.nextLong()));
  }
}
    
/* 
  output:
13
123.78
Hi
13
12347
12347
123.78
@
@
23
23
sahithi
sahithi



 */
     
    