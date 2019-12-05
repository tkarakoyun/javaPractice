package day06;

import day01.Main;

import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double regularprice;
        double saleprice;
        double discount;

        System.out.println("What is the regular price?");

        regularprice = scan.nextDouble();

        System.out.println("What is discount rate?");
        discount =scan.nextDouble();

        saleprice = regularprice - regularprice * discount;

        System.out.println("Regular price is " +regularprice
                           + "$ , discount is "  +discount+ " you got a deal for " + saleprice);
    }
}
