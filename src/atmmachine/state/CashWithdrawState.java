package atmmachine.state;

import atmmachine.ATM;
import atmmachine.Card;
import atmmachine.withdrawlprocessor.CashWithdrawProcessor;
import atmmachine.withdrawlprocessor.FiveHundredWithdrawProcessor;
import atmmachine.withdrawlprocessor.OneHundredWithdrawProcessor;
import atmmachine.withdrawlprocessor.TwoThousandWithdrawProcessor;

public class CashWithdrawState extends AtmState {
    public CashWithdrawState() {
        System.out.println("Please enter the amount to withdraw");
    }

    @Override
    public void cashWithdraw(ATM atm, Card card, int withdrawAmount) {
        if(atm.getAtmBalance() < withdrawAmount) {
            System.out.println("Insufficient fund in atm");
            exit(atm);
        }
        else if (card.getBalance() < withdrawAmount) {
            System.out.println("Insufficient fund in bank account");
            exit(atm);
        }
        else {
            card.withdrawMoney(withdrawAmount);
            atm.deductBalance(withdrawAmount);
            CashWithdrawProcessor withdrawProcessor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
            withdrawProcessor.withdraw(atm, withdrawAmount);
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentAtmState(new IdleState());
        System.out.println("Exiting");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your cards");
    }
}
