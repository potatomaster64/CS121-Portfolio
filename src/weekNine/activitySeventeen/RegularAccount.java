package weekNine.activitySeventeen;

public class RegularAccount extends BankAccount{
    private int age;

    public RegularAccount(String accountHolderName, String accountType, double balance) {
        super(accountHolderName, accountType, balance);
        this.age = age;
    }
    @Override
    public String toString(){
        return "\nAge: " + age;
    }
}
