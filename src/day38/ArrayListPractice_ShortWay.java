package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {

    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99, 65.67);
        System.out.println("prices = " + prices);
        int count = 0;

        for(Double each : prices ){
            if(each>5){
                ++count;
            }
        }
        System.out.println("count = " + count);

        ArrayList<Double> newPrices = new ArrayList<>(prices);
        newPrices.add(199.9);
        newPrices.remove(0.99);
        System.out.println("newPrices = " + newPrices);

        //Create an ArrayList Object in one shor with many items so we can add or remove


        ArrayList<Double> oneShotPrice
                = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99));

        oneShotPrice.add(1, 100.9);
        System.out.println("After adding 100.99 = " + oneShotPrice);
        oneShotPrice.remove(2);
        System.out.println("After removing 3rd Item = " + oneShotPrice);



    }
}
