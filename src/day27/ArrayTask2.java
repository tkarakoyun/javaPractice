package day27;

public class ArrayTask2 {

    public static void main(String[] args) {

        int[] nums = {100, 1000, 9999, 8888, 1231, 2345};
        int max = nums [0];

        for (int i = 0; i < nums.length ; i++) {
            if(max< nums [i]){
                max = nums[i];

            }
        }

        System.out.println("First max number : " + max);


    }
}
