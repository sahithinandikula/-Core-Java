//204 mock QNO:01
import java.util.Scanner;
class Main
{
   static Scanner sc=new Scanner(System.in);
   static long m1(Boolean b,char ch)
   {
      System.out.println(b);
      System.out.println(ch);
      return sc.nextLong();
   }
   boolean m2(char s)
   {
      System.out.println(m1(sc.nextBoolean(),sc.next().charAt(0)));
      System.out.println("m2 method parameter : "+s);
      return sc.nextBoolean();
   }
    char m3(short a)
    {
      System.out.println(m2(sc.next()));
      return sc.next().charAt(0);
    }
    Main(long l)
    {
       System.out.println(l);
    }
    Main(short a)
    {  this(sc.nextLong());
       System.out.println("parameter of constructor");
    }
    short m4(double d)
    {
        System.out.println(m3());
        System.out.println(d);
        return sc.nextShort();
    }
    public static void main(String[] args)
    {
       
       /* System.out.println(new Main(sc.nextShort()).Main().m4(sc.nextDouble(Main()).m3(sc.nextShort(Main().m2(sc.next().charAt(0)(m1(sc.nextBoolean())))); */
      System.out.println(
            Main.m1(sc.nextBoolean(), sc.next().charAt(0)) + "\n" +       // Static method
            new Main(sc.nextShort()).m2(sc.next().charAt(0)) + "\n" +     // m2 with constructor
            new Main(sc.nextShort()).m3(sc.nextShort()) + "\n" +          // m3 with constructor
            new Main(sc.nextShort()).m4(sc.nextDouble()));                  // m4 with constructor
       
    }
}