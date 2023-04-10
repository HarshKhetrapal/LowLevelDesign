package vendingmachine;

public enum Coin {
    OneRs(1),
    FiveRs(5),
    TenRs(10),
    TwentyFive(25);

    public int value;
    Coin(int val) {
        this.value = val;
    }
}
