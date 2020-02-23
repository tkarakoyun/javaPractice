package day33;

import java.util.Scanner;

public class ReturnWillTerminateTheMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number more than 10");

        int num = scan.nextInt();
        if(num<10){
            //you can use return Keyword to get out of the message in
            //void message, as long as you don't actually return a value.
            //below line is the only thing you can do.
            return;
        }
        System.out.println("Happy Holidays");
        System.out.println("2 Days Off!! Yay");
    }
}
