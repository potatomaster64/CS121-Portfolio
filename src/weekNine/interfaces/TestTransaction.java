package weekNine.interfaces;

public class TestTransaction {
    public static void main(String[] args){
        Transactionable depositTransaction = new DepositTransaction(500.0);
        Transactionable withdrawalTransaction = new WithdrawalTransaction(500.0);

        System.out.println(depositTransaction.processTransaction(200.0));
        System.out.println(withdrawalTransaction.processTransaction(100.0));
        System.out.println(withdrawalTransaction.processTransaction(700.0));
    }
}
