package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.CalculadoraDeEntregas;

public class App {
    public static void main(String[] args) throws Exception {
        
        CalculadoraDeEntregas calculadora = new CalculadoraDeEntregas();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = calculadora.calcularDataEntrega(LocalDate.now(), 3);

        String dateString = date.format(formatter);

        System.out.println("Data de envio: " + LocalDate.now().format(formatter));
        System.out.println("Data de entrega do seu pedido: " + dateString);
    }
}
