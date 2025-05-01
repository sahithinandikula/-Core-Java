import java.util.Scanner;
class code9
{
static Scanner sc=new Scanner(System.in);
static String m1(char a)
{
  System.out.println(a);
  System.out.println("Enter String value for m1 to return");
  return sc.next();
}
static int m2(String a)
{
  System.out.println(a);
  System.out.println("Enter int value for m2 to return");
  return sc.nextInt();
}
public static void main(String[] args)
{
   System.out.println(m2(m1(sc.next().charAt(0))));
}
}