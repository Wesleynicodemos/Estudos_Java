package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import enums.OrderStatus;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    List<OrderItem> itens = new ArrayList<>();

    public Order() {

    }

    public Order(LocalDateTime moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }
    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem (OrderItem item) {
        itens.add(item);
    }

    public void removeItem (OrderItem item) {
        itens.remove(item);
    }

    public double total() {
        double total = 0.0;
        for (OrderItem item : itens) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}
