package day46;

public class SavingAccount extends BankAccount {
    
    double interestRate ;


    /**
     * 
     * @param accountHolder
     * @param accountNum
     * @param balance
     *                   
     */
    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate){
        
        super(accountHolder,accountNum,balance);
        this.interestRate = interestRate;
        
        
    }

    public static void main(String[] args) {
        
        SavingAccount s1 = new SavingAccount("Tugba", 123456, 50000, 4.2);
        System.out.println("s1= " + s1.toString());

        s1.withdraw(10000);

        System.out.println("s1 = " + s1);

        s1.deposit(5000);

        System.out.println("s1 = " + s1);
    }
    @Override
    public void withdraw(int amount){
        balance = balance-amount-30;

    }

    @Override
    public void deposit ( int amount){
        balance = balance + amount;
    }



    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
