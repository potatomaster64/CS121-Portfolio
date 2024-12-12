package weekNine.activitySeventeen;

public class BankAccount {
    protected String accountHolderName, accountType;
    protected double balance;

    public BankAccount(String accountHolderName, String accountType, double balance){
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }
    @Override
    public String toString(){
        return "Account Holder: " + accountHolderName + "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
}
