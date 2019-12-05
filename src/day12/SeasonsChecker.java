package day12;

import java.util.Scanner;

public class SeasonsChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please");
        String season = scan.next();

        if (season.equalsIgnoreCase("spring") ){
            System.out.println("Hiking, Navruz, Allergy Season");
        } else if ( season.equalsIgnoreCase("summer")){
            System.out.println("Pool, Swimming, Beach, Vacation");
        } else if ( season.equalsIgnoreCase("fall")){
            System.out.println("barbecue, riding bike, Halloween");
        } else if ( season.equalsIgnoreCase("winter")){
            System.out.println("Code, Ski, Sledding, ");
        }else {
            System.out.println("Not Valid!!");
        }
    }
}
