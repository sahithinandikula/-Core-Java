/* create a java application where we have 1 class it contains one static 
method and one non static method then invoke these 2 methods 
under main method in single line by providing dynamic inputs, 
without creating object directly.  */

import java.util.Scanner;
class Practice9
{
  static Scanner sc=new Scanner(System.in);
  static int m1(Boolean a)
  {
   System.out.println(a);
   return sc.nextInt();
  }
  char m2(int a)
  {
    System.out.println(a);
    return sc.next().charAt(0);
  }
  public static void main(String[] args)
  {
    System.out.println(new Practice9().m2(m1(sc.nextBoolean()c)));
  }
}

