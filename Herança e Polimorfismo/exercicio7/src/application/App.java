package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Circulo;
import entities.FormaGeometrica;
import entities.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        List<FormaGeometrica> formas = new ArrayList<>();
        

        formas.add(new Retangulo(2.5, 3.0));
        formas.add(new Circulo(2.5));

        for (FormaGeometrica forma : formas) {
            System.out.println(forma.calcularArea()); 
            forma.imprimirDescricao();
        }
    }
}
