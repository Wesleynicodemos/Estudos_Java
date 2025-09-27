package entities;

public class Retangulo extends FormaGeometrica {
    protected Double width;
    protected Double height;

    public Retangulo() {

    }

    public Retangulo (Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double calcularArea() {

        return width * height;
    }
}