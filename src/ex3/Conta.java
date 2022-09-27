package ex3;

public class Conta {
    private String nome;
    private int numero;
    private double saldo;
    private double limite;


    public Conta(String nome, int numero, double limite) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0;
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public boolean saque(double valor){
        if (valor <= saldo + limite){
            this.saldo = this.saldo - valor;
            return true;
        }else {
            return false;
        }
    }
}
