package day64;

import java.util.*;

public class SortedMap_Practice {
    public static void main(String[] args) {


        //this will sort by natural order.
        SortedMap<String, Double> groceryPriceMap = new TreeMap<>();

        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}
