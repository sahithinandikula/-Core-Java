import java.util.Scanner;
class Factory
{
  static Scanner sc=new Scanner(System.in);
  static int m1(char a)
  {
    System.out.print(a);
    System.out.print(new Factory().m2(sc.nextInt())); //without using object calling m2 method
    return sc.nextInt();
  }
  Boolean m2(int a)
  {
   System.out.print(a);
   return sc.nextBoolean();
  }
  public static void main(String[] args)
  {
    System.out.print(m1(sc.next().charAt(0)));
  }
}