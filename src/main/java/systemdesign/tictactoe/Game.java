package systemdesign.tictactoe;

import java.util.*;

public class Game {
    Deque<Player> players;
    Board board;

    Game() {
        initializeGame();
    }

    public void initializeGame() {
        players = new LinkedList<>();
        Player p1 = new Player("P1", new Piece(-1, -1, PieceType.X));
        Player p2 = new Player("P2", new Piece(-1, -1, PieceType.O));
        players.add(p1);
        players.add(p2);

        board = new Board(3);
    }

    public String startGame() {
//        boolean winner = false;
        while (true) {
            Player playerTurn = players.removeFirst();
            board.printBoard();
            List<int[]> freeCells = board.getFreeCells();
            if (freeCells.isEmpty()) {
//                winner = true
                break;
            }
            System.out.println("Player: " + playerTurn.id + " Enter row, column: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);
            boolean pieceAdded = board.addPiece(new Piece(row, column, playerTurn.piece.pieceType));
            if (!pieceAdded) {
                System.out.println("Incorrect position for piece, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean hasWinner = checkIfWinner(row, column, playerTurn.piece.pieceType);
            if (hasWinner) {
                return playerTurn.id + " Won";
            }
        }

        return "Tie";
    }

    private boolean checkIfWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for (int i=0; i< board.size; i++) {
            if (board.board[row][i] == null || board.board[row][i].pieceType != pieceType) {
                 rowMatch = false;
                 break;
            }
        }

        for (int i=0; i< board.size; i++) {
            if (board.board[i][column] == null || board.board[i][column].pieceType != pieceType) {
                columnMatch = false;
                break;
            }
        }

        for (int i=0, j=0; i<board.size; i++, j++) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        for (int i=0, j=board.size-1; i<board.size; i++, j--) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
