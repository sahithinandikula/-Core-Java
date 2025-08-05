/* CAJA where we have two interfaces having one abstract ,one defined method each and an abstract class having one abstract and one defined method then inherit all this into a concrete class at a time and provide functionality for them ,invoke all the properties under main of a separate class Test by providing dynamic inputs */

import java.util.Scanner;
interface I1
{
  static Scanner sc=new Scanner(System.in);
  short m1(Boolean b);
  static int m2(float f)
  {
    System.out.println(f);
    return sc.nextInt();
  }
}
interface I2 
{
  String m3(short s);
  default float m4(Boolean b)
  {
    System.out.println(b);
    return I1.sc.nextFloat();
  }
}
abstract class Inter4 
{
  abstract long m5(String s);
  int m6(long l)
  {
    System.out.println(l);
    return I1.sc.nextInt();
  }
}
class Test extends Inter4 implements I2,I1
{
  public short m1(Boolean b)
  {
    System.out.println(b);
    return sc.nextShort();
  }
   public String m3(short s)
  {
    System.out.println(s);
    return sc.next();
  }
  long m5(String s)
  {  
    System.out.println(s);
    return sc.nextLong();
  }
  public static void main(String[] args)
  {
    Test obj=new Test();
    System.out.println(obj.m1(sc.nextBoolean()));
    System.out.println(I1.m2(sc.nextFloat()));
    System.out.println(obj.m3(sc.nextShort()));
    System.out.println(obj.m4(sc.nextBoolean()));
    System.out.println(obj.m5(sc.next()));
    System.out.println(obj.m6(sc.nextLong()));
  }
}


/*
output:
true
true
3
3
4
4.0
89
89
5
5
hello
hello
false
false
1.23
1.23
abstract
abstract
986754
986754
765634
765634
89
89
*/
  

   
  
 