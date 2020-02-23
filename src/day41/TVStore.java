package day41;

public class TVStore {

    public static void main(String[] args) {
        Tv t1 = new Tv();
        t1.name = "Sony";
        System.out.println("t1 = " + t1);
        t1.turnOn();
        t1.setCurrentChannel(12);
        t1.setCurrentChannel(121);


        System.out.println(t1.getCurrentChannel() );
        t1.turnOff();

        System.out.println("t1 = " + t1.toString());
    }
}
