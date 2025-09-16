package entities;

public class Funcionario {
    protected String nome;
    protected Integer matricula;
    protected Double salarioBase;

    public Funcionario() {

    }

    public Funcionario(String nome, Integer matricula, Double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double calcularSalario() {
        return salarioBase;
    }

    public String toString(){
        return "Nome: " + nome + "\nMatricula: " + matricula + "\nSalario: " + String.format("%.2f", salarioBase);
    }
}
