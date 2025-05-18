import java.util.Scanner;
class This3
{
 static Scanner sc=new Scanner(System.in);
 This3(int a)
 {
   System.out.println(a);
 }
 This3(float b)
 {
   this(sc.nextInt());
   System.out.println(b);
 }
 This3(char ch)
 {
   this(sc.nextFloat());
   System.out.println(ch);
  }
  public static void main(String[] args)
  {
    new This3(sc.next().charAt(0));
  }
}