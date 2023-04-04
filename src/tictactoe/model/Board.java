package tictactoe.model;

public class Board {
    public int size;
    public PlayingSymbol[][] matrix;

    public Board(int size) {
        this.size = size;
        this.matrix = new PlayingSymbol[size][size];
    }

    private Boolean checkIfCellEmpty(int row, int col) {
        if(matrix[row][col] == null)
            return true;
        else
            return false;
    }

    public Boolean validateMove(int row, int col) {
        if(row<0 || col< 0 || row>=size || col>=size)
            return false;
        return true;
    }

    public Boolean playMove(int row, int col, PlayingSymbol symbol) {
        if (this.checkIfCellEmpty(row, col)) {
            matrix[row][col] = symbol;
            return true;
        }
        else
            return false;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(matrix[i][j] != null)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("  ");
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
