package day08;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("What is my favorite number?");

        int myFavoriteNumber = scan.nextInt();


        if (myFavoriteNumber == 9){

            System.out.println("You are RIGHT!");
        }
        else {

            System.out.println("Try Again!");
        }
    }
}
