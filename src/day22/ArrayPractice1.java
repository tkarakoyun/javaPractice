package day22;

public class ArrayPractice1 {

    public static void main(String[] args) {

        double[] prices = new double[5];
        System.out.println(prices[0]);


        prices [0] = 2.46;
        prices [1] = 12.96;
        prices [2] = 992.1;
        prices [3] = 500;
        prices [4] = 65.123;


        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        char [] name = new char[5];

        name [0] = 'T';
        name [1] = 'U';
        name [2] = 'G';
        name [3] = 'B';
        name [4] = 'A';

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);

        System.out.println(name);

        boolean [] yesNo = new boolean[3];



        yesNo[0] = 6>3;
        yesNo[1] = 6<1;
        yesNo[2] = 10==10;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

    }
}
