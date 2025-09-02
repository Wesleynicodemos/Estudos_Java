package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import enums.OrderStatus;

public class Order {

    private LocalDate moment;
    private OrderStatus status;
    
    List<OrderItem> itens = new ArrayList<>();

    public LocalDate getMoment() {
        return moment;
    }
    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
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
