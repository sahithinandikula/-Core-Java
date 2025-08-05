import java.util.*;
interface RBI
{
    Scanner sc=new Scanner(System.in);
    double deposit(double amount);
    double withdraw(double amount);
    void balanceEnquiry();
    void loan();
}
class SBI implements RBI
{
    double balance=10000;
    public double deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Successfully deposited amount inr :"+amount);
        }
        else
            System.out.println("Deposit amount cannot be negative ");
        return balance;
    }
    public double withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println("Withdrawl successfull amount inr : "+amount);
        }
        else
            System.out.println("Insufficient funds");
        return balance;
    }
    public void balanceEnquiry()
    {
        System.out.println("Current balance : "+balance);
    }
    public void loan()
    {
        System.out.print("Enter your cibil score to check eligibility : ");
        int cibil=sc.nextInt();
        if(cibil>=600 && cibil<=900)
        {
            double loan_amount=0;
            if(cibil>=600&&cibil<=700)
                loan_amount=200000;
            else if(cibil>700 &&cibil<=800)
                loan_amount=500000;
            else
                loan_amount=100000;
            System.out.println("Your eligible loan amount = "+loan_amount);
            System.out.println("Choose your Tenure : ");
            System.out.println("1 - For 1 year rate of interest 8% ");
            System.out.println("2 - For 2 years rate of interest 10% ");
            System.out.println("3 - For 3 years rate of interest 12% ");
            int tenure=sc.nextInt();
            if(tenure==1)
            {
                double interest=loan_amount*0.08;
                System.out.println("your total loan payable loan amount : "+(loan_amount+interest)+"per month EMI : "+((loan_amount+interest)/12));
            }
            else if(tenure==2)
            {
                double interest=loan_amount*0.10;
                System.out.println("your total loan payable loan amount : "+(loan_amount+interest)+"per month EMI : "+((loan_amount+interest)/24));
            }
            else if(tenure==3)
            {
                double interest=loan_amount*0.12;
                System.out.println("your total loan payable loan amount : "+(loan_amount+interest)+"per month EMI : "+((loan_amount+interest)/36));
            }
            else
                System.out.println("Invalid tenure Thank you :) ");
        }
        else
            System.out.println("Invalid cibil score you are bnot eligible for loan ");
    }
    void transaction()
    {
        System.out.println("1 - Deposit\n2 - Withdraw\n3 - balanceEnquiry\n4 - loan");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.print("Enter Deposit amount : ");
            System.out.println("Your available balance : "+deposit(sc.nextDouble()));
        }
        else if(n==2)
        {
            System.out.print("Enter Withdraw amount : ");
            System.out.println("Your available balance : "+withdraw(sc.nextDouble()));
        }
        else if(n==3)
            balanceEnquiry();
        else if(n==4)
            loan();
        else
        {
            System.out.println("Invalid selection ");
            transaction();
        }
    }
}
class KOTAK implements RBI
{
    double balance=10000;
    public double deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Successfully deposited amount inr :"+amount);
        }
        else
            System.out.println("Deposit amount cannot be negative ");
        return balance;
    }
    public double withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println("Withdrawl successfull amount inr : "+amount);
        }
        else
            System.out.println("Insufficient funds");
        return balance;
    }
    public void balanceEnquiry()
    {
        System.out.println("Current balance : "+balance);
    }
    public void loan()
    {
        System.out.print("Enter your cibil score to check eligibility : ");
        int cibil=sc.nextInt();
        if(cibil>=600 && cibil<=900)
        {
            double loan_amount=0;
            if(cibil>=600&&cibil<=700)
                loan_amount=300000;
            else if(cibil>700 &&cibil<=800)
                loan_amount=500000;
            else
                loan_amount=120000;
            System.out.println("Your eligible loan amount = "+loan_amount);
            System.out.println("Choose your Tenure : ");
            System.out.println("1 - For 1 year rate of interest 10% ");
            System.out.println("2 - For 2 years rate of interest 13% ");
            System.out.println("3 - For 3 years rate of interest 17% ");
            int tenure=sc.nextInt();
            if(tenure==1)
            {
                double interest=loan_amount*0.10;
                System.out.printf("your total loan payable loan amount : %.2f per month EMI : %.2f",(loan_amount+interest),((loan_amount+interest)/12));
            }
            else if(tenure==2)
            {
                double interest=loan_amount*0.13;
                System.out.printf("your total loan payable loan amount : %.2f per month EMI : %.2f",(loan_amount+interest),((loan_amount+interest)/24));
            }
            else if(tenure==3)
            {
                double interest=loan_amount*0.17;
                System.out.printf("your total loan payable loan amount : %.2f per month EMI : %.2f",(loan_amount+interest),((loan_amount+interest)/36));
            }
            else
                System.out.println("Invalid tenure Thank you :) ");
        }
        else
            System.out.println("Invalid cibil score you are bnot eligible for loan ");
    }
    void transaction()
    {
        System.out.println("1 - Deposit\n2 - Withdraw\n3 - balanceEnquiry\n4 - loan");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.print("Enter Deposit amount : ");
            System.out.println("Your available balance : "+deposit(sc.nextDouble()));
        }
        else if(n==2)
        {
            System.out.print("Enter Withdraw amount : ");
            System.out.printf("Your available balance : %.2f ",withdraw(sc.nextDouble()));
        }
        else if(n==3)
            balanceEnquiry();
        else if(n==4)
            loan();
        else
        {
            System.out.println("Invalid selection ");
            transaction();
        }
    }
}
public class User
{
	public static void main(String[] args) {
		System.out.println("1 - SBI\n2 - KOTAK");
		int n=RBI.sc.nextInt();
		if(n==1)
		    new SBI().transaction();
		else if(n==2)
		    new KOTAK().transaction();
		 else
		   {
		       System.out.println("Invalid choice please select valid  ");
		       main(args);
		   }
	}
}
