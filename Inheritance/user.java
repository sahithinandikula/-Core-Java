import java.util.Scanner;
class restur
{
	static Scanner sc = new Scanner (System.in);
	double amount=0;
	double veg(int quantity)
	{
	return quantity*199;
	}
	double chicken(int quantity)
	{
	return quantity*299;
 	}
	double mutton(int quantity)
	{
	return quantity*599;
	}
}
class swiggy extends restur
{
	void select()
	{
	menu();
	System.out.println("choose your item");
        int n=sc.nextInt();
	     if(n==1)
		{
			System.out.println("enter quantity");
			int s=sc.nextInt();
			amount=amount+veg(s);
		}
	     if(n==2)
		{
		System.out.println("enter quantity");
		int s=sc.nextInt();
        	amount=amount+chicken(s);
		}
	    if(n==3)
		{
                System.out.println("enter quantity");
		int s=sc.nextInt();
		amount=amount+mutton(s);
		}
	     System.out.println("if you want to selct more items enter 1 and 2 for Billing");
	     int n1=sc.nextInt();
	     if(n1==1)
			select();
	     else
			billing(amount);
}
	void menu()
	{
	        System.out.println("1 for veg biryani 199/-");
		System.out.println("2 for chicken biryani 299/-");
		System.out.println("3 for mutton biryani 599/-");
	}
	void billing(double bill)
	{
	double gst=(bill/100)*2;
	System.out.println("delivery charge = 20");
	System.out.println("GST             = "+gst);
        System.out.println("your billing is    = "+bill);
	int total=(int)bill;
        int t=total;
        float discount=0;
        float w=(float)total;
        int rev=0;
        int c=0;
        while(t!=0)
	{
	int r=t%10;
	rev=rev*10+r;
	t=t/10;
	}
	if(rev==total)
	{
	discount=discount+((float)total/100)*5;
	w=(float)total-discount;
	}
	t=total;
	while(t!=0)
	{
	int r=t%10;
	c++;
	t=t/10;
	}
	t=total;
	int s=0;
	rev=0;
	while(t!=0)
	{
	int r=t%10;
	s=s+(int)Math.pow(r,c);
	t=t/10;
	}
	if(total==s)
	{
	discount=discount+((float)total/100)*10;
	w=(float)total-discount;
	}
	System.out.println("your discount   = "+discount);
	System.out.println("total amount    = "+(w+20+(int)gst));
	}
}
	class zomato extends restur
	{
	void select()
	{
	menu();
	System.out.println("choose the item");
	int a=sc.nextInt();
	if(a==1)
	{
	System.out.println("enter quantity");
	int s=sc.nextInt();
	amount=amount+veg(s);
	}
	if(a==2)
	{
	System.out.println("enter quantity");
	int s=sc.nextInt();
	amount=amount+chicken(s);
	}
	if(a==3)
	{
	System.out.println("enter quantity");
	int s=sc.nextInt();
	amount=amount+mutton(s);
	}
	System.out.println("if you want to select more items enter 1 and 2 for bill");
	int c=sc.nextInt();
	if(c==1)
{
select();
}
else
billing(amount);
}

void menu()
{
System.out.println("1 for veg biryani 230/-");
System.out.println("2 for chicken biryani 290/-");
System.out.println("3 for mutton biryani 799/-");
}
void billing(double bill)
{
double gst=(bill/100)*2;
System.out.println("delivery charge = 40");
System.out.println("GST             = "+gst);
System.out.println("your bill is    = "+bill);
int total=(int)bill;
int t=total;
float discount=0;
float w=0;
int c=0;
int rev=0;
while(t!=0)
{
int r=t%10;
rev=rev*10+r;
t=t/10;
}
if(rev==total)
{
discount=discount+((float)total/100)*5;
w=(float)total-discount;
}
t=total;
while(t!=0)
{
int r=t%10;
c++;
t=t/10;
}
t=total;
int s=0;
rev=0;
while(t!=0)
{
int r=t%10;
s=s+(int)Math.pow(r,c);
t=t/10;
}
if(total==s)
{
discount=discount+((float)total/100)*10;
w=(float)total-discount;
}

System.out.println("your discount   = "+discount);
System.out.println("total amount    = "+(w+40+(int)gst));
}
}

class user extends swiggy
{
public static void main(String[] args)
{
swiggy obj=new swiggy();
zomato obj1=new zomato();
System.out.println("swiggy zomato");
System.out.println("enter 1 for swiggy 2 for zomato");
int e=sc.nextInt();
if(e==1)
{
obj.select();

}
else
{
obj1.select();
}
}
}




	



