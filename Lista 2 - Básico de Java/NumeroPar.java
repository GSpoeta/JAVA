package Lista2;

import java.util.Scanner;

public class NumeroPar {

    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner scanner = new Scanner(System.in);

        // aqui pede um numero inteiro pro usuario
        System.out.print("Digite um número inteiro: ");
        
        // aqui le o numero digitado e guarda na variavel num
        int num = scanner.nextInt();

        // aqui verifica se o numero e par usando resto da divisao por 2
        boolean par = (num % 2 == 0);

        // aqui entra se o numero for par
        if (par) {
            // aqui mostra que o numero e par
            System.out.println("O número é par.");
        } else {
            // aqui entra se nao for par
            // aqui mostra que o numero e impar
            System.out.println("O número é ímpar.");
        }

        // aqui fecha o scanner depois de usar
        scanner.close();
    }
}