package tictactoe;

public class ApplicationMain {
    public static void main(String[] args) {
        Game game = new Game();
        String winner = game.startGame();
        System.out.println("Winner is: " + winner);
    }
}
