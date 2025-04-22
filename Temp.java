import java.util.Scanner;
class Temp
{
 static Scanner sc=new Scanner(System.in);

 float m1(String s)
{
    System.out.println(s);
    System.out.println("enter float for m1 return");

    return sc.nextFloat();
}
static Boolean m2(char ch)
{   
    Temp obj=new Temp();
    System.out.println("enter string for m1 parameter");
    System.out.println(obj.m1(sc.next()));
    System.out.println(ch);
    System.out.println("enter boolean for m2 return");

    return sc.nextBoolean();
}
double m3(int a)
{
    System.out.println("enter char for m2 parameter");
    System.out.println(m2(sc.next().charAt(0)));
    System.out.println(a);
    System.out.println("enter double for m3 return");

    return sc.nextDouble();
}
static int m4(Boolean b)
{
    Temp obj=new Temp();
    System.out.println("enter integer for m3 parameter");
    System.out.println(obj.m3(sc.nextInt()));
    System.out.println(b);
    System.out.println("enter integer for m4 return");

    return sc.nextInt();
}

  
  
    public static void main(String[] args)
{	
   
    Temp ob=new Temp();
    System.out.println("enter boolean for m4 parameter");

    System.out.println(m4(sc.nextBoolean()));

}
}