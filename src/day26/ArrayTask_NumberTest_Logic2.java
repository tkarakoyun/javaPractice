package day26;

public class ArrayTask_NumberTest_Logic2 {

    public static void main(String[] args) {

        int[] scores = {156, 101, 76, 187, 87, 110 };

        int size = scores.length;
        System.out.println("size = " + size);


        String finalResult = "Yes";

        for (int eachNum : scores){
            if (eachNum<=100){
                finalResult = "No";
                break;

            }
        }

        System.out.println("finalResult = " + finalResult);
    }
}
