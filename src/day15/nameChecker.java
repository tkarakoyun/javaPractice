package day15;

import java.util.Scanner;

public class nameChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name please");
        String name = scan.next();

        int lengthOfTheName = name.length();
        System.out.println("lengthOfTheName = " + lengthOfTheName);


        if (name.length() < 4) {
            System.out.println("Short Name");
        } else if (name.length() >= 4 && name.length() <=10){
            System.out.println("Medium Name");
        }else {
            System.out.println("Long Name");
        }

        String myName = "Tugba";

        if (myName.contains("a") || myName.contains("e")) {
            System.out.println("Name contains a or e");
        } else {
            System.out.println("Name does not contain a or e");
        }





    }
}
