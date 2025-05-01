import java.util.Scanner;
class Practice3
{
  static Scanner sc=new Scanner(System.in);
  static Practice3 obj=new Practice3();
  int m1(char ch)
  { 
    System.out.println(ch);
    System.out.println("Enter int value to return");
    return sc.nextInt();
  }
  void m2(float a)
 {
  System.out.println(a);
  }
  
   Boolean m3(String a)
   {
     System.out.println(a);
     System.out.println("Enter Boolean value to return");
     return sc.nextBoolean();
   }
   static char m4(int a)
    {
     System.out.println(a);
     System.out.println(obj.m1(sc.next().charAt(0)));
     System.out.println("Enter character value for m1 to return");
     return sc.next().charAt(0);
    }
    static int m5(String a)
    {
    System.out.println(a);
    obj.m2(sc.nextFloat());
    System.out.println("Enter int value for m2 to return");
    return sc.nextInt();
    }
    static double m6()
    {
     System.out.println(obj.m3(sc.next()));
     System.out.println("Enter double value to return");
     return sc.nextDouble();
    }
    public static void main(String[] args)
    {
      System.out.println(obj.m6());
      System.out.println(obj.m5(sc.next()));
      System.out.println(obj.m4(sc.nextInt()));
    }
}