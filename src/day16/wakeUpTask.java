package day16;

public class wakeUpTask {
    public static void main(String[] args) {

        String word1 = "Bell";
        String word2 = "";

        // word2 = " "+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        // word2 = wor2 +word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
         word2 += " "+ word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);

        System.out.println("word2 = " + word2);

        String msg = "hello";

      //  msg = msg +"world";
         msg += "world";  // this is the short way
        System.out.println("msg = " + msg);


    }
}
