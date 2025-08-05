import java.util.Scanner;
interface A1
{
  static Scanner sc=new Scanner(System.in);
   void setPass(String pass);
   default short m2(float f)
   {
     System.out.println(f);
     return sc.nextShort();
   }
}
interface A2
{
   String getPass();
}
interface A3
{
   long m3(short s);
   default String m4(int a)
   {
     System.out.println(a);
     return A1.sc.next();
   }
}
abstract class Abs implements  A1,A2,A3
{
   abstract float m5(String s);
   int m6(char a)
   {
     System.out.println(a);
     return sc.nextInt();
   }
   Abs(float f)
   {
     System.out.println(f);
   }
}
class Concrete1 extends Abs
{
   public void setPass(String pass)
   {
     System.out.println(pass);
   }
   public String getPass()
   {
     System.out.println("your pass");
     return sc.next();
   }
   public long m3(short s)
   {
     System.out.println(s);
     return sc.nextLong();
   } 
   float m5(String s)
   {
      System.out.println(s);
      return sc.nextFloat();
   }
   Concrete1()
   {
     super(sc.nextFloat());
     System.out.println("CC1");
   }
}
class Concrete2 extends Abs
{
   private String pass;
   public void setPass(String pass)
   {
     this.pass=pass;
   }
   public String getPass()
   {
     System.out.println("getter");
     return pass;
   }
   public long m3(short s)
   {
     System.out.println(s);
     return sc.nextLong();
   } 
   float m5(String s)
   {
      System.out.println(s);
      return sc.nextFloat();
   }
    Concrete2()
   {
     super(sc.nextFloat());
     System.out.println("CC2");
   }
}
class Concrete3 extends Abs
{
   public void setPass(String pass)
   {
     System.out.println(pass);
   }
   public String getPass()
   {
     System.out.println("getter3");
     return sc.next();
   }
   public long m3(short s)
   {
     System.out.println(s);
     return sc.nextLong();
   } 
   float m5(String s)
   {
      System.out.println(s);
      return sc.nextFloat();
   }
   Concrete3()
   {
     super(sc.nextFloat());
     System.out.println("CC3");
   }
}
class Test
{
   static Scanner sc=A1.sc;
   static void invoke(Abs obj)
   {
      obj.setPass(sc.next()); 
     System.out.println(obj.m2(sc.nextFloat()));
     System.out.println(obj.getPass());
     System.out.println(obj.m3(sc.nextShort()));
     System.out.println(obj.m4(sc.nextInt()));
     System.out.println(obj.m5(sc.next()));
     System.out.println(obj.m6(sc.next().charAt(0)));
   }
    
  public static void main(String[] args)
  {
    System.out.println("1- CC1\n2 - CC2\n3 - CC3");
    int n=sc.nextInt();
    if(n==1)
    {
      invoke(new Concrete1());
    }
    else if(n==2)
    {
       invoke(new Concrete2());
    }
    else if(n==3)
    {
       invoke(new Concrete3());
    }
  }
}
   
/*
output:
1- CC1
2 - CC2
3 - CC3
2
1.2
1.2
CC2
hello
1.245
1.245
45
45
getter
hello
5
5
75655
75655
67
67
welcome
welcome
sravika
sravika
1.345
1.345
@
@
690
690
*/
  
   
  
   