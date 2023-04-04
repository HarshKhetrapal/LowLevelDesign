package tictactoe;

import tictactoe.model.Board;
import tictactoe.model.Player;
import tictactoe.model.PlayingSymbol;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Deque<Player> players;
    Board playingBoard;
    int turnCounter;

    public Game() {
        this.intializeGame();
    }

    private void intializeGame() {
        players = new LinkedList<>();
        Player player1 = new Player(1, "Harsh", PlayingSymbol.X);
        Player player2 = new Player(2, "Devesh", PlayingSymbol.O);
        players.add(player1);
        players.add(player2);
        playingBoard = new Board(3);
        turnCounter = 0;
    }

    public String startGame() {
        Boolean isTie = false;
        while (!isTie) {
            Player currentPlayer = players.removeFirst();
            playingBoard.printBoard();
            System.out.println(currentPlayer.getName()+ " Please play the next move  Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);
            if (!this.playingBoard.validateMove(inputRow, inputColumn)) {
                players.addFirst(currentPlayer);
                System.out.println(currentPlayer.getName() + " you have given the invalid row or column");
                continue;
            }

            Boolean isMoveDone = playingBoard.playMove(inputRow, inputColumn, currentPlayer.getSymbol());
            if(!isMoveDone) {
                players.addFirst(currentPlayer);
                System.out.println(currentPlayer.getName() + " you cannot play this position");
                continue;
            }
            turnCounter++;
            if(turnCounter >= (playingBoard.size + (playingBoard.size - 1))) {
                Boolean winner = checkWinner(inputRow, inputColumn, currentPlayer.getSymbol());
                if(winner)
                    return currentPlayer.getName();
                if(turnCounter >= (playingBoard.size * playingBoard.size - 1)) {
                    isTie = true;
                    continue;
                }
            }
            players.addLast(currentPlayer);
        }
        return "It's a tie, no winner";
    }

    private Boolean checkWinner(int row, int col, PlayingSymbol symbol) {
        int rowMatch = 0;
        int colMatch = 0;
        int diagonalMatch = 0;
        int revDiagonalMatch = 0;

        for(int i = 0; i < playingBoard.size; i++) {
            if (playingBoard.matrix[row][i] == symbol)
                rowMatch++;
        }
        for(int i = 0; i < playingBoard.size; i++) {
            if (playingBoard.matrix[i][col] == symbol)
                colMatch++;
        }
        for(int i = 0; i < playingBoard.size; i++) {
            if (playingBoard.matrix[i][i] == symbol)
                diagonalMatch++;
        }
        for(int i=0, j=playingBoard.size-1; i<playingBoard.size;i++,j--) {
            if (playingBoard.matrix[i][i] == symbol)
                revDiagonalMatch++;
        }
        if((rowMatch == playingBoard.size) || (colMatch == playingBoard.size) || (diagonalMatch == playingBoard.size) || (revDiagonalMatch == playingBoard.size))
            return true;
        else
            return false;
    }
}
