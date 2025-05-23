//random otp generator when mobile number entered
import java.util.Random;
class Insta {
    private String username = "Sahithi";
    private String password = "@Sahithi123";
    private String phone_number = "8183474855";

    String getUserName() {
        return username;
    }

    String getPassword() {
        return password;
    }

    String getPhoneNumber() {
        return phone_number;
    }

    void setUserName(String username) {
        this.username = username;
    }

    void setPassword(String password) {
        this.password = password;
    }

    void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }
}

class InstaAcc {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    static Insta obj = new Insta();

    void login() {
        System.out.println("Enter uname and pass");
        String name = sc.next();
        String pass = sc.next();

        if (name.equals(obj.getUserName()) && pass.equals(obj.getPassword())) {
            System.out.println("logged In");
        } else if (!name.equals(obj.getUserName()) && !pass.equals(obj.getPassword())) {
            System.out.println("Invalid details\nEnter Mobile number to get uname");
            while (true) {
                String mno = sc.next();
                if (mno.equals(obj.getPhoneNumber())) {
                    Random r = new Random();
                    int otp = r.nextInt(8999) + 1000;
                    System.out.println("OTP: " + otp);
                    int entotp = sc.nextInt();
                    if (otp == entotp) {
                        System.out.println("User name -> " + obj.getUserName());
                        login();
                        break;
                    }
                } else {
                    System.out.println("User not found");
                    System.out.println("1 for re-enter 2 for Exit");
                    int n = sc.nextInt();
                    if (n == 1) {
                        System.out.println("Retry your mobile number");
                    } else {
                        System.out.println("bye bye.....");
                        break;
                    }
                }
            }
        } else if (name.equals(obj.getUserName()) && !pass.equals(obj.getPassword())) {
            System.out.println("Enter New Pass");
            obj.setPassword(sc.next());
            System.out.println(obj.getPassword());
            login();
        } else if (!name.equals(obj.getUserName()) && pass.equals(obj.getPassword())) {
            System.out.println("Enter new Username");
            obj.setUserName(sc.next());
            System.out.println(obj.getUserName());
            login();
        }
    }

    public static void main(String[] args) {
        new InstaAcc().login();
    }
}
