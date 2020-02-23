package day26;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        int[] scores = {156, 101,76, 187, 87, 110};

        String finalResult = "";// if all numbers are more than 100 then make it yes. if not make it no.

        int cntLessThan100 = 0;

        for (int eachNum : scores){

            if(eachNum>100){
                System.out.println("eachNum : " + eachNum);
                cntLessThan100++;
            }
        }

        System.out.println("count = " + cntLessThan100);
        if (cntLessThan100>0){
            finalResult= "Yes";
        }else{
            finalResult = "No";
        }
        System.out.println("finalResult = " + finalResult);



    }
}
