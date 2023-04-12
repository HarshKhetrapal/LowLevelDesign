package atmmachine;

import atmmachine.state.AtmState;
import atmmachine.state.IdleState;

public class ATM {

    private static ATM atm = new ATM();

    AtmState currentAtmState;

    private int atmBalance;
    int noOfTwoThousandNote;
    int noOfFiveHundredNote;
    int noOfOneHundredNote;

    public int getNoOfTwoThousandNote() {
        return noOfTwoThousandNote;
    }

    public int getNoOfFiveHundredNote() {
        return noOfFiveHundredNote;
    }

    public int getNoOfOneHundredNote() {
        return noOfOneHundredNote;
    }

    public AtmState getCurrentAtmState() {
        return currentAtmState;
    }

    public void setCurrentAtmState(AtmState currentAtmState) {
        this.currentAtmState = currentAtmState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNote = noOfTwoThousandNotes;
        this.noOfFiveHundredNote = noOfFiveHundredNotes;
        this.noOfOneHundredNote = noOfOneHundredNotes;
    }

    public static ATM getATMObject() {
        atm.setCurrentAtmState(new IdleState());
        return atm;
    }

    public void deductBalance(int balance) {
        this.atmBalance -= balance;
    }

    public void deductTwoThousandNote(int numberOfNote) {
        this.noOfTwoThousandNote -= numberOfNote;
    }

    public void deductFiveHundredNote(int numberOfNote) {
        this.noOfFiveHundredNote -= numberOfNote;
    }

    public void deductOneHundredNote(int numberOfNote) {
        this.noOfOneHundredNote -= numberOfNote;
    }

    public void printATMState() {
        System.out.println("Balance: " + atmBalance);
        System.out.println("2k note: " + noOfTwoThousandNote);
        System.out.println("500 note: " + noOfFiveHundredNote);
        System.out.println("100 note: " + noOfOneHundredNote);
    }
}
