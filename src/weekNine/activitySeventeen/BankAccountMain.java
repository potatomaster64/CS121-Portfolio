package weekNine.activitySeventeen;

public class BankAccountMain {

    public void main(String[] args){
        BankAccount regularAccount = new BankAccount("Evan Turner", "Regular", 500.00);
        BankAccount premiumAccount = new BankAccount("Robert Bell", "Premium", 5000.00);

        System.out.println("Regular Account Information: \n" + regularAccount + super.toString());
        System.out.println("Premium Account Information: \n" + premiumAccount);
    }
}
