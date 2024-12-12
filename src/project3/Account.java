package project3;

public class Account {
    private static int numberOfAccounts = 1000;
    private double balance;
    private int accountNumber;

    public Account(double initialDeposit) {
        this.balance = initialDeposit;
        this.accountNumber = ++numberOfAccounts;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Updated Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal amount exceeds balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Updated Balance: " + balance);
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
