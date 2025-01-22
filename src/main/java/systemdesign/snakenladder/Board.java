package systemdesign.snakenladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        initializeCells(boardSize);
        addSnakesAndLadders(cells, numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell();
            }
        }
        System.out.println("Board initialized");
    }


    private void addSnakesAndLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders) {
        while (numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            if (snakeTail >= snakeHead) continue;

            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;
            Cell snakeCell = getCell(snakeHead);
            snakeCell.jump = snakeObj;

            numberOfSnakes -= 1;
        }

        while (numberOfLadders > 0) {
            int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            if (ladderHead >= ladderTail ) continue;
            Jump ladderObj = new Jump();
            ladderObj.start = ladderHead;
            ladderObj.end = ladderTail;
            Cell ladderCell = getCell(ladderHead);
            ladderCell.jump = ladderObj;


            numberOfLadders -= 1;
        }
    }

    public Cell getCell(int playerPosition) {
        int boarRow = playerPosition/cells.length;
        int boardCol = playerPosition%cells.length;

        return cells[boarRow][boardCol];
    }
}
