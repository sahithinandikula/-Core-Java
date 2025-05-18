import java.util.Scanner;
class main{
    int n=10;
    void m1()
    {
        System.out.println(this.n);
    }
    main(int a)
    {
        System.out.println(a);
    }
    main(char ch)
    {
        System.out.println(ch);
    }
}
class B extends main{
    int b=100;
    B()
    {
        super(10);
    }
    B()
    {
        super('a');
    }
    void m2( )
    {
        int b=29;
        System.out.println(b);
        System.out.println(this.b);
        System.out.println(super.a);
    }
     public static void main(String args[])
     {
        B obj=new B();
     }
}