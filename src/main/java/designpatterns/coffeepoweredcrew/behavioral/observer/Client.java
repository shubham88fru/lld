package designpatterns.coffeepoweredcrew.behavioral.observer;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        order.attach(priceObserver);

        order.addItem(50);
        order.addItem(179);
        System.out.println(order);

    }
}
