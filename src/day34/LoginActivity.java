package day34;

public class LoginActivity {

    public static void main(String[] args) {

        login1("my username" , "abc123");

        boolean result = login2("user", "abc123");
        System.out.println("result = " + result);


    }

    public static void login1(String user, String password) {
        if (user.equals("user") && password.equals("abc123")) {
            System.out.println("Log In successful");
        } else {
            System.out.println("Log in Failed");
        }
    }

    public static boolean login2(String user, String password){
        if (user.equals("user") && password.equals("abc123")){
            return true;
        }else{
            return false;
        }

        //short way to write this is below
        // return user.equals("user")&& password.equals("abc123);
    }



}
