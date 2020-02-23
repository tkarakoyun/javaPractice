package day29;

import java.util.Arrays;

public class FillingUpArrayValue {

    public static void main(String[] args) {

        int[]numbers = new int[100];

        System.out.println(Arrays.toString(numbers));


        for (int x = 0; x < numbers.length; x++) {

            numbers[x] = x * 5;

        }

        System.out.println(Arrays.toString(numbers));

    }
}
