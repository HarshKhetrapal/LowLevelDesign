package atmmachine;

public class Card {
    private int CardNumber;
    private int cvv;
    private int expiryDate;
    private String name;
    static int pin = 123;
    UserBankAccount bankAccount;

    public boolean checkPin(int pinToCheck) {
        if(pin == pinToCheck)
            return true;
        else
            return false;
    }

    public int getBalance() {
        return this.bankAccount.balance;
    }

    public void withdrawMoney(int amountToWithdraw) {
        this.bankAccount.withdrawMoney(amountToWithdraw);
    }

    public void setBankAccount(UserBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
