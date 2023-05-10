package chessgame;

import chessgame.piece.Piece;

public class Game {
    private Player[] players;
    private Board board;
    private Player currentTurn; //which player's turn it is.
    private GameStatus status;

    public Game(Player p1, Player p2) {
        initialize(p1, p2);
    }

    public void playGame() {
        while (!this.players[0].getIsWinner() || !this.players[1].getIsWinner()) {
            //based on some input keep playing the game.
            //These below need to be input from somewhere.
            ////////////////////////////////////////////
            Player inputPlayer = null;
            int inputStartX = 0;
            int inputStartY = 0;
            int inputEndX = 0;
            int inputEndY = 0;
            /////////////////////////////////////////////
            this.playerMove(inputPlayer, inputStartX, inputStartY, inputEndX, inputEndY);
        }
    }

    private void initialize(Player p1, Player p2) {
        players[0] = p1;
        players[1] = p2;

        board = new Board();
        board.initializeBoard();

        //Player on white side starts the game.
        if (p1.isWhiteSide()) {
            this.currentTurn = p1;
        } else {
            this.currentTurn = p2;
        }

        status = GameStatus.RUNNING;

    }

    public void playerMove(Player player, int startX, int startY, int endX, int endY) {
        Box start = board.get(startX, startY);
        Box end = board.get(endX, endY);

        Piece sourcePiece = start.getPiece();
        sourcePiece.canMove(board, start, end);

        Piece destPiece = end.getPiece();
        if (destPiece != null) {
            destPiece.setKilled(true);
        }

        end.setPiece(sourcePiece);

        if (this.currentTurn == players[0]) {
            this.currentTurn = players[1];
        } else {
            this.currentTurn = players[0];
        }
    }
}
