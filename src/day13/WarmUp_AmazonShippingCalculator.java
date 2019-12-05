package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        /**
         * amazon has 2 types of users prime and regular
         * prime member get free shipping
         * regular member user get free shipping only if their purchase is more than 25$
         * otherwise they get 5$ shipping fee
         */

        String memberType = "member" ;

        double amount = 45.99d;

        int shippingFee = 0;

        //first check member type

        if(memberType.equalsIgnoreCase("PRIME MEMBER")){
            System.out.println("you get 1 day free shipping");
            System.out.println("your final price is " + amount);
        }else if(! memberType.equalsIgnoreCase("PRIME MEMBER") && amount>25) {
            System.out.println("Not a prime member but your order is more than 25");
            System.out.println("You got free shipping");
        }else{
            System.out.println("Do you want to sign up for prime membership?");

            shippingFee = 5;
            amount = amount +shippingFee ; // or in a shorter way we can say amount += shippingfee

            System.out.println("Your final amount is " + amount);
        }


    }
}
