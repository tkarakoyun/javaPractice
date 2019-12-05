package day11;

public class StringEquality {

    public static void main(String[] args) {

        String name = "Rabia";
        String name2 = new String ("Rabia");
        String name3 = "Rabia";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("Using == methods");
        System.out.println(name == name2);
        System.out.println(name == name3);

        // The correct way of comparing String to get consistent result is
        //using one of the String objext behavior/ method called
        //equal  method
        // str1.equal(str2)

        System.out.println("Using equal methods");

        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
    }
}
