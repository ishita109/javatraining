package bankingTransaction;

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.03; // 3% interest rate

    public SavingsAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        balance += balance * INTEREST_RATE; // Apply interest
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}
