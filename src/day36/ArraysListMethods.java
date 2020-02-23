package day36;

import day16.CountToNine;

import java.util.ArrayList;

public class ArraysListMethods {

    public static void main(String[] args) {

        ArrayList<Long> lst = new ArrayList<>();

        // C.R.U.D.

        //Create, Read, Update, Delete

        //add item, insert an item, read item, update, the item, remove the item.

        lst.add( 12L );
        lst.add( 100L );
        lst.add( 150L );
        lst.add( 200L );

        System.out.println("lst = " + lst);
        // counting items inside ArrayList
        System.out.println("Counting items using lst.size() = "+ lst.size() ) ;
        //Getting items inside ArrayList object
        System.out.println("First item is : lst.get(0) = "+ lst.get(0));

        System.out.println("Sum of the array list items = " +(lst.get(0) + lst.get(1)+ lst.get(2)+ lst.get(3)) );

        // below will print out the whole thing with list of each
        for (int x = 0; x <lst.size() ; x++) {
            System.out.println(" item " + lst.get(x));
        }

        long sum = 0;

        for (int x = 0; x < lst.size(); x++) {

            sum = sum + lst.get(x);

        }
        System.out.println("sum = " + sum);

        // TASK : GET THE MAX OF ABOVE ARRAYLIST ITEMS

        long max = lst.get(0);
        for (int x = 0; x < lst.size(); x++) {

            if (lst.get(x) > max) {
                max = lst.get(x);
            }

        }
        System.out.println("max = " + max);

    }
    }

