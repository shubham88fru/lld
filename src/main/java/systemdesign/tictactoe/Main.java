package systemdesign.tictactoe;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.printf("Winner is : " + game.startGame());
    }
}
