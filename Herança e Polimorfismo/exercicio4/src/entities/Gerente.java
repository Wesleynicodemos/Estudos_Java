package entities;

public class Gerente extends Funcionario {
    protected Double bonus;

    public Gerente() {

    }
    public Gerente(String nome, Integer matricula, Double salarioBase, Double bonus) {
        super(nome, matricula, salarioBase);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }
    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public Double calcularSalario() {
        
        Double salarioBase = super.calcularSalario();
        return salarioBase + this.bonus;
    }

    @Override
    public String toString() {
   
        return "Nome: " + nome + "\nMatricula: " + matricula + "\nSalario: " + String.format("%.2f", calcularSalario());
    }
    
}