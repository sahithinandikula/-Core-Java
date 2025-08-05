import java.util.Scanner;
class B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    //int a=sc.nextInt();
    //sc.nextLine();
    int a=Integer.parseInt(sc.nextLine());
    String b =sc.nextLine();
    System .out.println(a);
    System.out.println(b);
    //long c=long.parseLong(sc.nextLine()); bg color start with 100
    //System.out.println(c);

    static String red="\u001B[31m";

    System.out.println(red+"hello");
    // 0 for reset
    // 31-39 for colours


   //ASCII generator - for photos
  }
}



/*
output:
C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\interfaces\Bank>java   B
15
hello
15
hello
*/


//use thread 
// \r-rewrite