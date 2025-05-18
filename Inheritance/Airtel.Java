//Recharge process

class Airtel
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	double rech(int plan)
	{
		if(plan==1)
			return 199;
		else if(plan == 2)
			return 299;
		else
			return 399;
	}
}
class Phonepe extends Airtel
{
	double amt = 0;
	void sel()
	{
		plans();
		System.out.println("Choose your plan");
		int n = sc.nextInt();
		amt = amt + rech(n);
		System.out.println("1 Recharge Selected");
		System.out.println("1 for Another recharge 2 for Bill");
		int n1 = sc.nextInt();
		if(n1==1)		
			sel();
		else
			billi();
	}
	void plans(){
		System.out.println("1 for 199");
		System.out.println("2 for 299");
		System.out.println("3 for 399");
	}
	void billi(){
		System.out.println("---------Invoice---------\n");
		System.out.println("Bill is     : "+amt);
		System.out.println("P charge    :  2/-");
		System.out.println("-------------------------");
		System.out.println("Total bill  : "+(amt+2));
		System.out.println("-------------------------");
		System.out.println("         Thank you       ");
	}
}
class User extends Phonepe
{
	public static void main(String[] args)
	{
		new User().sel();
	}
}