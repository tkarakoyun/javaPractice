package day11;

public class LogicalOperations {

    public static void main(String[] args) {

        System.out.println("Truth Table");

        System.out.println(true && true) ;
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);



        System.out.println("Result of true || true is " + (true || true)  );
        System.out.println("Result of false || true is " + (false || true)  );
        System.out.println("Result of true || false is " + (true || false)  );
        System.out.println("Result of false || false is " + (false || false)  );


        int  num = 55;

        System.out.println(num>100 && num<10);

        System.out.println(num>10 || num<100);

        System.out.println(num ==50 || num ==51 || num==55);

        /**
         * x is more than 50
         * and x is not equal to 52
         * or x equal to 57
         */
        System.out.println(num>50 && num !=52 || num==57);

        System.out.println(false ||  true && true);



    }
}
