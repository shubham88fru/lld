package systemdesign.designatm;

public class SelectOperationState extends ATMState {
    public SelectOperationState() {
        showOperations();
    }

    @Override
    public void selectOperation(ATM atmObj, Card card, TransactionType transactionType) {
        switch (transactionType) {
            case CASH_WITHDRAWAL -> atmObj.setCurrentATMState(new CashWithdrawalState()); break;
            case BALANCE_CHECK -> atmObj.setCurrentATMState(new CheckBalanceState()); break;
            default -> System.out.println("Invalid transaction type");exit(atmObj);
        }
    }

    @Override
    public void exit(ATM atmObj) {
        returnCard();
        atmObj.setCurrentATMState(new IdleState());
        System.out.println("Exiting atm state");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    private void showOperations() {
        System.out.println("Please select the operation");
        TransactionType.showAllTransactionTypes();
    }
}
