package tictactoegamecnc;

import tictactoegamecnc.model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque<Player> players;
    Board board;
    public void initializeGame() {
        players = new LinkedList<>();
        Player player1 = new Player("Harsh", new PieceX());
        Player player2 = new Player("Devesh", new PieceO());
        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player currentPlayer = players.removeFirst();
            board.printBoard();
            List<List<Integer>> freeCells = board.getFreeCells();
            if(freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.println("Player:" + currentPlayer.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceSuccessfullyAdded = board.addPiece(inputRow, inputColumn, currentPlayer.getPlayingPiece());
            if (!pieceSuccessfullyAdded) {
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);

            boolean winner = isThereWinner(inputRow, inputColumn, currentPlayer.getPlayingPiece().getPieceType());
            if(winner) {
                return currentPlayer.getName();
            }
        }
        return "tie";
    }

    private boolean isThereWinner(int inputRow, int inputColumn, PieceType pieceType) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0;i<board.size;i++) {
            if(board.playingBoard[inputRow][i] == null || board.playingBoard[inputRow][i].getPieceType() != pieceType) {
                rowMatch = false;
            }
        }

        for(int i=0;i<board.size;i++) {
            if(board.playingBoard[i][inputColumn] == null || board.playingBoard[i][inputColumn].getPieceType() != pieceType) {
                colMatch = false;
            }
        }

        for (int i = 0, j= 0; i < board.size; i++, j++) {
            if(board.playingBoard[i][j] == null || board.playingBoard[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
            }
        }

        for (int i = 0, j = board.size - 1; i < board.size; i++, j--) {
            if(board.playingBoard[i][j] == null || board.playingBoard[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
