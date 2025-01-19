package systemdesign.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    Piece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Piece[size][size];
    }

    public boolean addPiece(Piece piece) {
        if (board[piece.row][piece.col] != null) {
            return false;
        }

        board[piece.row][piece.col] = piece;
        return true;
    }

    public List<int[]> getFreeCells() {
        List<int[]> freeCells = new ArrayList<>();

        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(new int[]{i, j});
                }
            }
        }

        return freeCells;
    }

    public void printBoard() {

        for (int i=0; i<size; i++) {

            for (int j=0; j<size; j++) {
                System.out.print((board[i][j] == null ? " ": board[i][j].pieceType) + " |");
            }
            System.out.println();
        }
    }
}
