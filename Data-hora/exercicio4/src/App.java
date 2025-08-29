import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        String hoje = "23/08/2025";

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate formatado = LocalDate.parse(hoje, formatador);
        
        System.out.println(formatado);

        LocalDate novaData = formatado.plusDays(60);

        DateTimeFormatter novoFormatador = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");

        String dataFormatada = novaData.format(novoFormatador);

        System.out.println(dataFormatada);
 
    }
}
