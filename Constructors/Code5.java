import java.util.Scanner;
class Code5
{

  static Scanner sc=new Scanner(System.in);

  int a;
  float b;
  Code5(int c,float d)
 {
  a=c;
  b=d;
 }
   
public static void main(String[] args)
{
  Code5 obj=new Code5(sc.nextInt(),sc.nextFloat());
  System.out.println(obj.a+" "+obj.b);
}
}

