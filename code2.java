import java.util.Scanner;
class code2
{
  static  Scanner sc=new Scanner(System.in);
  Boolean m1(int a)
  {
    System.out.println(a);
    System.out.println("Enter Boolean value for m1 to return");
    return sc.nextBoolean();
  }
   static char m2(float a)
   {
    System.out.println(a);
    System.out.println("Enter character value for m2 to return");
    return sc.next().charAt(0);
   }
  public static void main(String[] args)
  {
    System.out.println("Enter float value");
    float b=sc.nextFloat();
    System.out.println(m2(b));
    code2 obj=new code2();
    System.out.println("enter int value");
    System.out.println(obj.m1(sc.nextInt()));
  }
}  
