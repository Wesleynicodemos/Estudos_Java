package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Estoque;

public class Product {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estoque product = new Estoque();


        System.out.print("Enter the product name: ");
        String name = sc.next();
        product.setName(name);
        System.out.print("Enter the product Price: ");
        double price = sc.nextDouble();
        product.setPrice(price);
        System.out.print("Enter the number of products in stock: ");
        int quantity = sc.nextInt();

        product.addStock(quantity);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getStock());

    }
}
