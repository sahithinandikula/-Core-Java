/* 
cajp where we have class insta it contains two private variables like username and password ,then provide setter and getter methods for this variables and we have class user from here reset the value and display new values by providing dynamic inputs.

*/

import java.util.Scanner;
class Insta
{
   static Scanner sc=new Scanner(System.in);
   private  String username=sc.next();
   private  String password=sc.next();
   void setPassword(String username,String password)
   {
      this.username=username;
      this.password=password;
   }
   String getPassword()
   {
      return password;
   }
   String getUsername()
   {
      return username;
   }
}
class  Pubacc
{
   public static void main(String[] args)
   {
     Insta obj=new Insta();
     obj.setPassword(Insta.sc.next(),Insta.sc.next());
     System.out.println(obj.getPassword());
     System.out.println(obj.getUsername());
   }
}

/*

output:
C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\Encapsulation>java Pubacc
sravika@
hghghg
#sravika#
gfgfgf
gfgfgf
#sravika#

*/