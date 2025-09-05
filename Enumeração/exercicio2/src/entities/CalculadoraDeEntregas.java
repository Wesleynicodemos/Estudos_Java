package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class CalculadoraDeEntregas {

    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public LocalDate calcularDataEntrega (LocalDate dataInicio, int diasUteis) {
     
        
        
        while (diasUteis > 0) {
            dataInicio = dataInicio.plusDays(1);

            DayOfWeek diaDaSemana = dataInicio.getDayOfWeek();
            
            if (diaDaSemana != DayOfWeek.SATURDAY && diaDaSemana != DayOfWeek.SUNDAY) {
               diasUteis --;
            } 
        }
        return dataInicio;
    }
}
