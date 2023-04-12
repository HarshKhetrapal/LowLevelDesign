package atmmachine.withdrawlprocessor;

import atmmachine.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor {
    public OneHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/100;
        int balance = remainingAmount%100;

        if(required <= atm.getNoOfTwoThousandNote())
            atm.deductTwoThousandNote(required);
        else {
            atm.deductTwoThousandNote(atm.getNoOfTwoThousandNote());
            balance = balance + (required - atm.getNoOfTwoThousandNote()) * 100;
        }
        if(balance != 0)
            super.withdraw(atm, balance);
    }
}
