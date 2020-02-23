package day21;

public class OddNumberPrintRepetition {

    public static void main(String[] args) {

        //count only 1 to 10 -->print only odd number
        //repeat this 4 times.

        for (int x = 1; x <= 4; x++) { //repeat
            System.out.println("Iteration: " + x);
            for (int i = 1; i <= 10; i++) { //
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }

            }
            System.out.println();
        }
    }
}
