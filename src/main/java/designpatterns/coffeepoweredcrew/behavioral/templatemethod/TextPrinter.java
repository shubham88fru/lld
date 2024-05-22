package designpatterns.coffeepoweredcrew.behavioral.templatemethod;

import java.util.Map;

//Concrete implementation. Implements steps needed..
//..by template method
public class TextPrinter extends OrderPrinter {

    @Override
    protected String start() {
        return "Order Details";
    }

    @Override
    protected String formatItems(Order order) {
        return "Order #" + order.getId();
    }

    @Override
    protected String formatOrderNumber(Order order) {
        StringBuilder builder = new StringBuilder("Items\n------------------------------");
        for (Map.Entry<String, Double> entry: order.getItems().entrySet()) {
            builder.append(entry.getKey()).append(" $").append(entry.getValue()).append("\n");
        }
        builder.append("-------------------------------------");
        return builder.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return "Total: $"+order.getTotal();
    }

    @Override
    protected String end() {
        return "";
    }
}
