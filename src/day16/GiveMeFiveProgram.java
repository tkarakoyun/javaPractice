package day16;

import java.util.Scanner;

public class GiveMeFiveProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       // System.out.println("Give Me Five!!");

       // int userNumber = scan.nextInt();

        //if(userNumber!=5){
         //   System.out.println("You did not give me 5!");
        //}
        int userNumber = 0;
        while(userNumber!=5) {
            System.out.println("Give me five!");
            userNumber = scan.nextInt();
        }
        System.out.println("End of the Program");
    }
}
