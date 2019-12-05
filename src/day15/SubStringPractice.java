package day15;

import java.sql.SQLOutput;

public class SubStringPractice {

    public static void main(String[] args) {
        //getting the part of the String out of another String
        //
        //              0123456789012345
        String movie = "Lord of the Ring";
        //Sub string will return part of another string
        //Starting from beginning index until right before ending index
        String wordLord = movie.substring(0,4);
        System.out.println("wordLord = " + wordLord);

        String wordOf =movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);
        // I want to get the word (OF) from this movie.

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = "+ wordThe);

        String wordRing =movie.substring(12,16);
        System.out.println("wordRing = " + wordRing);

        //Get the second word till last word!
            //            0123456789012345
        //String movie = "Lord of the Ring";

        int startingPoint = movie.indexOf(" ")+1;
        int endingPoint = movie.length() ;

        System.out.println("Second word till last :" +
                movie.substring(startingPoint,endingPoint) );

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("Second word till last = " + secondWordTillLast);

        String secondToLast = movie.substring(5);
        System.out.println("secondToLast = " + secondToLast);


        //From one word to another
        String wordLordOf = movie.substring(0, 7);
        System.out.println("wordLordOf = " + wordLordOf);

        //reversing the sentence


        System.out.println(wordRing + " " + wordThe + " " + wordOf + " " + wordLord);





    }
}
