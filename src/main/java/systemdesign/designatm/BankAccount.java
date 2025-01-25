package systemdesign.designatm;

public class BankAccount {
    int balance;

    public void withdrawBalance(int amount) {
        balance -= amount;
    }
}
