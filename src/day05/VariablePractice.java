package day05;

public class VariablePractice {

    public static void main(String[] args) {

        //whole number      : byte, short, int, long
        //fractional number : float, double
        //logical           : boolean (true, false)
        //character         : char (single character in single quote)

        // usually by default for whole numbers: just use int
        // usually by default for fractional numbers: just use double

        //Is String part of Primitive types ?: NO!!!
        //String is sequence of character

        int birthyear = 1991;
        int currentyear = 2019;

        System.out.println("I was born in " + birthyear + ", and I am "
                + (currentyear - birthyear) + " years old.");

        //////

        int birth = 1975;
        int current = 2019;
        int age = current-birth;

        System.out.println("I was born in " + birth + ", and I am "
                + age + " years old.");

        int speedlimit = 40;
        int currentspeed = 50;
        int overTheLimit = currentspeed - speedlimit;

        System.out.println( overTheLimit);


    }
}
