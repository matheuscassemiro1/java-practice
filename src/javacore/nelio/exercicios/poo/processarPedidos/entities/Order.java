package javacore.nelio.exercicios.poo.processarPedidos.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order(Date moment) {
        this.moment = moment;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public double total() {
        Double aux = 0.0;
        for (OrderItem i : items) {
            aux += i.subtotal();
        }
        return aux;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ORDER SUMMARY:")
                .append("Order moment: ")
                .append(format.format(moment))
                .append("\n")
                .append("Order status: ")
                .append(status)
                .append("\n")
                .append("Client: ")
                .append(client.getName() + " ")
                .append("(" + format.format(client.getBirthdate()) + ")")
                .append(" - ")
                .append(client.getEmail() + "\n")
                .append("Order items:\n");
        Double totalPrice = 0.0;
        for (OrderItem item : items) {
            totalPrice += item.subtotal();
            builder.append(item)
                    .append("Subtotal: " + "$" + String.format("%.2f", item.subtotal()) + "\n");
        }
        builder.append("Total price: " + String.format("%.2f", total()));
        return builder.toString();
    }
}
