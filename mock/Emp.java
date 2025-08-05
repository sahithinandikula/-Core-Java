import java.util.Scanner;
class Emp1
{
  static Scanner sc=new Scanner(System.in);
  String Ename=sc.next();
  int Eid=sc.nextInt();
  long l=sc.nextLong();
   static void display(Emp x)
  {
    System.out.println(x.Ename);
    System.out.println(x.Eid);
    System.out.println(x.l);
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