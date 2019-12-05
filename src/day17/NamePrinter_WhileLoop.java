package day17;

public class NamePrinter_WhileLoop {

    public static void main(String[] args) {

        String name = "call 1-800-Alexander";

        int x = 0;

        while(x < name.length()){   // (x<= name.length()-1) <- this is the same thing.

            System.out.print("index " + x + " : ");
            System.out.println(name.charAt(x));

            ++x;

        }

       //assuming you don't know the length of your name.
        //write a program to print your name in reverse order.
    }
}
