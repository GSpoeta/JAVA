package lista7;

import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {

        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui inicia o saldo da conta
        double saldo = 100;
        
        // aqui variavel da opcao do menu
        int op;

        // aqui loop do menu do caixa eletronico
        do {
            
            // aqui mostra as opcoes do sistema
            System.out.println("\n1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            
            // aqui le a opcao escolhida
            op = sc.nextInt();

            // aqui decide o que fazer dependendo da opcao
            switch (op) {
                
                case 1:
                    // aqui mostra o saldo atual
                    System.out.println("Saldo: " + saldo);
                    break;

                case 2:
                    // aqui pede o valor do deposito
                    System.out.print("Valor para depositar: ");
                    
                    // aqui le o valor digitado
                    double valor = sc.nextDouble();
                    
                    // aqui adiciona o valor ao saldo
                    saldo += valor;
                    
                    // aqui confirma o deposito
                    System.out.println("Depósito feito!");
                    break;

                case 3:
                    // aqui pede o valor do saque
                    System.out.print("Valor para sacar: ");
                    
                    // aqui le o valor do saque
                    double saque = sc.nextDouble();

                    // aqui verifica se tem saldo suficiente
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 4:
                    // aqui encerra o sistema
                    System.out.println("Saindo...");
                    break;

                default:
                    // aqui aparece se digitar opcao invalida
                    System.out.println("Opção inválida");
            }

        // aqui repete ate o usuario escolher sair
        } while (op != 4);

        // aqui fecha o scanner
        sc.close();
    }
}