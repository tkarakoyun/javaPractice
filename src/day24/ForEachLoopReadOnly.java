package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;
        System.out.println(yourFavNumber);
        
        long[] nums = {10,40, 20};

        for (int x = 0; x <3 ; x++) {

            long eachItem = nums[x];

            eachItem = 100;

          //  nums[x] = nums[x]*2;

        }

        //Never use for each loop to modify array items.

        System.out.println("After We Modify The Value");

        for (int x = 0; x < 3 ; x++) {

            System.out.println(nums[x]);
            
        }
    }
}
