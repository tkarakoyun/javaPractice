package day21;

public class SearchSomethingInString {
    public static void main(String[] args) {

        String myName ="Tugba Karakoyun";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);


        System.out.println("---2 chars ---");
        //for (int x = 0; x< charCount-2 ; x++) {
        for (int x = 0; x <= lastCharIndex-1 ; x++) {
            String currentChar = myName.substring(x, x + 2 ) ;

            if(currentChar.equalsIgnoreCase("a")) {

                System.out.println("The index of a is " + x);

            }

        }

    }
}
