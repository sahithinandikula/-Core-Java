import java.util.Scanner;
class Dynamic
{ 
  static Scanner sc = new Scanner(System.in);
  int m1(String a)
  {
    System.out.println(a);
    System.out.println("Enter the int for M1 return");
    return sc.nextInt();
  }
  static float m2(Boolean a)
  {
    System.out.println(a);
    System.out.println("Enter the Float for M2 return");
    return sc.nextFloat();
  }
  double m3(char a)
  {
    System.out.println(a);
    System.out.println("Enter the double for M3 return");
    return sc.nextDouble();
  }

public static void main(String args[])
{
   System.out.println("Enter Boolean value");
   Boolean b=sc.nextBoolean();
   System.out.println(m2(b));
   Dynamic obj=new Dynamic();
   System.out.println("Enter String for m1 para");
   System.out.println(obj.m1(sc.next()));
   System.out.println("Enter char for m3 para");
   System.out.println(obj.m3(sc.next().charAt(0)));
}
}