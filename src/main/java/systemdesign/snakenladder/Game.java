package systemdesign.snakenladder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {
    Deque<Player> playerList = new LinkedList<>();
    Board board;
    Dice dice;
    Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10, 5, 4);

        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        playerList.addLast(player1);
        playerList.addLast(player2);
    }

    public void startGame() {
        System.out.print(winner);
        while (winner == null) {
            Player playerTurn = findPlayerTurn();
            System.out.println("Player turn is: " + playerTurn.id + " current position is " + playerTurn.pos);

            int diceNumbers = dice.rollDice();

            int playerNewPosition = playerTurn.pos + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.pos = playerNewPosition;

            System.out.println("Player turn is: " + playerTurn.id + " new position is " + playerTurn.pos);

            if (playerNewPosition >= board.cells.length * board.cells.length-1) {
                winner = playerTurn;
            }
        }
        System.out.println("Winner is: " + winner.id);
    }

    private Player findPlayerTurn() {
        Player playerTurn = playerList.removeFirst();
        playerList.addLast(playerTurn);
        return playerTurn;
    }

    private int jumpCheck(int position) {
        if (position > board.cells.length * board.cells.length-1) {
            return position;
        }

        Cell cell = board.getCell(position);
        if (cell.jump != null && cell.jump.start == position) {
            String jumpBy = (cell.jump.start < cell.jump.end) ?"ladder": "snake";
            System.out.println("Jump done by " + jumpBy);
            return cell.jump.end;
        }

        return position;
    }

}
