package day48;

// this is how we create an interface
//interface is abstract type just like abstract class
// no object can be created from it
//it provide guideline for implementing classes
//its's like signing a contract.

public interface Flyable {

    //and interface can only have public static final field
    public static final boolean Have_Wing = true;

    //can we have constructor
    public abstract void fly();



}
