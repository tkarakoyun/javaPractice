package day20;

public class PalindromeTes {

    public static void main(String[] args) {

        /**
         * If you reverse a String if it does not change. 
         * it means it is called palindrome.
         * level, kayak, elle, madam, aziza,
         */
        
        String name = "kayak";
        System.out.println("name = " + name);

        String reverseName = "";

        for (int i =name.length()-1 ; i >=0 ; i--) {
            reverseName = reverseName+ name.charAt(i);
            
            
        }
        System.out.println("reverseName = " + reverseName);

        if (name.equalsIgnoreCase(reverseName)){
            System.out.println("Palindrome Test has passed");
        }else{
            System.out.println("Palindrome Test has failed");
        }
    }
}
