package day31;

public class MethodIntro {

    public static void main(String[] args) {

       // two ways to call static methods
        //ClassName.MethodName(external data if needed)
        //if you are in same class.
        //you can directly call them.
        //methodName(external data if needed)
        System.out.println("Begin");
        sayHello();
        System.out.println("--------");
        sayHello();
        System.out.println("The end");

    }

    public static void sayHello(){

        System.out.println("Hello World");
        System.out.println("My Name is Juma");
        System.out.println("I love Java");

    }
}
