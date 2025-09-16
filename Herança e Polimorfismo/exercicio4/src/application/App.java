package application;

import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.Funcionario;
import entities.Gerente;
import entities.Desenvolvedor;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("John", 55, 3000.00, 500.00));
        funcionarios.add(new Funcionario("Mike", 1001, 1500.00));
        funcionarios.add(new Desenvolvedor("Kate", 1020, 2000.00, 10));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Salario de " + funcionario.getNome() + ": R$" + String.format("%.2f",funcionario.calcularSalario()));
        }
    }
}