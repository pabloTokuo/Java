package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> orderItems = new ArrayList<>();
    private Client client;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public Double total() {
        double sum = 0.0;
//        vai percorrer a lista orderItems
        for (OrderItem c : orderItems) {
//            classe SUBTOTAL de OrderItem
            sum += c.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment));
        sb.append("\nOrder status: " + status);
        sb.append("\nClient: " + client.getName() + " " + sdf.format(client.getBirthDate()) + " - " + client.getEmail());
        sb.append("\nOrder items: \n");
        for (OrderItem c: orderItems) {
            sb.append(c.getProduct().getName() + ", ");
            sb.append("$" + String.format("%.2f", c.getPrice())+ ", ");
            sb.append("Quantity: " + c.getQuantity());
            sb.append(", Subtotal: $" + String.format("%.2f", c.subTotal())+ "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }

}
