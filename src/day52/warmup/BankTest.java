package day52.warmup;

public class BankTest {

    public static void main(String[] args) {


        Account a1 = new Account("Tugba", 10000);
        Account a2 = new Account("Tayfun", 7000);

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        a1.transferAll(a2);
        System.out.println("a1 after = " + a1);
        System.out.println("a2 after = " + a2);


        a2.transferAll(a1);
        System.out.println("a1 after 2nd transfer = " + a1);
        System.out.println("a2 after 2nd transfer = " + a2);
    }


}
