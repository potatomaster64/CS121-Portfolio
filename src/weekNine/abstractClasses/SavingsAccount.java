package weekNine.abstractClasses;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountHolder, String accountNumber, double balance, double interestRate){
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountDetails(){
        return "Savings Account - Holder: " + accountHolder + ", Account Number: " + accountNumber + ", Balance: " + balance + ", Interest Rate: " + interestRate;
    }
}
