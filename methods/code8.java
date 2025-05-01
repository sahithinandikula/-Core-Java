import java.util.Scanner;
class code8
{
static Scanner sc=new Scanner(System.in);
int m1(String a)
{
  System.out.println(a);
return sc.nextInt();
}
static int m2(Boolean a )
{
    code8 obj=new code8();
    int b=obj.m1(sc.next());
    int c=sc.nextInt();
    System.out.println(a);
    return b+c;
}
public static void main(String[] args)
{
  System.out.println(m2(sc.nextBoolean()));
}
}
