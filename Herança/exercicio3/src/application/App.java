package application;

import java.util.Locale;

import entities.Funcionario;
import entities.Gerente;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Funcionario gerente = new Gerente("John", 55, 3000.00, 500.00);

        if (gerente instanceof Gerente) {
            Gerente gerente1 = (Gerente) gerente;
            System.out.println(gerente1.getBonus());
        }

    }
}
