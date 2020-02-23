package day32;

public class StringActions {

    public static void main(String[] args) {

        //reversePrintMyOwnName();

        printStringWithDashInBetween("hasan");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Tokun");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Gulbara");

    }

    public static void reversePrintMyOwnName(){
        String name = "Akbar";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }

        System.out.println();
    }

    public static void printStringWithDashInBetween(String name) {
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));

            if(i != name.length()-1) {
                System.out.print("-");
            }
        }
    }
}
