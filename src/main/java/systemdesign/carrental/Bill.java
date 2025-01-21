package systemdesign.carrental;

public class Bill {
    Reservation reservation;
    boolean isPaid;
    double amount;

    Bill(Reservation reservation) {
        this.reservation = reservation;
        this.amount = computeBillAmount();
        this.isPaid = false;
    }

    private double computeBillAmount() {
        return 100.0;
    }
}
