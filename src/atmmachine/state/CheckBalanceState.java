package atmmachine.state;

import atmmachine.ATM;
import atmmachine.Card;

public class CheckBalanceState extends AtmState{
    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your remaning balance is: " + card.getBalance());
        exit(atm);
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
