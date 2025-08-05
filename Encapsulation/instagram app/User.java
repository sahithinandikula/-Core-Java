import java.util.*;
class Mobile
{
    void message(int otp)
    {
        System.out.println("your otp : "+otp);
    }
}
class Insta
{
    private String password="hi";
    void setPass(String password)
    {
        this.password=password;
    }
    String getPass()
    {
        return password;
    }
    int otpGenerator()
    {
        int otp=1000+(int)(Math.random()*8999);
        new Mobile().message(otp);
        return otp;
    }
}
public class User
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    Insta x=new Insta();
		System.out.print("Enter password to login : ");
		String password=sc.next();
		if(password.equals(x.getPass()))
		{
		    System.out.println("Login successfull");
		}
		else
		{
		    System.out.print("Invalid password press 1 to reset : ");
		    int n=sc.nextInt();
		    if(n==1)
		    {
		        int otp=x.otpGenerator();
		        System.out.print("Enter your otp : ");
		        int ot=sc.nextInt();
		        if(ot==otp)
		        {
		            System.out.print("Enter new password : ");
		            x.setPass(sc.next());
		            System.out.println("your new pass : "+x.getPass());
		        }
		        else
		            System.out.println("Invalid otp ");
		    }
		    else
		        System.out.println("Thank you ");
		}
		
	}
}
