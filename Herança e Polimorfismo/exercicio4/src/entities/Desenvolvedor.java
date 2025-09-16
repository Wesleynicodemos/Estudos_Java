package entities;

public class Desenvolvedor extends Funcionario {
    protected Integer horasExtras;

    public Desenvolvedor() {

    }

    public Desenvolvedor(String nome, Integer matricula, Double salarioBase, Integer horasExtras) {
        super(nome, matricula, salarioBase);
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horas) {
        this.horasExtras = horas;
    }

    @Override
    public Double calcularSalario() {
        return salarioBase + horasExtras * 50.00;
    }
}