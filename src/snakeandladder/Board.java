package snakeandladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int size, int noOfSnakes, int noOfLadders) {
        this.createBoard(size);
        this.addSnakesToBoard(noOfSnakes);
        this.addLaddersToBoard(noOfLadders);
    }

    private void addLaddersToBoard(int noOfLadders) {
        while (noOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(ladderStart > ladderEnd)
                continue;
            Ladder ladder = new Ladder(ladderStart, ladderEnd);
            Cell ladderInCell = this.getCell(ladderStart);
            ladderInCell.jump = ladder;
            noOfLadders--;
        }
    }

    private void addSnakesToBoard(int noOfSnakes) {
        while (noOfSnakes > 0) {
            int snakeStart = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int snakeEnd = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(snakeEnd > snakeStart)
                continue;
            Snake snake = new Snake(snakeStart, snakeEnd);
            Cell snakeInCell = this.getCell(snakeStart);
            snakeInCell.jump = snake;
            noOfSnakes--;
        }
    }

    private void createBoard(int size) {
        for(int i = 0; i < size; i++) {
            for(int j = i; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public Cell getCell(int nextPos) {
        int row = nextPos / cells.length;
        int col = nextPos % cells.length;
        return cells[row][col];
    }
}
