/* cajp where we have class insta which contains two private fields like username and password then provide setter and getter methods for this variables and we have a class user from here if user want to reset password and display new password ,if user want to reset username then reset username and display new username , if user want to reset both then reset both by using constructor injection and display the updated values by providing dynamic inputs.*/

import java.util.Scanner;
class Madhu
{
  static Scanner sc=new Scanner(System.in);
  private String username;
  private String password;
  void setUsername(String username)
  {
     this.username=username;
  }
  void setPassword(String password)
  {
    this.password=password;
  }
  String getUsername()
  {
     return username;
  }
  String getPassword()
  {
     return password;
  }
  Madhu(String username,String password)
  {
     this.username=username;
     this.password=password;
  }
  Madhu()
  {
    
  }
}
class usermadhu
{
  public static void main(String[] args)
  {
    Madhu obj=new Madhu(Madhu.sc.next(),Madhu.sc.next());
    System.out.println("Enter your choice to reset");
    int choice=Madhu.sc.nextInt();
    switch(choice)
    {
      case 1:
         obj.setUsername(Madhu.sc.next());
         System.out.println("new username : "+obj.getUsername());
          break;
      case 2:
         obj.setPassword(Madhu.sc.next());
         System.out.println("new password : "+obj.getPassword());
         break; 
      case 3:
         String newUsername=Madhu.sc.next();
         System.out.println("new username : "+obj.getUsername());   
         obj.setPassword(Madhu.sc.next());
         System.out.println("new password : "+obj.getPassword());
         break; 
    }
  }
}
  
/*
output:
madhu
@madhu
moon
Enter your choice to reset
1
@desigirl
new username : @desigirl

*/

  