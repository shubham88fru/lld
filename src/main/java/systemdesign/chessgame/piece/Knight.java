package systemdesign.chessgame.piece;

import systemdesign.chessgame.Board;
import systemdesign.chessgame.Box;

public class Knight extends Piece {
    public Knight(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        //Implementation..
        //Verify if end is a valid position for this type of piece.
        //Can't move if piece at destination is of same color.
        if (isOccupiedBySameColorPiece(start, end)) return false;

        int distX = Math.abs(start.getX() - end.getX());
        int distY = Math.abs(start.getY() - end.getY());

        return (distX * distY == 2);
    }
}
