package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product  #" + (i+1) + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char answer = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (answer == 'i'){
                System.out.print("Customs Fee: ");
                double fee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, fee));
            } else if (answer == 'u') {
                System.out.println("Manufacture Date: ");
                String date = sc.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dateForm = LocalDate.parse(date, formatter);

                products.add(new UsedProduct(name, price, dateForm));
            } else {
                products.add(new Product(name, price));
            }

            System.out.println();
            System.out.println("PRICE TAGS:");

            for(Product product : products) {
                System.out.println(product.PriceTag());
            }

        }
        sc.close();
    }
}
