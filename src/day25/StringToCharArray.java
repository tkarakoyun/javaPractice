package day25;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {

        String name = "Anastasiya";

        char[] allCharsInName = name.toCharArray();

        for(char eachChar: allCharsInName){
            System.out.println("eachChar = " + eachChar);
        }
        
        int count = 0;
        for (char eachChar : allCharsInName){
            if(eachChar=='a'){
                
                ++count;
            }
        }

        System.out.println("count = " + count);

        // what if I want to order them alphabetically.

        Arrays.sort(allCharsInName);
        System.out.println("After sorting allCharsInName = " + Arrays.toString(allCharsInName));


    }
}
