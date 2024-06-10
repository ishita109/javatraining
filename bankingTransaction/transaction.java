package bankingTransaction;

final class Transaction {
    private final double transactionFee = 2.00;

    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
        applyTransactionFee(account);
    }

    private void applyTransactionFee(Account account) {
        account.withdraw(transactionFee);
    }
}

