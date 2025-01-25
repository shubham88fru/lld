package systemdesign.designatm;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor{
    FiveHundredWithdrawProcessor(CashWithdrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/500;
        int balance = remainingAmount%500;

        if (required <= atm.getNoOfTwoThousandNotes()) {
            atm.deductFiveHundredNotes(required);
        } else if (required > atm.getNoOfTwoThousandNotes()) {
            atm.deductFiveHundredNotes(atm.getNoOfTwoThousandNotes());
            balance += (required - atm.getNoOfTwoThousandNotes())*500;
        }

        if (balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
