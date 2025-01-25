package systemdesign.designatm;

public class HasCardState extends ATMState {
    public HasCardState() {
        System.out.println("Enter your pin: ");
    }

    @Override
    public void authenticatePing(ATM atm, Card card, int pin) {
        boolean isCorrectPinEntered = card.isCorrectPinEntered(pin);

        if (isCorrectPinEntered) {
            atm.setCurentATMState(new SelectOperationState());
        } else {
            System.out.println("Invalid PIN number");
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        System.out.println("Exiting..");

        returnCard();
        atm.setCurrentATMState(new IdleState());
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
