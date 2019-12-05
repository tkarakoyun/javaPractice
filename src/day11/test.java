package day11;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();


        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();


        totalPrice = price1 + price3;

        report = ("Item1: " + item1 + " Price: "
                + price1 + ", " + "Item3: "+ item3 + " Price: " + price3 + "\n"+ "Total price: " + totalPrice);

        System.out.println(report);

    }
}
