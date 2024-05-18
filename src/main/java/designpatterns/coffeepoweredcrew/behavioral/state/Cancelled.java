package designpatterns.coffeepoweredcrew.behavioral.state;

public class Cancelled implements OrderState {


    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Cancelled order. Can't cancel anymore.");
    }
}
