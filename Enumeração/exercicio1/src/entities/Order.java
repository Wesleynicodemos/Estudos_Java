package entities;

import java.time.LocalDate;

import entities.enums.OrderStatus;

public class Order {
    private Integer id;
    private LocalDate moment;
    private OrderStatus status;

    public Order() {

    }

    public Order(Integer id, LocalDate moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public String toString() {
        return "id: " + id + "\nmoment: " + moment + "\nstatus: " + status;
    }
}
