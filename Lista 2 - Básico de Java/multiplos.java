package Lista2;

import java.util.Scanner;

public class multiplos {

    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner scanner = new Scanner(System.in);

        // aqui pede um numero pro usuario
        System.out.print("Digite um número: ");
        
        // aqui le o numero digitado e guarda na variavel numero
        int numero = scanner.nextInt();

        // aqui verifica se o numero e multiplo de 3 ou de 7 usando o resto da divisao
        boolean multiplo = (numero % 3 == 0) || (numero % 7 == 0);

        // aqui entra se for multiplo de 3 ou 7
        if (multiplo) {
            // aqui mostra que e multiplo de 3 ou 7
            System.out.println("O número é múltiplo de 3 ou de 7.");
        } else {
            // aqui entra se nao for multiplo
            // aqui mostra que nao e multiplo de nenhum dos dois
            System.out.println("O número NÃO é múltiplo de 3 nem de 7.");
        }

        // aqui fecha o scanner depois de usar
        scanner.close();
    }
}