package entities;

public abstract class FormaGeometrica {
    
    public FormaGeometrica() {

    }

    public abstract Double calcularArea();

    public void imprimirDescricao(){
        System.out.println("Esta é uma forma geométrica.");
    }
}
