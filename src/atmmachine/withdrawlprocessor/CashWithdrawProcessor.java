package atmmachine.withdrawlprocessor;

import atmmachine.ATM;

public abstract class CashWithdrawProcessor {
    CashWithdrawProcessor nextCashWithdrawProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        this.nextCashWithdrawProcessor = nextCashWithdrawProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount) {
        if(nextCashWithdrawProcessor != null)
            nextCashWithdrawProcessor.withdraw(atm, remainingAmount);
    }
}
