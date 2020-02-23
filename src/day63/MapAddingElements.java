package day63;

import java.util.*;

public class MapAddingElements {

    public static void main(String[] args) {

        Map<String, Integer> nameAgePair = new HashMap<>();

        nameAgePair.put ("Zehra", 6);
        nameAgePair.put ("Muhammed", 21);
        nameAgePair.put ("Maiia", 27);
        nameAgePair.put ("Aidar", 20);
        nameAgePair.put ("Fatih", 27);
        nameAgePair.put ("Ruhksona", 16);
        nameAgePair.put ("Zehra", 7);
        nameAgePair.putIfAbsent("Zehra", 10);


        System.out.println("nameAgePair = " + nameAgePair);

        System.out.println("nameAgePair.size () = " + nameAgePair.size() );

        System.out.println("Zehra's Age = " + nameAgePair.get("Zehra"));


        System.out.println("nameAgePair.containsKey(\"Ruhksona\") = " + nameAgePair.containsKey("Ruhksona"));
        System.out.println("nameAgePair.containsKey(\"Hasan\") = " + nameAgePair.containsKey("Hasan"));

        nameAgePair.replace("Maiia", 17);
        System.out.println("nameAgePair- maiia = " + nameAgePair.get("Maiia"));

        nameAgePair.replace("Zehra", 7, 10);
        System.out.println("nameAgePair.get(\"Zehra\")= " +nameAgePair.get("Zehra"));

        nameAgePair.remove("Fatih");
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));
        System.out.println("nameAgePair.containsKey(\"Fatih\") = " + nameAgePair.containsKey("Fatih"));        

    }
}
