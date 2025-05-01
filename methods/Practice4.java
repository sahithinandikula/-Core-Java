import java.util.Scanner;
class Practice4
{
  static Scanner sc=new Scanner(System.in);
     static Object m1(Object obj) {
        Practice4  myObj = new Practice4(); // Create an object to call non-static m2
        myObj.m2(10, "Hello", 3.14);   // Calling m2 with 3 parameters
        return obj;                    // Returning the same object
    }

    // Non-static method m2
    public void m2(int a, String b, double c) {
        System.out.println("Inside m2:");
        System.out.println("Integer: " + a);
        System.out.println("String: " + b);
        System.out.println("Double: " + c);
    }

    // Main method
    public static void main(String[] args) {
        m1("Passing to m1"); // Calling m1 directly without storing parameters
    }
}