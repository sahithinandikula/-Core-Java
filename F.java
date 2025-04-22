import java.util.Scanner;

class F {
    Scanner sc = new Scanner(System.in);
     static F obj = new F();
    void m1(int a) {
        System.out.println("Inside m1 with int: " + a);
    }

    void m2(String str) {
        System.out.println("Inside m2 with String: " + str);
        System.out.print("Enter integer value for m1: ");
        int val = sc.nextInt();
        obj.m1(val);
    }

    void m3(float f) {
        System.out.println("Inside m3 with float: " + f);
        System.out.print("Enter string value for m2: ");
        String str = sc.next();
        obj.m2(str);
    }

    void m4(boolean b) {
        System.out.println("Inside m4 with boolean: " + b);
        System.out.print("Enter float value for m3: ");
        float f = sc.nextFloat();
        obj.m3(f);
    }

    void m5(double d) {
        System.out.println("Inside m5 with double: " + d);
        System.out.print("Enter boolean value for m4 (true/false): ");
        boolean b = sc.nextBoolean();
        obj.m4(b);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter double value for m5: ");
        double d = sc.nextDouble();
        obj.m5(d);
    }
}
