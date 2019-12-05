package day20;

public class ReversingAString {

    public static void main(String[] args) {

        String name = "Tugba Karakoyun";
        String reversedName = "";

        int lastCharIndex = name.length()-1;

        for (int i =lastCharIndex; i >=0 ; i--) {

            System.out.print(i + "index : ");

            char currentChar = name.charAt( i );
            System.out.println(name.charAt(i));

            reversedName = reversedName + currentChar;

        }

        System.out.println("reversedName = " + reversedName);


            /**
             *
             * THIS is the long way. Up code will still give the same answer.
             *
             *
             *         System.out.print(name.charAt(14));
             *         System.out.print(name.charAt(13));
             *         System.out.print(name.charAt(12));
             *         System.out.print(name.charAt(11));
             *         System.out.print(name.charAt(10));
             *         System.out.print(name.charAt(9));
             *         System.out.print(name.charAt(8));
             *         System.out.print(name.charAt(7));
             *         System.out.print(name.charAt(6));
             *         System.out.print(name.charAt(5));
             *         System.out.print(name.charAt(4));
             *         System.out.print(name.charAt(3));
             *         System.out.print(name.charAt(2));
             *         System.out.print(name.charAt(1));
             *         System.out.print(name.charAt(0));
             */


    }
}
