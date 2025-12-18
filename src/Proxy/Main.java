package Proxy;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccountProxy("Account_Holder",new BankAccountImpl());
        System.out.println("Account Balance is " +bankAccount.balance());
    }
}
