//all relationships in a single program
import java.util.Scanner;
class A
{
   static Scanner sc=new Scanner(System.in);
   int m1(Boolean b)
   {
     System.out.println(b);
     return sc.nextInt();
   }
}
class B extends A
{
    String m2(long l)
    {
      System.out.println(l);
      return sc.next();
    }
}
//has -A
class C 
{
   B obj =new B();
   char m3(float f)
   {
      System.out.println(f);
      return A.sc.next().charAt(0);
  }
}
//User-A
class Relation 
{
   
   short m4(int a)
   {
     System.out.println(a);
     return A.sc.nextShort();
   }
   public static void main(String[] args)
   {
        C obj1=new C();//local obj
        Relation obj2=new Relation();
        System.out.println(obj1.obj.m1(A.sc.nextBoolean()));
        System.out.println(obj1.obj.m2(A.sc.nextLong()));
        System.out.println(obj1.m3(A.sc.nextFloat()));
        System.out.println(obj2.m4(A.sc.nextInt()));
   }
}


/*
 
C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp>java Relation

true
true
78
78
8547
8547
madhu
madhu
1.23
1.23
@
@
89
89
4
4


*/
