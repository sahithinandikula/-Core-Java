import java.util.Scanner;
class Invoke
{
static Scanner sc=new Scanner(System.in);
float m1()
{
  return sc.nextFloat();
}
Boolean m2()
{
  m1();
  return sc.nextBoolean();
}
public static void main(String[] args)
{
  Invoke obj=new Invoke();
  System.out.println(obj.m2());
}
}
  