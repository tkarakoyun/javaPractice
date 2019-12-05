package day06;

import java.util.Scanner;

public class trial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String name = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        System.out.println("Enter your email");
        String email = scan.next();

        System.out.println("Enter your street");
        String street = scan.next();

        System.out.println("Enter your city");
        String city = scan.next();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        Long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        Long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        Double height = scan.nextDouble();

        System.out.println("Enter your weight");
        Double weight = scan.nextDouble();

        System.out.println("Are you married");
        Boolean isMarried = scan.nextBoolean();

    }
}