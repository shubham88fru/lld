package chessgame.piece;

import chessgame.Board;
import chessgame.Box;

public class Bishop extends Piece {
    public Bishop(boolean white) {
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

        if (distX == distY) {
            //and if not other piece is present in between
            //start and end, then return true;
        }

        return false;
    }
}
