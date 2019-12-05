package day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {


        // I want to save users input after asking some questions.
        //and I want to save this input so I can do something with it.

        //Step 1 : use scanner class to create scanner object
            // that ave this functionality
        Scanner scan = new Scanner (System.in);

        // ask user to enter name

        System.out.println("Enter your first name  : ");

        // capture what user type on keyboard in console

        String firstname = scan.next();


        //print the result of what we saved from use input.

        System.out.println("You have entered:  " + firstname);

        // ask question from user before entering

        System.out.println("What is your age?");

        int age= scan.nextInt();

        System.out.println("Your age is:  " + age);

        System.out.println("Where are you from?");

        String country = scan.next();

        System.out.println("You are from :  " + country);
        System.out.println("Thank you for the information.");
    }
}
