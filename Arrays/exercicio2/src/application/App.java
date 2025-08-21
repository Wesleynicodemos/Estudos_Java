package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        double price;

        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++) {
            System.out.println("product");
            sc.nextLine();
            name = sc.next();
            System.out.println("price");
            price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double sum = 0;

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName());
            sum += products[i].getPrice();
        }

        double avg = sum / products.length;

        System.out.println(avg);
    }
}
