package weekNine.abstractClasses;

public abstract class Account {
    protected String accountHolder;
    protected String accountNumber;
    protected double balance;

    public Account(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract String getAccountDetails();
}
