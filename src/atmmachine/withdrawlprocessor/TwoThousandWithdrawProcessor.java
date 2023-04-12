package atmmachine.withdrawlprocessor;

import atmmachine.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor{
    public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/2000;
        int balance = remainingAmount%2000;

        if(required <= atm.getNoOfTwoThousandNote())
            atm.deductTwoThousandNote(required);
        else {
            atm.deductTwoThousandNote(atm.getNoOfTwoThousandNote());
            balance = balance + (required - atm.getNoOfTwoThousandNote()) * 2000;
        }
        if(balance != 0)
            super.withdraw(atm, balance);
    }
}
