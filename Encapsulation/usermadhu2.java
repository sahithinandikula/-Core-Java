import java.util.Scanner;
class Madhu
{
  //static Scanner sc=new Scanner(System.in);
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
class usermadhu2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Madhu obj=new Madhu();
    System.out.println("Enter your choice to reset \n username \n password \n both");
    String choice=sc.next();
    if(choice.equals("username"))
    {
       System.out.println("enter new username");
       obj.setUsername(sc.next());
       System.out.println("new username : "+obj.getUsername());
    }
    else if(choice.equals("password"))
    {
        System.out.println("enter new password");
        obj.setPassword(sc.next());
        System.out.println("new password : "+obj.getPassword());   
    }
    else if(choice.equals("both"))
    {
       System.out.println("enter new username");
       String name=sc.next();
       System.out.println("enter new password");
       String pass=sc.next();
       obj =new Madhu(name,pass);
       System.out.println("username:"+obj.getUsername());
       System.out.println("password:"+obj.getPassword());
    }
    else
    {
       System.out.println("Invalid Choice");
    }
    
  }
}


/*
output:
Enter your choice to reset
 username
 password
 both
both
enter new username
sravika#
enter new password
18768
username:sravika#
password:18768
*/