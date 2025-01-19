package systemdesign.tictactoe;

public class Piece {
    int row;
    int col;
    PieceType pieceType;
    public Piece(int row, int col, PieceType pieceType) {
        this.row = row;
        this.col = col;
        this.pieceType = pieceType;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
