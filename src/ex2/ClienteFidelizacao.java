package ex2;

public class ClienteFidelizacao extends Cliente{
    private double bonus;
    private String validade;

    public ClienteFidelizacao(String nome, String endereco, double bonus, String validade) {
        super(nome, endereco);
        this.bonus = bonus;
        this.validade = validade;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void adicionaBonus(double valorDaCompra){
        double bonusDaCompra = 0.05 * valorDaCompra;
        this.setBonus(this.getBonus() + bonusDaCompra);
    }
}
