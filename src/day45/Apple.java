package day45;

public class Apple extends Fruit {


    public Apple(){
        // I want to reuse the functionality
        //Already written in super class constructor
        // We can use super () or super(argument here)
        // to call super class's constructor.
        //super();

        //how to call constructor with 1 argument

        super ("test");

    }

    public static void main(String[] args){

        Apple a1 = new Apple();


    }

}
