package ex2;

public class ClienteFidelizacaoEspecial extends ClienteFidelizacao{
    public ClienteFidelizacaoEspecial(String nome, String endereco, double bonus, String validade) {
        super(nome, endereco, bonus, validade);
    }

    @Override
    public void adicionaBonus(double valorDaCompra) {
        double bonusDaCompra = 0.1 * valorDaCompra;
        this.setBonus(this.getBonus() + bonusDaCompra);
    }
}
