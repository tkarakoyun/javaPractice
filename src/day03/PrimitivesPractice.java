package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {

        byte letterCount = 26;

        System.out.println("The letter count is " + letterCount);

        short sheepcount = 300;

        System.out.println("The sheep count is " + sheepcount );

        int catcount = 20;

        System.out.println("The cat count is " +  catcount);

        long mileToSun = 100000000l;

        System.out.print("The mile to sun is " + mileToSun);

        long mileToMoon = 56789870l;

        System.out.println("Mile to moon is " + mileToMoon);

        // floating point

        float priceofBanana = 1.99f; // you must put F at the end to indicate this is float data type.

        System.out.println(" Price of a pound of Banana is " + priceofBanana );

        float priceofpatatoe = 2.49f;

        System.out.println("Price of a pound of Potatoe is" + priceofpatatoe);
        //larger floating point numbers

        double priceOfiPad1 = 355.99d;

        System.out.println("Price of iPad 1 is" + priceOfiPad1);

        double priceOfiPadpro = 11024.99d;

        System.out.println("Price of iPad Pro is " + priceOfiPadpro);

        //compiler automotically assumes it is double so it is not reqiured to have d

        double priceofMac = 2299.99d;

        System.out.println("Price of Macbook" + priceofMac);

        //if you have a whole number by itself, compiler automatically assume it's an int
        //if you have a fractional number by itself, compiler automatically assume it's a double


    }
}
