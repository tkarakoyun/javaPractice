package day17;


public class NameBackwards {

    public static void main(String[] args) {
        //  assuming you don't know the length of your name
        //  write a program to print your name in reverse order

        /**
         * Find out the location o your last character of your name
         * pick your last character of your name according to the location
         * then keep shifting the location to pick until first character
         *
         */
        //             012345678901234      index =    count-1
        String name = "Tugba Karakoyun";
        //             123456789012345      count = name.length()


        int x = name.length()-1;

        while (x>=0){
            System.out.println("index "+ x + " : " + name.charAt(x));
            --x;
        }

    }
}
