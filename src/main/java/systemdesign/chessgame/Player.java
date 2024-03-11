package systemdesign.chessgame;

public class Player {
    private Person person; //Person class is created with basic details of user during signup
    private boolean whiteSide = false;
    private boolean isWinner = false;

    public Player(Person person, boolean whiteSide) {
        this.person = person;
        this.whiteSide = whiteSide;
    }

    public Person getPerson() {
        return person;
    }

    public boolean isWhiteSide() {
        return whiteSide;
    }

    public boolean getIsWinner() {
        return this.isWinner;
    }

    public void setIsWinner() {
        this.isWinner = true;
    }
}
