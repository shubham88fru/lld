package systemdesign.designatm;

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
