package day44;

public class Train extends Vehicle {

    int wagonCount ;





    public static void main(String[] args) {

        Train t1 = new Train();
        t1.makeChoChoSound();

//      These attribiutes we got it from Vehicle
        t1.make = "Thomas";
        t1.year = 1999;
        // calling the method we got from Vehicle.
        System.out.println(t1.getYear());
        t1.start();
        t1.goForward();


    }

    public void makeChoChoSound() {
        System.out.println("Choo Chooo");
    }

}
