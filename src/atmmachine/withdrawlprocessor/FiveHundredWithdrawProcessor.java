package atmmachine.withdrawlprocessor;

import atmmachine.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor{
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/500;
        int balance = remainingAmount%500;

        if(required <= atm.getNoOfTwoThousandNote())
            atm.deductTwoThousandNote(required);
        else {
            atm.deductTwoThousandNote(atm.getNoOfTwoThousandNote());
            balance = balance + (required - atm.getNoOfTwoThousandNote()) * 500;
        }
        if(balance != 0)
            super.withdraw(atm, balance);
    }
}
