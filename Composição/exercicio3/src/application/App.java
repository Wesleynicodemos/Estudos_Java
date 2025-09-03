package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Client Data:");
        System.out.println();

        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("E-mail: ");
        String email = sc.next();
        System.out.print("Birth Date: ");
        String birthDate = sc.next();
        //13/02/1999

        int year = Integer.parseInt(birthDate.substring(6));
        int month = Integer.parseInt(birthDate.substring(3, 5));
        int day = Integer.parseInt(birthDate.substring(0, 2));

        LocalDate birth = LocalDate.of(year,month,day);

        System.out.println();

        Client client = new Client(name, email, birth);

        System.out.println("Enter Order Data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        new Order(LocalDateTime.now() , status, client);

        System.out.print("How many itens for this order?");
        int n = sc.nextInt();

        String productName;
        double productPrice;
        int quantity;
        for (int i = 1; i == n; i++) {
            System.out.println("Enter #" + i + "item data:");
            System.out.println("Product Name: ");
            sc.nextLine();
            productName = sc.next();
            System.out.println("Product Price: ");
            productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            quantity = sc.nextInt();

            new OrderItem(quantity,productPrice);
            new Product(productName, productPrice);
        }
        sc.close();
    }
}
