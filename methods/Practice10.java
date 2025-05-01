/* create a java application where we have 1 class it contains a non 
static method m1 having no parameter and returns short this method 
in this method we have a local variable print this variable under main 
method by providing dynamic inputs. */

import java.util.Scanner;
class Practice10
{
  static Scanner sc=new Scanner(System.in);
  short  m1()
  {
   short s=sc.nextShort();
   return s;
  }
  public static void main(String[] args)
  {
  System.out.println(new Practice10().m1());


  }
}