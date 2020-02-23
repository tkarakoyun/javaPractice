package day34;

public class PracticeMethodWithNumbers {
    public static void main(String[] args) {

        int result1 = build3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);

        int result2 = build3DigitNumber(6, 14, 0);
        System.out.println("result2 = " + result2);

        System.out.println(build3DigitNumber(16, 14, 90));

        System.out.println("result1+result2 = "+ (result1 + result2) );
        System.out.println(result1 + result2+ " is result of result1+result2 ");

        //add the result of first 2 method call.


    }

    public static int build3DigitNumber(int digit1, int digit2, int digit3){
        if(digit1<0 || digit1>9){
            digit1 = 0;
        }
        if (digit2<0 || digit2>9){
            digit2 = 0;
        }
        if (digit3<0 || digit3>9){
            digit3 = 0;
        }
        // we want to make sure every digit is already valid before doing below
        // if you come to this point , it should be already valid
        int number = digit1 * 100 + digit2 * 10 + digit3;
        return number;
    }
}
