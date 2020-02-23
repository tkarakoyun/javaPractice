package day47;

public class GasCar extends Car {

    int gasLevel;


    @Override
    public void start() {
        System.out.println("Starting Gas Car");
    }

    @Override
    public void goForward() {
        System.out.println("Going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Turning "+ direction);
    }
}
