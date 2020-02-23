package day26;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwappingValues {

    public static void main(String[] args) {

        String name1 = "Emma";
        String name2 = "Jason";
        // name2 should have Emma , name1 should have Jason
        //name1 = name2 ;
        //name2 = name1 ;

        String tempContainer = name1; // emma
        name1 = name2;  //name1 -->> Jason
        name2 = tempContainer; // name -->> Emma

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        // swap the value of first item and last item
        int[] myNumbers = new int[]{10, 40, 30, 7};

        int temp = myNumbers[0];  // temp now has 10
        myNumbers[0] = myNumbers[3];  // first item value become 7
        myNumbers[3] = temp;  // last item now become 10

        System.out.println("first item = " + myNumbers[0]);
        System.out.println("last item = " + myNumbers[3]);


        System.out.println("myNumbers = " + Arrays.toString(myNumbers));

        int temp2 = myNumbers[1] ;
        myNumbers[1] =myNumbers[2];
        myNumbers [2] = temp2;

        System.out.println("myNumbers =" + Arrays.toString(myNumbers));


    }
}
