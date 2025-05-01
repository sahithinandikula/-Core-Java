import java.util.Scanner;
class Practice6
{
  static Scanner sc=new Scanner(System.in);
  static int c=0;
  static int m1(int a)
  {
    return a;
  }

  static void m3()
  {
   System.out.println("Hi");
  }
  static void m4()
  {
    m2(sc.nextBoolean());
  }
  static void m2(Boolean a)
  {
    c++;
    if(a==false)
     {
       m2(sc.nextBoolean());
     }
     else
     {
       if(m1(c)>3)
       {
          m3();
        }
        else
       {
         m4();
       }
     }
  }
   public static void main(String[] args)
   {
    m2(sc.nextBoolean());
   }

}