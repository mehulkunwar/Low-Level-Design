package Proxy;

public class BankAccountProxy implements BankAccount{
    String roleType;
    BankAccountImpl bankAccount;

    public BankAccountProxy(String roleType, BankAccountImpl bankAccount) {
        this.roleType = roleType;
        this.bankAccount = bankAccount;
    }

    @Override
    public int bankAccountNumber() {
        if(roleType.equals("Account_Holder")) return bankAccount.bankAccountNumber();

        throw new IllegalArgumentException("Access denied");
    }

    @Override
    public int balance() {
        if(roleType.equals("Account_Holder")) return bankAccount.balance();
        throw new IllegalArgumentException("Access denied");
    }

    @Override
    public void FreezeAccount() {
        if(roleType.equals("Account_Holder")) bankAccount.FreezeAccount();

        throw new IllegalArgumentException("Access denied");
    }
}
