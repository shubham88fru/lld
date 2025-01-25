package systemdesign.designatm;

public class Card {
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;
    static int PIN_NUMBER = 112211;
    private BankAccount bankAccount;

    public boolean isCorrectPinEntered(int pin) {
        if (pin == PIN_NUMBER) {
            return true;
        }
        return false;
    }

    public int getBankBalance() {
        return bankAccount.balance;
    }

    public void deductBankBalance(int amount) {
        bankAccount.withdrawBalance(amount);
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
