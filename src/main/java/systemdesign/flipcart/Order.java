package systemdesign.flipcart;

import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private Date orderDate;
    private double amount;

    private List<OrderLog> logs;
    private List<Item> items;
}
