package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

        int [] nums = {13, 31, 8, 5, 21, 2};

        System.out.println("nums = "+ Arrays.toString(nums)  );

        //storing the size of an array into a variable
        int numsItemCount = nums.length;

        int [] numsCopy = new int [numsItemCount];

        numsCopy[0] = nums[0];//13
        numsCopy[1] = nums[1];
        numsCopy[2] = nums[2];
        numsCopy[3] = nums[3];
        numsCopy[4] = nums[4];
        numsCopy[5] = nums[5];

        for (int i = 0; i < numsItemCount ; i++) {
            numsCopy[i] = nums[i];

        }
        System.out.println("numsCopy = "+ Arrays.toString(numsCopy)  );

        Arrays.sort(numsCopy);
        System.out.println("numsCopy = "+ Arrays.toString(numsCopy)  );

        if(Arrays.equals(nums, numsCopy)){
            System.out.println("This array is already sorted");
        }else{
            System.out.println("This array is not sorted");
        }
    }
}
