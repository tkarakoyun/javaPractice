package day19;

import java.util.Scanner;

public class SpeedAction_Scanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        System.out.println("enter starting end ending point");
        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start<end){
            for (int i = start; i <= end ; i++) {
                System.out.print( i+ ", ");
        }

        }else if (start> end){
            System.out.println("Decreasing the speed");

            for (int x = start; x >= end; x--) {
                System.out.println(x + ", ");
            }
        }else {
            System.out.println("No action needed! same speed");
        }


    }
}
