import java.util.Scanner;
class Sample
{    

   static Scanner sc=new Scanner(System.in); 
   int add(int a, int b)
   {
     System.out.println("a:"+a+" "+"b:"+b);
     return a+b;
   }
   int sub(int a, int b)
   {
     System.out.println("a:"+a+" "+"b:"+b);
     return a-b;
   }
   int multi()
   {
     int f=add(sc.nextInt(),sc.nextInt())*sub(sc.nextInt(),sc.nextInt());
     return f; 
   }
  public static void main(String[] args)
  {
   
    Sample obj=new Sample();
    System.out.println(obj.multi());
  }
}  

     