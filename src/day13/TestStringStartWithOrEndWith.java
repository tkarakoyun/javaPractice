package day13;

public class TestStringStartWithOrEndWith {
    public static void main(String[] args) {

        String name = "Tugba";

        //check if a String start with another string

        System.out.println("Name starts with");

        System.out.println(name.startsWith("T")); // case sensitive - if you use 't' it will be false.

        System.out.println(name.startsWith("D"));

        //check if a String end with another string

        System.out.println("Name ends with");

        System.out.println(name.endsWith("a"));

        System.out.println(name.endsWith("b"));





    }
}
