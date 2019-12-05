package day15;

import java.util.Scanner;

public class ReversingAString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name please");
        String name = scan.next();


        System.out.println(name.charAt(0) + " " + name.charAt(1) + " " +
                name.charAt(2) + " " + name.charAt(3) + " "+ name.charAt(4));


        System.out.println(name.charAt(4) + " " + name.charAt(3) + " " +
                name.charAt(2) + " " + name.charAt(1) + " "+ name.charAt(0));
            // How do you find out last character of any String.
        //counting character start with one
        //counting index(location) start with 0.
        //so last character index/location will be always one less than actual character count.
        //Tugba has 5 character
        //01234 and last character index is 4 not 5. 5-1 = 4

        //Repl - 64

        int nameLength = name.length();
        int lastCharIndex = nameLength -1;
        char lastChar =  name.charAt(lastCharIndex);

        System.out.println("Last Char it " + lastChar);

        System.out.println("Last Char is on shot " + name.charAt(name.length() -1));


    }
}
