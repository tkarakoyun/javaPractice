package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("What is your name?");

        String name = scan.nextLine();

        System.out.println("you have entered " + name);

        System.out.println("Which city do you live in. Please include State.");

        String address = scan.nextLine();

        System.out.println("You live in " + address);

        System.out.println("What is your street address?");

        String street = scan.nextLine();

        System.out.println("you live on " + street);



    }
}
