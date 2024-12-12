package weekNine;
import javax.swing.JOptionPane;



public class BankAccount {
    private String firstName;
    private String lastName;
    private String accountType;
    private int age;
    private double balance;
    private String customerId;
    private String accountConfirmationNumber;

    public BankAccount(String firstName, String lastName, String accountType, int age, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountType = accountType;
        this.age = age;
        this.balance = initialDeposit;
        this.accountConfirmationNumber = generateConfirmationNumber();
    }

    public BankAccount(String customerId) {
        this.customerId = customerId;
        this.accountConfirmationNumber = generateConfirmationNumber();
    }

    private String generateConfirmationNumber() {
        return "ACCT-" + (int) (Math.random() * 1000000);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            JOptionPane.showMessageDialog(null, "Deposit successful! New balance: $" + balance);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            JOptionPane.showMessageDialog(null, "Withdrawal successful! New balance: $" + balance);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid withdrawal amount.");
        }
    }

    public void displayAccountInfo() {
        String info = "Account Confirmation Number: " + accountConfirmationNumber +
                "\nAccount Type: " + (accountType != null ? accountType : "Premium") +
                "\nCustomer ID: " + (customerId != null ? customerId : "N/A") +
                "\nFirst Name: " + (firstName != null ? firstName : "N/A") +
                "\nLast Name: " + (lastName != null ? lastName : "N/A") +
                "\nAge: " + (age != 0 ? age : "N/A") +
                "\nBalance: $" + balance;
        JOptionPane.showMessageDialog(null, info);
    }

    public static void main(String[] args) {
        String customerType = JOptionPane.showInputDialog("Are you a premium customer? (yes/no)");
        BankAccount account;

        if ("yes".equalsIgnoreCase(customerType)) {
            String customerId = JOptionPane.showInputDialog("Enter Customer ID:");
            account = new BankAccount(customerId);
        } else {
            String firstName = JOptionPane.showInputDialog("Enter First Name:");
            String lastName = JOptionPane.showInputDialog("Enter Last Name:");
            String accountType = JOptionPane.showInputDialog("Enter Account Type (Checking/Savings):");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age:"));
            double initialDeposit = Double.parseDouble(JOptionPane.showInputDialog("Enter Initial Deposit:"));
            account = new BankAccount(firstName, lastName, accountType, age, initialDeposit);
        }

        account.displayAccountInfo();

        String action = JOptionPane.showInputDialog("Would you like to deposit, withdraw, or exit?");
        while (!"exit".equalsIgnoreCase(action)) {
            if ("deposit".equalsIgnoreCase(action)) {
                double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter deposit amount:"));
                account.deposit(amount);
            } else if ("withdraw".equalsIgnoreCase(action)) {
                double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter withdrawal amount:"));
                account.withdraw(amount);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid action.");
            }
            action = JOptionPane.showInputDialog("Would you like to deposit, withdraw, or exit?");
        }

        account.displayAccountInfo();
        JOptionPane.showMessageDialog(null, "Thank you for using our banking system!");
    }
}