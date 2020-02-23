package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {

    public static void main(String[] args) {

        /*
        Single dimensional array : contains values
        int[] arr = {1, 2, 3};

        multi dimensional array : an array that can contain arrays(s)

         */

        int [] arr1D = {1, 2, 3};
        // 2D array: is an array that contains single dimensional arrays.

        int [] [] arr2D = { {1, 2, 3}, {4, 5, 6} };
        //index:                0           1

        // [Index num of 1D Arrays][]

        //arr2D[0] ==> {1, 2, 3}

        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[0][2]); //0 bolesindeki 2. sayi (3)

        System.out.println(arr2D[1][1]); // 1 bolmesindeki 1. sayi (5)

        System.out.println(Arrays.toString(arr2D[1]));
    }
}
