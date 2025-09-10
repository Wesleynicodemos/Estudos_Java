package entities;

public class Gato extends Animal {
    private String raça;

    public Gato() {

    }

    public Gato(String nome, String raça) {
        super(nome);
        this.raça = raça;
    }

    @Override
    public void somAnimal() {
        System.out.println("Gato mia: miau miau.");
    }

    public void infoAnimal() {
        System.out.println("A raça do gato e: " + raça);
        System.out.println("O nome do gato e: " + nome);
    }
}
