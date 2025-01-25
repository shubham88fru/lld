package systemdesign.designatm;

public class CashWithdrawProcessor {
    CashWithdrawProcessor nextProcessor;

    CashWithdrawProcessor(CashWithdrawProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void withdraw(ATM atm, int amount) {
        if (nextProcessor != null) {
            nextProcessor.withdraw(atm, amount);
        }
    }
}
