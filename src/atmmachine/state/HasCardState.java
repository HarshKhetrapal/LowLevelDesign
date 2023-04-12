package atmmachine.state;

import atmmachine.ATM;
import atmmachine.Card;

public class HasCardState extends AtmState {
    public HasCardState() {
        System.out.println("Enter your pin:");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean isPinValid = card.checkPin(pin);
        if(isPinValid)
            atm.setCurrentAtmState(new SelectOperationState());
        else {
            System.out.println("Invalid password");
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
