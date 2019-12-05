package day13;

public class shopOnline {

    public static void main(String[] args) {

        /**
         * create boolean store the result of youWantToShop
         * if yes, do you want to go to Store or do you wanna shop online
         *
         * if user do not wanna shop at all, print good job stay home coding!!
         */

        boolean youWantToShop = true;
        String preference = "Store" ;

        //if (youWantToShop)

        if ( youWantToShop==true){

            if (preference.equals("Store")) {
                System.out.println("Going to store for shopping");
            }else {
                System.out.println("Going to online for shopping");
            }

        }else{
            System.out.println("good job stay home coding");
        }



    }
}
