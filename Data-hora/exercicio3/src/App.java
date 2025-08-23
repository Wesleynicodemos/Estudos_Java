import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDate today = LocalDate.now(); // hoje: 23/08/2025

        System.out.println("Data sem o DateTimeFormatter: " + today); //Saída: 2025-08-23

        DateTimeFormatter longFormatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");

        String newFormatter = today.format(longFormatter);

        System.out.println("Data com o DateTimeFormatter: " + newFormatter); // Saída: 23 de agosto de 2025

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        newFormatter = today.format(shortFormatter);

        System.out.println("Data com o DateTimeFormatter (curto): " + newFormatter);
    }
}
