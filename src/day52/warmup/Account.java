package day52.warmup;


public class Account implements Transferable {

    protected String name;
    private int balance;

    public Account(String name, int balance){
        this.name =name;
        this.balance = balance;
    }



    @Override
    public void transferAll(Account otherAccount) {


        otherAccount.balance+=this.balance;
        this.balance=0;
        //otherAccount.deposit(this.balance);
        //this.withdraw(this.balance);
    }


    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance+= amount;
    }
    public void withdraw(int amount){
        balance-= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean isPalindrome(){

        String nameCopy = this.name.toLowerCase().replace(" ", "");
        String reverseResult="";
        for (int x = nameCopy.length()-1; x >=0; x--) {
            reverseResult += nameCopy.charAt(x);
        }

        return nameCopy.equals(reverseResult);
    }

}
