package bankingTransaction;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        SavingsAccount savingsAccount = new SavingsAccount("John Doe", 1000.00);
        checkingAccount checkingAccount = new checkingAccount("Jane Smith", 2000.00);

        // Perform some transactions
        savingsAccount.deposit(500.00);
        savingsAccount.withdraw(200.00);

        checkingAccount.deposit(1000.00);
        checkingAccount.withdraw(500.00);

        // Display balances
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

        // Display total number of accounts
        System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());
    }
}

