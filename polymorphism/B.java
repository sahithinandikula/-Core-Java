//main method overriding
import java.util.Scanner;
class Over
{
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args)
   {
     System.out.println("hello");
   }
   
}
class B extends Over
{
   public static void main(String[] args)
   {
      System.out.println("main method overriding");
      Over.main(args);
   }
}

/*

output:

C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\polymorphism>java B
main method overriding
hello

*/