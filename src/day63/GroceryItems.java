package day63;

import java.util.*;

public class GroceryItems {

    public static void main(String[] args) {

        Map<String, Double> itemAndPricePair = new HashMap<>();

        itemAndPricePair.put("Tomato",1.99);
        itemAndPricePair.put("Potato",1.99);
        itemAndPricePair.put("Tomato",3.00);
        itemAndPricePair.put("Grape",3.99);
        itemAndPricePair.put("Banana",0.69);
        itemAndPricePair.put("Apple",1.89);
        itemAndPricePair.putIfAbsent("Fish",12.99);
        itemAndPricePair.putIfAbsent("Apple",100.0);

        System.out.println("itemAndPricePair.size() = " + itemAndPricePair.size());
        System.out.println("itemAndPricePair = " + itemAndPricePair); // random order

        System.out.println("itemAndPricePair.get(\"Tomato\") = " + itemAndPricePair.get("Tomato"));
        
       // itemAndPricePair.replace("Apple", 1.89*2); // this is if you know the price to the tomato
        itemAndPricePair.replace("Apple",itemAndPricePair.get("Apple") * 2); // this is if I dont know the price
        System.out.println("itemAndPricePair.get(\"Apple\") = " + itemAndPricePair.get("Apple"));

        itemAndPricePair.replace("Banana",itemAndPricePair.get("Banana") -1); // this is if I dont know the price
        System.out.println("itemAndPricePair.get(\"Banana\") = " + itemAndPricePair.get("Banana"));

        if (itemAndPricePair.containsKey("Tomato")) {
            itemAndPricePair.remove("Tomato");
            System.out.println("NO MORE TOMATO!@");
        }
        System.out.println("groceryPriceMap = " + itemAndPricePair);

    }


}
