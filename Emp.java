import java.util.Scanner;
class Emp
{
  static Scanner sc=new Scanner(System.in);
  String Ename;
  int Eid;
  long l();
   Emp(String Ename,int Eid,long l)
   {
     this.Ename=Ename;
     this.Eid=Eid;
     this.l=l;
   }
   static void display(String Ename,int Eid,long l)
  {
    System.out.println(Ename);
    System.out.println(Eid);
    System.out.println(l);
  }
  public static void main(String[] args)
  {
    Emp obj1=new Emp();
    Emp obj2=new Emp();
    Emp obj3=new Emp();
    Emp obj4=new Emp();
    System.out.println("Choose employee to get      their details");
    int n=sc.nextInt();
    switch(n)
    {
     case 1:
          display(obj1);
          break;
     case 2:
          display(obj2);
          break;
     case 3:
          display(obj3);
          break;
     case 4:
          display(obj4);
          break;
    }
  }
}