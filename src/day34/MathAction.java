package day34;

import day31.Calculator_V2;

import java.util.Arrays;

public class MathAction {

    public static void main(String[] args) {

        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6, 4, 0);
        System.out.println("result1 = " + result1);

        int[] nums = {2,5,87};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums)) ;

        //how can I call static method calculate in Calculator_v2 under day 31 package.
        //first thing first, it's not under current package day34.
        //so we need to import the class. -->> import day31.Calculator_v2
        //in order to call static method of Calculator_v2 clas,
        //calculator_v2.yourStaticMethodName(...)

        Calculator_V2.calculate(10, 20, '-');



    }

}
