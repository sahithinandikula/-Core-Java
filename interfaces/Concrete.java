/* CAJA where we have one interface it contains two abstract and 2 defined methods then provide functionality for this interface in a concrete class and invoke them by providing dynamic inputs. 
*/

import java.util.Scanner;
interface B
{
   static Scanner sc=new Scanner(System.in);
   String m1(short s);
   float m2(char a);
   static int m3(double d)
   {
      System.out.println(d);
      return sc.nextInt();
   }
   default Boolean m4(long l)
   {
      System.out.println(l);
      return sc.nextBoolean();    

   }
}
class Concrete implements B
{
   //static Scanner sc=new Scanner(System.in);
   public String m1(short s)
   {
     System.out.println(s);
     return sc.next();
   }
   public float m2(char a)
   {
      System.out.println(a);
      return sc.nextFloat();
   }
   public static void main(String[] args)
   {
      B obj=new Concrete();
      System.out.println(obj.m1(sc.nextShort()));
      System.out.println(obj.m2(sc.next().charAt(0)));
      System.out.println(B.m3(sc.nextDouble()));
      System.out.println(obj.m4(sc.nextLong()));
   }
}


/*

output:

e
5
5
inreface
inreface
@
@
1.2
1.2
12.345
12.345
567
567
76543
76543
true
true

*/