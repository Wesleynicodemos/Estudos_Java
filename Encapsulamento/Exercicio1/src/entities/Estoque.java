package entities;

public class Estoque {
    
    private String name;
    private double price;
    private int stock;
    

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getPrice () {
        return this.price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public int getStock () {
        return this.stock;
    }

    public void addStock (int quantity) {
        stock = quantity;
    }


}
