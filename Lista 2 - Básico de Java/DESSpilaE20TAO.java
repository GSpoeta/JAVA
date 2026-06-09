package Lista2;

import java.util.Scanner;

public class DESSpilaE20TAO {

    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner scanner = new Scanner(System.in);

        // aqui pede um numero pro usuario
        System.out.print("Digite um número: ");
        
        // aqui le o numero digitado e guarda na variavel numero
        int numero = scanner.nextInt();

        // aqui verifica se o numero esta entre 10 e 20 incluindo os dois
        boolean estaNoIntervalo = (numero >= 10) && (numero <= 20);

        // aqui entra se o numero estiver no intervalo
        if (estaNoIntervalo) {
            // aqui mostra que o numero esta entre 10 e 20
            System.out.println("O número está entre 10 e 20.");
        } else {
            // aqui entra se nao estiver no intervalo
            // aqui mostra que nao esta entre 10 e 20
            System.out.println("O número NÃO está entre 10 e 20.");
        }

        // aqui fecha o scanner depois de usar
        scanner.close();
    }
}