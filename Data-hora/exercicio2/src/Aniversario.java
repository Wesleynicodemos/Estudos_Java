import java.time.LocalDate;

public class Aniversario {
    public static void main(String[] args) throws Exception {
        
        LocalDate ultimoAniversario = LocalDate.of(2025,02,13);

        System.out.println("Seu aniversario foi : " + ultimoAniversario);

        LocalDate proximoAniversario = ultimoAniversario.plusYears(1);

        System.out.println("Seu aniversario será: " + proximoAniversario);
        
    }
}
