package aula12_metodos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LUISGUILHERMEDESOUZA
 */
public class JogoAdivinhacao {

    //Método para iniciar o jogo
    public static void iniciarJogo() {
        System.out.println("## Método iniciarJogo");
        System.out.println(" | Bem-vindo ao jogo de adivinhação!");
        System.out.println(" | Tente adivinhar o número que estou pensando entre 1 e 100.");
        System.out.println(" |_____");
    }

    //Método para processar a entrada do usuário
    public static int processarEntrada() {
        System.out.println("## Método processarEntrada");
        Scanner sc = new Scanner(System.in);
        System.out.println(" | Digite seu palpite: ");
        System.out.println(" |_____");

        return sc.nextInt();
    }

    //Método para verificar se o jogador venceu
    public static boolean verificarVencedor(int palpite, int numeroSecreto) {
        System.out.println("## Método verificarVencedor");
        if (palpite == numeroSecreto) {
            System.out.println(" | Parabéns! Você acertou o número");
            System.out.println(" |_____");

            return true;
        } else if (palpite < numeroSecreto) {
            System.out.println(" | O número é maior que " + palpite);
            System.out.println(" |_____");

        } else {
            System.out.println(" | O número é menor que " + palpite);
            System.out.println(" |_____");

        }
        System.out.println(" |_____");

        return false;
    }

    //Método Principal > Main
    public static void main(String[] args) {
        iniciarJogo();

        Random rd = new Random();
        int numeroSecreto = rd.nextInt(101);
        boolean venceu = false;

        while (!venceu) {
            int palpite = processarEntrada();
            venceu = verificarVencedor(palpite, numeroSecreto);
        }
        System.out.println("## Método princial Main");
        System.out.println(" | Obrigado por jogar!");
        System.out.println(" |_____");

    }
}
