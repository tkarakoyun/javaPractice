package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        for (int x = 1; x <= 100; x++) {
            //System.out.println("x = " + x);
            nums.add(x);

        }
        System.out.println("nums = " + nums);

        //change all the odd number value to 0;
        for (int i = 0; i <nums.size() ; i+=2) {
            nums.set(i, 0);

        }

        System.out.println("nums = " + nums);

        // How to find index of value 20;

        System.out.println("nums.indexOf(20) = " + nums.indexOf(20));
        
        // insert 100 to first index:
        nums.add(0, 100);
        System.out.println("nums = " + nums);

        System.out.println("Index of 20 after inserting 100 at index 0 = "+ nums.indexOf(20));

        List<Integer>lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst2 = " + lst2);       
        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 : 
        
        lst2.add(lst2.indexOf(34) + 1, 100);
        System.out.println("lst2 = " + lst2);

        // add 100 five times.

        for (int i = 1; i <=5 ; i++) {
            lst2.add(0,100);
        }
        System.out.println("lst2 = " + lst2);
    }
}
