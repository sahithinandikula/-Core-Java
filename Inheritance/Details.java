import java.util.Scanner;
class Excel
{
   int EmpId;
   String EmpDes;
   double EmpSal;
   String EmpLoc;
   Excel(int EmpId,String EmpDes,double   EmpSal,String EmpLoc)
{
  this.EmpId=EmpId;
  this.EmpDes=EmDes;
  this.EmpSal=EmpSal;
  this.EmpLoc=EmpLoc;
}
}
class Details extends Excel
{
  Details(int EmpId,String EmpDes,double   EmpSal,String EmpLoc)
{
  super(int EmpId,String EmpDes,double   EmpSal,String EmpLoc);
}
void display()
   {
     System.out.println("Employee Details:");
     System.out.println("Employee Id:"+EmpId);
     System.out.println("Employee Designation:"+EmpDes);
     System.out.println("Employee Salary"+EmpSal);
     System.out.println("balance:"+balance);
   }
}
}
class Employee extends Details
{
  public static void main(String[] args)
  {
     Details obj=new Details(101,"Developer",20000,"Hyd");
 obj.display();
}
}