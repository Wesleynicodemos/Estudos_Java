package application;

import java.util.Locale;
import java.util.Scanner;

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
        System.out.println();

        System.out.println("Enter Order Data:");
        System.out.println("How many itens for this order?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            
        }
    }
}
