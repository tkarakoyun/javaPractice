package day16;

import java.util.Scanner;

public class reply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter price in cents: ");
        int itemPrice = scan.nextInt();

        int quarters = 25;
        int dimes= 10;
        int nickels= 5;

        System.out.println("Your change is " + quarters + "quarters, " +
                dimes + "dimes, " + "and " + nickels + "nickels.");


        if (itemPrice < 25 || itemPrice > 100){
            System.out.println("Invalid price!");
        }else if (itemPrice %5==0){
            System.out.println("Invalid price!");
        }
    }
}

