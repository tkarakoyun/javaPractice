package day24;

import java.util.Arrays;

public class ArrayMethodSorting {

    public static void main(String[] args) {

        int[] scores = {99,44,66,23,19,55};

        System.out.println(Arrays.toString(scores));
        System.out.println("Original first item is: " + scores[0]);

        Arrays.sort(scores);
        //So what happen to my original order?? GONEEEE!!
        //Can I get it back? NOOO!!!
        //The original index of items has changed!
        System.out.println(Arrays.toString(scores));
        //find the first item on the list.
        System.out.println("new first item is: " + scores[0]);

        char[] nameChars = {'G',' ','d','Z','9','A',};
        System.out.println("before sorting nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("After sorting nameChars = " + Arrays.toString(nameChars));

        System.out.println("----String Sorting------");
        String[] superHeros = {"Superman" , "Batman", "Wonder Woman", "Aquaman", " Cyborg", "Flash"};
        System.out.println("before sorting superheros):   "+ Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("after sorting superheros):   "+ Arrays.toString(superHeros));

        System.out.println("----Boolean Sorting------");
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString((fiveSwitchOnOffs)));


    }
}
