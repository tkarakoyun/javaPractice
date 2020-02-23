package day48;

//we build a relationship with class and interface
//using implements keywords ( compared to extends keyword for class to class.


public class Plane implements Flyable {

    String name;
    int capacity;
    int speed;

    @Override
    public void fly() {
        System.out.println("Plane is Flying");
    }



}
