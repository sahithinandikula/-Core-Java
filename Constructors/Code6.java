//create object parametrized constructor for object and call in main method


import java.util.Scanner;
class Code6
{
  static Scanner sc=new Scanner(System.in);
  Code6()
{

System.out.println("hi");
}

  Code6(Code6 a)
  {
     System.out.println(a);
  }
  public static void main(String[] args)
  {
    Code6 obj=new Code6();
    Code6 obj1=new Code6(obj);

 }
}