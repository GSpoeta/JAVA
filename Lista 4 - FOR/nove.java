package Lista4;

import java.util.Scanner;

public class nove {

    public static void main(String[] args) {

        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria variaveis pra guardar o maior e o menor numero
        int maior = 0;
        int menor = 0;

        // aqui repete 7 vezes pra pedir 7 numeros
        for (int i = 1; i <= 7; i++) {

            // aqui pede um numero pro usuario
            System.out.print("Digite um número: ");
            
            // aqui le o numero digitado e guarda na variavel num
            int num = sc.nextInt();

            // aqui na primeira vez define maior e menor como o primeiro numero
            if (i == 1) {
                maior = num;
                menor = num;
            }

            // aqui verifica se o numero atual e maior que o maior guardado
            if (num > maior) {
                maior = num;
            }

            // aqui verifica se o numero atual e menor que o menor guardado
            if (num < menor) {
                menor = num;
            }

        }

        // aqui mostra o maior numero digitado
        System.out.println("Maior = " + maior);
        
        // aqui mostra o menor numero digitado
        System.out.println("Menor = " + menor);

        // aqui o programa termina poderia fechar o scanner tambem
    }
}