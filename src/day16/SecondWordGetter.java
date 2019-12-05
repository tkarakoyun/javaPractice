package day16;

public class SecondWordGetter {

    public static void main(String[] args) {

        // give a sentence with 3 words
        //Get the second word
        //step
        //second word is between first space and last space

        //getting location of space remind me of indexOf
        //getting string inside another string by beginning and ending index
        //remind me of substring
        //                 0123456789012345
        String sentence = "I Love Java";
        String secondWord ;
        int firstSpaceIndex = sentence.indexOf(" ");                    // this will find the first space
        System.out.println("firstSpaceIndex = "+ firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");            // This will find the last space
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println( sentence.substring(2, 6) );               //This will print out the word that is under those numbers
        secondWord = sentence.substring( firstSpaceIndex+1 , lastSpaceIndex   );
        System.out.println("secondWord = " + secondWord);

        /**
         * How to get first word;
         * in plain english:first word is starting from first character till first space
         */

        String firstWord = sentence.substring(0, firstSpaceIndex);
        //how do we print out a variable with value using shortcut : soutv then lab
        System.out.println("firstWord = " + firstWord);

        /**
         * how to get last word from any sentence
         * last word in a sentence means from last space
         */

        String lastWord = sentence.substring(lastSpaceIndex);
        System.out.println("lastWord = " + lastWord);
    }

}
