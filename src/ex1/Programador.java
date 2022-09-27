package ex1;

public class Programador extends Funcionario{
    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentaSalario() {
        double aumento = (0.2 * this.getSalario()) + this.getSalario();
        this.setSalario(aumento);
    }
}
