package Proxy;

public class BankAccountImpl implements BankAccount{
    @Override
    public int bankAccountNumber() {
        return 1111;
    }

    @Override
    public int balance() {
        return 1111;
    }

    @Override
    public void FreezeAccount() {
        System.out.println("Account Froze");
    }
}
