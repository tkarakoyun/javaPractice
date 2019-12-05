package day11;

import java.sql.SQLOutput;
import java.util.function.DoubleToIntFunction;

public class StringEqualityPractice {

    public static void main(String[] args) {

        //checking for String equality should be always
        //done using equals method of the String

        //oneString.equals(anotherString) -->true or false

        System.out.println("Java".equals("java"));

        String myStr = "Java";

        System.out.println(myStr.equals("Java"));

        String yourStr =new String("Java");

        System.out.println("is my string same as your string ?");

        // how to compare myStr to yourStr for equality
        System.out.println(myStr.equals(yourStr));

        if (myStr.equals("Java")) {
            System.out.println("Correct Word");
        }else{
            System.out.println("Say JAVA!!");
        }
    }
}
