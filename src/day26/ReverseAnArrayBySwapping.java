package day26;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ReverseAnArrayBySwapping {


    public static void main(String[] args) {
                                //  0  1  2   3  4  5   6
        int[] myNumbers = new int[]{5, 3, 21, 2, 1, 13, 8,10, 14,17, 4, 7, 9  };
        int size = myNumbers.length;
        int lastIndex = size -1;
        int middleIndex = size/2;

        System.out.println(Arrays.toString(myNumbers));

        // swap first and last
        System.out.println(myNumbers[0] + "----" + myNumbers[lastIndex - 0]);

        //swap second and one before last
        System.out.println(myNumbers[1] + "----" + myNumbers[lastIndex - 1]);

        //swap third and 2 before last

        System.out.println(myNumbers[2] + "----" + myNumbers[lastIndex - 2]);


        System.out.println("------------ Loop here ---------");

        for (int x = 0; x <middleIndex ; x++) {

            System.out.println(myNumbers[x] + "----" + myNumbers[lastIndex - x]);
            int temp = myNumbers[x];
            myNumbers[x] = myNumbers[lastIndex - x];
            myNumbers[lastIndex - x] = temp;


        }

        System.out.println("After swap complete " + Arrays.toString(myNumbers));

    }
}
