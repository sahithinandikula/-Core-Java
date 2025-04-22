import java.util.Scanner;
class Numbers
{
   static Scanner sc=new Scanner(System.in);
   static Numbers obj=new Numbers();
   Boolean m1(String a)
   {
     System.out.println(a);
     System.out.println("Enter Boolean value to return");
     return sc.nextBoolean();
   }
   static void m2(char a)
   {
     
     System.out.println(a);
     System.out.println(obj.m1(sc.next()));
     
   }
   int m3()
   {
    m2(sc.next().charAt(0));
    return sc.nextInt();
   }
   static String m4(double a)
   {
    
    System.out.println(a);
    System.out.println(obj.m3());
    System.out.println("Enter String value to return");
    return sc.next();
   }
   public static void main(String[] args)
   {
    System.out.println("Enter double as  parameter for m4");
    System.out.println(m4(sc.nextDouble()));
   }


}