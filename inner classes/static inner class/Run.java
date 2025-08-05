//create a java application 1 class,non static method static inner class which contains 1 static & //non static methods and invoke all these properties under main by providing dynamic inputs

import java.util.Scanner;
class Run
{
  static Scanner sc=new Scanner(System.in);
  int m1(double d)
  {
    System.out.println(d);
    return sc.nextInt();
  }
   static class Stat
   {
      static Boolean m2(String s)
      {
         System.out.println(s);
         return sc.nextBoolean();
      }
      float m3(int a)
      {
        System.out.println(a);
        return sc.nextFloat();
      }
   }
   public static void main(String[] args)
   {
     Run obj=new Run();
     System.out.println(obj.m1(sc.nextDouble()));
     System.out.println(Run.Stat.m2(sc.next()));
     Stat x=new Stat(); // if outside class then Run.Stat x=new Run.Stat();
     System.out.println(x.m3(sc.nextInt()));
   }
}
  

/*
output:
C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\inner classes\static inner class>java Run
1.234
1.234
23
23
innerclass
innerclass
true
true
45
45
1.2
1.2

*/