package day05;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        Scanner Scan = new Scanner (System.in);

        System.out.println("How many hours in a day?");
        int days = Scan.nextInt();
        int hours = 24 * days;
        System.out.println("There are " + hours + " hours in " + days + "days.");


        System.out.println("What is your hourly wage?");
        int wageInHour = Scan.nextInt();
        int salary = wageInHour;
    }
}
