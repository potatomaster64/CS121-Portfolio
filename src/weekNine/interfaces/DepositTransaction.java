package weekNine.interfaces;

public class DepositTransaction implements Transactionable {
    private double balance;

    public DepositTransaction(double initialBalance){
        this.balance = initialBalance;
    }

    @Override
    public String processTransaction(double amount){
        balance += amount;

        return "Deposited " + amount + ". New Balance: " + balance;
    }
}
