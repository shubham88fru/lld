package chessgame.piece;

import chessgame.Board;
import chessgame.Box;

public class King extends Piece {

    public King(boolean white) {
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

        //if loc is up, down, left, right, diagonal and not unoccupied, then can move.
        if ((distX+distY == 1) && end.isEmpty()) return true;

        if ((distX+distY == 2) && !isOccupiedBySameColorPiece(start, end)) return true;

        return false;
    }

}
