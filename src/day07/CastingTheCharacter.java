package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';

        System.out.println(letterInNumber2);

        // saving the number as char
        //so we can get the character representation
        //of the number in ascii table

        char myFirstchar = (char) 100;
        System.out.println(myFirstchar);

        //find out your numbe of each charactere in your first name
        char letterA = 'a';

        //adding a character to a int number will result int

        // (int) letterA +1
        System.out.println(letterA +1);

        System.out.println(" " + letterA +1);
    }
}
