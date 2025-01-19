package systemdesign.tictactoe;

public class Player {
    String id;
    Piece piece;

    public Player(String id, Piece piece) {
        this.id = id;
        this.piece = piece;
    }
}
