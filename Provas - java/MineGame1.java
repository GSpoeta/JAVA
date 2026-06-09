package Prova;

import java.util.Scanner;

public class MineGame1 {
 
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int opcao;
                
        
            System.out.println("\n == Floresta 21 ==");
            System.out.println("1. concertar gerador"); 
            System.out.println("2. se esconder no armario (la ele)"); 
            System.out.println("3. Fugir pela floresta");
            
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            if (opcao == 1) {
                System.out.println("\nConcertando...");
                System.out.println("\nGerador consertado carregando energia..");
        int tamanho = 0;
        
        while (tamanho <= 100) {
            
            System.out.println("Potencia de energia do gerador... " + tamanho);
            
            tamanho = tamanho + 25;
            if (tamanho > 100) {
                 System.out.println("\nParabens voce restaurou a energia e ligou a luz! \n\nual  voce ganhou o jogo. ");
                 System.out.println("\n \n \n ASSASINO: Nos vemos no cinema...");
            } else 
           System.out.println("\n");
           
        }   
            } else if (opcao == 2) {
                System.out.println("\n Se escondeu no armario... \n");
                System.out.println("Pessima escolha o assasino fareja seu cheiro de medo e ele vai te achar, restaure o sistema de energia! ");
                
            } else if (opcao == 3) {
                System.out.println("\n Correu pra floresta...\n");
                
                System.out.println("Game over o assasino da floresta te achou...");
                
              
            
            } else {
                System.out.println("\n Opção inválida!\n ");
                
            }
            
           
    }
}
        
   





//Questão 1: Fuga do Assassino (Survival Horror)
//Cenário: Você está desenvolvendo a lógica de um minijogo de terror. O personagem do jogador encontra
//um gerador de energia quebrado no escuro e começa a ouvir passos se aproximando. Ele precisa decidir
//rápido o que fazer!
//A Tarefa: Crie um programa que apresente um menu interativo com as seguintes opções: 1. Consertar
//fios (+25% de progresso), 2. Esconder-se no armário (pausa), 0. Correr para a floresta (desistir). O
//programa deve rodar até que o gerador atinja 100% ou o jogador decida fugir. Ao final, exiba uma
//mensagem de vitória ou Game Over.
//Estruturas Obrigatórias:
//Scanner para capturar a escolha.
//Variável int (progresso) e boolean (fuga).
//Laço do-while e estrutura switch-case.
//Condicional if-else para o resultado final.