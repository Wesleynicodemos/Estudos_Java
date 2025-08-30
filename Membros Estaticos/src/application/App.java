package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        double dollarPrice, dollar;


        System.out.println("What is the Dollar price?");
        dollarPrice = sc.nextDouble();
        System.out.println("How many Dollars will be bought?");
        dollar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f", converter.dollarToReal(dollarPrice, dollar));

        sc.close();
    }
}
