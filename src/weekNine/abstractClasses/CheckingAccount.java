package weekNine.abstractClasses;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountHolder, String accountNumber, double balance, double overdraftLimit){
        super(accountHolder, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getAccountDetails(){
        return "Checking Account - Holder: " + accountHolder + ", Account Number: " + accountNumber +  ", Balance: " + balance + ", Overdraft Limit: " + overdraftLimit;
    }
}
