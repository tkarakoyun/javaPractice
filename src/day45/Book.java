package day45;

public class Book extends Object{


    public static void main(String[] args) {

        Book b1 = new Book();

        System.out.println("b1 = " + b1.toString());

    }

    @Override
    public String toString() {
        return "my own version of toString";

    }
}
