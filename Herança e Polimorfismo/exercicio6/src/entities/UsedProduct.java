package entities;

import java.time.LocalDate;

public class UsedProduct extends Product {
    protected LocalDate manufactureDate;

    public UsedProduct(){

    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }
    
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String PriceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" (used) $ ");
        sb.append(String.format("%.2f", price));
        sb.append(" (manufacture Date: " + manufactureDate + ")");
        return sb.toString();
    }
}