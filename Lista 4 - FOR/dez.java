package Lista4;

import java.util.Scanner;
import java.util.Random;

public class dez {

    public static void main(String[] args) {

        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui cria o random pra gerar numero aleatorio
        Random r = new Random();

        // aqui gera um numero aleatorio de 1 a 100
        int numero = r.nextInt(100) + 1;

        // aqui da 7 tentativas pro usuario acertar o numero
        for (int i = 1; i <= 7; i++) {

            // aqui mostra qual tentativa o usuario esta
            System.out.print("Tentativa " + i + ": ");
            
            // aqui le o palpite do usuario
            int palpite = sc.nextInt();

            // aqui verifica se acertou o numero
            if (palpite == numero) {
                System.out.println("Você acertou!");
                break;
            }

            // aqui da uma dica se o numero e maior ou menor
            if (palpite < numero) {
                System.out.println("O número é maior");
            } else {
                System.out.println("O número é menor");
            }

        }

        // aqui mostra o numero correto caso o usuario nao acerte
        System.out.println("Número correto: " + numero);

        // aqui o programa termina poderia fechar o scanner tambem
    }
}