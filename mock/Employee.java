import java.util.Scanner;
class Emp
{
  static Scanner sc=new Scanner(System.in);
  static Emp obj=new Emp();
  String Ename=sc.next();
  int Eid=sc.nextInt();
  long l=sc.nextLong();
  void display(Emp x)
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
    int n=sc.nextInt();
    switch(n)
    {
     case 1:
          obj.display(obj1);
          break;
     case 2:
          obj.display(obj2);
          break;
     case 3:
          obj.display(obj3);
          break;
     case 4:
          obj.display(obj4);
          break;
    }
  }
}