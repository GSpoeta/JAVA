package Lista5;

// "e" smp ganha
// "à" smp perde
// "w,s" anuncia fim do easter egg
import java.util.Random;
import java.util.Scanner;

public class ParImparMODIFICADO {

    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui cria o random pra gerar numeros aleatorios
        Random rand = new Random();

        // aqui guarda a escolha do jogador
        String escolha;
        
        // aqui controla o modo secreto que faz o jogador perder
        boolean modoSecretoPerder = false;
        
        // aqui controla o modo secreto que faz o jogador vencer
        boolean modoSecretoVencer = false;
        
        // aqui controla se o easter egg ja foi encerrado
        boolean easterEggEncerrado = false;

        // aqui conta vitorias do jogador
        int vitoriasJogador = 0;
        
        // aqui conta vitorias do computador
        int vitoriasComputador = 0;

        // aqui mostra o titulo do jogo
        System.out.println("=== JOGO PAR OU ÍMPAR ===");

        // aqui inicia o loop infinito do jogo
        while (true) {
            
            // aqui pede a escolha do jogador
            System.out.println("\nDigite 'par', 'impar' ou 'sair':");
            
            // aqui le a escolha e deixa tudo em minusculo
            escolha = sc.next().toLowerCase();

            // aqui ativa modo secreto de perder
            if (escolha.equals("à")) {
                modoSecretoPerder = true;
                System.out.println("Opção inválida!");
                continue;
            }

            // aqui ativa modo secreto de vencer
            if (escolha.equals("e")) {
                modoSecretoVencer = true;
                System.out.println("Opção inválida!");
                continue;
            }

            // aqui verifica comandos do easter egg
            if (escolha.equals("s") || escolha.equals("w") || escolha.equals("sw") || escolha.equals("ws")) {

                // aqui verifica se o easter egg ja acabou
                if (easterEggEncerrado) {
                    System.out.println("Ja disse que nao tem mais easter egg!");
                } else {
                    System.out.println("Acabou os easter egg!");
                    easterEggEncerrado = true;
                }

                // aqui desativa modos secretos
                modoSecretoPerder = false;
                modoSecretoVencer = false;

                continue;
            }

            // aqui verifica se o jogador quer sair
            if (escolha.equals("sair")) {
                System.out.println("Jogo encerrado!");
                break;
            }

            // aqui valida a escolha normal
            if (!escolha.equals("par") && !escolha.equals("impar")) {
                System.out.println("Opção inválida!");
                continue;
            }

            // aqui pede o numero do jogador
            System.out.println("Digite um número de 1 a 10:");

            // aqui valida se e numero mesmo
            if (!sc.hasNextInt()) {
                System.out.println("Digite um numero!");
                sc.next();
                continue;
            }

            // aqui le o numero do jogador
            int jogador = sc.nextInt();

            // aqui valida intervalo do numero
            if (jogador < 1 || jogador > 10) {
                System.out.println("Número inválido!");
                continue;
            }

            int computador;

            // aqui força o computador a fazer o jogador perder
            if (modoSecretoPerder) {
                if (escolha.equals("par")) {
                    computador = (jogador % 2 == 0) ? 1 : 0;
                } else {
                    computador = (jogador % 2 == 0) ? 0 : 1;
                }

            // aqui força o jogador a vencer
            } else if (modoSecretoVencer) {
                if (escolha.equals("par")) {
                    computador = (jogador % 2 == 0) ? 0 : 1;
                } else {
                    computador = (jogador % 2 == 0) ? 1 : 0;
                }

            // aqui modo normal aleatorio
            } else {
                computador = rand.nextInt(10) + 1;
            }

            // aqui soma os valores
            int soma = jogador + computador;

            // aqui mostra jogadas
            System.out.println("Você jogou: " + jogador);
            System.out.println("Computador jogou: " + computador);
            System.out.println("Soma: " + soma);

            // aqui verifica se e par
            boolean ehPar = (soma % 2 == 0);

            // aqui define vencedor
            if ((ehPar && escolha.equals("par")) || (!ehPar && escolha.equals("impar"))) {
                System.out.println("Você venceu!");
                vitoriasJogador++;
            } else {
                System.out.println("Você perdeu!");
                vitoriasComputador++;
            }

            // aqui mostra placar
            System.out.println("\n=== PLACAR ===");
            System.out.println("Jogador: " + vitoriasJogador);
            System.out.println("Computador: " + vitoriasComputador);
        }

        // aqui fecha o scanner
        sc.close();
    }
}