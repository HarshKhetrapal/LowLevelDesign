package atmmachine.state;

import atmmachine.ATM;
import atmmachine.Card;
import atmmachine.TransactionType;

public abstract class AtmState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("Oops Something went wrong");
    }
    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("Oops Something went wrong");
    }
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("Oops Something went wrong");
    }
    public void cashWithdraw(ATM atm, Card card, int withdrawAmount) {
        System.out.println("Oops Something went wrong");
    }
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Oops Something went wrong");
    }
    public void returnCard() {
        System.out.println("Oops Something went wrong");
    }
    public void exit(ATM atm) {
        System.out.println("Oops Something went wrong");
    }
}
