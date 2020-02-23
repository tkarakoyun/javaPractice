package day47;


//I don'tneed to create car object using this class.
//I only want this class to be super class to provide.
//Reusable fields and methods for sub classes.

public abstract class Car {

    int year;
    String brand;

    // this is a type of message that does not have a body. does not need {}
    //abstract class can have abstract method
    // it has abstract keyword
    // and it does not have body, does not have{}
    // it ends with ;
    // It's meant to be overridden to provide body in sub class.



    public abstract void start() ;

    public abstract void goForward();

    public abstract void goBackward();

    public abstract void turn(String direction);




}
