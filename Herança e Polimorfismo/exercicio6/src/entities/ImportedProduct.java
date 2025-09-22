package entities;

public class ImportedProduct extends Product{
    protected Double customsFee;

    public ImportedProduct() {

    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double finalPrice() {
        return price + customsFee;
    }

    @Override
    public String PriceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" $ ");
        sb.append(String.format("%.2f", finalPrice()));
        sb.append("(Customs Fee: $ " + String.format("%.2f", customsFee));
        return sb.toString();
    }
}