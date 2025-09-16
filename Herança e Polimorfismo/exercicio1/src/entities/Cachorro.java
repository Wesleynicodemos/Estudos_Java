package entities;

public class Cachorro extends Animal {
    private String raça;

    public Cachorro (){

    }
    
    public Cachorro( String nome, String raça) {
        super(nome);
        this.raça = raça;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public void somAnimal(){
        System.out.println("Cachorro late : Au au!");
    }

    public void infoAnimal() {
        System.out.println("A raça do cachorro é: " + raça);
        System.out.println("O nome do cachorro é: " + nome);
    }
}
