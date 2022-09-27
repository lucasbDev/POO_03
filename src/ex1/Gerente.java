package ex1;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentaSalario() {
        double aumento = (0.1 * this.getSalario()) + this.getSalario();
        this.setSalario(aumento);
    }
}
