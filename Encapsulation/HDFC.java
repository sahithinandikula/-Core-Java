//mock 205 QNO:3
/*  CAJA where we have one class like Bank it contains private fields like uName and Pin without values initialize those variables while creating an object.and we have one more class User which contains method like login in this method.We need to ask uName and Pin from user if both uName and Pin matched with existing details then print login successful or else print invalid details. */

import java.util.Scanner;
class Bank
{
   static Scanner sc=new Scanner(System.in);
   private String uName;
   private String Pin;
   void setUsername(String uName)
   {
       this.uName=uName;
   }
   void setPin(String Pin)
   {
      this.Pin=Pin;
   }
   String getUsername()
   {
      return uName;
   }
   String getPin()
   {
     return Pin;
   }
   Bank(String uName,String Pin)
   {
     this.uName=uName;
     this.Pin=Pin;
   }
   Bank()
   {

   }
}
class HDFC extends Bank
{
  
    static Bank obj =new Bank();
    void login()
    {
       System.out.println("Enter uName and Pin");
       String uname=Bank.sc.next();
       String pin=Bank.sc.next();
        obj=new Bank(uname,pin);
       System.out.println("\n Enter username and pin to login");
        String user=sc.next();
        String userPin=sc.next();
        if (user.equals(obj.getUsername()) && userPin.equals(obj.getPin()))
        {
            System.out.println("login Successful");
        }
        else
        {
           System.out.println("Invalid Details");

        }
    }
    public static void main(String[] args)
    {
       new HDFC().login();
    }
}


/*
output:
Enter uName and Pin
sahithi
010203

 Enter username and pin to login
sahithi
010203
login Successful
*/