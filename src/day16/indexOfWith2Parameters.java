package day16;

public class indexOfWith2Parameters {
    public static void main(String[] args) {
        //             012345678901234567890123456789012
        String name = "I love Java I love Java Java Java ";

        System.out.println("Starting from 0 " + name.indexOf("Java"));
        System.out.println(name.indexOf("Java" , 8 ));
        System.out.println(name.indexOf("Java" , 20 ));
        System.out.println(name.indexOf("Java" , 25 ));

        int firstJavaLocation = name.indexOf("Java");
        int startingPointToSearchSecondJava= firstJavaLocation+1;
        int secondJavaLocation = name.indexOf("Java",startingPointToSearchSecondJava );

        System.out.println("second Java Location = " + secondJavaLocation);

        // I do not know how many word in this sentence . I only know there 3+ words
        // and there is only one space in between words
        // I just want to know what is the second word
        // the word in between first space and second space is second word
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpaceLocation = name.indexOf(" ", firstSpaceLocation + 1);

        System.out.println("Second word in this sentence is "
                + name.substring(firstSpaceLocation + 1, secondSpaceLocation));
    }
}
