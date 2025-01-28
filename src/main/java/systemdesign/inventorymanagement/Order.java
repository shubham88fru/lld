package systemdesign.inventorymanagement;


import java.util.Map;

public class Order {
    User user;
    Address address;
    Map<Integer ,Integer> productCategoryAndCountMap;
    Warehouse warehouse;
    Invoice invoice;
    Payment payment;
    OrderStatus orderStatus;

    Order(User user, Warehouse warehouse) {
        this.user = user;
        this.productCategoryAndCountMap = user.getUserCart().getCartItems();
        this.warehouse = warehouse;
        this.address = user.address;
        invoice = new Invoice();
        invoice.generateInvoice(this);
    }

    public void checkout() {}
}
