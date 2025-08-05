import java.util.Scanner;
class Instagram
{
   static Scanner sc=new Scanner(System.in);
   private String password=sc.next();
   void setter(String password)
   {
      this.password=password;
   }
    String getter()
   {
      return password;
   }
}
class Socialmed
{
   public static void main(String[] args)
   {
      Instagram obj=new Instagram();
      obj.setter(Instagram.sc.next());
      System.out.println("new password : "+obj.getter());
   }
}


/*

output:
C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\Encapsulation>java Socialmed
hello@
#sahithi
new password : #sahithi

*/