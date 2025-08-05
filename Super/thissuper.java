/* cajp where we need to satisfy this and super at all levels */

import java.util.Scanner;
class AC
{
  static Scanner sc=new Scanner(System.in);
  double d=sc.nextDouble();
  char m1(short s)
  {
    String d=sc.next();
    System.out.println(this.d);
    System.out.println(d);
    System.out.println(s);
    return sc.next().charAt(0);
  }
  int m1(boolean b)
  {
    System.out.println(this.m1(sc.nextShort()));
    System.out.println(b);
    return sc.nextInt();
  }
  AC(long l)
  {
    System.out.println(l);
  }
  AC(float f)
  {
    this(sc.nextLong());
    System.out.println(f);
  }
}
class thisup extends AC
{
   int d=sc.nextInt();
   short m2()
   {
     System.out.println(super.d);
     System.out.println(d);
     return sc.nextShort();
   }
   int m1(boolean b)
   {
      System.out.println(super.m1(sc.nextBoolean()));
      System.out.println("bool parameter: "+b);
      return sc.nextInt();
   }
   thisup(int a)
   {
      super(sc.nextFloat());
      System.out.println("parameter: "+a);
   }
   public static void main(String[] args)
   {
     thisup obj=new thisup(sc.nextInt());
     System.out.println(obj.m2());
     System.out.println(obj.m1(sc.nextBoolean()));
   }
}
   
/*

output:
89
34.5
653766
678.896
653766
34.5
75
parameter: 89
678.896
75
2
2
false
true
3
sravika
678.896
sravika
3
@
@
true
67
67
bool parameter: false
13
13

*/

