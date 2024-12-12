package weekNine.activitySeventeen;

public class PremiumAccount extends BankAccount{
private double creditLimit;
    public PremiumAccount(String accountHolderName, String accountType, double balance, double creditLimit){
        super(accountHolderName, accountType, balance);
        this.creditLimit = creditLimit;
    }
    @Override
    public String toString(){
        return super.toString() + "\nCredit Limit: " + creditLimit;
    }
}
