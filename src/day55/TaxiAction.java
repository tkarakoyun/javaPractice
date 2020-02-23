package day55;

public class TaxiAction {

    public static void main(String[] args) {

        Engine en = new Engine("V6", 400);

        Driver d= new Driver("Pedro", 12345);
        Taxi t1 = new Taxi(101, en, d);

        System.out.println("t1 = " + t1.toString());

        Taxi t2 = new Taxi ( 102,
                            new Engine("V8", 600),
                            new Driver("John", 12345) );
        System.out.println("t2 = " + t2);

        int x = t2.plateNumber;
        Driver y = t2.dr;
        Engine z = t2.eng;


        System.out.println("Driver name " + y.name);
        System.out.println("Driver name " + t2.dr.name);

        System.out.println("Engine horsepower is " + t2.eng.horsePower);

    }
}
