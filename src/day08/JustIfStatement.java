package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt();
        System.out.println("What is the speed limit?");
        int speedLimit = scan.nextInt();

        if (currentSpeed >= speedLimit) {
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        }
        // there is no else. The program will just go on.

        System.out.println("The end! Move on with your life.");
    }
}
