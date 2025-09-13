package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Account account = new Account(1302, "Wesley", 1000.00);

        System.out.println(account);

        //UPCASTING
        Account account2 = new SavingsAccount(1999, "Marcos", 5000.00, 0.05);

        System.out.println(account2);

        account2.withdraw(1000.00);

        System.out.println(account2.getBalance());

        //UPCASTING

        BusinessAccount account3 = new BusinessAccount(2019, "Mike", 10000.00, 100000.00);

        System.out.println();
        System.out.println(account3);
        System.out.println("Depois do emprestimo:");
        account3.loan(1000.00);
        System.out.println("Retirada:");
        account3.withdraw(1000.00);
        System.out.println(account3.getBalance());
        System.out.println("Depois do emprestimo:");
        account3.loan(1000000.01);

    }
}
