package day39;

public class Car {

    int year;
    String model;
    String make;
    String color;

    public void goForward(){
        System.out.println(make + " Going forward");
    }

    public void printCarAge(){
        System.out.println("car age : " + (2020-year));
    }


}
