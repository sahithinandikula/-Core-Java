import java.util.Scanner;

abstract class A {
    static Scanner sc = new Scanner(System.in);

    abstract int m1(float a);
    abstract String m2(Boolean b);

    A(char a) {
        System.out.println("A constructor: " + a);
    }
}

abstract class B extends A {
    abstract short m3(long l);

    double m4(int a) {
        System.out.println("m4 in B: " + a);
        return sc.nextDouble();
    }

    B(char a) {
        super(a); // ✅ Fix: Forward to A's constructor
        System.out.println("B constructor: " + a);
    }
}

class Concrete1 extends B {
    Concrete1(char a) {
        super(a); // ✅ Fix: Forward to B’s constructor
        System.out.println("Concrete1 constructor: " + a);
    }

    int m1(float a) {
        System.out.println("m1: " + a);
        return sc.nextInt();
    }

    String m2(Boolean b) {
        System.out.println("m2: " + b);
        return sc.next();
    }

    short m3(long l) {
        System.out.println("m3: " + l);
        return sc.nextShort();
    }
}

class Concrete2 extends B {
    Concrete2() {
        super(sc.next().charAt(0)); // ✅ This is okay now because B's constructor is fixed
    }

    int m1(float a) {
        System.out.println("m1: " + a);
        return sc.nextInt();
    }

    String m2(Boolean b) {
        System.out.println("m2: " + b);
        return sc.next();
    }

    short m3(long l) {
        System.out.println("m3: " + l);
        return sc.nextShort();
    }
}

class Test {
    public static void main(String args[]) { // ✅ Fix: mian → main
        Concrete2 obj = new Concrete2(); // Will ask for a char input for constructor
        obj.m1(A.sc.nextFloat());
        obj.m2(A.sc.nextBoolean());
        obj.m3(A.sc.nextLong());
        obj.m4(A.sc.nextInt());
    }
}

/*

@
A constructor: @
B constructor: @
1.2
m1: 1.2
12
true
m2: true
hello
12424
m3: 12424
12
123
m4 in B: 123
23.45

*/
