package day26;

public class ArrayTask_NumberTest_Logic1 {

    public static void main(String[] args) {

        int[] scores = {156, 101, 76, 187, 87, 110 };

        int size = scores.length;
        System.out.println("size = " + size);

        String finalResult = "";

        int cntMoreThan100 = 0;

        for(int eachNum : scores){
            if (eachNum>100){
                ++ cntMoreThan100;
            }
        }
        System.out.println("cntMoreThan100 = " + cntMoreThan100);

        if (cntMoreThan100 == scores.length){
            finalResult="Yes";
        }else{
            finalResult="No";
        }
        System.out.println("finalResult = " + finalResult);
    }
}
