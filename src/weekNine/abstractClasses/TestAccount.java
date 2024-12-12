package weekNine.abstractClasses;

public class TestAccount {
    public static void main(String[] args){
        Account savingsAccount = new SavingsAccount("Jeff Smith", "123456789", 1000.0, .05);
        Account checkingAccount = new CheckingAccount("James Jamison", "12315859", 10000.0, 100.0);

        System.out.println(savingsAccount.getAccountDetails());
        System.out.println(checkingAccount.getAccountDetails());
    }
}
