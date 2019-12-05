package day05;

import java.util.Scanner;

public class GroceryAction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price for potatoe");
        float potatoprice = scan.nextFloat();
        System.out.println("How many do you want to buy?");
        int potatocount =scan.nextInt();
        System.out.println("Your total for potatoe is " + (potatocount*potatoprice));

        System.out.println("What is the price for carrot");
        float carrotprice = scan.nextFloat();
        System.out.println("How many do you want to buy?");
        int carrotcount = scan.nextInt();
        System.out.println("your total price for carrot is " + (carrotcount * carrotprice));

    }
}
