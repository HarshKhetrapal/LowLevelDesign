package atmmachine;

public enum TransactionType {
    CASH_WITHDRAW,
    BALANCE_CHECK;

    public static void showAllTransaction() {
        for(TransactionType transaction: TransactionType.values())
            System.out.println(transaction.name());
    }
}
