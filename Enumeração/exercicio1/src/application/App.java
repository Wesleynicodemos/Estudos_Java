package application;

import java.time.LocalDate;

import entities.Order;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate now = LocalDate.now();
    

        Order order = new Order(13, now , OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
