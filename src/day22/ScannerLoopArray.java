package day22;

import java.util.Scanner;

public class ScannerLoopArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);


        int [] number = new int[10];

        for (int x = 1; x < number.length ; x++) {

            System.out.println("Enter Your Number " + x);

            number[x] = scan.nextInt();


        }

        for (int x = 1; x < number.length ; x++) {

            System.out.print(number[x] + " ");
        }


        }
}
