package atmmachine.state;

import atmmachine.ATM;
import atmmachine.Card;
import atmmachine.TransactionType;

public class SelectOperationState extends AtmState {
    public SelectOperationState() {
        System.out.println("Please select operation");
        TransactionType.showAllTransaction();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        switch (transactionType) {
            case CASH_WITHDRAW:
                atm.setCurrentAtmState(new CashWithdrawState());
                break;
            case BALANCE_CHECK:
                atm.setCurrentAtmState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid operation selection");
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
