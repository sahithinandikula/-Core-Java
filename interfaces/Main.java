//create a java app where we have one interface it contains 2 undefined methods then provide //functionality in concrete class and invoke by providing dynamic inputs

import java.util.Scanner;
interface A
{
  int m1(String s); //by default public abstract is taken
  public abstract long m2(float f);
}
class Main implements A
{
  static Scanner sc=new Scanner(System.in);
  public int m1(String s)
  {
    System.out.println(s);
    return sc.nextInt();
  }
  public long m2(float f)
  {
    System.out.println(f);
    return sc.nextLong();
  }
  public static void main(String[] args)
  {
    A obj=new Main(); // upcasting or Main obj=new Main() is also considered 
    System.out.println(obj.m1(sc.next()));
    System.out.println(obj.m2(sc.nextFloat()));
  }
}


/*
output :
C:\Users\Sahit\OneDrive\Pictures\Desktop\java cvcorp\interfaces>java Main
hello
hello
12
12
64.9
64.9
45252
45252
*/.