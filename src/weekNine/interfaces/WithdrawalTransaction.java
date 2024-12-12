package weekNine.interfaces;

public class WithdrawalTransaction implements Transactionable{
    private double balance;

    public WithdrawalTransaction(double initialBalance){
        this.balance = initialBalance;
    }

    @Override
    public String processTransaction(double amount){
        if (balance >= amount) {
            balance -= amount;
            return "Withdrew " + amount + ". New Balance: " + balance;
        }else {
            return "Insufficient balance to withdraw " + amount + ". Current Balance: " + balance;
        }
    }

}
