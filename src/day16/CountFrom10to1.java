package day16;

public class CountFrom10to1 {

    public static void main(String[] args) {

        int count = 10;

        // below is two different ways.
        //both will give out the same result.
///// 1

        while (count >= 1) {
            System.out.println(count);
            --count;

        }

 //     2

        while (count !=0 ) {
            System.out.println(count);
            --count ;
        }
        System.out.println("final value of count " + count);
    }
}
