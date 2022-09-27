package ex2;

public class Main {
    public static void main(String[] args) {
        ClienteFidelizacao cliente = new ClienteFidelizacao("higo","rua que não existe",200,"ok");
        ClienteFidelizacaoEspecial cliente_especial = new ClienteFidelizacaoEspecial("fulano","rua tal",200,"válido");
        cliente.adicionaBonus(100);
        System.out.println("Bonus do Cliente FIdelização: " + cliente.getBonus());
        cliente_especial.adicionaBonus(100);
        System.out.println("Bonus do Cliente Fidelização Especial: " + cliente_especial.getBonus());

    }
}
