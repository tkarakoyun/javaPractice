package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

        //

        char myChar = 'a';
        System.out.println(myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);

        System.out.println('a' > 'b');
        System.out.println('z' > 'b');

        for (char iChar = 'a'; iChar<='z' ; iChar++){
            System.out.print(iChar + " ");

        }
        System.out.println();

        for (char kChar = 'z' ; kChar >= 'a'; kChar --){
            System.out.print(kChar + " ");
        }

        /**homework
         * create an interactive program to ask user
         * starting character and ending character
         * then print everything in between
         * it could be starting character is after ending character
         * for example user can enter Z A , or A K
         * Can we ask user character? NO!!
         * Ask user for string and pick first character by charAt(0)
         */

    }
}
