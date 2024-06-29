package hr0629.c;

public class HrBankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
        bankAccount.deposit(0);

        bankAccount.withdraw(4000);
        bankAccount.withdraw(4000);
        bankAccount.withdraw(4000);
        bankAccount.withdraw(2000);

    }
}
