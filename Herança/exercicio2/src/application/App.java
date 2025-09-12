package application;

import java.util.Locale;

import entities.Account;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Account account = new Account(1302, "Wesley", 1000.00);

        System.out.println(account);

        SavingsAccount Account2 = new SavingsAccount(1999, "Nicodemos", 5000.00, 0.05);

        System.out.println(Account2);

        Account2.withdraw(1000.00);

        System.out.println(Account2.getBalance());

    }
}
