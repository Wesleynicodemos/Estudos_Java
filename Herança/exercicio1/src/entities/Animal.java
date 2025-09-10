package entities;

public class Animal {
    protected String nome;

    public Animal(){

    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public void somAnimal(){
       System.out.println("som do animal.");
    }

}
