package day07;

public class PreIncrementAndPostIncrement {

    public static void main(String[] args) {

        int apple = 8 ; //8

        apple ++;       //9

        System.out.println( apple ); //system will print out 9


        System.out.println( apple++ );  // ++ at the end is called post increment.
        // It will increase the value, however it will hold the variable until the next variable.

        System.out.println(apple);


        int score = 50;

        System.out.println( ++score); // 51

        System.out.println(score++); // 51 is ready to show 52 on the next time

        System.out.println(score); // 52

        System.out.println( --score); //51

        System.out.println(score--); // still 51, however ready to be 50 on the next line.

        System.out.println(score); // 50 now.
    }
}
