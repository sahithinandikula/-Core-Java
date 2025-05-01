/* create a java application where we have class student  it contains  
Non static fields like Std_name,Std_id,Std_batch then we have a 
method display which displays the student details, enter the data of 
4 students and after that ask user to which student details he need 
to see and based on his input display that respective student details 
by providing dynamic inputs. */ 

import java.util.Scanner;

class Student {
    static Scanner sc = new Scanner(System.in);

    String std_name = sc.next();
    int std_id = sc.nextInt();
    int std_batch = sc.nextInt();

    void display(Student x) {
        System.out.println(x.std_name + " " + x.std_id + " " + x.std_batch);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        System.out.println("Select Student 1-4:");
        int n = sc.nextInt();

        if (n == 1)
            s1.display(s1);
        else if (n == 2)
            s2.display(s2);
        else if (n == 3)
            s3.display(s3);
        else if (n == 4)
            s4.display(s4);
        else
            System.out.println("Invalid input!");
    }
}
