class Insta
{
	private String username = "Sahithi";
	private String password = "@Sahithi";
	private String phone_number = "8186899829";

	/*Insta(String username, String password, String phone_number)
	{
		this.username = username;
		this.password = password;
		this.phone_number = phone_number;
	}*/

	String getUserName()
	{
		return username;
	}
	String getPassword()
	{
		return password;
	}
	String getPhoneNumber()
	{
		return phone_number;
	}
	void setUserName(String username)
	{
		this.username = username;
	}
	void setPassword(String password)
	{
		this.password = password;
	}
	void setPhoneNumber(String phone_number)
	{
		this.phone_number = phone_number;
	}
}
class User
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	static Insta obj = new Insta();
	void login()
	{
		System.out.println("Enter uname and pass");
		String name = sc.next();
		String pass = sc.next();
		if( name.equals( obj.getUserName() ) && pass.equals(obj.getPassword()) )
		{
			System.out.println("logged In");
		}
		else if( !name.equals( obj.getUserName() ) && !pass.equals(obj.getPassword()) )
		{
			System.out.println("Invalid details\n Enter Mobile number to get uname");
		    while(true){
			String mno = sc.next();
			if(mno.equals(obj.getPhoneNumber() ))
			{
				System.out.println("User name -> "+obj.getUserName());
				login();
				break;
			}
			else{
				System.out.println("User not found");
				System.out.println("1 for re-enter 2 for Exit");
				int n = sc.nextInt();
				if(n==1)
				{
					System.out.println("Retry your mobile number");
				}
				else{
					System.out.println("bye bye.....");
					break;
				}
			}
		     }
		}
		else if( name.equals( obj.getUserName() ) && !pass.equals(obj.getPassword())) {
			System.out.println("Enter New Pass");
			obj.setPassword(sc.next());
			System.out.println(obj.getPassword());
			login();
		}
	}
	
	public static void main(String[] args)
	{

		new User().login();
		

	}
}