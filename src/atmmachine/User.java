package atmmachine;

public class User {
    Card card;
    UserBankAccount bankAccount;
    public Card getCard() {
        return this.card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
}
