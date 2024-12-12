package project3;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Bank bank;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.bank = new Bank();
    }

    public void runMenu() {
        int choice;
        do {
            displayMainMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> accessAccount();
                case 2 -> openNewAccount();
                case 3 -> closeAllAccounts();
                case 4 -> System.out.println("Exiting the program...");
                default -> System.out.println("Invalid entry. Please choose between 1 and 4.");
            }
        } while (choice != 4);
    }

    private void displayMainMenu() {
        System.out.println("\n********** Menu **********");
        System.out.println("1. Access an Account");
        System.out.println("2. Open a New Account");
        System.out.println("3. Close All Accounts");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private void accessAccount() {
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();
        Customer customer = bank.getCustomer(pin);

        if (customer == null) {
            System.out.println("PIN is not valid.");
            return;
        }

        System.out.println("Accounts:\n" + customer.getAllAccountsInfo());
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        Account account = customer.getAccount(accountNumber);

        if (account == null) {
            System.out.println("Account number invalid.");
            return;
        }

        System.out.println("Account Menu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Exit to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            }
            case 2 -> {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            }
            case 3 -> System.out.println("Exiting to Main Menu...");
            default -> System.out.println("Invalid choice.");
        }
    }

    private void openNewAccount() {
        System.out.print("Is this a new customer (yes/no)? ");
        String isNew = scanner.nextLine();

        Customer customer;
        if (isNew.equalsIgnoreCase("yes")) {
            customer = createNewCustomer();
        } else {
            System.out.print("Enter Customer PIN: ");
            String pin = scanner.nextLine();
            customer = bank.getCustomer(pin);

            if (customer == null) {
                System.out.println("PIN is not valid.");
                return;
            }
        }

        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        Account newAccount = new Account(initialDeposit);
        customer.addAccount(newAccount);
        System.out.println("New Account Opened: " + newAccount.getAccountNumber());
    }

    private Customer createNewCustomer() {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        Customer customer = new Customer(firstName, lastName, pin);
        bank.addCustomer(customer);
        return customer;
    }

    private void closeAllAccounts() {
        System.out.print("Enter Customer PIN: ");
        String pin = scanner.nextLine();
        Customer customer = bank.getCustomer(pin);

        if (customer == null) {
            System.out.println("PIN is not valid.");
            return;
        }

        bank.removeCustomer(customer);
        System.out.println("Customer and all accounts removed from bank registry.");
    }
}
