package day27;

import java.util.Scanner;

public class ArraysTask {

    public static void main(String[] args) {

            int[] scores = {100,897, 654, 32, 1231, 224, 556, 7, 1, 2, 3, 4};

            int min = 999999999;

        for (int i = 0; i < scores.length ; i++) {
            if(min > scores[i]){
                min= scores[i];
            }

        }
        System.out.println("Minimum Number is = " + min);

        int secondMin = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i] == min) {
                continue;

            }

            if(secondMin > scores[i]){
                secondMin = scores[i];
            }
        }
        System.out.println("Second Minimum number is = " + secondMin);

        int thirdMin = scores[0];
        for (int i = 0; i < scores.length ; i++) {
            if(scores[i] == min || scores[i] == secondMin){
                continue;
            }

            if(thirdMin> scores[i]){
                thirdMin = scores[i];
            }

        }
        System.out.println("third minimum number is = " + thirdMin);
    }
}
