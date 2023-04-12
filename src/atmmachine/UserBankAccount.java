package atmmachine;

public class UserBankAccount {
    int balance;
    public void withdrawMoney(int amount) {
        this.balance -= amount;
    }
}
