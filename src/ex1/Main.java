package ex1;

import java.util.Scanner;

public class Main {

    static void mostra_dados (Funcionario funcionario, int escolha){
        if (escolha == 1){
            System.out.println("O salario do funcionario "+ funcionario.getNome() + " é de: " + funcionario.getSalario());
        }else if (escolha == 2){
            funcionario.aumentaSalario();
            System.out.println("Salário aumentado com sucesso!");
            System.out.println("o novo salário é de " + funcionario.getSalario());
        }else if(escolha == 3){
            System.out.println("O salario do funcionario "+ funcionario.getNome() + " é de: " + funcionario.getSalario());
            funcionario.aumentaSalario();
            System.out.println("Salário aumentado com sucesso!");
            System.out.println("e o novo salário é de " + funcionario.getSalario());
        }else {
            System.out.println("Ocorreu um erro!");
            System.out.println("Verifique se colocou as opções corretamente");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcionario colaborador1 = new Gerente("Fulano", 100);
        Funcionario colaborador2 = new Programador("Higo", 200);
        Funcionario colaborador3 = new AnalistaDeSistemas("Fulana", 300);


        System.out.println("Bem vindo!!");
        System.out.println("O que deseja fazer ?");
        System.out.println("Consultar dados [1]");
        System.out.println("Aumentar salario [2]");
        System.out.println("Consultar e aumentar salario [3]");
        int escolha = input.nextInt();

        System.out.println("Escolha o funcionario: ");
        System.out.println("Gerente [G]");
        System.out.println("Programador [P]");
        System.out.println("Analista de Sistemas [A]");
        char opcao_funcionario = input.next().charAt(0);

        if(opcao_funcionario == 'g' || opcao_funcionario == 'G'){
            mostra_dados(colaborador1,escolha);
        }else if (opcao_funcionario == 'P' || opcao_funcionario == 'p'){
            mostra_dados(colaborador2,escolha);
        }else if (opcao_funcionario == 'A' || opcao_funcionario == 'a'){
            mostra_dados(colaborador3,escolha);
        }else {
            System.out.println("Digite as opções corretamente!");
        }
        }
    }
