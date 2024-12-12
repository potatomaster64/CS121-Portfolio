package project3;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private List<Account> accounts;

    public Customer(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public String getAllAccountsInfo() {
        StringBuilder info = new StringBuilder();
        for (Account account : accounts) {
            info.append(account.toString()).append("\n");
        }
        return info.toString();
    }

    @Override
    public String toString() {
        return "Customer: " + firstName + " " + lastName + ", PIN: " + pin;
    }

    public String getPin() {
        return pin;
    }
}
