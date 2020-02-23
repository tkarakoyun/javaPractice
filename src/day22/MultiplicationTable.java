package day22;

public class MultiplicationTable {

    public static void main(String[] args) {



        //System.out.println( " 1 x 1 = " + 1*1);
        //System.out.println( " 1 x 2 = " + 1*2);
        //System.out.println( " 1 x 3 = " + 1*3);

        System.out.println("x1 table");
        for (int base = 1; base <= 12 ; base++) {

            System.out.println(" 1 x " + base + " = " + 1 * base);


        }
        System.out.println("x2 table");
        for (int base = 1; base <= 12 ; base++) {

            System.out.println(" 2 x " + base + " = " + 2 * base);

        }

        System.out.println("x3 table");
        for (int base = 1; base <= 12 ; base++) {

            System.out.println(" 3 x " + base + " = " + 3 * base);
        }

        for (int timesTable = 1; timesTable <=10 ; timesTable++) {

            System.out.println("Multiplication Table of " + timesTable);

            for (int base = 1; base <=12 ; base++) {

                System.out.println(timesTable+ " x " + base +  " = " + timesTable * base);

            }
        }

    }
}
