package day28;

import java.util.Arrays;

public class ExcelVisualizer {

    public static void main(String[] args) {

        int [] row1 = new int[]{78,54,100,84};
        int [] row2 = new int []{33,44,77,123};
        int [] row3 = new int [] {12,88,52,76};
        int [] row4 = new int [] {67,33,98,67};
        int [] row5 = new int [] {12,88,52,45};
        int [] row6 = new int [] {67,33,98,34};

        int [] [] sheet = new int[][]{};


        int [] [] sheet1 = new int[][]{ {10,27  },{ 87,99,100 },{90,100  } };

        System.out.println(sheet1[1][2]);
        System.out.println(sheet1[2][0]);

        //how many items are in the whole Excel sheet.

        System.out.println(sheet1.length);

        System.out.println(Arrays.toString(sheet1[0]));

        System.out.println(sheet1[0].length);
        System.out.println(sheet1[1].length);
        System.out.println(sheet1[2].length);

        //how can I make above code better by loop and get the item count of each 1d array.

        for (int x = 0; x < sheet1.length ; x++) {

            System.out.println("Item number " + (x) + " length is: " + sheet1[x].length);

        }



    }
}
