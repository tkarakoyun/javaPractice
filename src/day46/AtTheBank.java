package day46;

public class AtTheBank {

    public static void main(String[] args) {

        CheckingAccount acc1 = new CheckingAccount("Tugba", 987654, 10000 );
        
        acc1 .deposit(100);
        System.out.println("acc1 = " + acc1);
        acc1.deposit(5000);
        System.out.println("acc1 = " + acc1);
        acc1.withdraw(5300);
        System.out.println("acc1 = " + acc1);
        
    }
}
