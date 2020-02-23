package day29;

import java.util.Arrays;

public class fillingUpArrayValueEvenNumber {

    public static void main(String[] args) {

        int [] numbers= new int [100];

        System.out.println("before filling up default value \n"+ Arrays.toString(numbers));

        for (int x = 0; x < numbers.length ; x++) {

            numbers[x] = x  *2;

        }
        System.out.println("after filling up default value \n"+ Arrays.toString(numbers));

        String [] word = new String [300];

        for (int x = 0; x < word.length; x++) {

            word [x] = (x + 1 ) + ". I love Java";

        }

        System.out.println("word = " + Arrays.toString(word));


        String str = new String("ABC"); // This is string object with value ABC,
        String [] strArr2 = new String[5]; // Empty String Array with capacity 5,


    }
}
