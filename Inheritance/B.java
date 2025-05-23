class A{
    int n=10;
    void m1()
    {
        int n=90;
        System.out.println(this.n);
    }
    
    A(int a)
    {
        System.out.println(a);
        
    }
    A(char ch)
    {
        this(100);
    }
}
class B extends A{
    int n=105;
    B(int d)
    {
        super('a');
    }
    B()
    {
        this(17);   
    }
    void m2( )
    { 
        super.m1();
        int n=29;
        System.out.println(n);
        System.out.println(this.n);
        System.out.println(super.n);
    }
     public static void main(String args[])
     {
        B obj=new B();
     }
}