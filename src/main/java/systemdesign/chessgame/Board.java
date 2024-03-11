package systemdesign.chessgame;

public class Board {
    private Box[][] boxes;

    public Board() {
        boxes = new Box[8][8]; //assuming by default 8*8 board. We can parameterize it as well.
        this.initializeBoard();
    }

    public void initializeBoard() {
        //one by puts instances of diff pieces
        //on the chess board.
        //eg: boxes[0][0] = new Box(0, 0, new Rook(true)); --> put a white rook at (0,0);
        //boxes[5][5] = new Box(5, 5, null); --> empty spot.
    }

    public Box get(int x, int y) {
        return boxes[x][y];
    }
}
