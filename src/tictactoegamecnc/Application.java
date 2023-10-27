package tictactoegamecnc;

public class Application {
    public static void main(String[] args) {
        Game ticTacTowGame = new Game();
        ticTacTowGame.initializeGame();
        System.out.println("Winner is: " + ticTacTowGame.startGame());
    }
}
