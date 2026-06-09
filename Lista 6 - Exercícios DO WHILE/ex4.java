package Lista6;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui variavel da opcao do menu
        int op;
        
        // aqui variaveis para armazenar dados do usuario
        String nome = "";
        String dor = "";
        
        // aqui loop do menu que so para quando escolher sair
        do {
            
            // aqui mostra o menu de opcoes
            System.out.println("\n1- Cadastrar");
            System.out.println("2- Consultar");
            System.out.println("3- Sair");
            System.out.print("Escolha: ");
            
            // aqui le a opcao escolhida
            op = sc.nextInt();
            
            // aqui limpa o enter que fica no buffer
            sc.nextLine();

            // aqui decide o que fazer dependendo da opcao
            switch (op) {
                
                case 1:
                    // aqui pede o nome do usuario
                    System.out.println("Digite seu nome! ");
                    
                    // aqui le o nome digitado
                    nome = sc.nextLine();
                    
                    // aqui confirma o cadastro
                    System.out.println("Cadastro realizado!"); 
                    break;
                            
                case 2:
                    // aqui pede o motivo da consulta
                    System.out.println("Digite o motivo da sua consulta!");
                    
                    // aqui le o texto digitado
                    dor = sc.nextLine();
                    
                    // aqui confirma a consulta
                    System.out.println("Consulta marcada, aguarde alguns minutos!");
                    break;

                case 3:
                    // aqui encerra o programa
                    System.out.println("Saindo...");
                    break;

                default:
                    // aqui entra se digitar opcao invalida
                    System.out.println("Opção inválida!");
            }

        // aqui repete ate o usuario escolher sair
        } while (op != 3);
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}