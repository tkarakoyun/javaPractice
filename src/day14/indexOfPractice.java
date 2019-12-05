package day14;

public class indexOfPractice {

    public static void main(String[] args) {

        //indexof -->>
        //find out index of another String inside This string
        String name = "Game of Java";  //length is 12, last char index is 11
        //find out the location of Jav
        //find out the location of letter 0
        //find out the location of first space
        System.out.println("find out the location of Java");
        System.out.println( name.indexOf("Java")  );

        System.out.println("find out the location of o");
        System.out.println(  name.indexOf("o") );
        //if the location is not found, we get minus number
        System.out.println("find out the location of uppercase o");
        System.out.println(  name.indexOf("O") );

        System.out.println("find out the location of space");
        System.out.println(  name.indexOf(" ") );

        System.out.println("find out the location of A");
        System.out.println(  name.indexOf("a") );
    }
}
