package systemdesign.designatm;

public class CashWithdrawalState extends ATMState {
    public CashWithdrawalState() {
        System.out.println("Please enter the withdrawal amount");
    }

    public void cashWithdrawal(ATM atm, Card card, int amount) {
        if (atm.getBalance() < amount) {
            System.out.println("Insufficient balance in atm machine");
            exit(atm);
        } else if (card.getBalance() < amount) {
            System.out.println("Insufficient balance in Card");
            exit(atm);
        } else {
            card.deductBankBalance(amount);
            atm.deductATMBalance(amount);

            CashWithdrawProcessor withdrawProcessor
                    = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor()));

            withdrawProcessor.withdraw(atm, amount);
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card.");
    }
}
