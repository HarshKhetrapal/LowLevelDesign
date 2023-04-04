package snakeandladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min = 1, max = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }
    public int rollDice() {
        int totalCount = 0;
        while(diceCount > 0) {
            totalCount += ThreadLocalRandom.current().nextInt(min, max + 1);
            diceCount--;
        }
        return totalCount;
    }
}
