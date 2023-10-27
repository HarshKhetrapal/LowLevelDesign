package tictactoegamecnc.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] playingBoard;

    public Board(int size) {
        this.size = size;
        playingBoard = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece piece) {
        if(playingBoard[row][col] != null)
            return false;
        playingBoard[row][col] = piece;
        return true;
    }

    public List<List<Integer>> getFreeCells() {
        List<List<Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                if(playingBoard[i][j] == null) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    freeCells.add(pair);
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (playingBoard[i][j] != null) {
                    System.out.print(playingBoard[i][j].getPieceType().name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }

    }
}
