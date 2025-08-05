/* caja where we have class insta it contains three private fields like username,password and mobile number then provide setter and getter methods for this variables and we have class user which contains a non static method login invoke this method from main method , in login method ask user to enter the credentials , if both the credentials are correct thrn print login successful or else if both the credentials are incorrect then ask user whether he needs to know his username if yes,then ask to enter mobile number,if the given number matces with existing number then display the username and redirect him to login based on his requirement , if mobile number ,mismatches then print user not found and ask him to re enter mobile number if he wants to do it or else print a user friendly message, if only username is incorrect then ask username whethere he need to reset the username if yes then reset the username and redirect him to login based on his requirement or else if only password is incorrect perform same operation as username by providing dynamic inputs */ 
//adding signup method


import java.util.Random;
class Insta {
    private String username = "Sahithi";
    private String password = "@Sahithi123";
    private String phone_number = "8183474855";

    String getUserName() {
        return username;
    }

    String getPassword() {
        return password;
    }

    String getPhoneNumber() {
        return phone_number;
    }

    void setUserName(String username) {
        this.username = username;
    }

    void setPassword(String password) {
        this.password = password;
    }

    void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    Insta(String username,String password,String phone_number)
  {
     this.username=username;
     this.password=password;
     this.phone_number=phone_number;
  }
  Insta()
  {

  }

}

class InstaAcc {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    static Insta obj = new Insta();

    void signup()
    {
       System.out.println("Enter your credentials to create a new account");
       System.out.print("Username : ");
       String username=sc.next();
       System.out.print("Password : ");
       String password=sc.next();
       System.out.print("Mobile number : ");
       String phone_number=sc.next();
       obj=new Insta(username,password,phone_number);
       System.out.println("Account created successfully");
       System.out.println("press 1 to login or any key to exit : ");
       char ch=sc.next().charAt(0);
       if(ch=='1')
       login();
       else
       System.out.println("Thank you ");

    }

    void login() {
        System.out.println("Enter uname and pass");
        String name = sc.next();
        String pass = sc.next();

        if (name.equals(obj.getUserName()) && pass.equals(obj.getPassword())) {
            System.out.println("logged In");
        } else if (!name.equals(obj.getUserName()) && !pass.equals(obj.getPassword())) {
            System.out.println("Invalid details\nEnter Mobile number to get uname");
            while (true) {
                String mno = sc.next();
                if (mno.equals(obj.getPhoneNumber())) {
                    Random r = new Random();
                    int otp = r.nextInt(8999) + 1000;
                    System.out.println("OTP: " + otp);
                    int entotp = sc.nextInt();
                    if (otp == entotp) {
                        System.out.println("User name -> " + obj.getUserName());
                        login();
                        break;
                    }
                } else {
                    System.out.println("User not found");
                    System.out.println("1 for re-enter 2 for Exit");
                    int n = sc.nextInt();
                    if (n == 1) {
                        System.out.println("Retry your mobile number");
                    } else {
                        System.out.println("bye bye.....");
                        break;
                    }
                }
            }
        } else if (name.equals(obj.getUserName()) && !pass.equals(obj.getPassword())) {
            System.out.println("Enter New Pass");
            obj.setPassword(sc.next());
            System.out.println(obj.getPassword());
            login();
        } else if (!name.equals(obj.getUserName()) && pass.equals(obj.getPassword())) {
            System.out.println("Enter new Username");
            obj.setUserName(sc.next());
            System.out.println(obj.getUserName());
            login();
        }
    }

    public static void main(String[] args) {
        System.out.println("1-sign up \n 2-login");
        int n=sc.nextInt();
        if(n==1)
        {
           new InstaAcc().signup();
        }
        else if(n==2)
        {
        new InstaAcc().login();
        }
        else
        {
             System.out.println("Invalid choice select valid one");
         main(null);
        }
    }
}


/*

output :

1-sign up
 2-login
1
Enter your credentials to create a new account
Username : sahithi@
Password : 235435
Mobile number : 8657464646
Account created successfully
press 1 to login or any key to exit :
1
Enter uname and pass
sahithi@
3333333
Enter New Pass
123456
123456
Enter uname and pass
skjgfj
123456
Enter new Username
#sahithi
#sahithi
Enter uname and pass
hello
55555
Invalid details
Enter Mobile number to get uname
9497743464
User not found
1 for re-enter 2 for Exit
1
Retry your mobile number
8657464646
OTP: 7000
7000
User name -> #sahithi
Enter uname and pass
#sahithi
123456
logged In

*/