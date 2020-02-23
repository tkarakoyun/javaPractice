package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {

    public static void main(String[] args) {

        int[][] myExcel = {{10, 27, 88,99},
                            {87,100},
                            {90,45,65} };

        // what does deepToString method do?
            //it takes an MultiD array and turn it into a String with all items.
        //What external data do we provide?
            //the multiD array object ot the multiD array variable.
        //What do I get out ot it?
            //String representation of multiD array object.
        System.out.println(Arrays.deepToString(myExcel));

        for ( int[] eachRow    :myExcel){

            for(int eachCell : eachRow){
                System.out.print(eachCell + " ");
            }
            System.out.println();
        }
    }
}
