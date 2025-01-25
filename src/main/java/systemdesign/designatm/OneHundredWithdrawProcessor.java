package systemdesign.designatm;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor{
    OneHundredWithdrawProcessor(CashWithdrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/100;
        int balance = remainingAmount%100;

        if (required <= atm.getNoOfTwoThousandNotes()) {
            atm.deductOneHundredNotes(required);
        } else if (required > atm.getNoOfTwoThousandNotes()) {
            atm.deductOneHundredNotes(atm.getNoOfTwoThousandNotes());
            balance += (required - atm.getNoOfTwoThousandNotes())*100;
        }

        if (balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
