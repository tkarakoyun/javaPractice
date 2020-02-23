package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

       // int[] ages = new int[]{3,5, 11, 33,57, 18}; // this is the long way.
        int[] ages = {3,5, 11, 33,57, 18};


        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);

        System.out.println("ages = " + ages);

        for (int x = 0; x < itemCount ; x++) {
            System.out.println(ages[x]);
        }

        int[] areaCodes = {703, 300, 954, 665};
        // if you do it this way: it Must happen in one line together.


        for (int x = 0; x < areaCodes.length ; x++) {
            System.out.print(areaCodes[x]+ " ");

        }

    }
}
