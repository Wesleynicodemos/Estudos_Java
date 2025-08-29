package entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private Integer hours;
    private Double valuePerHour;
    

    public HourContract() {

    }

    public HourContract(LocalDate date, Integer hours, Double value) {
        this.date = date;
        this.hours = hours;
        this.valuePerHour = value;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
   
    public Double totalValue () {
        return hours * valuePerHour;
    }
    
}
