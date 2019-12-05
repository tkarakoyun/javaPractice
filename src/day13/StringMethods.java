package day13;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class StringMethods {

    public static void main(String[] args) {

        //String actions that we already know so far
        //equals
        String s1 = "HELLO";
        System.out.println( s1.equals("abc"));
        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        //toUpperCase method of String is used to make String all character uppercase
        System.out.println( s1);
        System.out.println(   s1.toUpperCase());

        //toLowerCase method of String is used to make String all character lowercase.

        System.out.println( s1.toLowerCase());

        String t1 = "tugba karakoyun";
        System.out.println("My name is " + t1.toUpperCase());
        System.out.println("My name is " + t1.toLowerCase());

        // In order to get how many character we have inside String
        // we can use length method of string

        System.out.println(t1.length());

        int lengthOfStr = s1.length();

        if(lengthOfStr > 4){
            System.out.println(" More than 4 character");
        }else{
            System.out.println("Not more than 4 character");
        }


    }
}
