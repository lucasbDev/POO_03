package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo!");
        System.out.println("Qual o tipo de conta que deseja criar ?");
        System.out.println("Conta normal [1]");
        System.out.println("Conta Especial [2]");
        int opcao_conta = input.nextInt();

        if (opcao_conta == 1 || opcao_conta == 2) {

            System.out.println("Digite seu nome: ");
            String nome = input.next();
            System.out.println("Digite o número da conta: ");
            int numero_conta = input.nextInt();
            System.out.println("Valor do seu salário mensal: ");
            double salario_mensal = input.nextDouble();
            System.out.println("Qual o limite que você deseja para sua conta: ");
            double limite = input.nextDouble();

            if (opcao_conta == 1) {
                while (limite > salario_mensal) {
                    System.out.println("Infelizmente não foi possivel definir o limite desejado");
                    System.out.println("Escolha um limite abaixo do valor do seu salário mensal!");
                    System.out.println("Qual o limite que você deseja para sua conta: ");
                    limite = input.nextDouble();
                }
                Conta conta_simples = new Conta(nome, numero_conta, limite);
            } else if (opcao_conta == 2) {
                while (limite > salario_mensal * 3) {
                    System.out.println("Infelizmente não foi possivel definir o limite desejado");
                    System.out.println("Você deve escolher um limite abaixo de três salários mensais");
                    System.out.println("Qual o limite que você deseja para sua conta: ");
                    limite = input.nextDouble();
                }
                Conta conta_especial = new ContaEspecial(nome, numero_conta, limite);
            }
        } else {
            System.out.println("OCORREU UM ERRO!");
            System.out.println("DIGITE UMA OPÇÃO DE CONTA CORRETA!");
        }
    }
}
