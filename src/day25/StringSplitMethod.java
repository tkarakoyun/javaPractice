package day25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {


        String  sentence = "I love Java";

        String[] allWords = sentence.split(" ");

        System.out.println("allwords = " + Arrays.toString(allWords));
        System.out.println("HOw many words do I have?" + allWords.length);
        System.out.println("Last word in this sentence is : " + allWords[  allWords.length-1  ]  );


        String daughter = "Defne Vera Koca";

        String[] kelimeler = daughter.split(" ");

        System.out.println("Kelimeler " + Arrays.toString(kelimeler));

        System.out.println("How many words do I have?" + kelimeler.length);

        System.out.println("Last word in this sentence is : " + kelimeler [kelimeler.length-1]);


        String sentence2 = "Everthing is Awesome!!!";

        String[] splitBy_e_Arr = sentence2.split("is");

        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr));

        for (String eachPieces : splitBy_e_Arr){
            System.out.println("eachPieces = " + eachPieces+ ">");
        }


    }
}
