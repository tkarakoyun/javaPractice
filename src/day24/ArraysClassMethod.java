package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {

        String[] superHeros = {"Superman" , "Batman", "Wonder Woman", "Aquaman", " Cyborg", "Flash"};
        System.out.println("Arrays.toString(superheros) Result:    ");
        System.out.println(Arrays.toString(superHeros));

        String SuperHerosAsString = Arrays.toString(superHeros);
        System.out.println("superHerosString  Result:  ");
        System.out.println(SuperHerosAsString);

        //Question is " how do we get the first string from SuperHerosAsString
        System.out.println(SuperHerosAsString.charAt(1));


        System.out.println("~~~~~~~~~~~~~~~");

        int[] numbers = {10,44,55,3,78};
        System.out.println("Arrays.toString(numbers) Result: ");
        System.out.println(Arrays.toString(numbers));


        double[] prices = {3.14, 5.5, 9.0};
        System.out.println("Arrays.toString(prices) result" + Arrays.toString(prices));
        String priceString=Arrays.toString(prices);
        System.out.println("priceString = " + priceString);

        for (int i = 0; i < priceString.length() ; i++) {
            System.out.println("character at index " + i + " is : " + priceString.charAt(i));
        }

    }
}
