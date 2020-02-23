package day32;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        int[] scores = {1,6, 5, 3, 12, 2};
        printArrayItems(scores);

        printMaxOfIntArray( new int[] {4,15,35,21,14});
        printMinOfIntArray( new int[] {4,15,35,21,14});
        printSumOfIntArray(new int[] {4,15,35,21,14});

        compare2arraySize(new String[] {"Sezgin", "Senay","Astrit" }, new String []{"Arax"} );

        String[] names1 = {"Superman", "Batman", "Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};

    }
    public static void printArrayItems (int[] nums) {
        System.out.println("arrays have items: " + Arrays.toString(nums));
    }

    public static void printMaxOfIntArray (int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length ; i++) {
                if(max < nums[i]){
                    max = nums[i];
            }

        }
        System.out.println("The Max Number is " + max);
    }

    public static void printMinOfIntArray (int [] nums) {
        int min = nums[0];
        for (int i = 0; i > nums.length ; i++) {
            if(min > nums[i]){
                min=nums[i];
            }

        }
        System.out.println("The Min Number is " + min);
    }

    public static void printSumOfIntArray(int[] nums){
        int sum =0;
        for(int each : nums){
            sum = sum + each;
        }
        System.out.println("sum = " + sum);
    }
    public static void compare2arraySize(String [] arr1, String [] arr2){
        if (arr1.length > arr2.length) {
            System.out.println("array 1 has more item ");
        } else if (arr1.length < arr2.length) {
            System.out.println("array 2 has more item ");
        } else {
            System.out.println("they have same item count");
        }

    }
}
