package atmmachine;

public class ATMRoom {
    ATM atmMachine;
    User user;
    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        atmRoom.atmMachine.printATMState();
        atmRoom.atmMachine.getCurrentAtmState().insertCard(atmRoom.atmMachine, atmRoom.user.card);
        atmRoom.atmMachine.getCurrentAtmState().authenticatePin(atmRoom.atmMachine, atmRoom.user.card, 123);
        atmRoom.atmMachine.getCurrentAtmState().selectOperation(atmRoom.atmMachine, atmRoom.user.card, TransactionType.CASH_WITHDRAW);
        atmRoom.atmMachine.getCurrentAtmState().cashWithdraw(atmRoom.atmMachine, atmRoom.user.card, 2700);
        atmRoom.atmMachine.printATMState();
    }

    private void initialize() {
        this.atmMachine = ATM.getATMObject();
        this.atmMachine.setAtmBalance(3500, 1, 2, 5);
        this.user = this.createUser();
    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard() {
        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private UserBankAccount createBankAccount() {
        UserBankAccount bankAccount = new UserBankAccount();
        bankAccount.balance = 3000;
        return bankAccount;
    }
}
