package day36;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        ArrayList<Long> lst = new ArrayList<>();

        //Create, Read, Update, Delete

        //add item, insert an item, read item, update, the item, remove the item.

        lst.add( 12L );
        lst.add( 100L );
        lst.add( 150L );
        lst.add( 200L );

        System.out.println("lst = " + lst);
        // counting items inside ArrayList

        lst.add(2,125L);
        System.out.println("lst = " + lst);

        System.out.println("lst.get(3) = " + lst.get(3) );

        lst.set(3,195L);
        System.out.println("New Value for lst.get(3) = \n\t "+ lst.get(3));

        lst.remove(100L);
        System.out.println("lst after removing 100 = \n\t" + lst);
        lst.remove(2);
        System.out.println("lst after removing item at index 2 = \n\t" + lst);
        // Location for certain item
        System.out.println("Location of 100L = " + lst.indexOf(100L));

        System.out.println("Location of 23L = " + lst.indexOf(23L));

        // Check whether a list is empty or not
        System.out.println("\n lst.size()>0 = " + (lst.size()>0));
        System.out.println("lst.isEmpty() = " +lst.isEmpty());

        //how do I delete everything inside my ArrayList
        lst.clear();
        System.out.println("check after clearing lst.isEmpty() = " + lst.isEmpty());

        //check whether we have certain item or not
        System.out.println("\nlst.contains(100L) = " + lst.contains(100L) );
        System.out.println("lst.contains(10L) = " + lst.contains(10L));

        //how do I check whether a list contains an item without using contains.
        //use indexOf method, if it return -1, it means we don't
        System.out.println("DO I have 10L " + (lst.indexOf(10L)!=-1) );

    }
}

