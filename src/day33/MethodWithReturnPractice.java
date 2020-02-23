package day33;

import java.sql.SQLOutput;

public class MethodWithReturnPractice {
    public static void main(String[] args) {
        System.out.println(getSumFrom1toX(10));

        System.out.println(build_GOT_Email("Arya","Stark"));
        System.out.println(build_GOT_Email("Sam","Tarly"));
    }

    public static int getSumFrom1toX(int x){
        int sum = 0;

        for (int i = 1; i <= x ; i++) {
            sum += i;
        }

        return sum ;
    }

    public static String build_GOT_Email (String firstName, String lastName){

        String email = firstName.charAt(0) + lastName + "@NightWatch.com";

        return email;

        //return firstName.charAt(0) + lastName + "@NightWatch.com";
        //this will also do the same job.
    }
}
