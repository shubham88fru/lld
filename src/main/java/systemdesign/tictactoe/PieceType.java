package systemdesign.tictactoe;

public enum PieceType {
    X("x"),
    O("o");
    private final String value;
    PieceType(String value) {
        this.value = value;
    }
}
