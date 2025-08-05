import java.util.Scanner;
class Main
{
  static Scanner sc=new Scanner(System.in);
  int m1(char ch)
  {
   System.out.println(ch);
   return sc.nextInt();
  }
}
class Super2 extends Main
{
  int m1(char ch)
  {
    System.out.println(super.m1(sc.next().charAt(0)));
    System.out.println(ch);
    return sc.nextInt();
  }
   /* int callM1(char ch) {
    return super.m1(ch);
  } */
  public static void main(String[] args)
  {
   Super2 obj=new Super2();
   //System.out.println(obj.callM1(sc.next().charAt(0)));
    System.out.print(obj.m1(sc.next().charAt(0)));
  }

}

/*
  output:
  C:\Users\Sahit\OneDrive\Pictures\Desktop\java   cvcorp\Super>java Super2
#
@
@
89
89
#
54
54

*/