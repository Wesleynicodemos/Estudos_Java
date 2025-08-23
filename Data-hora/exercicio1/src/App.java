import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        


        LocalDate date = LocalDate.now();
        System.out.println(date); // imprime a data atual.

        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date2); // imprime a data e hora atual.

        Instant date3 = Instant.now(); 
        System.out.println(date3); // imprime a data e hora, porém GMT.

        System.out.println("\n.......................\n");
        // converter um texto ISO 8601 em hora:

        String texto = "13-02-1999";
        System.out.println(texto);

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        LocalDate data = LocalDate.parse(texto , form);
        
        System.out.println(data);
    }
}
