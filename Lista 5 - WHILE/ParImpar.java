package Lista5;

import java.util.Random;
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui cria o random pra gerar numeros aleatorios pro computador
        Random rand = new Random();

        // aqui variavel que guarda a escolha do jogador
        String escolha;

        // aqui mostra o titulo do jogo
        System.out.println("=== JOGO PAR OU ÍMPAR ===");

        // aqui inicia o loop infinito do jogo
        while (true) {
            
            // aqui pede pro usuario escolher par impar ou sair
            System.out.println("\nDigite 'par', 'impar' ou 'sair':");
            
            // aqui le a escolha e coloca tudo em minusculo
            escolha = sc.next().toLowerCase();

            // aqui verifica se o usuario quer sair do jogo
            if (escolha.equals("sair")) {
                System.out.println("Jogo encerrado!");
                break;
            }

            // aqui verifica se a opcao e valida
            if (!escolha.equals("par") && !escolha.equals("impar")) {
                System.out.println("Opção inválida!");
                continue;
            }

            // aqui pede um numero pro jogador
            System.out.println("Digite um número de 0 a 5:");
            int jogador = sc.nextInt();

            // aqui valida se o numero esta dentro do intervalo permitido
            if (jogador < 0 || jogador > 5) {
                System.out.println("Número inválido!");
                continue;
            }
            
            // aqui o computador escolhe um numero aleatorio de 0 a 5
            int computador = rand.nextInt(6);
            
            // aqui soma os numeros do jogador e do computador
            int soma = jogador + computador;

            // aqui mostra o que cada um jogou
            System.out.println("Você jogou: " + jogador);
            System.out.println("Computador jogou: " + computador);
            
            // aqui mostra a soma dos numeros
            System.out.println("Soma: " + soma);

            // aqui verifica se a soma e par
            boolean ehPar = (soma % 2 == 0);

            // aqui verifica se o jogador venceu ou perdeu
            if ((ehPar && escolha.equals("par")) || (!ehPar && escolha.equals("impar"))) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Você perdeu!");
            }
        }

        // aqui fecha o scanner depois de terminar o jogo
        sc.close();
    }
}