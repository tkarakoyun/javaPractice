package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18")
        );

//         * Task 1 : print only items name

        //Sample 1

        for(String eachProduct : productLst){

            String namePart = eachProduct.split(",")[0];

            System.out.println("eachProduct name = " + namePart);

            String price = eachProduct.split(",")[1];

            System.out.println("eachProduct price = " + price);

            //Sample 2

            for (int i = 0; i <productLst.size() ; i++) {

                String namePart1 = productLst.get(i).split(",")[0];
                System.out.println("Each Product name = " + namePart1);
            }

        }

//         * Task 2 : print all the prices more than 500

        for (String eachProduct : productLst){

            double price = Double.parseDouble(eachProduct.split(",")[1]);

            if(price>500){
                System.out.println("price = " + price);
            }
        }


//         * Task 3 : print average price

        double sum = 0;
        double average = 0;

        for (String eachProduct : productLst){

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price;

        }

        average = sum / productLst.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);


//         * Task 4 : print all the items name that has less than 20$ monthly payment.
        for (String eachProduct : productLst){

            String name = eachProduct.split(",")[0];

            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if(monthly<20){
                System.out.println(name + " " + monthly);
            }
        }

//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.

        for (String eachProduct : productLst) {

            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthly);
            }

        }

//         * Task 6 : Print all information about most expensive items.
        System.out.println("\n-----------Task 6 ----------with product details");
        // above solution will not work
        // because we need the location of max price not the price itself
        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxPriceIndex = 0;

        for (int i = 0; i < productLst.size(); i++) {

            // this is how we get each price part of items details
            String priceStr = productLst.get(i).split(",")[1];
            // this is how we turn the priceString into double data type
            double price = Double.parseDouble(priceStr);
            if (price > maxPrice) {
                maxPrice = price;
                maxPriceIndex = i;
            }
        }
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("expensive item detail = "
                + productLst.get(maxPriceIndex));

//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
        System.out.println("\n-----------Task 7 ----------with product details");



//         * Task 8 : Count the items prices more than average price.

//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.


//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :


        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        String item1 = "iPhone 6s, 449, 18.71";

        itemNames.add(item1.split(",")[0]);
        double pricePart = Double.parseDouble(item1.split(",")[1]);
        prices.add(pricePart);
        double monthlypart = Double.parseDouble(item1.split(",")[2]);
        monthlyPayments.add(monthlypart) ;

        System.out.println("itemNames = " + itemNames);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);
    }
}
