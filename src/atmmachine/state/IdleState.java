package atmmachine.state;

import atmmachine.ATM;
import atmmachine.Card;

public class IdleState extends AtmState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted!!!");
        atm.setCurrentAtmState(new HasCardState());
    }
}
