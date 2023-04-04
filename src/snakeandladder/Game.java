package snakeandladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playerDq = new LinkedList<>();
    Player winner;

    public Game() {
        this.intializeGame();
    }

    public void intializeGame() {
        this.board = new Board(10, 5, 4);
        this.dice = new Dice(2);
        this.createPlayer(2);
        winner = null;
    }

    private void createPlayer(int noOfPlayers) {
        int i = 1;
        while(noOfPlayers > 0) {
            Player player = new Player(i++, 0);
            playerDq.add(player);
            noOfPlayers--;
        }
    }

    public void startGame(){
        while(winner == null) {
            Player curPlayer = this.getNextPlayer();
            System.out.println("Player" + curPlayer.id + "'s turn");
            System.out.println("Player" + curPlayer.id + " rolling dice");

            int diceValue = dice.rollDice();
            System.out.println("Dice value after rolling is: " + diceValue);

            int nextPos = curPlayer.pos + diceValue;
            int posAfterJump = this.jumpCheck(nextPos);

            this.winner = this.checkMoveAndWinner(posAfterJump, curPlayer);
        }
    }

    private Player checkMoveAndWinner(int posAfterJump, Player curPlayer) {
        if(posAfterJump<=board.cells.length * board.cells.length-1)
        {
            curPlayer.pos = posAfterJump;
            System.out.println("Player" + curPlayer.id + " next pos is: " + posAfterJump);
        }
        else {
            System.out.println("Player" + curPlayer.id + " not moving as next pos is out of the board, so will stay in current pos: " + curPlayer.pos);
        }
        if (posAfterJump == board.cells.length * board.cells.length-1)
            return curPlayer;
        else return null;
    }

    private int jumpCheck(int nextPos) {
        Cell cellFromBoard = this.board.getCell(nextPos);
        if(cellFromBoard.jump != null && cellFromBoard.jump.start == nextPos) {
            System.out.println("found a " + cellFromBoard.jump.type + " which starts at: " + cellFromBoard.jump.start + " and ends at " + cellFromBoard.jump.end);
            return cellFromBoard.jump.end;
        }
        else {
            return nextPos;
        }
    }

    private Player getNextPlayer() {
        Player player = this.playerDq.removeFirst();
        this.playerDq.addLast(player);
        return player;
    }

}
