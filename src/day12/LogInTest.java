package day12;

public class LogInTest {

    public static void main(String[] args) {

        String userName, password;

        userName = "user123";
        password = "pass123";

        if (userName.equals("user123") && password.equals("pass123")){
            System.out.println("Log in successful");
        }else if(!userName.equals("user123")) {
            System.out.println("Username is not correct");
        }else if(!password.equals("pass123")) {
            System.out.println("password is not correct");
        } else{
            System.out.println("None of them are correct");
        }

    }
}
